package Telas;

import Controller.CadastroController;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TelaFuncionarios extends javax.swing.JInternalFrame {

    private final CadastroController controller;
    DefaultTableModel defTable;
    DefaultTableModel defTable1;

    public TelaFuncionarios() {
         initComponents();
        controller = new CadastroController(this);
        defTable = (DefaultTableModel) tblConsultarFuncionario.getModel();
        defTable1 = (DefaultTableModel) TabelaLista3.getModel();
        iniciarTabela();
        btnAlterar.setVisible(false);
        btnExcluir.setVisible   (false);

    }

    public TelaFuncionarios(String contabilidade) {
        initComponents();
        controller = new CadastroController(this);
        defTable = (DefaultTableModel) tblConsultarFuncionario.getModel();
        defTable1 = (DefaultTableModel) TabelaLista3.getModel();
        iniciarTabela();
        btnAlterar.setVisible(false);
        btnExcluir.setVisible   (false);
        pnlGuaiFuncionarios.remove(pnlConsultarFuncionario);
        pnlGuaiFuncionarios.remove(pnlNovoFuncionario);
    

    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGuaiFuncionarios = new javax.swing.JTabbedPane();
        pnlNovoFuncionario = new javax.swing.JPanel();
        lblCadastroFuncionario = new javax.swing.JLabel();
        spSeparador = new javax.swing.JSeparator();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNomeCompleto = new javax.swing.JLabel();
        txtNomeCompleto = new javax.swing.JTextField();
        lblNascimento = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        boxGenero = new javax.swing.JComboBox<>();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        boxCargo = new javax.swing.JComboBox<>();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblConfirmarSenha = new javax.swing.JLabel();
        txtlblConfirmarSenha = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        pnlConsultarFuncionario = new javax.swing.JPanel();
        pnlConsularFuncio = new javax.swing.JPanel();
        lblConsultarFuncionario = new javax.swing.JLabel();
        spSeparador1 = new javax.swing.JSeparator();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        pdrConsultarFuncionario = new javax.swing.JScrollPane();
        tblConsultarFuncionario = new javax.swing.JTable();
        pnlListaFuncionario = new javax.swing.JPanel();
        lblListaFuncionario = new javax.swing.JLabel();
        pdrListaFuncionario = new javax.swing.JScrollPane();
        TabelaLista3 = new javax.swing.JTable();
        spSeparador2 = new javax.swing.JSeparator();

        setClosable(true);
        setTitle("Controle de Funcionarios");
        getContentPane().setLayout(null);

        pnlGuaiFuncionarios.setBackground(new java.awt.Color(78, 76, 76));
        pnlGuaiFuncionarios.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        pnlGuaiFuncionarios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnlGuaiFuncionariosFocusGained(evt);
            }
        });
        pnlGuaiFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlGuaiFuncionariosMouseClicked(evt);
            }
        });

        pnlNovoFuncionario.setBackground(new java.awt.Color(78, 76, 76));

        lblCadastroFuncionario.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        lblCadastroFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastroFuncionario.setText("Cadastro do Funcionarios");

        spSeparador.setForeground(new java.awt.Color(0, 0, 0));

        lblId.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblId.setText("ID");
        lblId.setToolTipText("");
        lblId.setAlignmentY(1.5F);

        txtId.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N

        lblNomeCompleto.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblNomeCompleto.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeCompleto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeCompleto.setText("Nome Completo:");
        lblNomeCompleto.setToolTipText("");
        lblNomeCompleto.setAlignmentY(1.5F);

        txtNomeCompleto.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N

        lblNascimento.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lblNascimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNascimento.setText("Dt. Nasc:");
        lblNascimento.setToolTipText("");
        lblNascimento.setAlignmentY(1.5F);

        txtNascimento.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N

        lblCpf.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(255, 255, 255));
        lblCpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCpf.setText("CPF:");
        lblCpf.setToolTipText("");
        lblCpf.setAlignmentY(1.5F);

        txtCpf.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N

        lblSexo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSexo.setText("Sexo:");
        lblSexo.setToolTipText("");
        lblSexo.setAlignmentY(1.5F);

        boxGenero.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        boxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Não Binario" }));
        boxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxGeneroActionPerformed(evt);
            }
        });

        lblTelefone.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefone.setText("Telefone:");
        lblTelefone.setToolTipText("");
        lblTelefone.setAlignmentY(1.5F);

        txtTelefone.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("E-mail:");
        lblEmail.setToolTipText("");
        lblEmail.setAlignmentY(1.5F);

        txtEmail.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N

        lblCargo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo.setText("Cargo:");
        lblCargo.setToolTipText("");
        lblCargo.setAlignmentY(1.5F);

        boxCargo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        boxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Cabeleireiro/Barbeiro", "Visagista", "Recepcionista", "Contabilidade" }));
        boxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCargoActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha:");
        lblSenha.setToolTipText("");
        lblSenha.setAlignmentY(1.5F);

        txtSenha.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N

        lblConfirmarSenha.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblConfirmarSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmarSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfirmarSenha.setText("Confirmar Senha:");
        lblConfirmarSenha.setToolTipText("");
        lblConfirmarSenha.setAlignmentY(1.5F);

        txtlblConfirmarSenha.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        btnCadastrar.setText("Cadastrar ");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNovoFuncionarioLayout = new javax.swing.GroupLayout(pnlNovoFuncionario);
        pnlNovoFuncionario.setLayout(pnlNovoFuncionarioLayout);
        pnlNovoFuncionarioLayout.setHorizontalGroup(
            pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovoFuncionarioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNovoFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblSenha)
                        .addGap(18, 18, 18)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lblConfirmarSenha)
                        .addGap(18, 18, 18)
                        .addComponent(txtlblConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)
                        .addGap(56, 56, 56))
                    .addGroup(pnlNovoFuncionarioLayout.createSequentialGroup()
                        .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNovoFuncionarioLayout.createSequentialGroup()
                                .addComponent(lblId)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNovoFuncionarioLayout.createSequentialGroup()
                                .addComponent(lblNascimento)
                                .addGap(18, 18, 18)
                                .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))))
            .addGroup(pnlNovoFuncionarioLayout.createSequentialGroup()
                .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNovoFuncionarioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCadastroFuncionario)
                        .addGap(10, 10, 10)
                        .addComponent(spSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNovoFuncionarioLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNovoFuncionarioLayout.createSequentialGroup()
                                .addComponent(lblSexo)
                                .addGap(18, 18, 18)
                                .addComponent(boxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(lblTelefone)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNovoFuncionarioLayout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblCargo)
                                .addGap(18, 18, 18)
                                .addComponent(boxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15))
        );
        pnlNovoFuncionarioLayout.setVerticalGroup(
            pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovoFuncionarioLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlNovoFuncionarioLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(spSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNovoFuncionarioLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnlNovoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlblConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNovoFuncionarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        pnlGuaiFuncionarios.addTab("Novo Funcionarios", pnlNovoFuncionario);

        pnlConsularFuncio.setBackground(new java.awt.Color(78, 76, 76));
        pnlConsularFuncio.setLayout(null);

        lblConsultarFuncionario.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        lblConsultarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultarFuncionario.setText("Consultar Funcionario");
        pnlConsularFuncio.add(lblConsultarFuncionario);
        lblConsultarFuncionario.setBounds(10, 10, 270, 32);

        spSeparador1.setForeground(new java.awt.Color(0, 0, 0));
        pnlConsularFuncio.add(spSeparador1);
        spSeparador1.setBounds(270, 20, 510, 30);

        lblNome.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome:");
        lblNome.setToolTipText("");
        lblNome.setAlignmentY(1.5F);
        pnlConsularFuncio.add(lblNome);
        lblNome.setBounds(12, 65, 41, 18);

        txtNome.setFont(new java.awt.Font("Franklin Gothic Book", 0, 11)); // NOI18N
        pnlConsularFuncio.add(txtNome);
        txtNome.setBounds(71, 61, 364, 29);

        btnPesquisar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        pnlConsularFuncio.add(btnPesquisar);
        btnPesquisar.setBounds(520, 60, 81, 29);

        btnAlterar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
        });
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        pnlConsularFuncio.add(btnAlterar);
        btnAlterar.setBounds(620, 60, 67, 29);

        btnExcluir.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnlConsularFuncio.add(btnExcluir);
        btnExcluir.setBounds(710, 60, 65, 29);

        tblConsultarFuncionario.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 11)); // NOI18N
        tblConsultarFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Senha", "Sexo", "Nascimento", "Telefone", "E-mail", "CPF", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblConsultarFuncionario.setToolTipText("");
        tblConsultarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pdrConsultarFuncionario.setViewportView(tblConsultarFuncionario);

        pnlConsularFuncio.add(pdrConsultarFuncionario);
        pdrConsultarFuncionario.setBounds(10, 110, 780, 290);

        javax.swing.GroupLayout pnlConsultarFuncionarioLayout = new javax.swing.GroupLayout(pnlConsultarFuncionario);
        pnlConsultarFuncionario.setLayout(pnlConsultarFuncionarioLayout);
        pnlConsultarFuncionarioLayout.setHorizontalGroup(
            pnlConsultarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlConsularFuncio, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );
        pnlConsultarFuncionarioLayout.setVerticalGroup(
            pnlConsultarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlConsularFuncio, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pnlGuaiFuncionarios.addTab("Consultar Funcionario", pnlConsultarFuncionario);

        pnlListaFuncionario.setBackground(new java.awt.Color(72, 72, 72));

        lblListaFuncionario.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        lblListaFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lblListaFuncionario.setText("Lista de Funcionarios");

        TabelaLista3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 11)); // NOI18N
        TabelaLista3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Cargo"
            }
        ));
        TabelaLista3.setToolTipText("");
        TabelaLista3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pdrListaFuncionario.setViewportView(TabelaLista3);

        spSeparador2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlListaFuncionarioLayout = new javax.swing.GroupLayout(pnlListaFuncionario);
        pnlListaFuncionario.setLayout(pnlListaFuncionarioLayout);
        pnlListaFuncionarioLayout.setHorizontalGroup(
            pnlListaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListaFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblListaFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(spSeparador2))
                    .addComponent(pdrListaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlListaFuncionarioLayout.setVerticalGroup(
            pnlListaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaFuncionarioLayout.createSequentialGroup()
                .addGroup(pnlListaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListaFuncionarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblListaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlListaFuncionarioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(spSeparador2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pdrListaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlGuaiFuncionarios.addTab("Funcionarios", pnlListaFuncionario);

        getContentPane().add(pnlGuaiFuncionarios);
        pnlGuaiFuncionarios.setBounds(0, 0, 800, 450);

        setBounds(0, 0, 815, 476);
    }// </editor-fold>//GEN-END:initComponents

    private void boxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxGeneroActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (txtNomeCompleto.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "O campo nome nao pode ficar em branco");

            return;

        } else if (txtlblConfirmarSenha.getText().equals(txtSenha)) {

            JOptionPane.showMessageDialog(null, ("as senhas nao coencidem"));
            return;

        } else {

            try {
                this.controller.salvaUsuario1();
                JOptionPane.showMessageDialog(null, "Funcionario Salvo com Sucesso!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possivel Salvar o Usuario" + ex);
            }
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void boxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCargoActionPerformed


    }//GEN-LAST:event_boxCargoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        try {
            this.controller.pesquisarNoBancoDeDados();
            btnAlterar.setVisible(true);
            btnExcluir.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "não foi possivel Fazer a pesquisa " + ex);
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void pnlGuaiFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGuaiFuncionariosMouseClicked

    }//GEN-LAST:event_pnlGuaiFuncionariosMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        int Confirmacao = JOptionPane.showConfirmDialog(null, "Voce tem certeza que deseja Alterar o Funcionario "
                + tblConsultarFuncionario.getModel().getValueAt(0, 1) + "?");
        if (Confirmacao == 0) {
            try {
                this.controller.Alterar();
                JOptionPane.showMessageDialog(null, "Funcionario Alterado, ");
                iniciarTabela();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "não foi possivel Alterar o Funcionario, " + ex);
            }
        } else {
            txtNome.requestFocus();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int Confirmacao = JOptionPane.showConfirmDialog(null, "Voce tem certeza que deseja excluir o Funcionario "
                + tblConsultarFuncionario.getModel().getValueAt(0, 1) + "?");
        if (Confirmacao == 0) {

            try {
                this.controller.excluirFuncionario();
                JOptionPane.showMessageDialog(null, "Funcionarios Excluido Com Sucesso");
                iniciarTabela();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não Foi possivel Excluir o funcionario" + ex);
            }
        } else {

            txtNome.requestFocus();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarMouseClicked

    private void pnlGuaiFuncionariosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnlGuaiFuncionariosFocusGained
       
    }//GEN-LAST:event_pnlGuaiFuncionariosFocusGained

    private void iniciarTabela() {

        try {
            controller.iniciaTabela();
            controller.iniciaTabela2();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "acoteceu um erro ao iniciar a tabela" + ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaLista3;
    private javax.swing.JComboBox<String> boxCargo;
    private javax.swing.JComboBox<String> boxGenero;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel lblCadastroFuncionario;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblConsultarFuncionario;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblListaFuncionario;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JScrollPane pdrConsultarFuncionario;
    private javax.swing.JScrollPane pdrListaFuncionario;
    private javax.swing.JPanel pnlConsularFuncio;
    private javax.swing.JPanel pnlConsultarFuncionario;
    private javax.swing.JTabbedPane pnlGuaiFuncionarios;
    private javax.swing.JPanel pnlListaFuncionario;
    private javax.swing.JPanel pnlNovoFuncionario;
    private javax.swing.JSeparator spSeparador;
    private javax.swing.JSeparator spSeparador1;
    private javax.swing.JSeparator spSeparador2;
    private javax.swing.JTable tblConsultarFuncionario;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtlblConfirmarSenha;
    // End of variables declaration//GEN-END:variables

    public JTable getTabelaLista3() {
        return TabelaLista3;
    }

    public void setTabelaLista3(JTable TabelaLista3) {
        this.TabelaLista3 = TabelaLista3;
    }

    public JComboBox<String> getBoxCargo() {
        return boxCargo;
    }

    public void setBoxCargo(JComboBox<String> boxCargo) {
        this.boxCargo = boxCargo;
    }

    public JComboBox<String> getBoxGenero() {
        return boxGenero;
    }

    public void setBoxGenero(JComboBox<String> boxGenero) {
        this.boxGenero = boxGenero;
    }

    public JButton getBtnAlterar() {
        return btnAlterar;
    }

    public void setBtnAlterar(JButton btnAlterar) {
        this.btnAlterar = btnAlterar;
    }

    public JButton getBtnCadastrar() {
        return btnCadastrar;
    }

    public void setBtnCadastrar(JButton btnCadastrar) {
        this.btnCadastrar = btnCadastrar;
    }

    public JButton getBtnExcluir() {
        return btnExcluir;
    }

    public void setBtnExcluir(JButton btnExcluir) {
        this.btnExcluir = btnExcluir;
    }

    public JButton getBtnPesquisar() {
        return btnPesquisar;
    }

    public void setBtnPesquisar(JButton btnPesquisar) {
        this.btnPesquisar = btnPesquisar;
    }

    public JLabel getLblCadastroFuncionario() {
        return lblCadastroFuncionario;
    }

    public void setLblCadastroFuncionario(JLabel lblCadastroFuncionario) {
        this.lblCadastroFuncionario = lblCadastroFuncionario;
    }

    public JLabel getLblCargo() {
        return lblCargo;
    }

    public void setLblCargo(JLabel lblCargo) {
        this.lblCargo = lblCargo;
    }

    public JLabel getLblConfirmarSenha() {
        return lblConfirmarSenha;
    }

    public void setLblConfirmarSenha(JLabel lblConfirmarSenha) {
        this.lblConfirmarSenha = lblConfirmarSenha;
    }

    public JLabel getLblConsultarFuncionario() {
        return lblConsultarFuncionario;
    }

    public void setLblConsultarFuncionario(JLabel lblConsultarFuncionario) {
        this.lblConsultarFuncionario = lblConsultarFuncionario;
    }

    public JLabel getLblCpf() {
        return lblCpf;
    }

    public void setLblCpf(JLabel lblCpf) {
        this.lblCpf = lblCpf;
    }

    public JLabel getLblEmail() {
        return lblEmail;
    }

    public void setLblEmail(JLabel lblEmail) {
        this.lblEmail = lblEmail;
    }

 

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblListaFuncionario() {
        return lblListaFuncionario;
    }

    public void setLblListaFuncionario(JLabel lblListaFuncionario) {
        this.lblListaFuncionario = lblListaFuncionario;
    }

    public JLabel getLblNascimento() {
        return lblNascimento;
    }

    public void setLblNascimento(JLabel lblNascimento) {
        this.lblNascimento = lblNascimento;
    }

    public JLabel getLblNome() {
        return lblNome;
    }

    public void setLblNome(JLabel lblNome) {
        this.lblNome = lblNome;
    }

    public JLabel getLblNomeCompleto() {
        return lblNomeCompleto;
    }

    public void setLblNomeCompleto(JLabel lblNomeCompleto) {
        this.lblNomeCompleto = lblNomeCompleto;
    }

    public JLabel getLblSenha() {
        return lblSenha;
    }

    public void setLblSenha(JLabel lblSenha) {
        this.lblSenha = lblSenha;
    }

    public JLabel getLblSexo() {
        return lblSexo;
    }

    public void setLblSexo(JLabel lblSexo) {
        this.lblSexo = lblSexo;
    }

    public JLabel getLblTelefone() {
        return lblTelefone;
    }

    public void setLblTelefone(JLabel lblTelefone) {
        this.lblTelefone = lblTelefone;
    }

    public JScrollPane getPdrConsultarFuncionario() {
        return pdrConsultarFuncionario;
    }

    public void setPdrConsultarFuncionario(JScrollPane pdrConsultarFuncionario) {
        this.pdrConsultarFuncionario = pdrConsultarFuncionario;
    }

    public JScrollPane getPdrListaFuncionario() {
        return pdrListaFuncionario;
    }

    public void setPdrListaFuncionario(JScrollPane pdrListaFuncionario) {
        this.pdrListaFuncionario = pdrListaFuncionario;
    }

    public JPanel getPnlConsularFuncio() {
        return pnlConsularFuncio;
    }

    public void setPnlConsularFuncio(JPanel pnlConsularFuncio) {
        this.pnlConsularFuncio = pnlConsularFuncio;
    }

    public JPanel getPnlConsultarFuncionario() {
        return pnlConsultarFuncionario;
    }

    public void setPnlConsultarFuncionario(JPanel pnlConsultarFuncionario) {
        this.pnlConsultarFuncionario = pnlConsultarFuncionario;
    }

    public JTabbedPane getPnlGuaiFuncionarios() {
        return pnlGuaiFuncionarios;
    }

    public void setPnlGuaiFuncionarios(JTabbedPane pnlGuaiFuncionarios) {
        this.pnlGuaiFuncionarios = pnlGuaiFuncionarios;
    }

    public JPanel getPnlListaFuncionario() {
        return pnlListaFuncionario;
    }

    public void setPnlListaFuncionario(JPanel pnlListaFuncionario) {
        this.pnlListaFuncionario = pnlListaFuncionario;
    }

    public JPanel getPnlNovoFuncionario() {
        return pnlNovoFuncionario;
    }

    public void setPnlNovoFuncionario(JPanel pnlNovoFuncionario) {
        this.pnlNovoFuncionario = pnlNovoFuncionario;
    }

    public JSeparator getSpSeparador() {
        return spSeparador;
    }

    public void setSpSeparador(JSeparator spSeparador) {
        this.spSeparador = spSeparador;
    }

    public JSeparator getSpSeparador1() {
        return spSeparador1;
    }

    public void setSpSeparador1(JSeparator spSeparador1) {
        this.spSeparador1 = spSeparador1;
    }

    public JSeparator getSpSeparador2() {
        return spSeparador2;
    }

    public void setSpSeparador2(JSeparator spSeparador2) {
        this.spSeparador2 = spSeparador2;
    }

    public JTable getTblConsultarFuncionario() {
        return tblConsultarFuncionario;
    }

    public void setTblConsultarFuncionario(JTable tblConsultarFuncionario) {
        this.tblConsultarFuncionario = tblConsultarFuncionario;
    }

    public JTextField getTxtCpf() {
        return txtCpf;
    }

    public void setTxtCpf(JTextField txtCpf) {
        this.txtCpf = txtCpf;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

 

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNascimento() {
        return txtNascimento;
    }

    public void setTxtNascimento(JTextField txtNascimento) {
        this.txtNascimento = txtNascimento;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(JTextField txtNome) {
        this.txtNome = txtNome;
    }

    public JTextField getTxtNomeCompleto() {
        return txtNomeCompleto;
    }

    public void setTxtNomeCompleto(JTextField txtNomeCompleto) {
        this.txtNomeCompleto = txtNomeCompleto;
    }

    public JTextField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JTextField txtSenha) {
        this.txtSenha = txtSenha;
    }

    public JTextField getTxtTelefone() {
        return txtTelefone;
    }

    public void setTxtTelefone(JTextField txtTelefone) {
        this.txtTelefone = txtTelefone;
    }

    public JTextField getTxtlblConfirmarSenha() {
        return txtlblConfirmarSenha;
    }

    public void setTxtlblConfirmarSenha(JTextField txtlblConfirmarSenha) {
        this.txtlblConfirmarSenha = txtlblConfirmarSenha;
    }

}
