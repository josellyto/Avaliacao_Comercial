
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
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoEstab = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        enderecoEstab = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        telEstab = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 130, 40, 16);

        jLabel2.setText("Endereço:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 370, 60, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CADASTRAR ESTABELECIMENTO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(540, 10, 330, 30);

        tituloEstab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloEstabActionPerformed(evt);
            }
        });
        getContentPane().add(tituloEstab);
        tituloEstab.setBounds(330, 220, 300, 22);

        cadSenhaEstab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadSenhaEstabActionPerformed(evt);
            }
        });
        getContentPane().add(cadSenhaEstab);
        cadSenhaEstab.setBounds(330, 160, 300, 22);

        nomeEstab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeEstabActionPerformed(evt);
            }
        });
        getContentPane().add(nomeEstab);
        nomeEstab.setBounds(330, 130, 300, 22);

        ConfirmSenhaEstab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmSenhaEstabActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmSenhaEstab);
        ConfirmSenhaEstab.setBounds(330, 190, 300, 22);

        jLabel4.setText("Categoria:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 440, 60, 16);

        jLabel5.setText("Titulo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 220, 40, 16);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 450, 90, 28);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IM.jpg"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(700, 700));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 220, 840);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Inserir");
        getContentPane().add(jButton2);
        jButton2.setBounds(1050, 450, 70, 28);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/11929743_shop2.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(700, 150, 410, 290);

        jLabel7.setText("Senha:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 160, 37, 16);

        jLabel8.setText("Confirmar senha:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(230, 190, 100, 16);

        descricaoEstab.setColumns(20);
        descricaoEstab.setRows(5);
        jScrollPane1.setViewportView(descricaoEstab);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 250, 300, 98);

        jLabel10.setText("Descrição:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 250, 60, 16);

        enderecoEstab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoEstabActionPerformed(evt);
            }
        });
        getContentPane().add(enderecoEstab);
        enderecoEstab.setBounds(330, 370, 300, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Mercado", "Fastfood", "Farmácia", "Auto peças", "outros..." }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(330, 440, 88, 26);

        jLabel11.setText("Telefone:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(270, 400, 60, 20);
        getContentPane().add(telEstab);
        telEstab.setBounds(330, 400, 300, 20);

        jLabel12.setText("Atenção: Todos os campos devem ser preenchidos corretamente para serem validados");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(260, 90, 470, 16);

        jLabel13.setText("Insira uma foto do estabelecimento");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(710, 450, 210, 16);

        jMenuBar1.setBorder(null);

        jMenu1.setText("Início");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuários");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1382, 771));
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
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeEstab;
    private javax.swing.JTextField telEstab;
    private javax.swing.JTextField tituloEstab;
    // End of variables declaration//GEN-END:variables
}
