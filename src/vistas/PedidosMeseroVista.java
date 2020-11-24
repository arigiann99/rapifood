/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Mesero;
import entidades.Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelos.Conexion;
import modelos.MeseroData;
import modelos.PedidoData;

/**
 *
 * @author mgara
 */
public class PedidosMeseroVista extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private MeseroData md;
    private PedidoData pd;
    private ArrayList<Mesero> listaMeseros;
    private ArrayList<Pedido> listaPedidos;
    private Conexion con;

    public PedidosMeseroVista() {
        initComponents();
        con = new Conexion();
        modelo = new DefaultTableModel();

        md = new MeseroData(con);
        listaMeseros = (ArrayList<Mesero>) md.obtenerMeseros();

        pd = new PedidoData(con);
        cargarMeseros();
        armarCabeceraTabla();
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlPedidosAtendidos = new javax.swing.JLabel();
        jlMesero = new javax.swing.JLabel();
        jcbMeseros = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedidos = new javax.swing.JTable();
        jbVolver = new javax.swing.JButton();

        jlPedidosAtendidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlPedidosAtendidos.setText("PEDIDOS ATENDIDOS POR DIA");

        jlMesero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlMesero.setText("Mesero:");

        jcbMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMeserosActionPerformed(evt);
            }
        });

        jtPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtPedidos);

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
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlPedidosAtendidos)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlMesero)
                        .addGap(18, 18, 18)
                        .addComponent(jcbMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlPedidosAtendidos)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMesero)
                    .addComponent(jcbMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbVolver)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMeserosActionPerformed
        cargarDatos();
    }//GEN-LAST:event_jcbMeserosActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    public void borrarFilasTablas() {
        int a = modelo.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarMeseros() {
        for (Mesero item : listaMeseros) {
            jcbMeseros.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> columns = new ArrayList<>();
        columns.add("Id");
        columns.add("Fecha");
        columns.add("Id Mesa");
        columns.add("Id Mesero");
        columns.add("Estado");
        columns.forEach((it) -> {
            modelo.addColumn(it);
        });
        jtPedidos.setModel(modelo);
    }

    private void cargarDatos() {
        borrarFilasTablas();
        Mesero select = (Mesero) jcbMeseros.getSelectedItem();
        listaPedidos = (ArrayList) pd.PedidosAtendidosPorMeseros(select.getId_mesero());

        for (Pedido m : listaPedidos) {
            modelo.addRow(new Object[]{m.getId_pedido(), m.getFecha_pedido(), m.getMesa(), m.getMesero(), m.isEstado()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<Mesero> jcbMeseros;
    private javax.swing.JLabel jlMesero;
    private javax.swing.JLabel jlPedidosAtendidos;
    private javax.swing.JTable jtPedidos;
    // End of variables declaration//GEN-END:variables
}
