/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

package Vistas;

import TP6Ej2.package1.Producto;
import java.util.TreeSet;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeso_
 */
public class VistaBuscarPorNombre extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel(){
          @Override
          public boolean isCellEditable(int row, int column){
              return false; 
          }
    };
    /** Creates new form VistaBuscarPorNombre */
    public VistaBuscarPorNombre() {
        initComponents();
        String[] columnNames = { "Codigo", "Descripcion", "Precio", "Stock", "Categoria" };
        modelo.setColumnIdentifiers(columnNames);
        JTableNombres.setModel(modelo);
         JTFbuscarPorNombre.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtrar();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtrar();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filtrar();
            }
        });
       
        
    }

    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableNombres = new javax.swing.JTable();
        JTFbuscarPorNombre = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar por nombre");

        JTableNombres.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTableNombres);

        JTFbuscarPorNombre.setText("Ingrese el nombre...");
        JTFbuscarPorNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFbuscarPorNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFbuscarPorNombreFocusLost(evt);
            }
        });
        JTFbuscarPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFbuscarPorNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(JTFbuscarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFbuscarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFbuscarPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFbuscarPorNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFbuscarPorNombreActionPerformed

    private void JTFbuscarPorNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFbuscarPorNombreFocusGained
        JTFbuscarPorNombre.setText("");
    }//GEN-LAST:event_JTFbuscarPorNombreFocusGained

    private void JTFbuscarPorNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFbuscarPorNombreFocusLost
       if (JTFbuscarPorNombre.getText().isEmpty()) {
        JTFbuscarPorNombre.setText("Ingrese el nombre...");
       }
    }//GEN-LAST:event_JTFbuscarPorNombreFocusLost

    

    
    public void borrarFilasTabla() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
     private void filtrar() {
        String textoBusqueda = JTFbuscarPorNombre.getText().toLowerCase();
        borrarFilasTabla();

        TreeSet<Producto> listaProd = Producto.getProductos();
        for (Producto prod : listaProd) {
            if (prod.getDescripcion().toLowerCase().startsWith(textoBusqueda)) {
                Object[] nuevaFila = {prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getStock(), prod.getRubro()};
                modelo.addRow(nuevaFila);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFbuscarPorNombre;
    private javax.swing.JTable JTableNombres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
