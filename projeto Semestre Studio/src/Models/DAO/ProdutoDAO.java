/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.DAO;

import Models.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public class ProdutoDAO {

    private final Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    public Produto insert(Produto produto) throws SQLException {
        String nome, categoria, descricao, fornecedor;
        int id;
        double valor, quantidade;

        nome = produto.getNome();
        categoria = produto.getCategoria();
        descricao = produto.getDiscricao();
        fornecedor = produto.getFornecedor();
        id = produto.getId();
        valor = produto.getValor();
        quantidade = produto.getQuantidade();

        String st = "insert into produtos values(? , ? , ? , ? , ? , ? , ? );";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setInt(1, id);
        statement.setString(2, nome);
        statement.setString(3, categoria);
        statement.setDouble(4, valor);
        statement.setDouble(5, quantidade);
        statement.setString(6, fornecedor);
        statement.setString(7, descricao);
        
        statement.execute();

        return produto;

    }

    public void update(Produto produto) throws SQLException {
        String st = "UPDATE produtos SET nome = ?, categoria = ?, valor = ?, quantidade = ?,  fornecedor = ?, descrição  = ? WHERE idprodutos = ? ";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setString(1, produto.getNome());
        statement.setString(2, produto.getCategoria());
        statement.setDouble(3, produto.getValor());
        statement.setDouble(4, produto.getQuantidade());
        statement.setString(5, produto.getFornecedor());
        statement.setString(6, produto.getDiscricao());
        statement.setInt(7, produto.getId());
        statement.execute();

    }

    public void delete(Produto produto) throws SQLException {
        String st = "delete from produtos where idprodutos = ? ";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setInt(1, produto.getId());
        statement.execute();

    }

    public Produto selectPorId(Produto produto) throws SQLException {
        String st = "select * from usuario where idusuario = ? ";
        PreparedStatement statement = connection.prepareStatement(st);

        statement.setInt(1, produto.getId());

        return produto;

    }

    public Produto selectPorNome(Produto produto) throws SQLException {
        ResultSet resultado;
        String st = "SELECT * FROM produtos WHERE nome LIKE ?";
        PreparedStatement statement = connection.prepareStatement(st);

        statement.setString(1, "%" + produto.getNome() + "%");
        resultado = statement.executeQuery();
        if (resultado.next()) {
            int id = (resultado.getInt("idprodutos"));
            String nome = (resultado.getString("nome"));
            String categoria = (resultado.getString("categoria"));
            Double valor = (resultado.getDouble("valor"));
            Double quantidade = (resultado.getDouble("quantidade"));
            String fornecedor = (resultado.getString("fornecedor"));
            String descricao = (resultado.getString("descrição"));

            Produto produtoConsultado = new Produto(id, nome, categoria, descricao, fornecedor, valor, quantidade);

            return produtoConsultado;

        } else {
            return null;
        }
    }

    public ArrayList<Produto> selectAll() throws SQLException {
        String st = "select * from produtos ";
        PreparedStatement statement = connection.prepareStatement(st);

        return pesquisa(statement);
    }

    private ArrayList<Produto> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Produto> produto = new ArrayList<Produto>();
        statement.execute();
        ResultSet resultSet = statement.getResultSet();

        while (resultSet.next()) {
            int id = resultSet.getInt("idprodutos");
            String nome = resultSet.getString("nome");
            String categoria = resultSet.getString("categoria");
            double valor = resultSet.getDouble("valor");
            double quantidade = resultSet.getDouble("quantidade");
            String fornecedor = resultSet.getString("fornecedor");
            String descricao = resultSet.getString("descrição");

            Produto produtoComDadosDoBanco = new Produto(id, nome, categoria, descricao, fornecedor, valor, quantidade);
            produto.add(produtoComDadosDoBanco);
        }
        return produto;
    }

}
