/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author GIANELLI
 */
public class Reserva {

    private int id_reserva;
    private String nombre;
    private String apellido;
    private int dni;
    private int comensales;
    private LocalDate fechaHora;
    private boolean estado;
    private Date fechaActual;
    private Mesa mesa;

    public Reserva() {
    }

    public Reserva(String nombre, String apellido, int dni, int comensales, LocalDate fechaHora, boolean estado, Mesa mesa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.comensales = comensales;
        this.fechaHora = fechaHora;
        this.estado = estado;
        this.mesa = mesa;
    }

    public Reserva(int id_reserva, String nombre, String apellido, int dni, int comensales, LocalDate fechaHora, boolean estado) {
        this.id_reserva = id_reserva;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.comensales = comensales;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
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

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id_reserva=" + id_reserva + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", comensales=" + comensales + ", fechaHora=" + fechaHora + ", estado=" + estado + ", fechaActual=" + fechaActual + '}';
    }

}
