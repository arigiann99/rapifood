/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood;

import entidades.DetallePedido;
import modelos.Conexion;
import entidades.Mesa;
import entidades.Mesero;
import entidades.Pedido;
import entidades.Producto;
import entidades.Reserva;
import java.time.*;
import modelos.DetallePedidoData;
import modelos.MesaData;
import modelos.MeseroData;
import modelos.PedidoData;
import modelos.ProductoData;
import modelos.ReservaData;


public class TestFood {

   
    public static void main(String[] args) {
        Conexion con = new Conexion();
        ReservaData rd = new ReservaData(con);

        Mesa mesa = new Mesa(); //Se instancia una mesa con su id para asignarla a una reserva al momento de registrar.
        mesa.setId_mesa(8);
        
        //Reserva r1 = new Reserva("Marcelo", "Pochetino", 20123654,4, LocalDate.of(2020, 11, 20),LocalTime.of(21, 15), true,mesa);
      //  Reserva r1 = new Reserva("Lucas", "Weber", 27996774,6, LocalDate.of(2020, 11, 27),LocalTime.of(22, 30), true,mesa);
        //Reserva r1 = new Reserva("Julian", "Azcurra", 31556998,2, LocalDate.of(2020, 11, 19),LocalTime.of(12, 30), true,mesa);
        //r1.setId_reserva(16);//se setea el id para anular o modificar
        
        //RESERVA DATA -- PRUEBA DE METODOS
        
        //rd.registrarReserva(r1);
        //rd.modificarReserva(r1); //se setea el id para identificar que reserva anular o modificar
        //rd.anularReserva(r1); // se debe modicicar reserva instanciada porque es una baja "logica".
        //rd.listarReservas(LocalDate.of(2020, 11, 9)); //Las reservas realizadas en una fecha específica.(CONSIGNA)
        
        //MESA DATA -- PRUEBA DE METODOS
        
        MesaData md = new MesaData(con);
        //Mesa mesa = new Mesa(2, true);
        //mesa.setId_mesa(8); //se setea el id para identificar que mesa anular o modificar
        //md.agregarMesa(mesa);
        //md.anularMesa(mesa);
        //md.modificarMesa(mesa);
        //md.buscarMesa(8);

        //PRODUCTO DATA -- PRUEBA DE METODOS
        
        ProductoData pd = new ProductoData(con);
        //Producto p = new Producto(332278, "Ensalada Rusa", 250, true);
        Producto p = new Producto(333256, "vino Nampe 750cc", 350, true);
        //Producto p = new Producto(3852246, "chivito a las llamas", 1050, true);
        //Producto p = new Producto(332235, "Agua mineral 500cc", 100, true);
        //pd.agregarProducto(p);
//        p.setId_producto(21); //se setea el id para identificar que producto anular o modificar
        //pd.modificarProducto(p);
        //pd.buscarProducto(16);
//        System.out.println(pd.buscarProductosActivos());
//        System.out.println(pd.buscarProductosNoActivos());

        //MESERO DATA -- PRUEBA DE METODOS
        MeseroData msd = new MeseroData(con);
        Mesero mesero = new Mesero("Sosa", "Alberto Oscar", 27446449, "20-27446449-0", true);
        //Mesero mesero = new Mesero("Rosales", "Mario Dario", 34629654, "20-34629654-0", false);
        //Mesero mesero = new Mesero("Quiroga", "Juan Carlos", 30155236, "20-30155236-0", true);
        //Mesero mesero = new Mesero("Zabala", "Roxana", 39877455, "27-39877455-3", true);
        //mesero.setId_mesero(9);  //se setea el id para identificar que mesero anular o modificar
        //msd.agregarMesero(mesero);
        //msd.anularMesero(mesero);
        //msd.modificarMesero(mesero);
        //msd.buscarMesero(9);

        //PEDIDO DATA -- PRUEBA DE METODOS
        PedidoData ped = new PedidoData(con);
        Pedido pedido = new Pedido(true, mesa, mesero);
        pedido.setId_pedido(17);
        //ped.registrarPedido(pedido);
        //ped.anularPedido(pedido);
        //ped.modificarPedido(pedido);
        //ped.PedidosAtendidosPorMeseros(9); // Al final del día obtener cuántos pedidos atendió cada mesero (CONSIGNA).
        //ped.costoXPedido(18); // se setea el id del pedido para saber cuantos productos debe contar y sumar.
        //ped.listarPedidos(LocalDate.of(2020, 11, 9)); // Obtener pedidos realizados y     (CONSIGNA)
                                                        //los montos consumidos por cada mesa en una fecha dada.
        
        //DETALLE PEDIDO DATA -- PRUEBA DE METODOS
        DetallePedidoData dpd = new DetallePedidoData(con);
        DetallePedido dp = new DetallePedido( pedido, p);
        //dpd.agregarDetalles(dp);
        dpd.listarDetallesDeUnPedido(18);
        

    }

}
