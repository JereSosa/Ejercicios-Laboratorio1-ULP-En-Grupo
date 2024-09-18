package Vistas;

public class VistaPrincipal extends javax.swing.JFrame {

    
    public VistaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAdministracion = new javax.swing.JMenu();
        AdministrarProductos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmenuBNombre = new javax.swing.JMenuItem();
        jmenuBPrecio = new javax.swing.JMenuItem();
        jmenuBRubro = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1051, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        jMenuAdministracion.setText("Administracion");

        AdministrarProductos.setText("Administrar Productos");
        AdministrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrarProductosActionPerformed(evt);
            }
        });
        jMenuAdministracion.add(AdministrarProductos);

        jMenuBar1.add(jMenuAdministracion);

        jMenu4.setText("Consultas");

        jmenuBNombre.setText("Nombre");
        jmenuBNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuBNombreActionPerformed(evt);
            }
        });
        jMenu4.add(jmenuBNombre);

        jmenuBPrecio.setText("Precio");
        jmenuBPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuBPrecioActionPerformed(evt);
            }
        });
        jMenu4.add(jmenuBPrecio);

        jmenuBRubro.setText("Rubro");
        jmenuBRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuBRubroActionPerformed(evt);
            }
        });
        jMenu4.add(jmenuBRubro);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmenuBNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuBNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmenuBNombreActionPerformed

    private void jmenuBPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuBPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmenuBPrecioActionPerformed

    private void jmenuBRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuBRubroActionPerformed
        jDesktopPane.removeAll();
        jDesktopPane.repaint();
        VistaBuscarPorRubro vbpr=new VistaBuscarPorRubro(this);
        vbpr.setVisible(true);
        jDesktopPane.add(vbpr);
        vbpr.moveToFront();
        
    }//GEN-LAST:event_jmenuBRubroActionPerformed

    
    //hace la ventana administrar productos visible
    private void AdministrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrarProductosActionPerformed
         jDesktopPane.removeAll();
            jDesktopPane.repaint();
            VentanaGProductos vgp = new VentanaGProductos(this);
            vgp.setVisible(true);
            jDesktopPane.add(vgp);
            vgp.moveToFront();
    }//GEN-LAST:event_AdministrarProductosActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdministrarProductos;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenuAdministracion;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmenuBNombre;
    private javax.swing.JMenuItem jmenuBPrecio;
    private javax.swing.JMenuItem jmenuBRubro;
    // End of variables declaration//GEN-END:variables
}
