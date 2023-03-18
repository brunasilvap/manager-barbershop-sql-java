package Telas;

import Controller.AgendaController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;


public class TelaAgendamento extends javax.swing.JInternalFrame {

    private final  AgendaController controller;
    
    public TelaAgendamento() throws SQLException, ClassNotFoundException {
        initComponents();
        controller = new AgendaController(this);
        iniciar();
         
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAgendamento = new javax.swing.JPanel();
        lblAgendamentos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlInformacoes = new javax.swing.JPanel();
        lblIdAgendamento = new javax.swing.JLabel();
        txtIdAgendamento = new javax.swing.JTextField();
        lblIdCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        lblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblHorario = new javax.swing.JLabel();
        cmbHorario = new javax.swing.JComboBox<>();
        lblServico = new javax.swing.JLabel();
        cmbServico = new javax.swing.JComboBox<>();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblResponsavel = new javax.swing.JLabel();
        cmbResponsavel = new javax.swing.JComboBox<>();
        btnAgendar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblListaAgendamento = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableAgenda = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Tela Agendamento");
        getContentPane().setLayout(null);

        pnlAgendamento.setBackground(new java.awt.Color(78, 76, 76));
        pnlAgendamento.setLayout(null);

        lblAgendamentos.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 25)); // NOI18N
        lblAgendamentos.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendamentos.setText("Agendamentos");
        pnlAgendamento.add(lblAgendamentos);
        lblAgendamentos.setBounds(20, 10, 190, 35);
        pnlAgendamento.add(jSeparator1);
        jSeparator1.setBounds(210, 20, 750, 20);

        pnlInformacoes.setBackground(new java.awt.Color(78, 76, 76));
        pnlInformacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));

        lblIdAgendamento.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblIdAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        lblIdAgendamento.setText("ID Agendamento:");

        txtIdAgendamento.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N
        txtIdAgendamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdAgendamentoFocusLost(evt);
            }
        });

        lblIdCliente.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblIdCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblIdCliente.setText("ID Cliente :");

        txtIdCliente.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N
        txtIdCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdClienteFocusLost(evt);
            }
        });

        lblNomeCliente.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeCliente.setText("Nome do Cliente :");

        txtNomeCliente.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N
        txtNomeCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeClienteFocusGained(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data:");

        txtData.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        lblHorario.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(255, 255, 255));
        lblHorario.setText("Horario:");

        cmbHorario.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        cmbHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30" }));

        lblServico.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblServico.setForeground(new java.awt.Color(255, 255, 255));
        lblServico.setText("Serviço:");

        cmbServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbServicoItemStateChanged(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblValor.setForeground(new java.awt.Color(255, 255, 255));
        lblValor.setText("Valor:");

        lblResponsavel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblResponsavel.setForeground(new java.awt.Color(255, 255, 255));
        lblResponsavel.setText("Profissional Responsavel:");

        cmbResponsavel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbResponsavelItemStateChanged(evt);
            }
        });

        btnAgendar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btncancelar.setText("Cancelar ");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        lblListaAgendamento.setBackground(new java.awt.Color(78, 76, 76));
        lblListaAgendamento.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        lblListaAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        lblListaAgendamento.setText("Lista de Agendamentos");

        btnAtualizar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnAtualizar.setText("Atualizar Lista");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir Agendamento");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        TableAgenda.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 11)); // NOI18N
        TableAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Agendamentos", "Nome dos Clientes", "Data", "Horarios", "Servico", "Valor do Serviço", "Profissional", "OBS"
            }
        ));
        TableAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(TableAgenda);

        javax.swing.GroupLayout pnlInformacoesLayout = new javax.swing.GroupLayout(pnlInformacoes);
        pnlInformacoes.setLayout(pnlInformacoesLayout);
        pnlInformacoesLayout.setHorizontalGroup(
            pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdAgendamento))
                        .addGap(40, 40, 40)
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdCliente)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeCliente)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbServico, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblServico))
                        .addGap(40, 40, 40)
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValor)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblResponsavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbResponsavel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addComponent(btnAgendar)
                        .addGap(18, 18, 18)
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformacoesLayout.createSequentialGroup()
                        .addComponent(lblListaAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizar)
                        .addGap(27, 27, 27)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlInformacoesLayout.setVerticalGroup(
            pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addComponent(lblIdAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtIdAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addComponent(lblIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addComponent(lblNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblServico, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbServico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addComponent(lblResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(cmbResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir)
                    .addComponent(lblListaAgendamento))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlAgendamento.add(pnlInformacoes);
        pnlInformacoes.setBounds(20, 60, 940, 550);

        getContentPane().add(pnlAgendamento);
        pnlAgendamento.setBounds(0, 0, 980, 630);

        setBounds(0, 0, 995, 656);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtIdAgendamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdAgendamentoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAgendamentoFocusLost

    private void txtIdClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdClienteFocusLost
      try {
            Connection conexao;
            PreparedStatement st;
            ResultSet resultado;

            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancobarbearia", "root", "123456");
            //Verifica o conteúdo do comboBox de tipo de relatório

            st = conexao.prepareStatement("SELECT * FROM cliente  WHERE idcliente = ?");
            int cliente;
            cliente = Integer.parseInt(txtIdCliente.getText());
             st.setInt(1,cliente);
             resultado = st.executeQuery();
             
             if (resultado.next()){
            txtNomeCliente.setText(resultado.getString("nome"));
            txtNomeCliente.setEditable(false);
            return;
           
             }
            else
                 JOptionPane.showMessageDialog(null, "nao existe esse Id de cliente no banco de dados");
           txtNomeCliente.setEditable(true);
           txtNomeCliente.requestFocus();
           

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto" + ex.getMessage());
        }
        
    }//GEN-LAST:event_txtIdClienteFocusLost

    private void txtNomeClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeClienteFocusGained
         
    }//GEN-LAST:event_txtNomeClienteFocusGained

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
       
        dispose();
        
    }//GEN-LAST:event_btncancelarActionPerformed

    private void cmbServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbServicoItemStateChanged
        try {
            this.controller.pegarvalor();
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbServicoItemStateChanged

    private void cmbResponsavelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbResponsavelItemStateChanged
       
    }//GEN-LAST:event_cmbResponsavelItemStateChanged

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
         this.controller.agendar();
        
         try {
            this.controller.atualizaTabela();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            this.controller.atualizaTabela();
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "não foi possivel atualizar a tabelo ERRO, " + ex);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            this.controller.deletaAgendamento();
            JOptionPane.showMessageDialog(null, "Agendamento Excluido Com Sucesso");
            this.controller.atualizaTabela();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAgenda;
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btncancelar;
    private javax.swing.JComboBox<String> cmbHorario;
    private javax.swing.JComboBox<String> cmbResponsavel;
    private javax.swing.JComboBox<String> cmbServico;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAgendamentos;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblIdAgendamento;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblListaAgendamento;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblResponsavel;
    private javax.swing.JLabel lblServico;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlAgendamento;
    private javax.swing.JPanel pnlInformacoes;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtIdAgendamento;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void iniciar() throws SQLException, ClassNotFoundException {
       this.controller.atualizaServico();
       this.controller.pegarvalor();
       this.controller.atualizaProfissionaisBarbeiro();
       this.controller.atualizaProfissionaisVisagista();
       this.controller.atualizaTabela();
       
    }

    public JTable getTableAgenda() {
        return TableAgenda;
    }

    public void setTableAgenda(JTable TableAgenda) {
        this.TableAgenda = TableAgenda;
    }

    public JButton getBtnAgendar() {
        return btnAgendar;
    }

    public void setBtnAgendar(JButton btnAgendar) {
        this.btnAgendar = btnAgendar;
    }

    public JButton getBtnAgendar1() {
        return btncancelar;
    }

    public void setBtnAgendar1(JButton btnAgendar1) {
        this.btncancelar = btnAgendar1;
    }

    public JButton getBtnAtualizar() {
        return btnAtualizar;
    }

    public void setBtnAtualizar(JButton btnAtualizar) {
        this.btnAtualizar = btnAtualizar;
    }

    public JComboBox<String> getCmbHorario() {
        return cmbHorario;
    }

    public void setCmbHorario(JComboBox<String> cmbHorario) {
        this.cmbHorario = cmbHorario;
    }

    public JComboBox<String> getCmbServico() {
        return cmbServico;
    }

    public void setCmbServico(JComboBox<String> cmbServico) {
        this.cmbServico = cmbServico;
    }

    public JLabel getjLabel1() {
        return lblListaAgendamento;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.lblListaAgendamento = jLabel1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JLabel getLblAgendamentos() {
        return lblAgendamentos;
    }

    public void setLblAgendamentos(JLabel lblAgendamentos) {
        this.lblAgendamentos = lblAgendamentos;
    }

    public JLabel getLblData() {
        return lblData;
    }

    public void setLblData(JLabel lblData) {
        this.lblData = lblData;
    }

    public JLabel getLblHorario() {
        return lblHorario;
    }

    public void setLblHorario(JLabel lblHorario) {
        this.lblHorario = lblHorario;
    }

    public JLabel getLblIdAgendamento() {
        return lblIdAgendamento;
    }

    public void setLblIdAgendamento(JLabel lblIdAgendamento) {
        this.lblIdAgendamento = lblIdAgendamento;
    }

    public JLabel getLblIdCliente() {
        return lblIdCliente;
    }

    public void setLblIdCliente(JLabel lblIdCliente) {
        this.lblIdCliente = lblIdCliente;
    }

    public JLabel getLblNomeCliente() {
        return lblNomeCliente;
    }

    public void setLblNomeCliente(JLabel lblNomeCliente) {
        this.lblNomeCliente = lblNomeCliente;
    }

    public JLabel getLblServico() {
        return lblServico;
    }

    public void setLblServico(JLabel lblServico) {
        this.lblServico = lblServico;
    }

    public JLabel getLblValor() {
        return lblValor;
    }

    public void setLblValor(JLabel lblValor) {
        this.lblValor = lblValor;
    }

    public JPanel getPnlAgendamento() {
        return pnlAgendamento;
    }

    public void setPnlAgendamento(JPanel pnlAgendamento) {
        this.pnlAgendamento = pnlAgendamento;
    }

    public JPanel getPnlInformacoes() {
        return pnlInformacoes;
    }

    public void setPnlInformacoes(JPanel pnlInformacoes) {
        this.pnlInformacoes = pnlInformacoes;
    }

    public JTextField getTxtData() {
        return txtData;
    }

    public void setTxtData(JTextField txtData) {
        this.txtData = txtData;
    }

    public JTextField getTxtIdAgendamento() {
        return txtIdAgendamento;
    }

    public void setTxtIdAgendamento(JTextField txtIdAgendamento) {
        this.txtIdAgendamento = txtIdAgendamento;
    }

    public JTextField getTxtIdCliente() {
        return txtIdCliente;
    }

    public void setTxtIdCliente(JTextField txtIdCliente) {
        this.txtIdCliente = txtIdCliente;
    }

    public JTextField getTxtNomeCliente() {
        return txtNomeCliente;
    }

    public void setTxtNomeCliente(JTextField txtNomeCliente) {
        this.txtNomeCliente = txtNomeCliente;
    }

    public JTextField getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(JTextField txtValor) {
        this.txtValor = txtValor;
    }

    public JComboBox<String> getCmbResponsavel() {
        return cmbResponsavel;
    }

    public void setCmbResponsavel(JComboBox<String> cmbResponsavel) {
        this.cmbResponsavel = cmbResponsavel;
    }

    public JLabel getLblResponsavel() {
        return lblResponsavel;
    }

    public void setLblResponsavel(JLabel lblResponsavel) {
        this.lblResponsavel = lblResponsavel;
    }

    public JButton getBtnExcluir() {
        return btnExcluir;
    }

    public void setBtnExcluir(JButton btnExcluir) {
        this.btnExcluir = btnExcluir;
    }

    public JButton getBtncancelar() {
        return btncancelar;
    }

    public void setBtncancelar(JButton btncancelar) {
        this.btncancelar = btncancelar;
    }
    
}
