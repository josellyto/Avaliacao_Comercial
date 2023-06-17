package avaliacaoempresas;

public class CadastroEmpresas extends javax.swing.JFrame {

    public CadastroEmpresas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tituloEstab = new javax.swing.JTextField();
        cadSenhaEstab = new javax.swing.JTextField();
        nomeEstab = new javax.swing.JTextField();
        ConfirmSenhaEstab = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoEstab = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        enderecoEstab = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel11 = new javax.swing.JLabel();
        telEstab = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 100, 50, 16);

        jLabel2.setText("Endereço:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 370, 60, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cadastrar Estabelecimento");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 20, 330, 30);

        tituloEstab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloEstabActionPerformed(evt);
            }
        });
        getContentPane().add(tituloEstab);
        tituloEstab.setBounds(210, 160, 300, 22);

        cadSenhaEstab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadSenhaEstabActionPerformed(evt);
            }
        });
        getContentPane().add(cadSenhaEstab);
        cadSenhaEstab.setBounds(210, 130, 300, 22);

        nomeEstab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeEstabActionPerformed(evt);
            }
        });
        getContentPane().add(nomeEstab);
        nomeEstab.setBounds(210, 100, 300, 22);

        ConfirmSenhaEstab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmSenhaEstabActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmSenhaEstab);
        ConfirmSenhaEstab.setBounds(210, 190, 300, 22);

        jLabel4.setText("Categoria:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 400, 60, 16);

        jLabel5.setText("Titulo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 190, 40, 16);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 460, 90, 22);

        jLabel7.setText("Senha:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 130, 40, 20);

        jLabel8.setText("Confirmar senha:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 160, 100, 16);

        descricaoEstab.setColumns(20);
        descricaoEstab.setRows(5);
        jScrollPane1.setViewportView(descricaoEstab);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(210, 220, 300, 110);

        jLabel10.setText("Descrição:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(150, 220, 60, 16);

        enderecoEstab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoEstabActionPerformed(evt);
            }
        });
        getContentPane().add(enderecoEstab);
        enderecoEstab.setBounds(210, 340, 300, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Selecionar", "Mercado", "Fastfood", "Farmácia", "Auto peças", "outros..." }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(210, 400, 93, 22);

        jLabel11.setText("Telefone:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(150, 340, 60, 20);
        getContentPane().add(telEstab);
        telEstab.setBounds(210, 370, 300, 22);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Atenção: Todos os campos devem ser preenchidos corretamente para ser validados");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(140, 70, 470, 16);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo3.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 60, 710, 460);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IM.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-3, 0, 710, 580);

        jMenuBar1.setBorder(null);

        jMenu1.setText("Início");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Avaliações");
        jRadioButtonMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/application_home.png"))); // NOI18N
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuários");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Cadastrar");
        jRadioButtonMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(724, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeEstabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeEstabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeEstabActionPerformed

    private void ConfirmSenhaEstabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmSenhaEstabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmSenhaEstabActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tituloEstabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloEstabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloEstabActionPerformed

    private void enderecoEstabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoEstabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoEstabActionPerformed

    private void cadSenhaEstabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadSenhaEstabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadSenhaEstabActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        // TODO add your handling code here:
        new CadastrarUsuario().setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        // TODO add your handling code here:
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEmpresas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConfirmSenhaEstab;
    private javax.swing.JTextField cadSenhaEstab;
    private javax.swing.JTextArea descricaoEstab;
    private javax.swing.JTextField enderecoEstab;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeEstab;
    private javax.swing.JTextField telEstab;
    private javax.swing.JTextField tituloEstab;
    // End of variables declaration//GEN-END:variables
}
