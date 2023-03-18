package Models.DAO;

import Models.Agendamento;
import Models.Cliente;
import Models.Servico;
import Models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//* @author Vinicius
public class AgendamentoDAO {

    private final Connection connection;

    public AgendamentoDAO(Connection connection) {
        this.connection = connection;

    }

    public Agendamento insert(Agendamento agendamento) throws SQLException {
        int id = agendamento.getId();
        Usuario responsavel = agendamento.getProfissionaoResponsavel();
        Cliente cliente = agendamento.getCliente();
        Servico servico = agendamento.getServico();
        double valor = agendamento.getValor();
        String data = agendamento.getData();
        String hora = agendamento.getHora();
        String obs = agendamento.getObservacao();

        String st = "insert into agendamento values(?, ? , ? , ? , ? , ? , ? , ? );";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setInt(1, id);
        statement.setString(2, cliente.getNome() + "");
        statement.setString(3, data);
        statement.setString(4, hora);
        statement.setString(5, servico.getNome() +"");
        statement.setDouble(6, valor);
        statement.setString(7, responsavel.getNome() +"");
        statement.setString(8, obs);
        
        statement.execute();

        return agendamento;

    }
    
     public ArrayList<Agendamento> selectAll() throws SQLException {
        String st = "select * from agendamento ";
        PreparedStatement statement = connection.prepareStatement(st);

        return pesquisa(statement);
    }

    private ArrayList<Agendamento> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Agendamento> agendamento = new ArrayList<Agendamento>();
        statement.execute();
        ResultSet resultSet = statement.getResultSet();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            Cliente cliente = new Cliente  (resultSet.getString("cliente"));
            String data = resultSet.getString("data");
            String horario = resultSet.getString("horario");
            Servico servico = new Servico(resultSet.getString("servico"));
            double valor = resultSet.getDouble("valor");
            Usuario usuario = new Usuario (resultSet.getString("profissional"));
            String obs =resultSet.getString("Observacao");
            
            
            Agendamento agendamentoComDadosDoBanco = new Agendamento(id,usuario,cliente,servico,valor,data,horario,obs);
            agendamento.add(agendamentoComDadosDoBanco);
        }

        return agendamento;
    }
 
    public void delete(Agendamento agendamento) throws SQLException {
        String st = "delete from agendamento where id = ? ";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setInt(1, agendamento.getId());
        statement.execute();

    }
}
