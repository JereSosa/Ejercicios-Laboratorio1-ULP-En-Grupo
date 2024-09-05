/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tplabo4_ejerciciocolegio.vistas;

import java.util.HashSet;
import javax.swing.JOptionPane;
import tplabo4_ejerciciocolegio.Materia;

/**
 *
 * @author jeso_
 */
public class FormAltaMaterias extends javax.swing.JInternalFrame {
    private HashSet <Materia> mat;
    /**
     * Creates new form AltaMaterias
     */
    public FormAltaMaterias(HashSet<Materia> mat) {
        this.mat = mat;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTidMateria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTnombreMateria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTañoMateria = new javax.swing.JTextField();
        JBcargarMateria = new javax.swing.JButton();
        JBnuevoMateria = new javax.swing.JButton();
        JBsalirMateria = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(242, 189, 57));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Formulario de Materias");

        jLabel2.setText("ID Materia:");

        JTidMateria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTidMateria.setCaretColor(new java.awt.Color(153, 153, 0));
        JTidMateria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTidMateriaFocusLost(evt);
            }
        });
        JTidMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTidMateriaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        JTnombreMateria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTnombreMateria.setCaretColor(new java.awt.Color(153, 153, 0));

        jLabel4.setText("Año:");

        JTañoMateria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTañoMateria.setCaretColor(new java.awt.Color(153, 153, 0));
        JTañoMateria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTañoMateriaFocusLost(evt);
            }
        });

        JBcargarMateria.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        JBcargarMateria.setText("Cargar");
        JBcargarMateria.setBorder(null);
        JBcargarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcargarMateriaActionPerformed(evt);
            }
        });

        JBnuevoMateria.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        JBnuevoMateria.setText("Nuevo");
        JBnuevoMateria.setBorder(null);
        JBnuevoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnuevoMateriaActionPerformed(evt);
            }
        });

        JBsalirMateria.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        JBsalirMateria.setText("Salir");
        JBsalirMateria.setBorder(null);
        JBsalirMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalirMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBnuevoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JBcargarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBsalirMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JTidMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTañoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTnombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTidMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTnombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTañoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBcargarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBnuevoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBsalirMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTidMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTidMateriaActionPerformed
        
    }//GEN-LAST:event_JTidMateriaActionPerformed

    private void JBnuevoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnuevoMateriaActionPerformed
        JTañoMateria.setText("");
        JTidMateria.setText("");
        JTnombreMateria.setText("");
    }//GEN-LAST:event_JBnuevoMateriaActionPerformed

    private void JBcargarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcargarMateriaActionPerformed
        int añoMateria = Integer.parseInt(JTañoMateria.getText());
        int idMateria = Integer.parseInt(JTidMateria.getText());
        String nombreMateria = JTnombreMateria.getText();
        Materia mat1 = new Materia(idMateria, nombreMateria, añoMateria);
        mat.add(mat1);
        JOptionPane.showMessageDialog(null, "La materia se cargo con exito!");
        
        
    }//GEN-LAST:event_JBcargarMateriaActionPerformed

    private void JBsalirMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalirMateriaActionPerformed
        dispose();
    }//GEN-LAST:event_JBsalirMateriaActionPerformed

    private void JTidMateriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTidMateriaFocusLost
        try {
            int idMateria = Integer.parseInt(JTidMateria.getText());
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID de Materia solo puede contener numeros", "ERROR DE ENTRADA", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JTidMateriaFocusLost

    private void JTañoMateriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTañoMateriaFocusLost
        try {
            
            int añoMateria = Integer.parseInt(JTañoMateria.getText());
        // Verificar si el año está en el rango permitido (por ejemplo, entre 1 y 7)
        if (añoMateria < 1 || añoMateria > 7){
                JOptionPane.showMessageDialog(this, "El rango de año no existe, porfavor corrijalo", "ERROR DE AÑO", JOptionPane.ERROR_MESSAGE);
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El año de Materia solo puede contener numeros", "ERROR DE ENTRADA", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JTañoMateriaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBcargarMateria;
    private javax.swing.JButton JBnuevoMateria;
    private javax.swing.JButton JBsalirMateria;
    private javax.swing.JTextField JTañoMateria;
    private javax.swing.JTextField JTidMateria;
    private javax.swing.JTextField JTnombreMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}