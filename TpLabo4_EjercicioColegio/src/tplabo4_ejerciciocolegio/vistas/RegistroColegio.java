/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tplabo4_ejerciciocolegio.vistas;

import java.util.HashSet;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import tplabo4_ejerciciocolegio.Alumno;
import tplabo4_ejerciciocolegio.Materia;

/**
 *
 * @author jeso_
 */
public class RegistroColegio extends javax.swing.JFrame {
    HashSet <Alumno> listaAlumnos = new HashSet<>();
    HashSet <Materia> listaMaterias = new HashSet<>();
    
    /**
     * Creates new form RegistroColegio
     */
    public RegistroColegio() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        JMalumnos = new javax.swing.JMenu();
        JMagregarAlumno = new javax.swing.JMenuItem();
        JMmaterias = new javax.swing.JMenu();
        JMagregarMaterias = new javax.swing.JMenuItem();
        JMinscripcion = new javax.swing.JMenu();
        JMinscribirAlumnos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        JMsalir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        JMalumnos.setText("ALUMNOS");

        JMagregarAlumno.setText("Agregar Alumno");
        JMagregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMagregarAlumnoActionPerformed(evt);
            }
        });
        JMalumnos.add(JMagregarAlumno);

        jMenuBar2.add(JMalumnos);

        JMmaterias.setText("MATERIAS");

        JMagregarMaterias.setText("Agregar Materias");
        JMagregarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMagregarMateriasActionPerformed(evt);
            }
        });
        JMmaterias.add(JMagregarMaterias);

        jMenuBar2.add(JMmaterias);

        JMinscripcion.setText("INSCRIPCION");

        JMinscribirAlumnos.setText("Inscribir Alumnos");
        JMinscribirAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMinscribirAlumnosActionPerformed(evt);
            }
        });
        JMinscripcion.add(JMinscribirAlumnos);

        jMenuBar2.add(JMinscripcion);

        jMenu1.setText("MOSTRAR");

        jMenuItem2.setText("Alumnos inscriptos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar2.add(jMenu1);

        JMsalir.setText("SALIR");
        JMsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMsalirActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Seguro desea salir?");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JMsalir.add(jMenuItem1);

        jMenuBar2.add(JMsalir);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMagregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMagregarAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormAltaAlumnos a2 = new FormAltaAlumnos(listaAlumnos);
        a2.setVisible(true);
        escritorio.add(a2);
        
    }//GEN-LAST:event_JMagregarAlumnoActionPerformed

    private void JMagregarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMagregarMateriasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormAltaMaterias m1 = new FormAltaMaterias(listaMaterias);
        m1.setVisible(true);
        escritorio.add(m1);
        
        
    }//GEN-LAST:event_JMagregarMateriasActionPerformed

    private void JMinscribirAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMinscribirAlumnosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioInscripcion f1 = new FormularioInscripcion(listaMaterias, listaAlumnos);
        f1.setVisible(true);
        escritorio.add(f1);
    }//GEN-LAST:event_JMinscribirAlumnosActionPerformed

    private void JMsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMsalirActionPerformed
    
    
    }//GEN-LAST:event_JMsalirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        AlumnosInscriptos alumInscriptos = new AlumnosInscriptos();
        alumInscriptos.setVisible(true);
        escritorio.add(alumInscriptos);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroColegio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMagregarAlumno;
    private javax.swing.JMenuItem JMagregarMaterias;
    private javax.swing.JMenu JMalumnos;
    private javax.swing.JMenuItem JMinscribirAlumnos;
    private javax.swing.JMenu JMinscripcion;
    private javax.swing.JMenu JMmaterias;
    private javax.swing.JMenu JMsalir;
    private javax.swing.JPanel escritorio;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
