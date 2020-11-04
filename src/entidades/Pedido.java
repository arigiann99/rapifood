package entidades;

import java.util.Date;

public class Pedido {

    private int id_pedido;
    private Date fecha_pedido;
    private boolean estado;
    private Mesa mesa;
    private Mesero mesero;

    public Pedido() {
    }

    public Pedido(Date fecha_pedido, boolean estado, Mesa mesa, Mesero mesero) {
        this.fecha_pedido = fecha_pedido;
        this.estado = estado;
        this.mesa = mesa;
        this.mesero = mesero;
    }

    public Pedido(int id_pedido, Date fecha_pedido, boolean estado, Mesa mesa, Mesero mesero) {
        this.id_pedido = id_pedido;
        this.fecha_pedido = fecha_pedido;
        this.estado = estado;
        this.mesa = mesa;
        this.mesero = mesero;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
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

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id_pedido=" + id_pedido + ", fecha_pedido=" + fecha_pedido + ", estado=" + estado + ", mesa=" + mesa + ", mesero=" + mesero + '}';
    }

}
