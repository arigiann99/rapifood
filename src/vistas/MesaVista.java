/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Mesa;
import javax.swing.JOptionPane;
import modelos.Conexion;
import modelos.MesaData;

/**
 *
 * @author mgara
 */
public class MesaVista extends javax.swing.JInternalFrame {

    MesaData md;
    Conexion con;
    public MesaVista() {
        initComponents();
        con= new Conexion();
        md= new MesaData(con);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlFormularioMesa = new javax.swing.JLabel();
        jlId = new javax.swing.JLabel();
        jlCapacidad = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jtCapacidad = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JCheckBox();
        jbBuscar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();

        jlFormularioMesa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlFormularioMesa.setText("FORMULARIO MESA");

        jlId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlId.setText("ID:");

        jlCapacidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlCapacidad.setText("Capacidad:");

        jlEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlEstado.setText("Estado:");

        jtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtIdKeyPressed(evt);
            }
        });

        jtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtCapacidadKeyPressed(evt);
            }
        });

        jcbEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcbEstado.setText("Activo");
        jcbEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbEstadoKeyPressed(evt);
            }
        });

        jbBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.setEnabled(false);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.setEnabled(false);
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbBorrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbBorrar.setText("Borrar");
        jbBorrar.setEnabled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
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
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jlFormularioMesa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jlId)
                                .addGap(54, 54, 54)
                                .addComponent(jtId))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCapacidad)
                                    .addComponent(jlEstado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcbEstado)
                                        .addGap(0, 26, Short.MAX_VALUE))
                                    .addComponent(jtCapacidad))))
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscar)))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbVolver)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbBorrar)
                            .addComponent(jbGuardar))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbActualizar)
                            .addComponent(jbLimpiar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlFormularioMesa)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlId)
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar))
                        .addGap(41, 41, 41)
                        .addComponent(jlCapacidad))
                    .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEstado)
                    .addComponent(jcbEstado))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbActualizar))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBorrar)
                    .addComponent(jbLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jbVolver)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
       dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
       jtId.setText("");
       jtCapacidad.setText("");
       jcbEstado.setSelected(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdKeyPressed
       jbBuscar.setEnabled(true);
       jbBorrar.setEnabled(true);
       jbLimpiar.setEnabled(true);
    }//GEN-LAST:event_jtIdKeyPressed

    private void jtCapacidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCapacidadKeyPressed
        jbGuardar.setEnabled(true);
        jbActualizar.setEnabled(true);
    }//GEN-LAST:event_jtCapacidadKeyPressed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int capacidad=Integer.parseInt(jtCapacidad.getText());
        boolean estado=jcbEstado.isEnabled();
        Mesa m=new Mesa(capacidad,estado);
        md.agregarMesa(m);
        jtId.setText(m.getId_mesa()+"");
        JOptionPane.showMessageDialog(this, "Mesa guardada");
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        if(jtId!=null){
            int id=Integer.parseInt(jtId.getText());
            int capacidad=Integer.parseInt(jtCapacidad.getText());
            boolean estado=jcbEstado.isEnabled();
            Mesa m=new Mesa(id,capacidad,estado);
            md.modificarMesa(m);
            jbLimpiarActionPerformed(evt);
            JOptionPane.showMessageDialog(this, "Modificacion guardada");
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        if(jtId.getText()!=null){
           int id=Integer.parseInt(jtId.getText());
           int capacidad=Integer.parseInt(jtCapacidad.getText());
           boolean estado=jcbEstado.isEnabled();
           Mesa m=new Mesa(id,capacidad,estado);
           md.anularMesa(m);
           jbLimpiarActionPerformed(evt);
           JOptionPane.showMessageDialog(this, "Se anulo la mesa");
       }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        int id = Integer.parseInt(jtId.getText());
        Mesa m=md.buscarMesa(id);
        if (m != null) {
            jtId.setText(m.getId_mesa()+ "");
            jtCapacidad.setText(m.getCapacidad()+ "");
            jcbEstado.setSelected(m.isEstado());
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcbEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbEstadoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEstadoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JCheckBox jcbEstado;
    private javax.swing.JLabel jlCapacidad;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFormularioMesa;
    private javax.swing.JLabel jlId;
    private javax.swing.JTextField jtCapacidad;
    private javax.swing.JTextField jtId;
    // End of variables declaration//GEN-END:variables
}
