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
        Mesa mesa = new Mesa();
        mesa.setId_mesa(4);
        
        Reserva r1 = new Reserva("Roman", "Riquelme", 36227267,4, LocalDate.now(), false,mesa);
        r1.setId_reserva(11);
        
        //ReservaData - Prueba de Metodos
        //rd.registrarReserva(r1);
        //rd.anularReserva(r1); // se debe modicicar reserva instanciada porque es una baja "logica".
    }
    
}
