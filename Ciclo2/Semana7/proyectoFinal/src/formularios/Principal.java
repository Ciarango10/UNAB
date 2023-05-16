package formularios;

import javax.swing.JInternalFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuProductos = new javax.swing.JMenu();
        jMenuItemCrear = new javax.swing.JMenuItem();
        jMenuItemListar = new javax.swing.JMenuItem();
        jMenuItemAdministrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crud Productos");
        setResizable(false);

        ventanaPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout ventanaPrincipalLayout = new javax.swing.GroupLayout(ventanaPrincipal);
        ventanaPrincipal.setLayout(ventanaPrincipalLayout);
        ventanaPrincipalLayout.setHorizontalGroup(
            ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        ventanaPrincipalLayout.setVerticalGroup(
            ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        jMenuArchivo.setText("Archivo");
        jMenuArchivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItemSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuProductos.setText("Productos");
        jMenuProductos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItemCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItemCrear.setText("Crear");
        jMenuItemCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrearActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItemCrear);

        jMenuItemListar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItemListar.setText("Listar");
        jMenuItemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItemListar);

        jMenuItemAdministrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItemAdministrar.setText("Administrar");
        jMenuItemAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdministrarActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItemAdministrar);

        jMenuBar1.add(jMenuProductos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agregarVentanaPanel(JInternalFrame ventana) {
        if (ventanaPrincipal.getComponentCount() > 0) {
            ventanaPrincipal.removeAll();
        }
        ventanaPrincipal.add(ventana);
    }

    private void jMenuItemCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrearActionPerformed
        //********************************************************
        //creacion de objetos
        //********************************************************
        CrearProductos ventanaCrearProductos;
        //********************************************************
        //********************************************************
        //creacion de objetos
        //********************************************************
        ventanaCrearProductos = new CrearProductos();
        //********************************************************
        //********************************************************
        //agregar ventana al panel
        //********************************************************
        agregarVentanaPanel(ventanaCrearProductos);
        //********************************************************
        //********************************************************
        //mostrar la ventana en el panel
        //********************************************************
        ventanaCrearProductos.show();
        //********************************************************
    }//GEN-LAST:event_jMenuItemCrearActionPerformed

    private void jMenuItemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarActionPerformed
        //********************************************************
        //creacion de objetos
        //********************************************************
        ListarProductos ventanaListarProductos;
        //********************************************************
        //********************************************************
        //creacion de objetos
        //********************************************************
        ventanaListarProductos = new ListarProductos();
        //********************************************************
        //********************************************************
        //agregar ventana al panel
        //********************************************************
        agregarVentanaPanel(ventanaListarProductos);
        //********************************************************
        //********************************************************
        //mostrar la ventana en el panel
        //********************************************************
        ventanaListarProductos.show();
        //********************************************************
    }//GEN-LAST:event_jMenuItemListarActionPerformed

    private void jMenuItemAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdministrarActionPerformed
        //********************************************************
        //creacion de objetos
        //********************************************************
        AdministrarProductos ventanaAdministrarProductos;
        //********************************************************
        //********************************************************
        //creacion de objetos
        //********************************************************
        ventanaAdministrarProductos = new AdministrarProductos();
        //********************************************************
        //********************************************************
        //agregar ventana al panel
        //********************************************************
        agregarVentanaPanel(ventanaAdministrarProductos);
        //********************************************************
        //********************************************************
        //mostrar la ventana en el panel
        //********************************************************
        ventanaAdministrarProductos.show();
        //********************************************************
    }//GEN-LAST:event_jMenuItemAdministrarActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAdministrar;
    private javax.swing.JMenuItem jMenuItemCrear;
    private javax.swing.JMenuItem jMenuItemListar;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuProductos;
    private javax.swing.JPanel ventanaPrincipal;
    // End of variables declaration//GEN-END:variables
}
