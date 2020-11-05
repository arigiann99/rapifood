/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author GIANELLI
 */
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
    
    

}
