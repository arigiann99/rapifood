/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.Mesa;
import entidades.Mesero;
import entidades.Pedido;
import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PedidoData {

    private Connection con = null;

    public PedidoData(Conexion conexion) {
        con = conexion.getConection();
    }

    public void registrarPedido(Pedido pedido) {
        try {
            String sql = "INSERT INTO `pedido`(`id_mesa`, `id_mesero`) VALUES (?,?)";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, pedido.getMesa().getId_mesa());
            st.setInt(2, pedido.getMesero().getId_mesero());

            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();

            if (rs.next()) {
                pedido.setId_pedido(rs.getInt("id_pedido"));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener id de pedido");
            }
            st.close();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo obtener id de pedido");
        }
    }

    public void anularPedido(Pedido pedido) {
        try {
            String sql = "UPDATE `pedido` SET `estado`=? WHERE `id_pedido`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setBoolean(1, pedido.isEstado());
            st.setInt(2, pedido.getId_pedido());

            st.executeUpdate();
            st.close();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo anular el pedido");
        }
    }

    public void modificarPedido(Pedido pedido) {
        LocalDate fecha_pedido = LocalDate.now();
        try {
            String sql = "UPDATE `pedido` SET `estado`=?,`fecha_pedido`=?,`id_mesa`=?,`id_mesero`=? WHERE `id_pedido`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, pedido.getId_pedido());
            st.setBoolean(2, pedido.isEstado());
            st.setDate(3, Date.valueOf(fecha_pedido));
            st.setInt(4, pedido.getMesa().getId_mesa());
            st.setInt(5, pedido.getMesero().getId_mesero());

            st.executeUpdate();
            st.close();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo modificar el pedido");
        }
    }

    public List<Pedido> PedidosAtendidosPorMeseros(int id) {
        List<Pedido> pedidos = new ArrayList<>();
        
        LocalDate fecha = LocalDate.now(); // Al final del día obtener cuántos pedidos atendió cada mesero. este metodo consultara los pedidos del dia.
        try {

            String sql = "SELECT * FROM `pedido` WHERE  fecha_pedido =?  AND `id_mesero`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            st.setDate(1, Date.valueOf(fecha));
            st.setInt(2, id);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                
                Conexion c = new Conexion();
                
                Pedido pedido = new Pedido();
                pedido.setId_pedido(rs.getInt(1));
                pedido.setFecha_pedido(rs.getDate(3));
                pedido.setEstado(rs.getBoolean(2));
                
                Mesa mesa=new Mesa();
                mesa.setId_mesa(rs.getInt(4));
                mesa.getId_mesa();
                pedido.setMesa(mesa);
                
                MeseroData md= new MeseroData(c);
                Mesero mesero= md.buscarMesero(rs.getInt("id_mesero"));
               // mesero.setId_mesero(rs.getInt(5));
                pedido.setMesero(mesero);
                pedidos.add(pedido);
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo obtener resultados");
        }
//        System.out.println("El mesero N°" + id + " atendio: " + mesero.size() + " pedidos");
        return pedidos;
    }

    public double costoXPedido(int id) {
        Pedido pedido = new Pedido();
        try {
            String sql = "SELECT SUM(producto.precio) FROM `detalle_pedido` ,`producto` WHERE `id_pedido`=? AND detalle_pedido.id_producto = producto.id_producto";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                pedido.setCosto(rs.getDouble(1));
                System.out.println();
            }
            String sql2 = "UPDATE `pedido` SET `costo`=? WHERE pedido.id_pedido=?";
            PreparedStatement stt = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
            stt.setDouble(1, pedido.getCosto());
            stt.setInt(2, id);
            stt.executeUpdate();

            stt.close();
            st.close();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo obtener resultados");
        }
        return pedido.getCosto();
    }

    public List<Pedido> listarPedidos(LocalDate fecha) {
        List<Pedido> pedidos = new ArrayList<>();
        

        String sql = "SELECT * FROM `pedido` WHERE `fecha_pedido`=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setDate(1, Date.valueOf(fecha));

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Conexion c = new Conexion();
                
                Pedido pedido = new Pedido();
                pedido.setId_pedido(rs.getInt("id_pedido"));
                pedido.setFecha_pedido(rs.getDate("fecha_pedido"));
                pedido.setEstado(rs.getBoolean("estado"));

                Mesa mesa = new Mesa();
                mesa.setId_mesa(rs.getInt("id_mesa"));
                mesa.getId_mesa();
                pedido.setMesa(mesa);

                MeseroData md= new MeseroData(c);
                Mesero mesero = md.buscarMesero(rs.getInt("id_mesero"));
                pedido.setMesero(mesero);
                System.out.println(pedido.toString());
                pedidos.add(pedido);
            }

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo listar los pediddos");
        }

        return pedidos;
    }

    public Pedido buscarPedido(int id) {
        Pedido pedido = new Pedido();
        String sql = "SELECT * FROM pedido WHERE id_pedido=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pedido.setId_pedido(rs.getInt("id_pedido"));
                pedido.setEstado(rs.getBoolean("estado"));
                pedido.setFecha_pedido(rs.getDate("fecha_pedido"));
                pedido.setCosto(rs.getDouble("costo"));

                Mesa mesa = new Mesa();
                mesa.setId_mesa(rs.getInt("id_mesa"));
                pedido.setMesa(mesa);

                Mesero mesero = new Mesero();
                mesero.setId_mesero(rs.getInt("id_mesero"));
                pedido.setMesero(mesero);

                System.out.println(pedido);
            }

            ps.close();

        } catch (SQLException e) {
            System.err.print(e.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo encontrar el pedido");
        }
        return pedido;
    }
    
}
