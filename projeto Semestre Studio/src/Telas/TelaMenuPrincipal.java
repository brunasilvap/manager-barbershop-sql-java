package Telas;

import Controller.MenuPrincipalController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class TelaMenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;
    private String nomeDoUsuario;
    private String cargoDoUsuario;

    public TelaMenuPrincipal() {
        initComponents();
        this.controller = new MenuPrincipalController(this);

    }

    // controle de acesso 
    public TelaMenuPrincipal(String usuarioaltenticadoNome, String usuarioAltenticadoCargo) {
        this.nomeDoUsuario = usuarioaltenticadoNome;
        this.cargoDoUsuario = usuarioAltenticadoCargo;
        initComponents();

        this.controller = new MenuPrincipalController(this);

        lblSaudacao.setText("Bem Vindo, " + nomeDoUsuario);
        mnuContabilidade.setVisible(false);
        OperacaoBar.setVisible(false);
//permissôes
        if (usuarioAltenticadoCargo.equalsIgnoreCase("Cabeleireiro/Barbeiro")) {
            mnuOperação.setVisible(false);
            OperacaoBar.setVisible(true);
            mnuAdministracao.setVisible(false);
            mnuClientesAdm.setVisible(false);
            return;

        } else if (usuarioAltenticadoCargo.equalsIgnoreCase("Gerente")) {

            mnuCliente.setVisible(false);
            return;
        } else if (usuarioAltenticadoCargo.equalsIgnoreCase("Selecione o cargo")) {

            mnuOpcoes.setVisible(false);
            lblSaudacao.setText("Voce nao tem permissão para acessar o Sistema peça autorização ao gerente");
            return;
            
        } else if (usuarioAltenticadoCargo.equalsIgnoreCase("recepcionista")) {
            mnuAdministracao.setVisible(false);
            mnuCliente.setVisible(false);
            mnuEstoque.setVisible(false);
            return;
        } else if (usuarioAltenticadoCargo.equalsIgnoreCase("programador")) {

            return;
        } else if (usuarioAltenticadoCargo.equalsIgnoreCase("Visagista")) {
            mnuOperação.setVisible(false);
            OperacaoBar.setVisible(true);
            mnuAdministracao.setVisible(false);
            mnuClientesAdm.setVisible(false);
            return;
        } else if (usuarioAltenticadoCargo.equalsIgnoreCase("Contabilidade")) {

            mnuClientesAdm.setVisible(false);
            mnuAgendamento.setVisible(false);
            btnServico.setVisible(false);
            mnuAdministracao.setVisible(false);
            mnuContabilidade.setVisible(true);
            
            
            return;

        } else {
            mnuOpcoes.setVisible(false);
        }
        lblSaudacao.setText("Voce nao tem permissão para acessar o Sistema peça autorização ao gerente");

        return;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        lblSaudacao = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        mnuOpcoes = new javax.swing.JMenuBar();
        mnuAdministracao = new javax.swing.JMenu();
        mnuControledeFuncionarios = new javax.swing.JMenuItem();
        btnServico = new javax.swing.JMenuItem();
        mnuContabilidade = new javax.swing.JMenu();
        mnuControledeFuncionarios1 = new javax.swing.JMenuItem();
        mnuClientesAdm = new javax.swing.JMenu();
        mnuControleGeral = new javax.swing.JMenuItem();
        mnuCliente = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuOperação = new javax.swing.JMenu();
        mnuAgendamento = new javax.swing.JMenuItem();
        mnuEstoque = new javax.swing.JMenuItem();
        OperacaoBar = new javax.swing.JMenu();
        mnuAgendamento1 = new javax.swing.JMenuItem();
        mnuEstoque1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jdpPrincipal.setBackground(new java.awt.Color(182, 151, 135));

        lblSaudacao.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 25)); // NOI18N
        jdpPrincipal.add(lblSaudacao);
        lblSaudacao.setBounds(230, 30, 940, 70);

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/TElamenu.jpg"))); // NOI18N
        jdpPrincipal.add(lblImagem);
        lblImagem.setBounds(0, 0, 1340, 730);

        getContentPane().add(jdpPrincipal);
        jdpPrincipal.setBounds(0, 0, 1340, 670);

        mnuAdministracao.setText("Administração");
        mnuAdministracao.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N

        mnuControledeFuncionarios.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        mnuControledeFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons/cliente-icon.png"))); // NOI18N
        mnuControledeFuncionarios.setText("Controle de Funcionarios");
        mnuControledeFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuControledeFuncionariosActionPerformed(evt);
            }
        });
        mnuAdministracao.add(mnuControledeFuncionarios);

        btnServico.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnServico.setText("Serviços");
        btnServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicoActionPerformed(evt);
            }
        });
        mnuAdministracao.add(btnServico);

        mnuOpcoes.add(mnuAdministracao);

        mnuContabilidade.setText("Contabilidade");
        mnuContabilidade.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N

        mnuControledeFuncionarios1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        mnuControledeFuncionarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons/cliente-icon.png"))); // NOI18N
        mnuControledeFuncionarios1.setText("Funcionarios");
        mnuControledeFuncionarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuControledeFuncionarios1ActionPerformed(evt);
            }
        });
        mnuContabilidade.add(mnuControledeFuncionarios1);

        mnuOpcoes.add(mnuContabilidade);

        mnuClientesAdm.setText("Clientes");
        mnuClientesAdm.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N

        mnuControleGeral.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        mnuControleGeral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons/9040622_people_icon_1.png"))); // NOI18N
        mnuControleGeral.setText("Controle Geral");
        mnuControleGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuControleGeralActionPerformed(evt);
            }
        });
        mnuClientesAdm.add(mnuControleGeral);

        mnuOpcoes.add(mnuClientesAdm);

        mnuCliente.setText("Clientes");
        mnuCliente.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons/9039886_card_list_icon_1.png"))); // NOI18N
        jMenuItem1.setText("Lista de Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuCliente.add(jMenuItem1);

        mnuOpcoes.add(mnuCliente);

        mnuOperação.setText("Operação");
        mnuOperação.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N

        mnuAgendamento.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        mnuAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons/agenda-icon.png"))); // NOI18N
        mnuAgendamento.setText("Agendamentos");
        mnuAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgendamentoActionPerformed(evt);
            }
        });
        mnuOperação.add(mnuAgendamento);

        mnuEstoque.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        mnuEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons/estoque (1).png"))); // NOI18N
        mnuEstoque.setText("Estoque");
        mnuEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEstoqueActionPerformed(evt);
            }
        });
        mnuOperação.add(mnuEstoque);

        mnuOpcoes.add(mnuOperação);

        OperacaoBar.setText("Operação");
        OperacaoBar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N

        mnuAgendamento1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        mnuAgendamento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons/agenda-icon.png"))); // NOI18N
        mnuAgendamento1.setText("Agendamentos");
        mnuAgendamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgendamento1ActionPerformed(evt);
            }
        });
        OperacaoBar.add(mnuAgendamento1);

        mnuEstoque1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        mnuEstoque1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons/estoque (1).png"))); // NOI18N
        mnuEstoque1.setText("Estoque");
        mnuEstoque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEstoque1ActionPerformed(evt);
            }
        });
        OperacaoBar.add(mnuEstoque1);

        mnuOpcoes.add(OperacaoBar);

        setJMenuBar(mnuOpcoes);

        setSize(new java.awt.Dimension(1351, 721));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void mnuControledeFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuControledeFuncionariosActionPerformed
        TelaFuncionarios obj = new TelaFuncionarios();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_mnuControledeFuncionariosActionPerformed

    private void mnuControleGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuControleGeralActionPerformed
        TelaClientes obj;
        try {
            obj = new TelaClientes();
            jdpPrincipal.add(obj);
            obj.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mnuControleGeralActionPerformed

    private void mnuAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgendamentoActionPerformed
        try {
            this.controller.navegarParaAgenda();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, " deu algum erro" + ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_mnuAgendamentoActionPerformed

    private void mnuEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEstoqueActionPerformed

        try {
            this.controller.navegarParaEstoque();

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, " deu algum erro" + ex);
        }
    }//GEN-LAST:event_mnuEstoqueActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        try {
            String nome = null;
            TelaClientes obj;
            obj = new TelaClientes(nome);
            jdpPrincipal.add(obj);
            obj.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicoActionPerformed
        try {
            this.controller.navegarParaServico();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "não foi possivel entrar na Tela de Serviços erro " + ex);
        }
    }//GEN-LAST:event_btnServicoActionPerformed

    private void mnuControledeFuncionarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuControledeFuncionarios1ActionPerformed
        String nome = null;
         TelaFuncionarios obj = new TelaFuncionarios(nome);
        jdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_mnuControledeFuncionarios1ActionPerformed

    private void mnuAgendamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgendamento1ActionPerformed
