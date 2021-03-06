/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author mgara
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();
        jmProductos = new javax.swing.JMenu();
        jmFormularioProductos = new javax.swing.JMenuItem();
        jmMeseros = new javax.swing.JMenu();
        jmFormularioMeseros = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmMesas = new javax.swing.JMenu();
        jmFormularioMesas = new javax.swing.JMenuItem();
        jmReservas = new javax.swing.JMenu();
        jmFormularioReservas = new javax.swing.JMenuItem();
        jmPedidos = new javax.swing.JMenu();
        jmFormularioPedidos = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );

        jmArchivo.setText("Archivo");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmArchivo.add(jmiSalir);

        jMenuBar1.add(jmArchivo);

        jmProductos.setText("Productos");

        jmFormularioProductos.setText("Formulario Poductos");
        jmFormularioProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioProductosActionPerformed(evt);
            }
        });
        jmProductos.add(jmFormularioProductos);

        jMenuBar1.add(jmProductos);

        jmMeseros.setText("Meseros");

        jmFormularioMeseros.setText("Formulario Meseros");
        jmFormularioMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioMeserosActionPerformed(evt);
            }
        });
        jmMeseros.add(jmFormularioMeseros);

        jMenuItem1.setText("Ver pedidos atendidos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmMeseros.add(jMenuItem1);

        jMenuBar1.add(jmMeseros);

        jmMesas.setText("Mesas");

        jmFormularioMesas.setText("Formulario Mesas");
        jmFormularioMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioMesasActionPerformed(evt);
            }
        });
        jmMesas.add(jmFormularioMesas);

        jMenuBar1.add(jmMesas);

        jmReservas.setText("Reservas");

        jmFormularioReservas.setText("Formulario Reservas");
        jmFormularioReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioReservasActionPerformed(evt);
            }
        });
        jmReservas.add(jmFormularioReservas);

        jMenuBar1.add(jmReservas);

        jmPedidos.setText("Pedidos");

        jmFormularioPedidos.setText("Registrar");
        jmFormularioPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioPedidosActionPerformed(evt);
            }
        });
        jmPedidos.add(jmFormularioPedidos);

        jMenuItem2.setText("Buscar / Anular");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmPedidos.add(jMenuItem2);

        jMenuItem3.setText("Lista de Pedidos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmPedidos.add(jMenuItem3);

        jMenuBar1.add(jmPedidos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmFormularioProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioProductosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ProductoVista pd = new ProductoVista();
        pd.setVisible(true);
        escritorio.add(pd);
        escritorio.moveToFront(pd);
    }//GEN-LAST:event_jmFormularioProductosActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmFormularioMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioMeserosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        MeseroVista md = new MeseroVista();
        md.setVisible(true);
        escritorio.add(md);
        escritorio.moveToFront(md);
    }//GEN-LAST:event_jmFormularioMeserosActionPerformed

    private void jmFormularioMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioMesasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        MesaVista mv = new MesaVista();
        mv.setVisible(true);
        escritorio.add(mv);
        escritorio.moveToFront(mv);
    }//GEN-LAST:event_jmFormularioMesasActionPerformed

    private void jmFormularioReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioReservasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ReservaVista rv = new ReservaVista();
        rv.setVisible(true);
        escritorio.add(rv);
        escritorio.moveToFront(rv);
    }//GEN-LAST:event_jmFormularioReservasActionPerformed

    private void jmFormularioPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioPedidosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        PedidoVista pv = new PedidoVista();
        pv.setVisible(true);
        escritorio.add(pv);
        escritorio.moveToFront(pv);
    }//GEN-LAST:event_jmFormularioPedidosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        PedidosMeseroVista pmv = new PedidosMeseroVista();
        pmv.setVisible(true);
        escritorio.add(pmv);
        escritorio.moveToFront(pmv);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        PedidoBuscarVista pv = new PedidoBuscarVista();
        pv.setVisible(true);
        escritorio.add(pv);
        escritorio.moveToFront(pv);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        PedidoListaVista pl = new PedidoListaVista();
        pl.setVisible(true);
        escritorio.add(pl);
        escritorio.moveToFront(pl);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenuItem jmFormularioMesas;
    private javax.swing.JMenuItem jmFormularioMeseros;
    private javax.swing.JMenuItem jmFormularioPedidos;
    private javax.swing.JMenuItem jmFormularioProductos;
    private javax.swing.JMenuItem jmFormularioReservas;
    private javax.swing.JMenu jmMesas;
    private javax.swing.JMenu jmMeseros;
    private javax.swing.JMenu jmPedidos;
    private javax.swing.JMenu jmProductos;
    private javax.swing.JMenu jmReservas;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
