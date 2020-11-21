/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.*;
import java.util.ArrayList;
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
    private Conexion con;

    /**
     * Creates new form PedidoVista
     */
    public PedidoVista() {
        initComponents();
        con = new Conexion();
        modelo = new DefaultTableModel();

        pedidoData = new PedidoData(con);
        detalle = new DetallePedidoData(con);

        mesaData = new MesaData(con);
        listaMesa = (ArrayList) mesaData.obtenerMesas();

        meseroData = new MeseroData(con);
        listaMesero = (ArrayList) meseroData.obtenerMeseros();

        productoData = new ProductoData(con);
        listaProducto = (ArrayList) productoData.buscarProductosActivos();

        cargarMesas();
        cargarMeseros();
        cargarProductos();
        armarCabeceraTabla();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetalle = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cbProductos = new javax.swing.JComboBox<>();
        jLfecha = new javax.swing.JLabel();
        jBguardar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBanular = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTcosto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE PEDIDOS");

        jLabel2.setText("ID");

        jLabel3.setText("MESERO");

        jLabel4.setText("MESA");

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
        jScrollPane1.setViewportView(jTableDetalle);

        jLabel5.setText("PRODUCTOS");

        cbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProductosActionPerformed(evt);
            }
        });

        jLfecha.setText("jLabel6");

        jBguardar.setText("GUARDAR");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBmodificar.setText("MODIFICAR");

        jBanular.setText("ANULAR");

        jBlimpiar.setText("LIMPIAR");

        jLabel6.setText("PRECIO TOTAL:");

        jLabel7.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLfecha)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jBmodificar)
                                .addGap(18, 18, 18)
                                .addComponent(jBanular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLfecha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardar)
                    .addComponent(jBmodificar)
                    .addComponent(jBanular)
                    .addComponent(jBlimpiar))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProductosActionPerformed
        cargarDatos();
    }//GEN-LAST:event_cbProductosActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        Mesero mesero = (Mesero)cbMesero.getSelectedItem();
        mesero.getId_mesero();
        
        Mesa mesa = (Mesa)cbMesa.getSelectedItem();
        mesa.getId_mesa();
        
        Pedido pedido = new Pedido(mesa, mesero);
        pedidoData.registrarPedido(pedido);
        
        pedido.getId_pedido();
        
        
        for(int i =0;i<=jTableDetalle.getRowCount();i++){
//            int idMateria = (Integer)modelo.getValueAt(filaSelect, 0);
            int idProducto = (Integer)modelo.getValueAt(jTableDetalle.getSelectedRow(), 0);
//            DetallePedido dPedido = new DetallePedido(pedido, producto);
        }
        
    }//GEN-LAST:event_jBguardarActionPerformed

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
            cbProductos.addItem(item);
            
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

    public void cargarDatos() {

        Producto p = (Producto) cbProductos.getSelectedItem();
        cbProductos.getSelectedItem();

        modelo.addRow(new Object[]{p.getId_producto(), p.getNombre(), p.getPrecio()});

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Mesa> cbMesa;
    private javax.swing.JComboBox<Mesero> cbMesero;
    private javax.swing.JComboBox<Producto> cbProductos;
    private javax.swing.JButton jBanular;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLfecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetalle;
    private javax.swing.JTextField jTcosto;
    private javax.swing.JTextField jTid;
    // End of variables declaration//GEN-END:variables
}