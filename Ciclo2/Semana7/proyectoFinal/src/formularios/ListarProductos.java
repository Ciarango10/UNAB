package formularios;

import dao.DaoProducto;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelos.Producto;

public class ListarProductos extends javax.swing.JInternalFrame {
    
    private final String campos[] = {"Código", "Nombre", "Referencia", "Temperatura", "Valor Base"};
    private final DefaultTableModel miTabla = new DefaultTableModel(campos, 0);
    
    public ListarProductos() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Listado De Productos");

        panelCuerpo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
        jScrollPane1.setViewportView(tablaProductos);

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnRegresar.setText("REGRESAR AL MENU");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuerpoLayout = new javax.swing.GroupLayout(panelCuerpo);
        panelCuerpo.setLayout(panelCuerpoLayout);
        panelCuerpoLayout.setHorizontalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(btnRegresar)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        panelCuerpoLayout.setVerticalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnRegresar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCuerpo;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
