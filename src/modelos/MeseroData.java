/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.Mesero;
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
public class MeseroData {

    private Connection con = null;

    public MeseroData(Conexion conexion) {
        con = conexion.getConection();
    }

    public void agregarMesero(Mesero mesero) {
        try {
            String sql = "INSERT INTO `mesero`(`apellido`, `nombre`, `cuit`, `estado`, `dni`) VALUES (?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, mesero.getApellido());
            st.setString(2, mesero.getNombre());
            st.setString(3, mesero.getCuit());
            st.setBoolean(4, mesero.isEstado());
            st.setInt(5, mesero.getDni());

            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();

            if (rs.next()) {
                mesero.setId_mesero(rs.getInt("id_mesero"));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo encontrar id de mesero");
            }

            st.close();
        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo agregar un mesero");
        }
    }

    public void anularMesero(Mesero mesero) {
        try {
            String sql = "UPDATE `mesero` SET `estado`=? WHERE `id_mesero`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setBoolean(1, mesero.isEstado());
            st.setInt(2, mesero.getId_mesero());

            st.executeUpdate();
            st.close();

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo anular producto");
        }
    }

    public void modificarMesero(Mesero mesero) {
        try {
            String sql = "UPDATE `mesero` SET `apellido`=?,`nombre`=?,`cuit`=?,`estado`=?,`dni`=? WHERE `id_mesero`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, mesero.getApellido());
            st.setString(2, mesero.getNombre());
            st.setString(3, mesero.getCuit());
            st.setBoolean(4, mesero.isEstado());
            st.setInt(5, mesero.getDni());
            st.setInt(6, mesero.getId_mesero());

            st.executeUpdate();
            st.close();

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo modificar informacion de mesero");
        }
    }
}
