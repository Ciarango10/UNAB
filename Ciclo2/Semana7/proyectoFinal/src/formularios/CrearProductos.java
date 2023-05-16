package formularios;

import dao.DaoProducto;
import javax.swing.JOptionPane;
import modelos.Producto;

public class CrearProductos extends javax.swing.JInternalFrame {

    public CrearProductos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCuerpoCrear = new javax.swing.JPanel();
        lblNombrePro = new javax.swing.JLabel();
        txtCajaNombreCrear = new javax.swing.JTextField();
        lblReferenciaPro = new javax.swing.JLabel();
        txtCajaReferenciaCrear = new javax.swing.JTextField();
        lblTemperaturaCrear = new javax.swing.JLabel();
        txtCajaTemperaturaCrear = new javax.swing.JSpinner();
        lblValorBasePro = new javax.swing.JLabel();
        txtCajaValorBaseCrear = new javax.swing.JSpinner();
        paneBotonesCrear = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();

        setClosable(true);
        setTitle("Crear Productos");
        setPreferredSize(new java.awt.Dimension(688, 532));

        panelCuerpoCrear.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNombrePro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombrePro.setText("NOMBRE:");

        txtCajaNombreCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblReferenciaPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblReferenciaPro.setText("REFERENCIA:");

        txtCajaReferenciaCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblTemperaturaCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTemperaturaCrear.setText("TEMPERATURA:");

        txtCajaTemperaturaCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblValorBasePro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValorBasePro.setText("VALOR BASE:");

        txtCajaValorBaseCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout panelCuerpoCrearLayout = new javax.swing.GroupLayout(panelCuerpoCrear);
        panelCuerpoCrear.setLayout(panelCuerpoCrearLayout);
        panelCuerpoCrearLayout.setHorizontalGroup(
            panelCuerpoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoCrearLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(panelCuerpoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombrePro)
                    .addComponent(lblReferenciaPro)
                    .addComponent(lblTemperaturaCrear)
                    .addComponent(lblValorBasePro))
                .addGap(23, 23, 23)
                .addGroup(panelCuerpoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCajaReferenciaCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                    .addComponent(txtCajaNombreCrear)
                    .addComponent(txtCajaTemperaturaCrear)
                    .addComponent(txtCajaValorBaseCrear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCuerpoCrearLayout.setVerticalGroup(
            panelCuerpoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoCrearLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelCuerpoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePro)
                    .addComponent(txtCajaNombreCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelCuerpoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReferenciaPro)
                    .addComponent(txtCajaReferenciaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelCuerpoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperaturaCrear)
                    .addComponent(txtCajaTemperaturaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelCuerpoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorBasePro)
                    .addComponent(txtCajaValorBaseCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        paneBotonesCrear.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCrear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneBotonesCrearLayout = new javax.swing.GroupLayout(paneBotonesCrear);
        paneBotonesCrear.setLayout(paneBotonesCrearLayout);
        paneBotonesCrearLayout.setHorizontalGroup(
            paneBotonesCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneBotonesCrearLayout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addComponent(btnCrear)
                .addGap(276, 276, 276))
        );
        paneBotonesCrearLayout.setVerticalGroup(
            paneBotonesCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBotonesCrearLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnCrear)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCuerpoCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneBotonesCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCuerpoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneBotonesCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarCajas() {
        txtCajaNombreCrear.setText("");
        txtCajaReferenciaCrear.setText("");
        txtCajaTemperaturaCrear.setValue(0);
        txtCajaValorBaseCrear.setValue(0);
        txtCajaNombreCrear.requestFocus();
    }

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        //*****************************************************
        //definicion de variables
        //*****************************************************
        String nombre, referencia;
        Double temperatura, valorBase;
        DaoProducto objDaoProducto;
        Producto objProducto;
        //******************************************************
        //******************************************************
        //capturar datos desde la interfaz
        //******************************************************
        nombre = txtCajaNombreCrear.getText();
        referencia = txtCajaReferenciaCrear.getText();
        temperatura = Double.parseDouble(txtCajaTemperaturaCrear.getValue().toString());
        valorBase = Double.parseDouble(txtCajaValorBaseCrear.getValue().toString());
        //******************************************************

        if (nombre.isEmpty() || referencia.isEmpty()) {
            JOptionPane.showMessageDialog(panelCuerpoCrear, "Error: Los valores son obligatorios.");
        } else {
            //**********************************************************
            //creacion de objetos
            //***********************************************************
            objDaoProducto = new DaoProducto();
            objProducto = new Producto();
            //***********************************************************
            objProducto.setNombre(nombre);
            objProducto.setId(referencia);
            objProducto.setTemperatura(temperatura);
            objProducto.setValorBase(valorBase);

            if (objDaoProducto.agregar(objProducto)) {
                JOptionPane.showMessageDialog(panelCuerpoCrear, "Exito: El producto fue agregado correctamente.");
            } else {
                JOptionPane.showMessageDialog(panelCuerpoCrear, "Error: El producto NO fue agregado correctamente.");
            }
            limpiarCajas();
        }


    }//GEN-LAST:event_btnCrearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel lblNombrePro;
    private javax.swing.JLabel lblReferenciaPro;
    private javax.swing.JLabel lblTemperaturaCrear;
    private javax.swing.JLabel lblValorBasePro;
    private javax.swing.JPanel paneBotonesCrear;
    private javax.swing.JPanel panelCuerpoCrear;
    private javax.swing.JTextField txtCajaNombreCrear;
    private javax.swing.JTextField txtCajaReferenciaCrear;
    private javax.swing.JSpinner txtCajaTemperaturaCrear;
    private javax.swing.JSpinner txtCajaValorBaseCrear;
    // End of variables declaration//GEN-END:variables
}
