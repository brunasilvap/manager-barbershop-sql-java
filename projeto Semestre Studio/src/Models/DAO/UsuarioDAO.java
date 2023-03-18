/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DAO;

import Models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Viniciu
 */
public class UsuarioDAO {

    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;

    }

    public Usuario SelectUsuarioESenha(Usuario usuario) throws SQLException {
        String nome, cargo, sexo;
        ResultSet resultado;
        String st = "SELECT * FROM usuario WHERE nome=? AND senha=?";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getSenha());
        
        resultado = statement.executeQuery();
        
        if (resultado.next()){
        nome = resultado.getString("nome");
        cargo = resultado.getString("niveldeacesso");
        sexo = resultado.getString("sexo");
        Usuario usuarioSelecionado;
        usuarioSelecionado = new Usuario(nome, sexo, cargo);

        return usuarioSelecionado;
        }else 
            return null;
    }

    public Usuario insert(Usuario usuario) throws SQLException {
        String nome = usuario.getNome();
        String senha = usuario.getSenha();
        String sexo = usuario.getSexo();
        String nascimento = usuario.getNascimento();
        String telefone = usuario.getTelefone();
        String email = usuario.getEmail();
        String rg = usuario.getRg();
        String niveldeacesso = usuario.getNiveldeacesso();
        int id = usuario.getId();

        String st = "insert into usuario values(?, ? ,?,?,?,?,?,?,?);";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setInt(1, id);
        statement.setString(2, nome);
        statement.setString(3, senha);
        statement.setString(4, sexo);
        statement.setString(5, nascimento);
        statement.setString(6, telefone);
        statement.setString(7, email);
        statement.setString(8, rg);
        statement.setString(9, niveldeacesso);
        statement.execute();

        return usuario;

    }

    public void update(Usuario usuario) throws SQLException {
        String st = "UPDATE usuario SET  nome = ?, senha = ?, sexo = ?, nascimento = ?, telefone = ?, email = ?, rg = ?, niveldeacesso = ? WHERE idusuario = ?  ";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getSenha());
        statement.setString(3, usuario.getSexo());
        statement.setString(4, usuario.getNascimento());
        statement.setString(5, usuario.getTelefone());
        statement.setString(6, usuario.getEmail());
        statement.setString(7, usuario.getRg());
        statement.setString(8, usuario.getNiveldeacesso());
        statement.setInt(9, usuario.getId());
        statement.execute();
    }

    public void InsertOrUptade(Usuario usuario) throws SQLException {
        if (usuario.getId() > 0) {
            update(usuario);

        } else {
            insert(usuario);
        }

    }

    public void delete(Usuario usuario) throws SQLException {
        String st = "delete from usuario where idusuario = ? ";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setInt(1, usuario.getId());
        statement.execute();

    }

    public Usuario selectPorId(Usuario usuario) throws SQLException {
        String st = "select * from usuario where idusuario = ? ";
        PreparedStatement statement = connection.prepareStatement(st);

        statement.setInt(1, usuario.getId());

        return pesquisa(statement).get(0);

    }

    public boolean existeNoBancoPorUsuarioESenha(Usuario usuario) throws SQLException {

        String sql = "select * from usuario where nome = ?  and senha = ? ";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        
        return resultado.next();

    }

    public Usuario selectPorNome(Usuario usuario) throws SQLException {
        String st = "SELECT * FROM usuario WHERE nome LIKE ? ";
        PreparedStatement statement = connection.prepareStatement(st);
        ResultSet resultado;
        statement.setString(1, "%" + usuario.getNome() + "%");
        resultado = statement.executeQuery();

        return usuario;

    }

    public boolean selectPorEmailESenha(Usuario usuario) throws SQLException {
        String st = "SELECT * FROM usuario WHERE email =? AND senha=?";
        PreparedStatement statement = connection.prepareStatement(st);
        ResultSet resultado;
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getSenha());
        resultado = statement.executeQuery();

        if (resultado.next()) {

            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Usuario> selectAll() throws SQLException {
        String st = "select * from usuario";
        PreparedStatement statement = connection.prepareStatement(st);

        return pesquisaAll(statement);

    }

    public ArrayList<Usuario> selectAllBarbeiro() throws SQLException {
        String st = "select * from usuario where niveldeacesso = 'Cabeleireiro/Barbeiro'  ";
        PreparedStatement statement = connection.prepareStatement(st);

        return pesquisa(statement);

    }

    public ArrayList<Usuario> selectAllVisagista() throws SQLException {
        String st = "select * from usuario where niveldeacesso = 'Visagista'  ";
        PreparedStatement statement = connection.prepareStatement(st);

        return pesquisa(statement);

    }

    private ArrayList<Usuario> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        statement.execute();
        ResultSet resultSet = statement.getResultSet();

        while (resultSet.next()) {
            int id = resultSet.getInt("idusuario");
            String nome = resultSet.getString("nome");
            String senha = resultSet.getString("senha");
            Usuario usuarioComDadosDoBanco = new Usuario(nome, senha, id);
            usuarios.add(usuarioComDadosDoBanco);
        }

        return usuarios;
    }

    private ArrayList<Usuario> pesquisaAll(PreparedStatement statement) throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        statement.execute();
        ResultSet resultSet = statement.getResultSet();

        while (resultSet.next()) {
            int id = resultSet.getInt("idusuario");
            String nome = resultSet.getString("nome");
            String senha = resultSet.getString("senha");
            String sexo = resultSet.getString("sexo");
            String nascimento = resultSet.getString("nascimento");
            String telefone = resultSet.getString("telefone");
            String email = resultSet.getString("email");
            String rg = resultSet.getString("rg");
            String cargo = resultSet.getString("niveldeacesso");
            Usuario usuarioComDadosDoBanco = new Usuario(nome, senha, sexo, nascimento, telefone, email, rg, cargo, id);
            usuarios.add(usuarioComDadosDoBanco);
        }

        return usuarios;
    }

    public ArrayList<Usuario> selectPorNomes(Usuario usuario) throws SQLException {
        String st = "SELECT * FROM usuario WHERE nome LIKE ?";
        PreparedStatement statement = connection.prepareStatement(st);
        statement.setString(1, "%" + usuario.getNome() + "%");

        return pesquisaPorNome(statement);

    }

    private ArrayList<Usuario> pesquisaPorNome(PreparedStatement statement) throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        statement.execute();
        ResultSet resultSet = statement.getResultSet();

        while (resultSet.next()) {
            int id = resultSet.getInt("idusuario");
            String nome = resultSet.getString("nome");
            String senha = resultSet.getString("senha");
            String sexo = resultSet.getString("sexo");
            String nascimento = resultSet.getString("nascimento");
            String telefone = resultSet.getString("telefone");
            String email = resultSet.getString("email");
            String rg = resultSet.getString("rg");
            String cargo = resultSet.getString("niveldeacesso");
            Usuario usuarioComDadosDoBanco = new Usuario(nome, senha, sexo, nascimento, telefone, email, rg, cargo, id);
            usuarios.add(usuarioComDadosDoBanco);
        }

        return usuarios;

    }
}
