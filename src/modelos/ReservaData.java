package modelos;

import entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ReservaData {

    private Connection con = null;

    public ReservaData(Conexion conexion) {
        con = conexion.getConection();
    }

    public void registrarReserva(Reserva reserva) {
        try {
            String sql = "INSERT INTO `reserva`(`apellido`, `nombre`, `dni`, `comensales`, `fecha_hora`, `estado`, `id_mesa`) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, reserva.getApellido());
            st.setString(2, reserva.getNombre());
            st.setInt(3, reserva.getDni());
            st.setInt(4, reserva.getComensales());
            st.setDate(5, Date.valueOf(reserva.getFechaHora()));
            st.setBoolean(6, reserva.isEstado());
            st.setInt(7, reserva.getMesa().getId_mesa());

            st.executeUpdate();

            ResultSet rs = st.getGeneratedKeys();

            if (rs.next()) {
                reserva.setId_reserva(rs.getInt(1));

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener id de reserva");
            }

            st.close();

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo guardar reserva");
        }

    }

    public void anularReserva(Reserva reserva) { // ver que parametro recibe para dar baja a reserva
        try {
            //Reserva reserva = new Reserva();
            String sql = "UPDATE `reserva` SET `estado`=? WHERE `id_reserva`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setBoolean(1, reserva.isEstado());
            st.setInt(2, reserva.getId_reserva());

            st.executeUpdate();

            st.close();

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo dar de baja a la reserva");
        }
    }

    public void modificarReserva(Reserva reserva) {
        try {
            String sql = "UPDATE `reserva` SET `apellido`=?,`nombre`=?,`dni`=?,`comensales`=?,`fecha_hora`=?,`estado`=?,`id_mesa`=? WHERE `id_reserva`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, reserva.getApellido());
            st.setString(2, reserva.getNombre());
            st.setInt(3, reserva.getDni());
            st.setInt(4, reserva.getComensales());
            st.setDate(5, Date.valueOf(reserva.getFechaHora()));
            st.setBoolean(6, reserva.isEstado());
            st.setInt(7, reserva.getMesa().getId_mesa());
            st.setInt(8, reserva.getId_reserva());

            st.executeUpdate();
            st.close();

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo actualizar reserva");
        }
    }

}
