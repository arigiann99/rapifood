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
            String sql = "INSERT INTO `pedido`(`estado`, `id_mesa`, `id_mesero`) VALUES (?,?,?)";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setBoolean(1, pedido.isEstado());
            st.setInt(2, pedido.getMesa().getId_mesa());
            st.setInt(3, pedido.getMesero().getId_mesero());

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
            JOptionPane.showMessageDialog(null, "No se pudo anular reserva");
        }
    }

    public void modificarPedido(Pedido pedido) {
        try {
            String sql = "UPDATE `pedido` SET `estado`=?,`id_mesa`=?,`id_mesero`=? WHERE `id_pedido`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setBoolean(1, pedido.isEstado());
            st.setInt(2, pedido.getMesa().getId_mesa());
            st.setInt(3, pedido.getMesero().getId_mesero());
            st.setInt(4, pedido.getId_pedido());

            st.executeUpdate();
            st.close();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo modificar reserva");
        }
    }

    public List<Pedido> PedidosAtendidosPorMeseros(int id) {
        List<Pedido> mesero = new ArrayList<>();
        Pedido pedido = new Pedido();
        LocalDate fecha = LocalDate.now(); // Al final del día obtener cuántos pedidos atendió cada mesero. este metodo consultara los pedidos del dia.
        try {

            String sql = "SELECT * FROM `pedido` WHERE  fecha_pedido =?  AND `id_mesero`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            st.setDate(1, Date.valueOf(fecha));
            st.setInt(2, id);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                mesero.add(pedido);
            }
            st.close();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo obtener resultados");
        }
        System.out.println("El mesero atendio: " + mesero.size() + " pedidos");
        return mesero;
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
        Pedido pedido = new Pedido();

        String sql = "SELECT * FROM `pedido` WHERE `fecha_pedido`=?";
        try {
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setDate(1, Date.valueOf(fecha));

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                pedido.setId_pedido(rs.getInt("id_pedido"));
                pedido.setFecha_pedido(rs.getDate("fecha_pedido"));
                pedido.setEstado(rs.getBoolean("estado"));

                Mesa mesa = new Mesa();
                mesa.setId_mesa(rs.getInt("id_mesa"));
                mesa.getId_mesa();
                pedido.setMesa(mesa);

                Mesero mesero = new Mesero();
                mesero.setId_mesero(rs.getInt("id_mesero"));
                mesero.getId_mesero();
                pedido.setMesero(mesero);

                pedido.setCosto(rs.getInt("costo"));

                System.out.println(pedido.toString());
                pedidos.add(pedido);
            }

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo listar las reservas");
        }

        return pedidos;
    }
}
