/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.*;
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
    private LocalDate fecha_para_reservar;
    private LocalTime hora;
    private boolean estado;
    private LocalDate fechaActual;
    private Mesa mesa;

    public Reserva() {
    }

    public Reserva(String nombre, String apellido, int dni, int comensales, LocalDate fecha_para_reservar,  boolean estado, Mesa mesa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.comensales = comensales;
        this.fecha_para_reservar = fecha_para_reservar;
        
        this.estado = estado;
        this.mesa = mesa;
    }

    public Reserva(String nombre, String apellido, int dni, int comensales, LocalDate fecha_para_reservar, LocalTime hora, boolean estado, Mesa mesa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.comensales = comensales;
        this.fecha_para_reservar = fecha_para_reservar;
        this.hora = hora;
        this.estado = estado;
        this.mesa = mesa;
    }
    
    
    
    
    public Reserva(String nombre, String apellido, int dni, int comensales, LocalDate fecha_para_reservar, LocalTime hora, boolean estado, LocalDate fechaActual, Mesa mesa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.comensales = comensales;
        this.fecha_para_reservar = fecha_para_reservar;
        this.hora = hora;
        this.estado = estado;
        this.mesa = mesa;
    }

    public Reserva( String nombre, String apellido, int dni, int comensales, LocalTime hora, boolean estado, Mesa mesa, int id_reserva) {
        this.id_reserva = id_reserva;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.comensales = comensales;
//        this.fecha_para_reservar = fecha_para_reservar;
        this.hora = hora;
        this.estado = estado;
        this.mesa = mesa;
    }
    
    
    public Reserva(int id_reserva, String nombre, String apellido, int dni, int comensales, LocalDate fecha_para_reservar, LocalTime hora, boolean estado, LocalDate fechaActual, Mesa mesa) {
        this.id_reserva = id_reserva;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.comensales = comensales;
        this.fecha_para_reservar = fecha_para_reservar;
        this.hora = hora;
        this.estado = estado;
        this.fechaActual = fechaActual;
        this.mesa = mesa;
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

    public LocalDate getFecha_para_reservar() {
        return fecha_para_reservar;
    }

    public void setFecha_para_reservar(LocalDate fecha_para_reservar) {
        this.fecha_para_reservar = fecha_para_reservar;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(LocalDate fechaActual) {
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
        return "Reserva{" + "id_reserva=" + id_reserva + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", comensales=" + comensales + ", fecha_para_reservar=" + fecha_para_reservar + ", hora=" + hora + ", estado=" + estado + ", fechaActual=" + fechaActual + ", mesa=" + mesa + '}';
    }

}