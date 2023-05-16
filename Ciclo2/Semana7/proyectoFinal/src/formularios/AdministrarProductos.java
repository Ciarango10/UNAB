package formularios;

import dao.DaoProducto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Producto;

public class AdministrarProductos extends javax.swing.JInternalFrame {

    private final String campos[] = {"Código", "Nombre", "Referencia", "Temperatura", "Valor Base"};
    private final DefaultTableModel miTabla = new DefaultTableModel(campos, 0);

    public AdministrarProductos() {
        initComponents();
        cargarDatosTabla();
    }

    private void cargarDatosTabla() {
        List<Producto> arregloProductos;
        DaoProducto objDaoProducto;

        objDaoProducto = new DaoProducto();

        arregloProductos = objDaoProducto.consultar();

        arregloProductos.forEach(producto -> {
            Object[] fila = new Object[5];
            fila[0] = producto.getCodProducto();
            fila[1] = producto.getNombre();
            fila[2] = producto.getId();
            fila[3] = producto.getTemperatura();
            fila[4] = producto.getValorBase();
            miTabla.addRow(fila);
        });
        tablaProductos.setModel(miTabla);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCuerpo = new javax.swing.JPanel();
        lblNombrePro = new javax.swing.JLabel();
        txtCajaNombreCrear = new javax.swing.JTextField();
        lblReferenciaPro = new javax.swing.JLabel();
        txtCajaReferenciaCrear = new javax.swing.JTextField();
        lblTemperaturaCrear = new javax.swing.JLabel();
        txtCajaTemperaturaCrear = new javax.swing.JSpinner();
        lblValorBasePro = new javax.swing.JLabel();
        txtCajaValorBaseCrear = new javax.swing.JSpinner();
        lblCodigo = new javax.swing.JLabel();
        txtCajaCodProducto = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Administrar Productos");
        setPreferredSize(new java.awt.Dimension(688, 532));
        setRequestFocusEnabled(false);

        panelCuerpo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodigo.setText("CODIGO:");

        txtCajaCodProducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCajaCodProducto.setEnabled(false);

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuerpoLayout = new javax.swing.GroupLayout(panelCuerpo);
        panelCuerpo.setLayout(panelCuerpoLayout);
        panelCuerpoLayout.setHorizontalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNombrePro)
                        .addComponent(lblReferenciaPro)
                        .addComponent(lblTemperaturaCrear)
                        .addComponent(lblValorBasePro)
                        .addComponent(lblCodigo))
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addGap(23, 23, 23)))
                .addGap(23, 23, 23)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCajaReferenciaCrear)
                        .addComponent(txtCajaNombreCrear)
                        .addComponent(txtCajaTemperaturaCrear)
                        .addComponent(txtCajaValorBaseCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCajaCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(38, 38, 38))
        );
        panelCuerpoLayout.setVerticalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCajaCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePro)
                    .addComponent(txtCajaNombreCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReferenciaPro)
                    .addComponent(txtCajaReferenciaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperaturaCrear)
                    .addComponent(txtCajaTemperaturaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorBasePro)
                    .addComponent(txtCajaValorBaseCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void limpiarTabla() {
        for (int i = 0; i < tablaProductos.getRowCount(); i++) {
            miTabla.removeRow(i);
            i -= 1;
        }
    }

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        Integer filaSeleccionada;
        Long codProducto;
        String nombre, referencia;
        Double temperatura, valorBase;

        filaSeleccionada = tablaProductos.getSelectedRow();

        codProducto = Long.parseLong(miTabla.getValueAt(filaSeleccionada, 0).toString());
        nombre = miTabla.getValueAt(filaSeleccionada, 1).toString();
        referencia = miTabla.getValueAt(filaSeleccionada, 2).toString();
        temperatura = Double.parseDouble(miTabla.getValueAt(filaSeleccionada, 3).toString());
        valorBase = Double.parseDouble(miTabla.getValueAt(filaSeleccionada, 4).toString());

        txtCajaCodProducto.setValue(codProducto);
        txtCajaNombreCrear.setText(nombre);
        txtCajaReferenciaCrear.setText(referencia);
        txtCajaTemperaturaCrear.setValue(temperatura);
        txtCajaValorBaseCrear.setValue(valorBase);
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Long codProducto;
        DaoProducto objDaoProducto;
        Producto objProducto;

        objDaoProducto = new DaoProducto();
        objProducto = new Producto();

        codProducto = Long.parseLong(txtCajaCodProducto.getValue().toString());

        objProducto.setCodProducto(codProducto);

        if (objDaoProducto.borrar(objProducto)) {
            JOptionPane.showMessageDialog(panelCuerpo, "Exito: El producto fue borrado correctamente.");
            limpiarTabla();
            cargarDatosTabla();
            limpiarCajas();
        } else {
            JOptionPane.showMessageDialog(panelCuerpo, "Error: El producto NO fue borrado correctamente.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //*****************************************************
        //definicion de variables
        //*****************************************************
        String nombre, referencia;
        Double temperatura, valorBase;
        DaoProducto objDaoProducto;
        Producto objProducto;
        Long codPproducto;
        //******************************************************
        //******************************************************
        //capturar datos desde la interfaz
        //******************************************************
        nombre = txtCajaNombreCrear.getText();
        referencia = txtCajaReferenciaCrear.getText();
        temperatura = Double.parseDouble(txtCajaTemperaturaCrear.getValue().toString());
        valorBase = Double.parseDouble(txtCajaValorBaseCrear.getValue().toString());
        codPproducto = Long.parseLong(txtCajaCodProducto.getValue().toString());
        //******************************************************

        if (nombre.isEmpty() || referencia.isEmpty()) {
            JOptionPane.showMessageDialog(panelCuerpo, "Error: Los valores son obligatorios.");
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
            objProducto.setCodProducto(codPproducto);

            if (objDaoProducto.actualizar(objProducto)) {
                JOptionPane.showMessageDialog(panelCuerpo, "Exito: El producto fue editado correctamente.");
                limpiarTabla();
                cargarDatosTabla();
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(panelCuerpo, "Error: El producto NO fue editado correctamente.");
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombrePro;
    private javax.swing.JLabel lblReferenciaPro;
    private javax.swing.JLabel lblTemperaturaCrear;
    private javax.swing.JLabel lblValorBasePro;
    private javax.swing.JPanel panelCuerpo;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JSpinner txtCajaCodProducto;
    private javax.swing.JTextField txtCajaNombreCrear;
    private javax.swing.JTextField txtCajaReferenciaCrear;
    private javax.swing.JSpinner txtCajaTemperaturaCrear;
    private javax.swing.JSpinner txtCajaValorBaseCrear;
    // End of variables declaration//GEN-END:variables
}
