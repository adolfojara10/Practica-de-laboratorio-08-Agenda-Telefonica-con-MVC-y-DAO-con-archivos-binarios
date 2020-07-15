/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import ec.ups.edu.controlador.ControladorUsuario;
import ec.ups.edu.modelo.Usuario;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo
 */
public class VentanaInicioSesion extends javax.swing.JInternalFrame {
    
    private ControladorUsuario controladorU;
    private VentanaPrincipal ventanaPrincipal;
    private Usuario usuario;

    /**
     * Creates new form VentanaIncioSesion
     */
    public VentanaInicioSesion(ControladorUsuario controladorU, VentanaPrincipal ventanaPrincipal) {
        initComponents();
        this.ventanaPrincipal = ventanaPrincipal;
        this.controladorU = controladorU;
        
    }

    public JButton getBtnAtras() {
        return btnAtras;
    }

    public JButton getBtnInciarSesion() {
        return btnInciarSesion;
    }

    public JLabel getCorreo() {
        return correo;
    }

    public JLabel getPassword() {
        return password;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        correo = new javax.swing.JLabel();
        btnInciarSesion = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        password = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtCorreo = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setMaximizable(true);
        setResizable(true);
        setTitle("Iniciar Sesión");

        correo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        correo.setText("Correo electrónico");

        btnInciarSesion.setBackground(new java.awt.Color(153, 153, 255));
        btnInciarSesion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnInciarSesion.setText("Iniciar Sesión");
        btnInciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInciarSesionActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(255, 0, 0));
        btnAtras.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        password.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password)
                            .addComponent(correo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInciarSesion)
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAtras)
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInciarSesion)
                    .addComponent(btnAtras))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        limpiar();

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnInciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInciarSesionActionPerformed
        // TODO add your handling code here:
        String correo = txtCorreo.getText();
        char[] contra = txtPassword.getPassword();
        String password = String.valueOf(contra);
        
        if (correo.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos solicitados");
        } else {
            usuario = controladorU.iniciarSesion(correo, password);
            
            if (usuario != null) {
                JOptionPane.showMessageDialog(this, "¡Sesion iniciada con exito!");
                limpiar();
                this.setVisible(false);
                activarMenus();
                
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado. Intentelo otra vez");
            }
        }

    }//GEN-LAST:event_btnInciarSesionActionPerformed
    
    public void activarMenus() {
        ventanaPrincipal.getCerrarSesionMenuItem().setVisible(true);
        ventanaPrincipal.getGestiónMenu().setVisible(true);
        
        ventanaPrincipal.getRegistrarUsuarioMenuItem().setVisible(false);
        ventanaPrincipal.getIniciarSesionMenuItem().setVisible(false);
    }
    
    public void limpiar() {
        txtCorreo.setText("");
        txtPassword.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnInciarSesion;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel password;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
