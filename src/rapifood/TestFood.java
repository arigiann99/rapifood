/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood;

import entidades.DetallePedido;
import java.time.LocalDate;
import modelos.Conexion;
import entidades.Mesa;
import entidades.Mesero;
import entidades.Pedido;
import entidades.Producto;
import entidades.Reserva;
import modelos.DetallePedidoData;
import modelos.MesaData;
import modelos.MeseroData;
import modelos.PedidoData;
import modelos.ProductoData;
import modelos.ReservaData;

/**
 *
 * @author GIANELLI
 */
public class TestFood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion con = new Conexion();
        ReservaData rd = new ReservaData(con);

        //Mesa mesa = new Mesa(); // prueba para registrar una reserva.
        //mesa.setId_mesa(4);
        
        // Reserva r1 = new Reserva("Roman", "Riquelme", 36227267,4, LocalDate.now(), false,mesa);
        //r1.setId_reserva(11);//se setea el id para anular o modificar
        
        //ReservaData - Prueba de Metodos
        //rd.registrarReserva(r1);
        //rd.anularReserva(r1); // se debe modicicar reserva instanciada porque es una baja "logica".
        
        //Mesa Data
        MesaData md = new MesaData(con);
        Mesa mesa = new Mesa(6, true);
        mesa.setId_mesa(8); //se setea el id para anular o modificar
        //md.agregarMesa(mesa);
        //md.anularMesa(mesa);
        //md.modificarMesa(mesa);

        //ProductoData
        ProductoData pd = new ProductoData(con);
        Producto p = new Producto(332226, "Salmon ahumado", 750, true);
        //pd.agregarProducto(p);               

        //MeseroData
        MeseroData msd = new MeseroData(con);
        Mesero mesero = new Mesero("Colombo", "Alberto Oscar", 27446449, "20-27446449-0", true);
        mesero.setId_mesero(5);  //se setea el id para anular o modificar
        //msd.agregarMesero(mesero);
        //msd.anularMesero(mesero);
        //msd.modificarMesero(mesero);

        //PedidoData
        PedidoData ped = new PedidoData(con);
        Pedido pedido = new Pedido(true, mesa, mesero);
        pedido.setId_pedido(11);
        //ped.registrarPedido(pedido);
        //ped.anularPedido(pedido);
        //ped.modificarPedido(pedido);
        
        //Detalle pedido data
        DetallePedidoData dpd = new DetallePedidoData(con);
        DetallePedido dp = new DetallePedido( pedido, p);
        dpd.Cantidad_productos(11);

    }

}
