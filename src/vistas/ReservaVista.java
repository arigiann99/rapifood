/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Mesa;
import entidades.Reserva;
import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import modelos.Conexion;
import modelos.ReservaData;

/**
 *
 * @author mgara
 */
public class ReservaVista extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReservaVista
     */
    private ReservaData rd;
    private Conexion con;

    public ReservaVista() {
        initComponents();
        con = new Conexion();
        rd = new ReservaData(con);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlFormularioReserva = new javax.swing.JLabel();
        jlId = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jlComensales = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jlHora = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlFechaActual = new javax.swing.JLabel();
        jlMesa = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jtId = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtComensales = new javax.swing.JTextField();
        jtMesa = new javax.swing.JTextField();
        jtHora = new javax.swing.JTextField();
        jchEstado = new javax.swing.JCheckBox();
        jdcFechaActual = new com.toedter.calendar.JDateChooser();
        jdcFecha = new com.toedter.calendar.JDateChooser();

        jlFormularioReserva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlFormularioReserva.setText("FORMULARIO RESERVA");

        jlId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlId.setText("ID:");

        jlNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlNombre.setText("Nombre:");

        jlApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlApellido.setText("Apellido:");

        jlDni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlDni.setText("Dni:");

        jlComensales.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlComensales.setText("Cantidad de comensales:");

        jlFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlFecha.setText("Fecha:");

        jlHora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlHora.setText("Hora:");

        jlEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlEstado.setText("Estado:");

        jlFechaActual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlFechaActual.setText("Fecha actual:");

        jlMesa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlMesa.setText("Mesa:");

        jbBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBorrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbVolver.setText("Volver");

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jlFormularioReserva)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlNombre)
                                .addGap(18, 18, 18)
                                .addComponent(jtNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlApellido)
                                .addGap(18, 18, 18)
                                .addComponent(jtApellido))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlDni)
                                .addGap(43, 43, 43)
                                .addComponent(jtDni))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlId)
                                .addGap(48, 48, 48)
                                .addComponent(jtId)
                                .addGap(37, 37, 37)
                                .addComponent(jbBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlComensales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtComensales))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jlMesa)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jlHora)
                                            .addGap(18, 18, 18)
                                            .addComponent(jtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jlEstado)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jchEstado))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jlFechaActual)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jdcFechaActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jbVolver)
                        .addContainerGap(44, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlFormularioReserva)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId)
                    .addComponent(jbBuscar)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDni)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlComensales)
                    .addComponent(jtComensales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFecha)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHora))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEstado)
                    .addComponent(jchEstado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlFechaActual)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbGuardar)
                            .addComponent(jbBorrar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbActualizar)
                            .addComponent(jbLimpiar)
                            .addComponent(jbVolver)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jdcFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMesa))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:

        String nombre = jtNombre.getText();
        String apellido = jtApellido.getText();
        int dni = Integer.parseInt(jtDni.getText());
        int comensales = Integer.parseInt(jtComensales.getText());
        LocalDate fechaR = LocalDateTime.ofInstant(jdcFecha.getDate().toInstant(), ZoneId.systemDefault()).toLocalDate();
        LocalTime hora = LocalTime.parse(jtHora.getText());
        boolean estado = jchEstado.isEnabled();
        LocalDate fecha_actual = LocalDateTime.ofInstant(jdcFechaActual.getDate().toInstant(), ZoneId.systemDefault()).toLocalDate();
        Mesa mesa = new Mesa();
        mesa.setId_mesa(Integer.parseInt(jtMesa.getText()));
        Reserva R = new Reserva(nombre, apellido, dni, comensales, fechaR, hora, estado, fecha_actual, mesa);
        rd.registrarReserva(R);
        jbLimpiarActionPerformed(evt);
        JOptionPane.showMessageDialog(this, "Se guardo la la reserva");

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jtId.getText());
        Reserva reserva = rd.buscarReserva(id);
        if (reserva != null) {
            jtId.setText("" + reserva.getId_reserva());
            jtNombre.setText(reserva.getNombre());
            jtApellido.setText(reserva.getApellido());
            jtDni.setText("" + reserva.getDni());
            jtComensales.setText("" + reserva.getComensales());
            jdcFecha.setDateFormatString(reserva.getFecha_para_reservar().toString());
            jtHora.setText(reserva.getHora().toString());
            jchEstado.setSelected(reserva.isEstado());
            jdcFechaActual.setDateFormatString(reserva.getFechaActual().toString());
            jtMesa.setText("" + reserva.getMesa());

    }//GEN-LAST:event_jbBuscarActionPerformed
    }
    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        jtId.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
        jtDni.setText("");
        jtComensales.setText("");
        jtHora.setText("");
        jchEstado.setSelected(false);
        jdcFecha.setDateFormatString("");
        jdcFechaActual.setDateFormatString("");
        jtMesa.setText("");

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jtId.getText());
        rd.anularReserva(id);


    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
        if (jtId.getText() != null) {
            String nombre = jtNombre.getText();
            String apellido = jtApellido.getText();
            int dni = Integer.parseInt(jtDni.getText());
            int comensales = Integer.parseInt(jtComensales.getText());
            LocalDate fechaR = LocalDateTime.ofInstant(jdcFecha.getDate().toInstant(), ZoneId.systemDefault()).toLocalDate();
            LocalTime hora = LocalTime.parse(jtHora.getText());
            boolean estado = jchEstado.isEnabled();
            LocalDate fecha_actual = LocalDateTime.ofInstant(jdcFechaActual.getDate().toInstant(), ZoneId.systemDefault()).toLocalDate();
            Mesa mesa = new Mesa();
            mesa.setId_mesa(Integer.parseInt(jtMesa.getText()));
            Reserva R = new Reserva(nombre, apellido, dni, comensales, fechaR, hora, estado, fecha_actual, mesa);
            rd.modificarReserva(R);
            jbLimpiarActionPerformed(evt);
            JOptionPane.showMessageDialog(this, "Se actualizo la reserva");
        }
    }//GEN-LAST:event_jbActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JCheckBox jchEstado;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private com.toedter.calendar.JDateChooser jdcFechaActual;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlComensales;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlFechaActual;
    private javax.swing.JLabel jlFormularioReserva;
    private javax.swing.JLabel jlHora;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlMesa;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtComensales;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtHora;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtMesa;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
