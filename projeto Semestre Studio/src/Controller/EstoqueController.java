/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.EstoqueHelper;
import Models.DAO.Conexao;
import Models.DAO.ProdutoDAO;
import Models.Produto;
import Telas.TelaEstoque;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinic
 *
 */
public class EstoqueController {

    DefaultTableModel defTable;
    DefaultTableModel defTable1;

    private final TelaEstoque view;
    private EstoqueHelper helper;

    public EstoqueController(TelaEstoque view) {
        this.view = view;
        this.helper = new EstoqueHelper(view);
        defTable = (DefaultTableModel) view.getTblListaDeProdutos().getModel();
        // defTable1 = (DefaultTableModel) TabelaLista3.getModel();

    }

    public void CadastrarNoSistema() throws SQLException {

        String nome, categoria, descricao, fornecedor;
        int id;
        double valor, quantidade;

        nome = view.getTxtNomeProduto().getText();
        categoria = view.getTxtCategoria().getText();
        descricao = view.getTxtDescricao().getText();
        fornecedor = view.getTxtFornecedor().getText();
        id = Integer.parseInt(view.getTxtId().getText());
        valor = Double.parseDouble(view.getTxtValor().getText());
        quantidade = Double.parseDouble(view.getTxtQtd().getSelectedItem().toString());
// conexão 

        Connection conexao = new Conexao().getConnection();

        Produto produtoFull = new Produto(id, nome, categoria, descricao, fornecedor, valor, quantidade);

        ProdutoDAO produtodao = new ProdutoDAO(conexao);

        produtodao.insert(produtoFull);

        helper.limparTela();

    }

    public void ConsultarProduto() throws SQLException {

        String nome = view.getTxtNome().getText();

        Connection conexao = new Conexao().getConnection();
        Produto produto = new Produto(nome);

        ProdutoDAO produtoDao = new ProdutoDAO(conexao);

        Produto produtoSelecionado = produtoDao.selectPorNome(produto);
        defTable.setRowCount(0);

        Object[] linha = {produtoSelecionado.getId(), produtoSelecionado.getNome(),
            produtoSelecionado.getCategoria(),
            produtoSelecionado.getValor(), produtoSelecionado.getQuantidade(), produtoSelecionado.getFornecedor(), produtoSelecionado.getDiscricao()};

        defTable.addRow(linha);
    }

    public void AlterarProduto() throws SQLException {

        String nome, fornecedor, categoria, descricao;
        int id;
        double valor, quantidade;

        id = Integer.parseInt(view.getTblListaDeProdutos().getModel().getValueAt(0, 0).toString());
        nome = view.getTblListaDeProdutos().getModel().getValueAt(0, 1).toString();
        categoria = view.getTblListaDeProdutos().getModel().getValueAt(0, 2).toString();
        valor = Double.parseDouble(view.getTblListaDeProdutos().getModel().getValueAt(0, 3).toString());
        quantidade = Double.parseDouble(view.getTblListaDeProdutos().getValueAt(0, 4).toString());
        fornecedor = view.getTblListaDeProdutos().getModel().getValueAt(0, 5).toString();
        descricao = view.getTblListaDeProdutos().getModel().getValueAt(0, 6).toString();

        Connection conexao = new Conexao().getConnection();

        Produto produtoAgenda = new Produto(id, nome, categoria, descricao, fornecedor, valor, quantidade);

        ProdutoDAO produtoDao = new ProdutoDAO(conexao);
        produtoDao.update(produtoAgenda);

    }
    
    public void AtualizarTabela() throws SQLException{

        Connection conexao = new Conexao().getConnection();
        

        ProdutoDAO produtoDao = new ProdutoDAO(conexao);

        ArrayList<Produto> produtos = produtoDao.selectAll();
         //Exibir essa lista na view
          helper.preencherTabela(produtos);
    } 

    public void excluir() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        int id;  
        id  = Integer.parseInt(view.getTblListaDeProdutos().getModel().getValueAt(0, 0).toString());
        Produto produto = new Produto(id);
        ProdutoDAO produtoDao = new ProdutoDAO(conexao);
        produtoDao.delete(produto);
         
        
    }

}
