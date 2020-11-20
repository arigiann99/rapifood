/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.DetallePedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author GIANELLI
 */
public class DetallePedidoData {

    private Connection con = null;

    public DetallePedidoData(Conexion conexion) {
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
    
    public void modificarDetalles(DetallePedido detallePedido) {
        try {
            //Reserva reserva = new Reserva();
            String sql = "UPDATE `detalle_pedido` SET `id_pedido`=? `id_producto`=? WHERE `id_detalle`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(4, detallePedido.getPedido().getId_pedido());
            st.setInt(5, detallePedido.getProducto().getId_producto());

            st.executeUpdate();

            st.close();

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo modificar el detalle  pedido");
        }
    }
    
   

}
