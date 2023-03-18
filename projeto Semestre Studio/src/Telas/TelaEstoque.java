package Telas;

import Controller.EstoqueController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class TelaEstoque extends javax.swing.JInternalFrame {

    private final EstoqueController controller;

    public TelaEstoque() throws SQLException {
        initComponents();
        controller = new EstoqueController(this);
        controller.AtualizarTabela();
        pnlEstoque.remove(pnlHistoricoProdutos);
        btnAlterar.setVisible(false);
        btnExcluir.setVisible(false);

    }
        public TelaEstoque(String nome) throws SQLException {
        initComponents();
        controller = new EstoqueController(this);
        controller.AtualizarTabela();
        pnlEstoque.remove(pnlHistoricoProdutos);
        btnAlterar.setVisible(false);
        btnExcluir.setVisible(false);
        pnlEstoque.remove(pnlNovoProduto);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEstoque = new javax.swing.JTabbedPane();
        pnlNovoProduto = new javax.swing.JPanel();
        pnlNovoP = new javax.swing.JPanel();
        pnlPainel2 = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNomeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lblFornecedor = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblDescricaoPainel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextPane();
        btnAdicionar1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtQtd = new javax.swing.JComboBox<>();
        lblValor1 = new javax.swing.JLabel();
        lblNovoProduto = new javax.swing.JLabel();
        spSeparador3 = new javax.swing.JSeparator();
        pnlConsultarProduto = new javax.swing.JPanel();
        pnlConsultar = new javax.swing.JPanel();
        lblConsultar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaDeProdutos = new javax.swing.JTable();
        lblLsita = new javax.swing.JLabel();
        spSeparador = new javax.swing.JSeparator();
        pnlPainel = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        spSeparador1 = new javax.swing.JSeparator();
        pnlHistoricoProdutos = new javax.swing.JPanel();
        lblHistorico = new javax.swing.JLabel();
        spSeparador2 = new javax.swing.JSeparator();
        scrollTabela = new javax.swing.JScrollPane();
        tblTabelaHistorico = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnExcluir2 = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Estoque");
        getContentPane().setLayout(null);

        pnlEstoque.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N

        pnlNovoP.setBackground(new java.awt.Color(78, 76, 76));
        pnlNovoP.setLayout(null);

        pnlPainel2.setBackground(new java.awt.Color(78, 76, 76));
        pnlPainel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));

        lblId.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("ID:");
        lblId.setRequestFocusEnabled(false);

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lblNomeProduto.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblNomeProduto.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeProduto.setText("Nome do Produto:");
        lblNomeProduto.setRequestFocusEnabled(false);

        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        lblFornecedor.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        lblFornecedor.setText("Fornecedor:");
        lblFornecedor.setRequestFocusEnabled(false);

        txtFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFornecedorActionPerformed(evt);
            }
        });

        lblCategoria.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setText("Categoria:");
        lblCategoria.setRequestFocusEnabled(false);

        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblValor.setForeground(new java.awt.Color(255, 255, 255));
        lblValor.setText("Valor:");
        lblValor.setRequestFocusEnabled(false);

        lblDescricaoPainel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblDescricaoPainel.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricaoPainel.setText("Descrição:");
        lblDescricaoPainel.setRequestFocusEnabled(false);

        jScrollPane2.setViewportView(txtDescricao);

        btnAdicionar1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnAdicionar1.setText("Adicionar");
        btnAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar1ActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtQtd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        lblValor1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblValor1.setForeground(new java.awt.Color(255, 255, 255));
        lblValor1.setText("Quantidade:");
        lblValor1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout pnlPainel2Layout = new javax.swing.GroupLayout(pnlPainel2);
        pnlPainel2.setLayout(pnlPainel2Layout);
        pnlPainel2Layout.setHorizontalGroup(
            pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPainel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPainel2Layout.createSequentialGroup()
                        .addComponent(lblDescricaoPainel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(pnlPainel2Layout.createSequentialGroup()
                        .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoria))
                        .addGap(67, 67, 67)
                        .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPainel2Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFornecedor))
                        .addGap(59, 59, 59))))
        );
        pnlPainel2Layout.setVerticalGroup(
            pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtQtd))
                .addGap(30, 30, 30)
                .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricaoPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pnlNovoP.add(pnlPainel2);
        pnlPainel2.setBounds(42, 68, 731, 440);

        lblNovoProduto.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        lblNovoProduto.setForeground(new java.awt.Color(255, 255, 255));
        lblNovoProduto.setText("Novo Produto");
        pnlNovoP.add(lblNovoProduto);
        lblNovoProduto.setBounds(20, 11, 171, 28);

        spSeparador3.setForeground(new java.awt.Color(0, 0, 0));
        pnlNovoP.add(spSeparador3);
        spSeparador3.setBounds(195, 20, 613, 30);

        javax.swing.GroupLayout pnlNovoProdutoLayout = new javax.swing.GroupLayout(pnlNovoProduto);
        pnlNovoProduto.setLayout(pnlNovoProdutoLayout);
        pnlNovoProdutoLayout.setHorizontalGroup(
            pnlNovoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNovoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlNovoProdutoLayout.setVerticalGroup(
            pnlNovoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNovoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlEstoque.addTab("Novo Produto", pnlNovoProduto);

        pnlConsultarProduto.setLayout(null);

        pnlConsultar.setBackground(new java.awt.Color(78, 76, 76));

        lblConsultar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        lblConsultar.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultar.setText("Consulta de Produtos");

        tblListaDeProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Categoria", "Preço", "Qtd. Estoque", "Fornecedor", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(tblListaDeProdutos);

        lblLsita.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        lblLsita.setForeground(new java.awt.Color(255, 255, 255));
        lblLsita.setText("Lista de Produtos");

        spSeparador.setForeground(new java.awt.Color(0, 0, 0));

        pnlPainel.setBackground(new java.awt.Color(78, 76, 76));
        pnlPainel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));

        lblNome.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome do Produto:");
        lblNome.setRequestFocusEnabled(false);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPainelLayout = new javax.swing.GroupLayout(pnlPainel);
        pnlPainel.setLayout(pnlPainelLayout);
        pnlPainelLayout.setHorizontalGroup(
            pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblNome)
                .addGap(18, 18, 18)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPainelLayout.createSequentialGroup()
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        pnlPainelLayout.setVerticalGroup(
            pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        spSeparador1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlConsultarLayout = new javax.swing.GroupLayout(pnlConsultar);
        pnlConsultar.setLayout(pnlConsultarLayout);
        pnlConsultarLayout.setHorizontalGroup(
            pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarLayout.createSequentialGroup()
                .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlConsultarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlConsultarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLsita, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spSeparador1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlConsultarLayout.setVerticalGroup(
            pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(spSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLsita)
                    .addGroup(pnlConsultarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spSeparador1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlConsultarProduto.add(pnlConsultar);
        pnlConsultar.setBounds(0, 0, 830, 540);

        pnlEstoque.addTab("Consultar Produto", pnlConsultarProduto);

        pnlHistoricoProdutos.setBackground(new java.awt.Color(78, 76, 76));

        lblHistorico.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        lblHistorico.setForeground(new java.awt.Color(255, 255, 255));
        lblHistorico.setText("Historico de Produtos");

        spSeparador2.setForeground(new java.awt.Color(0, 0, 0));

        tblTabelaHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Pedido", "N.F.", "Tipo Pedido", "Status", "Vendedor/Usuário", "Cliente/Fornecedor", "Entrada", "Saída"
            }
        ));
        scrollTabela.setViewportView(tblTabelaHistorico);

        btnSalvar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");

        btnExcluir2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnExcluir2.setText("Excluir");

        btnAtualizar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnAtualizar.setText("Atualizar");

        javax.swing.GroupLayout pnlHistoricoProdutosLayout = new javax.swing.GroupLayout(pnlHistoricoProdutos);
        pnlHistoricoProdutos.setLayout(pnlHistoricoProdutosLayout);
        pnlHistoricoProdutosLayout.setHorizontalGroup(
            pnlHistoricoProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHistoricoProdutosLayout.createSequentialGroup()
                .addGroup(pnlHistoricoProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHistoricoProdutosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spSeparador2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlHistoricoProdutosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlHistoricoProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlHistoricoProdutosLayout.createSequentialGroup()
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnExcluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlHistoricoProdutosLayout.setVerticalGroup(
            pnlHistoricoProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHistoricoProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHistoricoProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHistoricoProdutosLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(spSeparador2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHistorico))
                .addGap(18, 18, 18)
                .addComponent(scrollTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlHistoricoProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pnlEstoque.addTab("Historico", pnlHistoricoProdutos);

        getContentPane().add(pnlEstoque);
        pnlEstoque.setBounds(0, 0, 840, 570);

        setBounds(0, 0, 846, 596);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void txtFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFornecedorActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnAdicionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionar1ActionPerformed
        try {
            this.controller.CadastrarNoSistema();

            JOptionPane.showMessageDialog(null, "Produto Cadastrado Com Sucesso!!! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel Cadastrar o item, o codigo de erro é, " + ex);
        }
    }//GEN-LAST:event_btnAdicionar1ActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            this.controller.ConsultarProduto();
            btnAlterar.setVisible(true);
            btnExcluir.setVisible(true);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "não foi possivel cadastrar o produto" + ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int Confirmacao = JOptionPane.showConfirmDialog(null, "Voce tem certeza que deseja Alterar o Produto "
                + tblListaDeProdutos.getModel().getValueAt(0, 1) + "?");
        if (Confirmacao == 0) {
            try {
                this.controller.AlterarProduto();
                JOptionPane.showMessageDialog(null, "Produto Alterado Com Sucesso!!! ");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "não foi possivel alterar o produto" + ex);
            }
        } else {
            txtNome.requestFocus();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int Confirmacao = JOptionPane.showConfirmDialog(null, "Voce tem certeza que deseja Exluir o Produto "
                + tblListaDeProdutos.getModel().getValueAt(0, 1) + "?");
        if (Confirmacao == 0) {
        
        try {
            this.controller.excluir();
            JOptionPane.showMessageDialog(null, "Produto Excluido Com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel Excluir o produto");
        }
         } else {
            txtNome.requestFocus();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar1;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluir2;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JLabel lblDescricaoPainel;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblHistorico;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLsita;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblNovoProduto;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JPanel pnlConsultar;
    private javax.swing.JPanel pnlConsultarProduto;
    private javax.swing.JTabbedPane pnlEstoque;
    private javax.swing.JPanel pnlHistoricoProdutos;
    private javax.swing.JPanel pnlNovoP;
    private javax.swing.JPanel pnlNovoProduto;
    private javax.swing.JPanel pnlPainel;
    private javax.swing.JPanel pnlPainel2;
    private javax.swing.JScrollPane scrollTabela;
    private javax.swing.JSeparator spSeparador;
    private javax.swing.JSeparator spSeparador1;
    private javax.swing.JSeparator spSeparador2;
    private javax.swing.JSeparator spSeparador3;
    private javax.swing.JTable tblListaDeProdutos;
    private javax.swing.JTable tblTabelaHistorico;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextPane txtDescricao;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JComboBox<String> txtQtd;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAdicionar1() {
        return btnAdicionar1;
    }

    public JComboBox<String> getTxtQtd() {
        return txtQtd;
    }

    public void setTxtQtd(JComboBox<String> txtQtd) {
        this.txtQtd = txtQtd;
    }

    public void setBtnAdicionar1(JButton btnAdicionar1) {
        this.btnAdicionar1 = btnAdicionar1;
    }

    public JButton getBtnAlterar() {
        return btnAlterar;
    }

    public void setBtnAlterar(JButton btnAlterar) {
        this.btnAlterar = btnAlterar;
    }

    public JButton getBtnAtualizar() {
        return btnAtualizar;
    }

    public void setBtnAtualizar(JButton btnAtualizar) {
        this.btnAtualizar = btnAtualizar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnExcluir() {
        return btnExcluir;
    }

    public void setBtnExcluir(JButton btnExcluir) {
        this.btnExcluir = btnExcluir;
    }

    public JButton getBtnExcluir2() {
        return btnExcluir2;
    }

    public void setBtnExcluir2(JButton btnExcluir2) {
        this.btnExcluir2 = btnExcluir2;
    }

    public JButton getBtnPesquisar() {
        return btnPesquisar;
    }

    public void setBtnPesquisar(JButton btnPesquisar) {
        this.btnPesquisar = btnPesquisar;
    }

    public JButton getBtnSalvar() {
        return btnSalvar;
    }

    public void setBtnSalvar(JButton btnSalvar) {
        this.btnSalvar = btnSalvar;
    }

    public JComboBox<String> getjComboBox1() {
        return txtQtd;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.txtQtd = jComboBox1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JLabel getLblCategoria() {
        return lblCategoria;
    }

    public void setLblCategoria(JLabel lblCategoria) {
        this.lblCategoria = lblCategoria;
    }

    public JLabel getLblConsultar() {
        return lblConsultar;
    }

    public void setLblConsultar(JLabel lblConsultar) {
        this.lblConsultar = lblConsultar;
    }

    public JLabel getLblDescricaoPainel() {
        return lblDescricaoPainel;
    }

    public void setLblDescricaoPainel(JLabel lblDescricaoPainel) {
        this.lblDescricaoPainel = lblDescricaoPainel;
    }

    public JLabel getLblFornecedor() {
        return lblFornecedor;
    }

    public void setLblFornecedor(JLabel lblFornecedor) {
        this.lblFornecedor = lblFornecedor;
    }

    public JLabel getLblHistorico() {
        return lblHistorico;
    }

    public void setLblHistorico(JLabel lblHistorico) {
        this.lblHistorico = lblHistorico;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblLsita() {
        return lblLsita;
    }

    public void setLblLsita(JLabel lblLsita) {
        this.lblLsita = lblLsita;
    }

    public JLabel getLblNome() {
        return lblNome;
    }

    public void setLblNome(JLabel lblNome) {
        this.lblNome = lblNome;
    }

    public JLabel getLblNomeProduto() {
        return lblNomeProduto;
    }

    public void setLblNomeProduto(JLabel lblNomeProduto) {
        this.lblNomeProduto = lblNomeProduto;
    }

    public JLabel getLblNovoProduto() {
        return lblNovoProduto;
    }

    public void setLblNovoProduto(JLabel lblNovoProduto) {
        this.lblNovoProduto = lblNovoProduto;
    }

    public JLabel getLblValor() {
        return lblValor;
    }

    public void setLblValor(JLabel lblValor) {
        this.lblValor = lblValor;
    }

    public JLabel getLblValor1() {
        return lblValor1;
    }

    public void setLblValor1(JLabel lblValor1) {
        this.lblValor1 = lblValor1;
    }

    public JPanel getPnlConsultar() {
        return pnlConsultar;
    }

    public void setPnlConsultar(JPanel pnlConsultar) {
        this.pnlConsultar = pnlConsultar;
    }

    public JPanel getPnlConsultarProduto() {
        return pnlConsultarProduto;
    }

    public void setPnlConsultarProduto(JPanel pnlConsultarProduto) {
        this.pnlConsultarProduto = pnlConsultarProduto;
    }

    public JTabbedPane getPnlEstoque() {
        return pnlEstoque;
    }

    public void setPnlEstoque(JTabbedPane pnlEstoque) {
        this.pnlEstoque = pnlEstoque;
    }

    public JPanel getPnlHistoricoProdutos() {
        return pnlHistoricoProdutos;
    }

    public void setPnlHistoricoProdutos(JPanel pnlHistoricoProdutos) {
        this.pnlHistoricoProdutos = pnlHistoricoProdutos;
    }

    public JPanel getPnlNovoP() {
        return pnlNovoP;
    }

    public void setPnlNovoP(JPanel pnlNovoP) {
        this.pnlNovoP = pnlNovoP;
    }

    public JPanel getPnlNovoProduto() {
        return pnlNovoProduto;
    }

    public void setPnlNovoProduto(JPanel pnlNovoProduto) {
        this.pnlNovoProduto = pnlNovoProduto;
    }

    public JPanel getPnlPainel() {
        return pnlPainel;
    }

    public void setPnlPainel(JPanel pnlPainel) {
        this.pnlPainel = pnlPainel;
    }

    public JPanel getPnlPainel2() {
        return pnlPainel2;
    }

    public void setPnlPainel2(JPanel pnlPainel2) {
        this.pnlPainel2 = pnlPainel2;
    }

    public JScrollPane getScrollTabela() {
        return scrollTabela;
    }

    public void setScrollTabela(JScrollPane scrollTabela) {
        this.scrollTabela = scrollTabela;
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

    public JSeparator getSpSeparador3() {
        return spSeparador3;
    }

    public void setSpSeparador3(JSeparator spSeparador3) {
        this.spSeparador3 = spSeparador3;
    }

    public JTable getTblListaDeProdutos() {
        return tblListaDeProdutos;
    }

    public void setTblListaDeProdutos(JTable tblListaDeProdutos) {
        this.tblListaDeProdutos = tblListaDeProdutos;
    }

    public JTable getTblTabelaHistorico() {
        return tblTabelaHistorico;
    }

    public void setTblTabelaHistorico(JTable tblTabelaHistorico) {
        this.tblTabelaHistorico = tblTabelaHistorico;
    }

    public JTextField getTxtCategoria() {
        return txtCategoria;
    }

    public void setTxtCategoria(JTextField txtCategoria) {
        this.txtCategoria = txtCategoria;
    }

    public JTextField getTxtFornecedor() {
        return txtFornecedor;
    }

    public void setTxtFornecedor(JTextField txtFornecedor) {
        this.txtFornecedor = txtFornecedor;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(JTextField txtNome) {
        this.txtNome = txtNome;
    }

    public JTextField getTxtNomeProduto() {
        return txtNomeProduto;
    }

    public void setTxtNomeProduto(JTextField txtNomeProduto) {
        this.txtNomeProduto = txtNomeProduto;
    }

    public JTextField getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(JTextField txtValor) {
        this.txtValor = txtValor;
    }

    public JTextPane getTxtDescricao() {
        return txtDescricao;
    }

    public void setTxtDescricao(JTextPane txtpDescricao) {
        this.txtDescricao = txtpDescricao;
    }

}
