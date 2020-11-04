package modelos;

import entidades.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MesaData {

    private Connection con = null;

    public MesaData(Conexion conexion) {
        con = conexion.getConection();
    }

    public void agregarMesa(Mesa mesa) {
        try {
            String sql = "INSERT INTO `mesa`(`capacidad`, `estado`) VALUES (?,?)";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, mesa.getCapacidad());
            st.setBoolean(2, mesa.isEstado());
            st.executeUpdate();

            ResultSet rs = st.getGeneratedKeys();

            if (rs.next()) {
                mesa.setId_mesa(rs.getInt("id_mesa"));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener id de mesa");
            }

            st.close();

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo agregar mesa");
        }

    }

    public void anularMesa(Mesa mesa) {
        try {
            //Reserva reserva = new Reserva();
            String sql = "UPDATE `mesa` SET `estado`=? WHERE `id_mesa`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setBoolean(1, mesa.isEstado());
            st.setInt(2, mesa.getId_mesa());

            st.executeUpdate();

            st.close();

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo dar de baja a la mesa");
        }
    }

    public void modificarMesa(Mesa mesa) {

        try {
            String sql = "UPDATE `mesa` SET `capacidad` =?,`estado`=? WHERE `id_mesa`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, mesa.getCapacidad());
            st.setBoolean(2, mesa.isEstado());
            st.setInt(3, mesa.getId_mesa());

            st.executeUpdate();
            st.close();

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo modificar mesa");
        }
    }
}
