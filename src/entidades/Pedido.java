package entidades;

import java.util.Date;

public class Pedido {

    private int id_pedido;
    private Date fecha_pedido;
    private boolean estado;
    private double costo;
    private Mesa mesa;
    private Mesero mesero;

    public Pedido() {
    }

    public Pedido(Mesa mesa, Mesero mesero) {
        this.mesa = mesa;
        this.mesero = mesero;
    }
    
    
    public Pedido(boolean estado, Mesa mesa, Mesero mesero) {
        this.estado = estado;
        this.mesa = mesa;
        this.mesero = mesero;
    }
    
    
    public Pedido(Date fecha_pedido, boolean estado, double costo, Mesa mesa, Mesero mesero) {
        this.fecha_pedido = fecha_pedido;
        this.estado = estado;
        this.costo = costo;
        this.mesa = mesa;
        this.mesero = mesero;
    }

    public Pedido(int id_pedido, Date fecha_pedido, boolean estado, double costo, Mesa mesa, Mesero mesero) {
        this.id_pedido = id_pedido;
        this.fecha_pedido = fecha_pedido;
        this.estado = estado;
        this.costo = costo;
        this.mesa = mesa;
        this.mesero = mesero;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id_pedido=" + id_pedido + ", fecha_pedido=" + fecha_pedido + ", estado=" + estado + ", costo=" + costo + ", mesa=" + mesa + ", mesero=" + mesero + '}';
    }

   
}
