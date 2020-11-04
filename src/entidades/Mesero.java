/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author GIANELLI
 */
public class Mesero {
    private int id_mesero;
    private String nombre;
    private String apellido;
    private int dni;
    private long cuit;
    private boolean estado;

    public Mesero() {
    }

    public Mesero(String nombre, String apellido, int dni, long cuit, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
        this.estado = estado;
    }

    public Mesero(int id_mesero, String nombre, String apellido, int dni, long cuit, boolean estado) {
        this.id_mesero = id_mesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId_mesero() {
        return id_mesero;
    }

    public void setId_mesero(int id_mesero) {
        this.id_mesero = id_mesero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Mesero{" + "id_mesero=" + id_mesero + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", cuit=" + cuit + ", estado=" + estado + '}';
    }
    
    
}
