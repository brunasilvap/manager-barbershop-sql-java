package Telas;

import Controller.Helper.NavegarHelper;
import Controller.LoginController;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Vinicius
 */

public class TelaLogin extends javax.swing.JFrame {

    private final LoginController controller;
    private final NavegarHelper navegar;

    public TelaLogin() {
        initComponents();
        controller = new LoginController(this);
        navegar = new NavegarHelper(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblDados = new javax.swing.JLabel();
        lbllUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        btnMostrarSenha = new javax.swing.JButton();
        pswSenhaUsuario = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        lblNaoConta = new javax.swing.JLabel();
        lblImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Login");
        getContentPane().setLayout(null);

        pnlLogin.setBackground(new java.awt.Color(78, 76, 76));
        pnlLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        pnlLogin.setLayout(null);

        lblLogin.setBackground(new java.awt.Color(0, 0, 0));
        lblLogin.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 25)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Login");
        lblLogin.setToolTipText("");
        pnlLogin.add(lblLogin);
        lblLogin.setBounds(-10, 20, 110, 50);

        jSeparator1.setForeground(new java.awt.Color(98, 55, 13));
        pnlLogin.add(jSeparator1);
        jSeparator1.setBounds(80, 50, 430, 10);

        lblDados.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 11)); // NOI18N
        lblDados.setForeground(new java.awt.Color(255, 255, 255));
        lblDados.setText("Informe seus dados de acesso.");
        pnlLogin.add(lblDados);
        lblDados.setBounds(210, 60, 148, 14);

        lbllUsuario.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 13)); // NOI18N
        lbllUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbllUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllUsuario.setText("Usuario:");
        lbllUsuario.setToolTipText("");
        lbllUsuario.setAlignmentY(1.5F);
        pnlLogin.add(lbllUsuario);
        lbllUsuario.setBounds(10, 120, 140, 30);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        pnlLogin.add(txtUsuario);
        txtUsuario.setBounds(120, 120, 360, 30);

        lblSenha.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 13)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha:");
        lblSenha.setToolTipText("");
        lblSenha.setAlignmentY(1.5F);
        pnlLogin.add(lblSenha);
        lblSenha.setBounds(10, 170, 140, 30);

        btnMostrarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons/9040149_eye_slash_icon_1.png"))); // NOI18N
        btnMostrarSenha.setContentAreaFilled(false);
        btnMostrarSenha.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnMostrarSenhaStateChanged(evt);
            }
        });
        btnMostrarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarSenhaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarSenhaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMostrarSenhaMousePressed(evt);
            }
        });
        btnMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarSenhaActionPerformed(evt);
            }
        });
        pnlLogin.add(btnMostrarSenha);
        btnMostrarSenha.setBounds(450, 170, 30, 30);

        pswSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswSenhaUsuarioActionPerformed(evt);
            }
        });
        pswSenhaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswSenhaUsuarioKeyPressed(evt);
            }
        });
        pnlLogin.add(pswSenhaUsuario);
        pswSenhaUsuario.setBounds(120, 170, 360, 30);

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        pnlLogin.add(btnEntrar);
        btnEntrar.setBounds(340, 220, 130, 40);

        btnCadastro.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(205, 156, 87));
        btnCadastro.setText("Cadastre-se ");
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        pnlLogin.add(btnCadastro);
        btnCadastro.setBounds(230, 220, 100, 40);

        lblNaoConta.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        lblNaoConta.setForeground(new java.awt.Color(255, 255, 255));
        lblNaoConta.setText("Ainda não tem uma conta?");
        pnlLogin.add(lblNaoConta);
        lblNaoConta.setBounds(110, 220, 140, 40);

        getContentPane().add(pnlLogin);
        pnlLogin.setBounds(90, 50, 530, 300);

        lblImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/TElamenu.jpg"))); // NOI18N
        lblImagemFundo.setText("Login ");
        lblImagemFundo.setToolTipText("");
        getContentPane().add(lblImagemFundo);
        lblImagemFundo.setBounds(0, 0, 700, 420);

        setSize(new java.awt.Dimension(716, 453));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        try {
            this.controller.entrarNoSistema();
            dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel entrar no Sistema" + ex);
        }


    }//GEN-LAST:event_btnEntrarActionPerformed

    private void pswSenhaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswSenhaUsuarioKeyPressed

    }//GEN-LAST:event_pswSenhaUsuarioKeyPressed

    private void pswSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswSenhaUsuarioActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed


    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnMostrarSenhaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnMostrarSenhaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarSenhaStateChanged

    private void btnMostrarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarSenhaMouseClicked


    }//GEN-LAST:event_btnMostrarSenhaMouseClicked

    private void btnMostrarSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarSenhaMousePressed
        pswSenhaUsuario.setEchoChar('\u0000');
    }//GEN-LAST:event_btnMostrarSenhaMousePressed

    private void btnMostrarSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarSenhaMouseExited
        pswSenhaUsuario.setEchoChar('*');
    }//GEN-LAST:event_btnMostrarSenhaMouseExited

    private void btnMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarSenhaActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed

        this.navegar.navegarParaCadastro();

    }//GEN-LAST:event_btnCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnMostrarSenha;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDados;
    private javax.swing.JLabel lblImagemFundo;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNaoConta;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lbllUsuario;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField pswSenhaUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    
    public JButton getBtnCadastro() {
        return btnCadastro;
    }

    public void setBtnCadastro(JButton btnCadastro) {
        this.btnCadastro = btnCadastro;
    }

    public JButton getBtnEntrar() {
        return btnEntrar;
    }

    public void setBtnEntrar(JButton btnEntrar) {
        this.btnEntrar = btnEntrar;
    }

    public JButton getjButton1() {
        return btnMostrarSenha;
    }

    public void setjButton1(JButton jButton1) {
        this.btnMostrarSenha = jButton1;
    }

    

    public JLabel getjLabel2() {
        return lblNaoConta;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.lblNaoConta = jLabel2;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JLabel getLblDados() {
        return lblDados;
    }

    public void setLblDados(JLabel lblDados) {
        this.lblDados = lblDados;
    }

    public JLabel getLblImagemFundo() {
        return lblImagemFundo;
    }

    public void setLblImagemFundo(JLabel lblImagemFundo) {
        this.lblImagemFundo = lblImagemFundo;
    }

    public JLabel getLblLogin() {
        return lblLogin;
    }

    public void setLblLogin(JLabel lblLogin) {
        this.lblLogin = lblLogin;
    }

    public JLabel getLblSenha() {
        return lblSenha;
    }

    public void setLblSenha(JLabel lblSenha) {
        this.lblSenha = lblSenha;
    }

    public JLabel getLbllUsuario() {
        return lbllUsuario;
    }

    public void setLbllUsuario(JLabel lbllUsuario) {
        this.lbllUsuario = lbllUsuario;
    }

    public JPanel getPnlLogin() {
        return pnlLogin;
    }

    public void setPnlLogin(JPanel pnlLogin) {
        this.pnlLogin = pnlLogin;
    }

    public JPasswordField getPswSenhaUsuario() {
        return pswSenhaUsuario;
    }

    public void setPswSenhaUsuario(JPasswordField pswSenhaUsuario) {
        this.pswSenhaUsuario = pswSenhaUsuario;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

}
