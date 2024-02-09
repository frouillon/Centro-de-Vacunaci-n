package menus;

/**
 *
 * @author USER
 */
public class resultadoPacienteVacunadoEspecifico extends javax.swing.JFrame {
    String kitPasado;
    String lotePasado;
    String marcaPasado;
    String efectoAdversoPasado;
    String nombre;
    String apellido;
    String telefono;
    String tipoDoc;
    String codDoc;
    String domicilio;
    /**
     * Creates new form resultadoBusquedaEspecifica
     */
    public resultadoPacienteVacunadoEspecifico() {
        initComponents();
    }

    public resultadoPacienteVacunadoEspecifico(String nombre, String apellido, String telefono, String tipoDoc, String codDoc, String domicilio, String kitVacunaSuministrada, String loteVacunaSuministrada, String marcaVacunaSuministrada, String efectoAdversoVacunaSuministrada) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.tipoDoc=tipoDoc;
        this.codDoc=codDoc;
        this.domicilio=domicilio;
        this.kitPasado=kitVacunaSuministrada;
        this.lotePasado=loteVacunaSuministrada;
        this.marcaPasado=marcaVacunaSuministrada;
        this.efectoAdversoPasado=efectoAdversoVacunaSuministrada;
        initComponents();
        txtKitPasado.setText(kitVacunaSuministrada);
        txtLotePasado.setText(loteVacunaSuministrada);
        txtMarcaPasado.setText(marcaVacunaSuministrada);
        txtEfectoAdversoPasado.setText(efectoAdversoVacunaSuministrada);
        txtNombrePasado.setText(nombre);
        txtApelldioPasado.setText(apellido);
        txtTelefonoPasado.setText(telefono);
        txtTipoDocPasado.setText(tipoDoc);
        txtCodDocPasado.setText(codDoc);
        txtDomicillioPasado.setText(domicilio);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombrePasado = new javax.swing.JTextField();
        txtApelldioPasado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTelefonoPasado = new javax.swing.JTextField();
        txtTipoDocPasado = new javax.swing.JTextField();
        btnMostrarVacunas1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtKitPasado = new javax.swing.JTextField();
        txtLotePasado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMarcaPasado = new javax.swing.JTextField();
        txtEfectoAdversoPasado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodDocPasado = new javax.swing.JTextField();
        txtDomicillioPasado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vacuna encontrada");

        txtNombrePasado.setEditable(false);
        txtNombrePasado.setText("nombre");
        txtNombrePasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePasadoActionPerformed(evt);
            }
        });

        txtApelldioPasado.setEditable(false);
        txtApelldioPasado.setText("apellido");
        txtApelldioPasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApelldioPasadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("La paciente encontrado");

        txtTelefonoPasado.setEditable(false);
        txtTelefonoPasado.setText("telefono");
        txtTelefonoPasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoPasadoActionPerformed(evt);
            }
        });

        txtTipoDocPasado.setEditable(false);
        txtTipoDocPasado.setText("tipo de documento");
        txtTipoDocPasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoDocPasadoActionPerformed(evt);
            }
        });

        btnMostrarVacunas1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnMostrarVacunas1.setText("Volver");
        btnMostrarVacunas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVacunas1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Lote:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Marca:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Efecto adverso:");

        txtKitPasado.setEditable(false);
        txtKitPasado.setText("kit");
        txtKitPasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKitPasadoActionPerformed(evt);
            }
        });

        txtLotePasado.setEditable(false);
        txtLotePasado.setText("lote");
        txtLotePasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLotePasadoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Kit:");

        txtMarcaPasado.setEditable(false);
        txtMarcaPasado.setText("marca");
        txtMarcaPasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaPasadoActionPerformed(evt);
            }
        });

        txtEfectoAdversoPasado.setEditable(false);
        txtEfectoAdversoPasado.setText("efecto adverso");
        txtEfectoAdversoPasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEfectoAdversoPasadoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Codigo del documento:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Domicilio:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Apellidos:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Nombres:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Telefono:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Tipo de documento:");

        txtCodDocPasado.setEditable(false);
        txtCodDocPasado.setText("codigo del documento");
        txtCodDocPasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodDocPasadoActionPerformed(evt);
            }
        });

        txtDomicillioPasado.setEditable(false);
        txtDomicillioPasado.setText("domicilio del paciente");
        txtDomicillioPasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicillioPasadoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText("La vacuna suministrada fue:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel3))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApelldioPasado, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTelefonoPasado, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTipoDocPasado)
                                    .addComponent(txtNombrePasado)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEfectoAdversoPasado)
                                    .addComponent(txtMarcaPasado)
                                    .addComponent(txtLotePasado)
                                    .addComponent(txtKitPasado)
                                    .addComponent(txtDomicillioPasado, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                    .addComponent(txtCodDocPasado)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(btnMostrarVacunas1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombrePasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtApelldioPasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txtTelefonoPasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTipoDocPasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCodDocPasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtDomicillioPasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtKitPasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLotePasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMarcaPasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEfectoAdversoPasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnMostrarVacunas1)
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarVacunas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVacunas1ActionPerformed
        // TODO add your handling code here:
        menuVacuna menVac = new menuVacuna();
        menVac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarVacunas1ActionPerformed

    private void txtCodDocPasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodDocPasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodDocPasadoActionPerformed

    private void txtEfectoAdversoPasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEfectoAdversoPasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEfectoAdversoPasadoActionPerformed

    private void txtMarcaPasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaPasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaPasadoActionPerformed

    private void txtLotePasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLotePasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLotePasadoActionPerformed

    private void txtKitPasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKitPasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKitPasadoActionPerformed

    private void txtDomicillioPasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicillioPasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicillioPasadoActionPerformed

    private void txtApelldioPasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApelldioPasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApelldioPasadoActionPerformed

    private void txtNombrePasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePasadoActionPerformed

    private void txtTipoDocPasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoDocPasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoDocPasadoActionPerformed

    private void txtTelefonoPasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoPasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoPasadoActionPerformed

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
            java.util.logging.Logger.getLogger(resultadoPacienteVacunadoEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultadoPacienteVacunadoEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultadoPacienteVacunadoEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultadoPacienteVacunadoEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultadoPacienteVacunadoEspecifico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarVacunas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApelldioPasado;
    private javax.swing.JTextField txtCodDocPasado;
    private javax.swing.JTextField txtDomicillioPasado;
    private javax.swing.JTextField txtEfectoAdversoPasado;
    private javax.swing.JTextField txtKitPasado;
    private javax.swing.JTextField txtLotePasado;
    private javax.swing.JTextField txtMarcaPasado;
    private javax.swing.JTextField txtNombrePasado;
    private javax.swing.JTextField txtTelefonoPasado;
    private javax.swing.JTextField txtTipoDocPasado;
    // End of variables declaration//GEN-END:variables
}