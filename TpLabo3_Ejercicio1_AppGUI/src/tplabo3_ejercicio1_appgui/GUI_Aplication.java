/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tplabo3_ejercicio1_appgui;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
/**
 *
 * @author jeso_
 */
public class GUI_Aplication extends javax.swing.JFrame {

    private boolean isPasswordVisible = false;
    /**
     * Creates new form GUI_Aplication
     */
    public GUI_Aplication() {
        initComponents();
        initPlaceholders();
    }

    private void initPlaceholders() {
        // Placeholder para el campo de correo electrónico
        JTingresemail.setText("Ingrese su mail...");
        JTingresemail.setForeground(Color.GRAY);
        JTingresemail.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent evt) {
                if (JTingresemail.getText().equals("Ingrese su mail...")) {
                    JTingresemail.setText("");
                    JTingresemail.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent evt) {
                if (JTingresemail.getText().isEmpty()) {
                    JTingresemail.setForeground(Color.GRAY);
                    JTingresemail.setText("Ingrese su mail...");
                }
            }
        });

        // Placeholder para el campo de contraseña
        JPassIngreseContrasena.setEchoChar((char) 0); // No mostrar asteriscos al principio
        JPassIngreseContrasena.setText("Ingrese su contraseña...");
        JPassIngreseContrasena.setForeground(Color.GRAY);
        JPassIngreseContrasena.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent evt) {
                if (new String(JPassIngreseContrasena.getPassword()).equals("Ingrese su contraseña...")) {
                    JPassIngreseContrasena.setText("");
                    JPassIngreseContrasena.setEchoChar('•'); // Mostrar asteriscos al escribir
                    JPassIngreseContrasena.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent evt) {
                if (new String(JPassIngreseContrasena.getPassword()).isEmpty()) {
                    JPassIngreseContrasena.setForeground(Color.GRAY);
                    JPassIngreseContrasena.setEchoChar((char) 0); // No mostrar asteriscos
                    JPassIngreseContrasena.setText("Ingrese su contraseña...");
                }
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLiniciesesion = new javax.swing.JLabel();
        JTingresemail = new javax.swing.JTextField();
        JPassIngreseContrasena = new javax.swing.JPasswordField();
        jbOjoabierto = new javax.swing.JButton();
        JLOlvidoSuContraseña = new javax.swing.JLabel();
        JLingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        JLiniciesesion.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        JLiniciesesion.setText("Inicie sesión:");
        JLiniciesesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JTingresemail.setText("Ingrese su mail...");
        JTingresemail.setToolTipText("");
        JTingresemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTingresemailFocusGained(evt);
            }
        });
        JTingresemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTingresemailActionPerformed(evt);
            }
        });

        JPassIngreseContrasena.setText("Ingrese su contraseña...");
        JPassIngreseContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JPassIngreseContrasenaFocusGained(evt);
            }
        });
        JPassIngreseContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPassIngreseContrasenaActionPerformed(evt);
            }
        });

        jbOjoabierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOjoabiertoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLiniciesesion, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jbOjoabierto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTingresemail)
                    .addComponent(JPassIngreseContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLiniciesesion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTingresemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPassIngreseContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbOjoabierto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        JLOlvidoSuContraseña.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        JLOlvidoSuContraseña.setForeground(new java.awt.Color(51, 51, 255));
        JLOlvidoSuContraseña.setText("Olvido su contraseña?");
        JLOlvidoSuContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JLOlvidoSuContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLOlvidoSuContraseñaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLOlvidoSuContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLOlvidoSuContraseñaMouseExited(evt);
            }
        });

        JLingresar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JLingresar.setText("Ingresar");
        JLingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JLingresarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("BIENVENIDO ESTUDIANTE DE LA ULP!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLOlvidoSuContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(JLingresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLOlvidoSuContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(JLingresar)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JPassIngreseContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPassIngreseContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPassIngreseContrasenaActionPerformed

    private void JTingresemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTingresemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTingresemailActionPerformed

    private void jbOjoabiertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOjoabiertoActionPerformed
        if (isPasswordVisible) {
            // Si la contraseña es visible, la ocultamos y cambiamos el icono al ojo abierto
            JPassIngreseContrasena.setEchoChar('•');
            jbOjoabierto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ver.png"))); // Icono de ojo abierto
        } else {
            // Si la contraseña está oculta, la mostramos y cambiamos el icono al ojo cerrado
            JPassIngreseContrasena.setEchoChar((char) 0);
            jbOjoabierto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/No ver.jpg"))); // Icono de ojo cerrado
        }
        isPasswordVisible = !isPasswordVisible;
     
        
    }//GEN-LAST:event_jbOjoabiertoActionPerformed

    private void JTingresemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTingresemailFocusGained
        
    }//GEN-LAST:event_JTingresemailFocusGained

    private void JPassIngreseContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JPassIngreseContrasenaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_JPassIngreseContrasenaFocusGained

    private void JLingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JLingresarActionPerformed
        // TODO add your handling code here:
        if(JTingresemail.getText().equalsIgnoreCase("alumno@ulp.edu.ar") && new String(JPassIngreseContrasena.getPassword()).equals("12345678")){
            JOptionPane.showMessageDialog(this, "Bienvenido a la plataforma");
        }else 
        JOptionPane.showMessageDialog(this, "Los datos ingresados no son correctos.");
    }//GEN-LAST:event_JLingresarActionPerformed

    private void JLOlvidoSuContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOlvidoSuContraseñaMouseClicked
        JOptionPane.showMessageDialog(this, "Envíe un mail a tuds@ulp.com.ar comentando el problema");
    }//GEN-LAST:event_JLOlvidoSuContraseñaMouseClicked

    private void JLOlvidoSuContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOlvidoSuContraseñaMouseEntered
        // TODO add your handling code here:
        JLOlvidoSuContraseña.setText("<html><u>Olvido su contraseña?</u></html>");
    }//GEN-LAST:event_JLOlvidoSuContraseñaMouseEntered

    private void JLOlvidoSuContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOlvidoSuContraseñaMouseExited
        // TODO add your handling code here:
        JLOlvidoSuContraseña.setText("Olvido su contraseña?");
    }//GEN-LAST:event_JLOlvidoSuContraseñaMouseExited

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
            java.util.logging.Logger.getLogger(GUI_Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Aplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLOlvidoSuContraseña;
    private javax.swing.JButton JLingresar;
    private javax.swing.JLabel JLiniciesesion;
    private javax.swing.JPasswordField JPassIngreseContrasena;
    private javax.swing.JTextField JTingresemail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbOjoabierto;
    // End of variables declaration//GEN-END:variables
}
