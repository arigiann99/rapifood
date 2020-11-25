package modelos;

import entidades.Mesa;
import entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ReservaData {

    private Connection con = null;

    public ReservaData(Conexion conexion) {
        con = conexion.getConection();
    }

    public void registrarReserva(Reserva reserva) {
        try {
            String sql = "INSERT INTO `reserva`(`apellido`, `nombre`, `dni`, `comensales`, `fecha_hora`, `hora`, `estado`, `id_mesa`) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, reserva.getApellido());
            st.setString(2, reserva.getNombre());
            st.setInt(3, reserva.getDni());
            st.setInt(4, reserva.getComensales());
            st.setDate(5, Date.valueOf(reserva.getFecha_para_reservar()));
            st.setTime(6, Time.valueOf(reserva.getHora()));
            st.setBoolean(7, reserva.isEstado());
            st.setInt(8, reserva.getMesa().getId_mesa());

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

    public void anularReserva(int reserva) { // ver que parametro recibe para dar baja a reserva
        try {
            //Reserva reserva = new Reserva();
            String sql = "UPDATE `reserva` SET `estado`=0 WHERE `id_reserva`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, reserva);
            st.executeUpdate();

            st.close();

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo dar de baja a la reserva");
        }
    }

    public void modificarReserva(Reserva reserva) {
        try {
            String sql = "UPDATE `reserva` SET `apellido`=?,`nombre`=?,`dni`=?,`comensales`=?,`hora`=?,`estado`=?, `id_mesa`=? WHERE `id_reserva`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, reserva.getApellido());
            st.setString(2, reserva.getNombre());
            st.setInt(3, reserva.getDni());
            st.setInt(4, reserva.getComensales());
//            st.setDate(5, Date.valueOf(reserva.getFecha_para_reservar().toString()));
            st.setTime(5, Time.valueOf(reserva.getHora()));
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

    public List<Reserva> listarReservas(LocalDate fecha) {
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva = new Reserva();
        try {

            String sql = "SELECT * FROM `reserva` WHERE `fecha_reserva`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setDate(1, Date.valueOf(fecha));

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                reserva.setId_reserva(rs.getInt("id_reserva"));
                reserva.setApellido(rs.getString("apellido"));
                reserva.setNombre(rs.getString("nombre"));
                reserva.setDni(rs.getInt("dni"));
                reserva.setComensales(rs.getInt("comensales"));
                reserva.setFechaActual(rs.getDate("fecha_reserva").toLocalDate());
                reserva.setFecha_para_reservar(rs.getDate("fecha_para_reservar").toLocalDate());
                reserva.setHora(rs.getTime("hora").toLocalTime());
                reserva.setEstado(rs.getBoolean("estado"));

                Mesa mesa = new Mesa();
                mesa.setId_mesa(rs.getInt("id_mesa"));
                reserva.setMesa(mesa);

                System.out.println(reserva.toString());
                reservas.add(reserva);
            }

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo listar las reservas");
        }

        return reservas;
    }
    
    public Reserva buscarReserva(int id) {
        Reserva reserva = new Reserva();
        String sql = "SELECT * FROM reserva WHERE id_reserva=?";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                reserva.setApellido(rs.getString("apellido"));
                reserva.setNombre(rs.getString("nombre"));
                reserva.setDni(rs.getInt("dni"));
                reserva.setComensales(rs.getInt("comensales"));
                reserva.setFecha_para_reservar(rs.getDate("fecha_hora").toLocalDate());
                reserva.setHora(rs.getTime("hora").toLocalTime());
                reserva.setEstado(rs.getBoolean("estado"));
                reserva.setFechaActual(rs.getDate("fecha_actual").toLocalDate());
                reserva.setId_reserva(rs.getInt("id_reserva"));
              
                Mesa mesa = new Mesa();
                mesa.setId_mesa(rs.getInt("id_mesa"));
                mesa.getId_mesa();
                reserva.setMesa(mesa);
               
            }
            //System.out.println("Mesero: { Nombre: " + mesero.getNombre() + " " + mesero.getApellido() + " Dni: " + mesero.getDni() + " Cuit: " + mesero.getCuit() + " Estado: " + mesero.isEstado() + " }");
            
            ps.close();
            
        } catch (SQLException e) {
            System.err.print(e.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo encontrar la reserva");
        }
        return reserva;
    }
    
    
    public List<Reserva> buscarReservaXfecha(LocalDate fecha_hora){
        List<Reserva> reservas = new ArrayList<>();
        Reserva r= null;
        String sql = "SELECT * FROM reserva WHERE fecha_hora=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDate(1, java.sql.Date.valueOf(fecha_hora));
            ResultSet rs = ps.executeQuery();
    
            while (rs.next()) {
                r=new Reserva();
                r.setId_reserva(rs.getInt("id_reserva"));
                r.setApellido(rs.getString("apellido"));
                r.setNombre(rs.getString("nombre"));
                r.setDni(rs.getInt("dni"));
                r.setComensales(rs.getInt("comensales"));
                r.setFecha_para_reservar(rs.getDate("fecha_hora").toLocalDate());
                r.setHora(rs.getTime("hora").toLocalTime());
                r.setEstado(rs.getBoolean("estado"));
                r.setFechaActual(rs.getDate("fecha_actual").toLocalDate());
                Mesa mesa = new Mesa();
                mesa.setId_mesa(rs.getInt("id_mesa"));
                mesa.getId_mesa();
                r.setMesa(mesa);
                reservas.add(r);
            }
            //System.out.println("Mesero: { Nombre: " + mesero.getNombre() + " " + mesero.getApellido() + " Dni: " + mesero.getDni() + " Cuit: " + mesero.getCuit() + " Estado: " + mesero.isEstado() + " }");
            
            ps.close();
            
        } catch (SQLException e) {
            System.err.print(e.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo encontrar la reserva");
        }
        return reservas;
    }

}
