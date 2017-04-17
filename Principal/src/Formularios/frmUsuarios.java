/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Datos;
import javax.swing.JOptionPane;

/**
 *
 * @author raulVe
 */
public class frmUsuarios extends javax.swing.JInternalFrame {
    private Datos misDatos;
    private int usuAct = 0;
    private  boolean nuevo=false;

    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }
    public frmUsuarios() {
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

        jLabel1 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        txtConfirmar = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmvPerfil = new javax.swing.JComboBox<>();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior2 = new javax.swing.JButton();
        btnSiguiente2 = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCanselar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuarios");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("ID Usuario *");

        txtIdUsuario.setEnabled(false);
        txtIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUsuarioActionPerformed(evt);
            }
        });

        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre*");

        jLabel3.setText("Apellido *");

        txtApellido.setEnabled(false);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Clave *");

        txtClave.setEnabled(false);
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        txtConfirmar.setEnabled(false);
        txtConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarActionPerformed(evt);
            }
        });

        jLabel5.setText("Confirmar *");

        jLabel6.setText("Perfil *");

        cmvPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un perfil", "Administrador", "Empleado" }));
        cmvPerfil.setEnabled(false);

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btnAnterior.setToolTipText("Va al anterior registro");

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/next.png"))); // NOI18N
        btnSiguiente.setToolTipText("Va al ultimo registro");

        btnAnterior2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btnAnterior2.setToolTipText("Va al anterior registro");

        btnSiguiente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/next.png"))); // NOI18N
        btnSiguiente2.setToolTipText("Va al siguiente registro");

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Agregar archivo-32.png"))); // NOI18N
        btnNuevo.setToolTipText("Crear nuevo registro");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar archivo-32.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar registro");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Editar propiedad-32.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar registro");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Guardar archivo-32.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar registro");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ver archivo-32.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar registro");

        btnCanselar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancelar-32.png"))); // NOI18N
        btnCanselar.setToolTipText("Canselar la operación");
        btnCanselar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmvPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNuevo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGuardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEliminar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtApellido)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCanselar)
                                .addGap(0, 53, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnterior2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSiguiente2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiguiente)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmvPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSiguiente, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAnterior, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(btnAnterior2)
                            .addComponent(btnSiguiente2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnNuevo))
                            .addComponent(btnModificar)
                            .addComponent(btnGuardar)
                            .addComponent(btnBuscar)))
                    .addComponent(btnCanselar))
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUsuarioActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void txtConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarActionPerformed
    //Boton Nuevo
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //Codigo para avilitar los campos de texto para crear un usuario 
        //Desavilitar los demas botones 
        btnAnterior.setEnabled(false);
        btnAnterior2.setEnabled(false);
        btnSiguiente.setEnabled(false);
        btnSiguiente2.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnCanselar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCanselar.setEnabled(true);
        
        //Habilita los campos
        txtIdUsuario.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtClave.setEnabled(true);
        txtConfirmar.setEnabled(true);
        cmvPerfil.setEnabled(true);
        //Limpiar campos 
        
        txtIdUsuario.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtClave.setText("");
        txtConfirmar.setText("");
        cmvPerfil.setSelectedIndex(0 );
        //Activar la bandera
        nuevo = true;
        //Foco al id 
        txtIdUsuario.requestFocusInWindow();
        
    }//GEN-LAST:event_btnNuevoActionPerformed
    //Boton Guardar
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Validacion de formulario 
        if(txtIdUsuario.getText().equals("")){
           JOptionPane.showMessageDialog(rootPane, "Digita un id");
           txtIdUsuario.requestFocusInWindow();
           return;
        }
        if (cmvPerfil.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(rootPane, "Selecsionar un ");
            cmvPerfil.requestFocusInWindow();
            return;
        }
    //Codigo para avilitar los campos de texto para crear un usuario
        
        //Desavilitar los demas botones 
        btnAnterior.setEnabled(true);
        btnAnterior2.setEnabled(true);
        btnSiguiente.setEnabled(true);
        btnSiguiente2.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnModificar.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnCanselar.setEnabled(true);
        btnEliminar.setEnabled(true);
        //Hablita los botones
        btnGuardar.setEnabled(false);
        btnCanselar.setEnabled(false);
        
        //Desavilitar los campos
        txtIdUsuario.setEnabled(false);
        txtNombre.setEnabled(false);
        
        txtApellido.setEnabled(false);
        txtClave.setEnabled(false);
        txtConfirmar.setEnabled(false);
        cmvPerfil.setEnabled(false);
        
    }//GEN-LAST:event_btnGuardarActionPerformed
    //Boton Eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Codigo para avilitar los campos de texto para crear un usuario 
        //Hablita los botones
        btnAnterior.setEnabled(true);
        btnAnterior2.setEnabled(true);
        btnSiguiente.setEnabled(true);
        btnSiguiente2.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnModificar.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnCanselar.setEnabled(true);
        btnEliminar.setEnabled(true);
        //Desavilitar los demas botones
        btnGuardar.setEnabled(false);
        btnCanselar.setEnabled(false);
        
        //Desavilitar los campos
        txtIdUsuario.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtClave.setEnabled(false);
        txtConfirmar.setEnabled(false);
        cmvPerfil.setEnabled(false);
    }//GEN-LAST:event_btnEliminarActionPerformed
    //Boton de modificar
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //Codigo para avilitar los campos de texto para crear un usuario 
        //Desavilitar los demas botones 
        btnAnterior.setEnabled(false);
        btnAnterior2.setEnabled(false);
        btnSiguiente.setEnabled(false);
        btnSiguiente2.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnCanselar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCanselar.setEnabled(true);

        //Habilita los campos
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtClave.setEnabled(true);
        txtConfirmar.setEnabled(true);
        cmvPerfil.setEnabled(true);
        //Desactivamos la bandera
        nuevo = false;
        //Foco al id 
        txtNombre.requestFocusInWindow();
    }//GEN-LAST:event_btnModificarActionPerformed
    //Formulario actual
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        txtIdUsuario.setText(misDatos.getUsuarios()[usuAct].getIdUsuario());
        txtNombre.setText(misDatos.getUsuarios()[usuAct].getNombre());
        txtClave.setText(misDatos.getUsuarios()[usuAct].getClave());
        txtConfirmar.setText(misDatos.getUsuarios()[usuAct].getClave());
        txtApellido.setText(misDatos.getUsuarios()[usuAct].getApellido());
       cmvPerfil.setSelectedIndex(misDatos.getUsuarios()[usuAct].getPerfil());
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAnterior2;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCanselar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnSiguiente2;
    private javax.swing.JComboBox<String> cmvPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JPasswordField txtConfirmar;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
