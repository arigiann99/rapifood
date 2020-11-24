/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.*;

/**
 *
 * @author GIANELLI
 */
public class PedidoVista extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ArrayList<Mesa> listaMesa;
    private MesaData mesaData;
    private ArrayList<Mesero> listaMesero;
    private MeseroData meseroData;
    private ArrayList<Producto> listaProducto;
    private ProductoData productoData;
    private PedidoData pedidoData;
    private DetallePedidoData detalle;
    private List<DetallePedido> listaDetalle;
    private List<Pedido> listaPedido;
    private Conexion con;

    /**
     * Creates new form PedidoVista
     */
    public PedidoVista() {
        initComponents();
        con = new Conexion();
        modelo = new DefaultTableModel();

        pedidoData = new PedidoData(con);
        listaPedido = pedidoData.listarPedidos(LocalDate.now());

        detalle = new DetallePedidoData(con);

        mesaData = new MesaData(con);
        listaMesa = (ArrayList) mesaData.obtenerMesas();

        meseroData = new MeseroData(con);
        listaMesero = (ArrayList) meseroData.obtenerMeseros();

        productoData = new ProductoData(con);
        listaProducto = (ArrayList) productoData.buscarProductosActivos();

        cargarMesas();
        cargarMeseros();

        armarCabeceraTabla();

        cargarProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbMesero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbMesa = new javax.swing.JComboBox<>();
        jBguardar = new javax.swing.JButton();
        jBgenerarP = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDetalle = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("FORMULARIO DE PEDIDOS");

        jLabel2.setText("ID");

        jTid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTidKeyPressed(evt);
            }
        });

        jLabel3.setText("MESERO");

        jLabel4.setText("MESA");

        jBguardar.setText("AGREGAR / MODIFICAR");
        jBguardar.setEnabled(false);
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBgenerarP.setText("GENERAR PEDIDO");
        jBgenerarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgenerarPActionPerformed(evt);
            }
        });

        jTableDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableDetalle);

        jLabel5.setText("SELECCIONE UN PRODUCTO DE LA LISTA");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("REGISTRO");

        jButton1.setText("VOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))
                        .addGap(45, 45, 45)
                        .addComponent(jBgenerarP))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBguardar)
                .addGap(115, 115, 115)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBgenerarP)
                    .addComponent(cbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardar)
                    .addComponent(jButton1))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        int filaSelect = jTableDetalle.getSelectedRow();
        if (filaSelect != -1) {
            int idPedido = Integer.parseInt(jTid.getText());
            if (idPedido != 0) {

                int idProducto = (Integer) modelo.getValueAt(filaSelect, 0);

                detalle.agregarDetalles(idPedido, idProducto);
            }
        }
        JOptionPane.showMessageDialog(this, "Producto Agregado");


    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBgenerarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgenerarPActionPerformed
        Mesero mesero = (Mesero) cbMesero.getSelectedItem();
        mesero.getId_mesero();

        Mesa mesa = (Mesa) cbMesa.getSelectedItem();
        mesa.getId_mesa();

        Pedido pedido = new Pedido(mesa, mesero);
        pedidoData.registrarPedido(pedido);

        jTid.setText(pedido.getId_pedido() + "");

        JOptionPane.showMessageDialog(this, "Pedido Generado");
        jBguardar.setEnabled(true);
        


    }//GEN-LAST:event_jBgenerarPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTidKeyPressed
        jBgenerarP.setEnabled(false);
        cbMesa.setEnabled(false);
        cbMesero.setEnabled(false);
        jBguardar.setEnabled(true);
    }//GEN-LAST:event_jTidKeyPressed

    public void cargarMesas() {
        for (Mesa item : listaMesa) {
            cbMesa.addItem(item);

        }
    }

    public void cargarMeseros() {
        for (Mesero item : listaMesero) {
            cbMesero.addItem(item);
        }
    }

    public void cargarProductos() {
        for (Producto item : listaProducto) {
            modelo.addRow(new Object[]{item.getId_producto(), item.getNombre(), item.getPrecio()});
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> columns = new ArrayList<>();
        columns.add("Id");
        columns.add("Nombre");
        columns.add("Precio");
        columns.forEach((it) -> {
            modelo.addColumn(it);
        });
        jTableDetalle.setModel(modelo);
    }

    public void borrarFilasTablas() {
        int a = modelo.getRowCount() - 1; // -1 indice de ultima fila.
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Mesa> cbMesa;
    private javax.swing.JComboBox<Mesero> cbMesero;
    private javax.swing.JButton jBgenerarP;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableDetalle;
    private javax.swing.JTextField jTid;
    // End of variables declaration//GEN-END:variables
}
