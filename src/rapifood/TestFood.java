/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood;

import java.time.LocalDate;
import modelos.Conexion;
import entidades.Mesa;
import entidades.Reserva;
import modelos.MesaData;
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
        //MesaData md = new MesaData(con);
        //Mesa mesa = new Mesa(6, true);
       // mesa.setId_mesa(8); //se setea el id para anular o modificar
        //md.agregarMesa(mesa);
        //md.anularMesa(mesa);
        //md.modificarMesa(mesa);
    }
    
}
