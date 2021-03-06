/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Botones_administracion extends javax.swing.JFrame {

    /**
     * Creates new form Botones_administracion
     */
    public Botones_administracion() {
        initComponents();
        this.setTitle("TIPO DE GESTION");
        this.setLocation(450,150);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_usuarios = new javax.swing.JButton();
        boton_productos = new javax.swing.JButton();
        close_sesion = new javax.swing.JButton();
        fondo_administracion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_usuarios.setText("Gestionar Usuarios");
        boton_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_usuariosActionPerformed(evt);
            }
        });
        getContentPane().add(boton_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 170, 40));

        boton_productos.setText("Gestionar Productos");
        boton_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_productosActionPerformed(evt);
            }
        });
        getContentPane().add(boton_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 170, 40));

        close_sesion.setText("Cerrar Sesion");
        close_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_sesionActionPerformed(evt);
            }
        });
        getContentPane().add(close_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 130, 30));

        fondo_administracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bluewhale.jpg"))); // NOI18N
        fondo_administracion.setText("jLabel1");
        getContentPane().add(fondo_administracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_usuariosActionPerformed
       Manejo_Usuarios manejar_usuarios = new Manejo_Usuarios();
       manejar_usuarios.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_boton_usuariosActionPerformed

    private void close_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_sesionActionPerformed
        Login_Usuarios cerrar_sesion = new Login_Usuarios();
        cerrar_sesion.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_close_sesionActionPerformed

    private void boton_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_productosActionPerformed
        Gestion_Productos btn_productos = new Gestion_Productos();
        btn_productos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_productosActionPerformed

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
            java.util.logging.Logger.getLogger(Botones_administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Botones_administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Botones_administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Botones_administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Botones_administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_productos;
    private javax.swing.JButton boton_usuarios;
    private javax.swing.JButton close_sesion;
    private javax.swing.JLabel fondo_administracion;
    // End of variables declaration//GEN-END:variables
}
