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
public class DetallePedido {

    private int id_detalle;
    //private int cantidad_productos;
    //private double costo;
    private Pedido pedido;
    private Producto producto;

    public DetallePedido() {
    }

    public DetallePedido(Pedido pedido, Producto producto) {
        this.pedido = pedido;
        this.producto = producto;
    }

    public DetallePedido(int id_detalle, Pedido pedido, Producto producto) {
        this.id_detalle = id_detalle;
        this.pedido = pedido;
        this.producto = producto;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetallePedido{" + "id_detalle=" + id_detalle + ", cantidad_productos=" + "pedido=" + pedido + ", producto=" + producto + '}';
    }

}
