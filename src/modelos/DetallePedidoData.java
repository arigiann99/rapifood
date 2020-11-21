/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.*;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author GIANELLI
 */
public class DetallePedidoData {

    private Connection con = null;
    private Conexion conexion;

    public DetallePedidoData(Conexion conexion) {
        this.conexion = conexion;
        con = conexion.getConection();
    }

    public void agregarDetalles(DetallePedido detallePedido) {
        try {
            String sql = "INSERT INTO `detalle_pedido`(`id_pedido`, `id_producto`) VALUES (?,?)";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, detallePedido.getPedido().getId_pedido());
            st.setInt(2, detallePedido.getProducto().getId_producto());

            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();

            if (rs.next()) {
                detallePedido.setId_detalle(rs.getInt("id_detalle"));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener id del detalle de pedido");
            }
            st.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo agregar el requerimiento");
        }
    }

    public void modificarDetalles(int producto, int detalle, int pedido) {
        try {
            //Reserva reserva = new Reserva();
            String sql = "UPDATE `detalle_pedido` SET `id_producto`=? WHERE `id_detalle`=? AND `id_pedido`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, producto);
            st.setInt(2, detalle);
            st.setInt(3, pedido);

            st.executeUpdate();

            st.close();

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo modificar el detalle  pedido");
        }
    }

    public void borrarDetalleDePedido(int detalle) {
        try {
            String sql = "DELETE FROM `detalle_pedido` WHERE =?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, detalle);

            st.executeUpdate();
            st.close();

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo borrar el detalle de Pedido");
        }

    }

    public List<DetallePedido> listarDetallesDeUnPedido(int pedido) {
        List<DetallePedido> detalleP = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `detalle_pedido` WHERE id_pedido=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, pedido);
            ResultSet rs = st.executeQuery();
            DetallePedido dPedido;
            while (rs.next()) {
                dPedido = new DetallePedido();
                dPedido.setId_detalle(rs.getInt("id_detalle"));

                Pedido p = buscarPedido(rs.getInt("id_pedido"));
                dPedido.setPedido(p);

                Producto producto = buscarProducto(rs.getInt("id_producto"));
                dPedido.setProducto(producto);

                detalleP.add(dPedido);
            }

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo listar detalles de Pedido");
        }
        return detalleP;
    }

    public Pedido buscarPedido(int id) {

        PedidoData pd = new PedidoData(conexion);

        return pd.buscarPedido(id);

    }

    public Producto buscarProducto(int id) {

        ProductoData pdata = new ProductoData(conexion);
        return pdata.buscarProducto(id);
    }
}
