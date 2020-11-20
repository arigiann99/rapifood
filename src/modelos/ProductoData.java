/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.Producto;
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
public class ProductoData {

    private Connection con = null;

    public ProductoData(Conexion conexion) {
        con = conexion.getConection();
    }

    public void agregarProducto(Producto producto) {
        try {
            String sql = "INSERT INTO `producto`(`codigo`, `nombre`, `precio`, `estado`) VALUES (?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, producto.getCodigo());
            st.setString(2, producto.getNombre());
            st.setDouble(3, producto.getPrecio());
            st.setBoolean(4, producto.isEstado());

            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();

            if (rs.next()) {
                producto.setId_producto(rs.getInt("id_producto"));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo encontrar id de producto");
            }

            st.close();
        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo agregar producto");
        }
    }

    public void anularProducto(Producto producto) {
        try {
            String sql = "UPDATE `producto` SET `estado`=? WHERE `id_producto`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setBoolean(1, producto.isEstado());
            st.setInt(2, producto.getId_producto());

            st.executeUpdate();
            st.close();

        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo anular producto");
        }
    }

    public void modificarProducto(Producto producto) {
        try {
            String sql = "UPDATE `producto` SET `codigo`=?,`nombre`=?,`precio`=?,`estado`=? WHERE `id_producto`=?";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(2, producto.getCodigo());
            st.setString(3, producto.getNombre());
            st.setDouble(4, producto.getPrecio());
            st.setBoolean(5, producto.isEstado());
            

            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            System.err.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo modificar producto");
        }
    }

    public Producto buscarProducto(int id) {
        Producto producto = new Producto();
        String sql = " SELECT * FROM producto WHERE id_producto=?";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                producto.setId_producto(rs.getInt("id_producto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCodigo(rs.getInt("codigo"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setEstado(rs.getBoolean("estado"));
            }
            System.out.println("Detalle del Producto:{ Nombre: " + producto.getNombre()+" Codigo: "+producto.getCodigo() + " Precio: " + producto.getPrecio() + " Estado: " + producto.isEstado() + " }");
            ps.close();
        } catch (SQLException e) {
            System.err.print(e.getMessage());
            JOptionPane.showMessageDialog(null, " No se pudo encontrar el producto");
        }
        return producto;
    }
}