try {
            this.controller.navegarParaAgenda();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, " deu algum erro" + ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuAgendamento1ActionPerformed

    private void mnuEstoque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEstoque1ActionPerformed

        try {
            this.controller.navegarParaEstoque1();

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, " deu algum erro" + ex);
        }    }//GEN-LAST:event_mnuEstoque1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu OperacaoBar;
    private javax.swing.JMenuItem btnServico;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuAdministracao;
    private javax.swing.JMenuItem mnuAgendamento;
    private javax.swing.JMenuItem mnuAgendamento1;
    private javax.swing.JMenu mnuCliente;
    private javax.swing.JMenu mnuClientesAdm;
    private javax.swing.JMenu mnuContabilidade;
    private javax.swing.JMenuItem mnuControleGeral;
    private javax.swing.JMenuItem mnuControledeFuncionarios;
    private javax.swing.JMenuItem mnuControledeFuncionarios1;
    private javax.swing.JMenuItem mnuEstoque;
    private javax.swing.JMenuItem mnuEstoque1;
    private javax.swing.JMenuBar mnuOpcoes;
    private javax.swing.JMenu mnuOperação;
    // End of variables declaration//GEN-END:variables

    public JDesktopPane getJdpPrincipal() {
        return jdpPrincipal;
    }

    public void setJdpPrincipal(JDesktopPane jdpPrincipal) {
        this.jdpPrincipal = jdpPrincipal;
    }

    public JLabel getLblImagem() {
        return lblImagem;
    }

    public void setLblImagem(JLabel lblImagem) {
        this.lblImagem = lblImagem;
    }

    public JLabel getLblSaudacao() {
        return lblSaudacao;
    }

    public void setLblSaudacao(JLabel lblSaudacao) {
        this.lblSaudacao = lblSaudacao;
    }

    public JMenu getMnuAdministracao() {
        return mnuAdministracao;
    }

    public void setMnuAdministracao(JMenu mnuAdministracao) {
        this.mnuAdministracao = mnuAdministracao;
    }

    public JMenuItem getMnuAgendamento() {
        return mnuAgendamento;
    }

    public void setMnuAgendamento(JMenuItem mnuAgendamento) {
        this.mnuAgendamento = mnuAgendamento;
    }

    public JMenu getMnuClientes() {
        return mnuClientesAdm;
    }

    public void setMnuClientes(JMenu mnuClientes) {
        this.mnuClientesAdm = mnuClientes;
    }

    public JMenuItem getMnuControleGeral() {
        return mnuControleGeral;
    }

    public void setMnuControleGeral(JMenuItem mnuControleGeral) {
        this.mnuControleGeral = mnuControleGeral;
    }

    public JMenuItem getMnuControledeFuncionarios() {
        return mnuControledeFuncionarios;
    }

    public void setMnuControledeFuncionarios(JMenuItem mnuControledeFuncionarios) {
        this.mnuControledeFuncionarios = mnuControledeFuncionarios;
    }

    public JMenuItem getMnuEstoque() {
        return mnuEstoque;
    }

    public void setMnuEstoque(JMenuItem mnuEstoque) {
        this.mnuEstoque = mnuEstoque;
    }

    public JMenuBar getMnuOpcoes() {
        return mnuOpcoes;
    }

    public void setMnuOpcoes(JMenuBar mnuOpcoes) {
        this.mnuOpcoes = mnuOpcoes;
    }

    public JMenu getMnuOperação() {
        return mnuOperação;
    }

    public void setMnuOperação(JMenu mnuOperação) {
        this.mnuOperação = mnuOperação;
    }

}
