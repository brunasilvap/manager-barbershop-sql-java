/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DAO;

import Models.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Viniciu
 */
public class ClienteDAO {

    private final Connection connection;
    String resultadoCargo;

    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }

    public Cliente insert(Cliente cliente) throws SQLException {
        String nome = cliente.getNome();
        String sexo = cliente.getSexo();
        String nascimento = cliente.getNascimento();
        String telefone = cliente.getTelefone();
        String email = cliente.getEmail();
        String cpf = cliente.getCpf();
        String endereco = cliente.getEndereco();
        int id = cliente.getId();

        String st = "insert into cliente values(? , ? , ? , ? , ? , ? , ? , ? );";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setInt(1, id);
        statement.setString(2, nome);
        statement.setString(3, sexo);
        statement.setString(4, nascimento);
        statement.setString(5, endereco);
        statement.setString(6, telefone);
        statement.setString(7, email);
        statement.setString(8, cpf);
        statement.execute();

        return cliente;

    }

    public void update(Cliente cliente) throws SQLException {
        String st = "UPDATE cliente SET  nome = ?, sexo = ?, nascimento = ?, endereco = ?, telefone = ?, email = ?, cpf = ? WHERE idcliente = ?  ";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setString(1, cliente.getNome());
        statement.setString(2, cliente.getSexo());
        statement.setString(3, cliente.getNascimento());
        statement.setString(4, cliente.getEndereco());
        statement.setString(5, cliente.getTelefone());
        statement.setString(6, cliente.getEmail());
        statement.setString(7, cliente.getCpf());
        statement.setInt(8, cliente.getId());
        statement.execute();
    }

    public void InsertOrUptade(Cliente cliente) throws SQLException {
        if (cliente.getId() > 0) {
            update(cliente);

        } else {
            insert(cliente);
        }

    }

    public void delete(Cliente cliente) throws SQLException {
        String st = "DELETE FROM cliente WHERE idcliente=? ";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setInt(1, cliente.getId());
        statement.execute();
    }

    public ArrayList<Cliente> selectAll() throws SQLException {
        String st = "select * from cliente ";
        PreparedStatement statement = connection.prepareStatement(st);

        return pesquisa(statement);

    }

    private ArrayList<Cliente> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        statement.execute();
        ResultSet resultSet = statement.getResultSet();

        while (resultSet.next()) {
            int id = resultSet.getInt("idcliente");
            String nome = resultSet.getString("nome");
            String sexo = resultSet.getString("sexo");
            String nascimento = resultSet.getString("nascimento");
            String endereco = resultSet.getString("endereco");
            String telefone = resultSet.getString("telefone");
            String email = resultSet.getString("email");
            String cpf = resultSet.getString("cpf");
            
            Cliente clienteComDadosDoBanco = new Cliente(nome, nascimento, sexo, endereco, email, telefone, cpf, id);
            clientes.add(clienteComDadosDoBanco);
        }

        return clientes;
    }

    public Cliente selectPorId(Cliente cliente) throws SQLException {
        String st = "select * from  where idusuario = ? ";
        PreparedStatement statement = connection.prepareStatement(st);

        statement.setInt(1, cliente.getId());

        return pesquisa(statement).get(0);
    }

    public Cliente selectPorNome(Cliente cliente) throws SQLException {
        ResultSet resultado;
        String st = "SELECT * FROM cliente WHERE nome LIKE ?";
        PreparedStatement statement = connection.prepareStatement(st);

        statement.setString(1, "%" + cliente.getNome() + "%");
        resultado = statement.executeQuery();
        if (resultado.next()) {
            int id = (resultado.getInt("idcliente"));
            String nome = (resultado.getString("nome"));
            String sexo = (resultado.getString("sexo"));
            String nascimento = (resultado.getString("nascimento"));
            String endereco = (resultado.getString("endereco"));
            String telefone = (resultado.getString("telefone"));
            String email = (resultado.getString("email"));
            String cpf = (resultado.getString("cpf"));

            Cliente clienteConsultado = new Cliente(nome, nascimento, sexo, endereco, email, telefone, cpf, id);
            return clienteConsultado;

        } else {
            return null;
        }
    }
}
