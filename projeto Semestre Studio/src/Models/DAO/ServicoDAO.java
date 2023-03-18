/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DAO;

import Models.Servico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vinicius
 */
public class ServicoDAO {

    private final Connection connection;

    public ServicoDAO(Connection connection) {
        this.connection = connection;

    }

    public Servico insert(Servico serv) throws SQLException {
        String nome = serv.getNome();
        int id = serv.getId();
        String descricao = serv.getDescricao();
        double valor = serv.getValor();

        String st = "insert into servico values(? , ? , ? , ? );";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setInt(1, id);
        statement.setString(2, nome);
        statement.setDouble(3, valor);
        statement.setString(4, descricao);
        
        statement.execute();

        return serv;

    }

    public void update(Servico serv) throws SQLException {
        String st = "UPDATE servico SET nomeservico = ?, valor   = ?, descricao = ? WHERE idservico = ? ";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setString(1, serv.getNome());
        statement.setDouble(2, serv.getValor());
        statement.setString(3, serv.getDescricao());
        statement.setInt(4, serv.getId());
        statement.execute();

    }

    public void delete(Servico serv) throws SQLException {
        String st = "DELETE FROM servico WHERE idservico =? ";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setInt(1, serv.getId());
        statement.execute();

    }

    public ArrayList<Servico> selectAll() throws SQLException {
        String st = "select * from servico ";
        PreparedStatement statement = connection.prepareStatement(st);

        return pesquisa(statement);
    }

    private ArrayList<Servico> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Servico> servico = new ArrayList<Servico>();
        statement.execute();
        ResultSet resultSet = statement.getResultSet();

        while (resultSet.next()) {
            int id = resultSet.getInt("idservico");
            String nome = resultSet.getString("nomeservico");
            double preco = resultSet.getDouble("valor");
            Servico servicoComDadosDoBanco = new Servico(id, nome, preco);
            servico.add(servicoComDadosDoBanco);
        }

        return servico;
    
    }

    public Servico selectPorId(Servico serv) throws SQLException {
        String st = "select * from servico where idservico = ? ";
        PreparedStatement statement = connection.prepareStatement(st);

        statement.setInt(1, serv.getId());

        return serv;

    }

    public Servico selectPorNome(Servico serv) throws SQLException, ClassNotFoundException {
        Connection conexao;
        PreparedStatement st;
        ResultSet resultado ;
        Class.forName("com.mysql.jdbc.Driver");
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancobarbearia", "root", "123456");
        st = conexao.prepareStatement("SELECT * FROM servico WHERE nomeservico=? ");
        String nome = serv.getNome();
        st.setString(1, nome);
     
        resultado = st.executeQuery();
        if (resultado.next()){
        Double valor = (resultado.getDouble("valor"));
        Servico valorFeito = new Servico(valor);

        return valorFeito;
        }
        return null;
    }

}
