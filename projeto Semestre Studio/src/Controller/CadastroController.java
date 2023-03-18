/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.CadastroHelper;
import Models.DAO.Conexao;
import Models.DAO.UsuarioDAO;
import Models.Usuario;
import Telas.TelaCadastro;
import Telas.TelaFuncionarios;
import Telas.TelaLogin;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinicius
 */
public class CadastroController {

    private CadastroHelper helper;
    private TelaCadastro view;
    private TelaFuncionarios view1;
    DefaultTableModel defTable;

    TelaLogin t;

    public CadastroController(TelaCadastro view) {
        this.view = view;
        

    }

    public void salvaUsuario() throws SQLException {
        String usuario = view.getTxtNome().getText();
        String senha = view.getPswSenha().getText();
        int id = Integer.parseInt(view.getTxtId().getText());
        String sexo = view.getBoxGenero().getSelectedItem().toString();
        String nascimento = view.getTxtNascimento().getText();
        String telefone = view.getTxtTelefone().getText();
        String email = view.getTxtEmail().getText();
        String cpf = view.getTxtCpf().getText();
        String cargo = view.getBoxCargo().getSelectedItem().toString();

        Usuario usuarioFull = new Usuario(usuario, senha, sexo, nascimento, telefone, email, cpf, cargo, id);

        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        usuarioDao.insert(usuarioFull);

        view.dispose();
        t = new TelaLogin();
        t.setVisible(true);

    }

    public CadastroController(TelaFuncionarios view1) {
        this.view1 = view1;
    }

    public void salvaUsuario1() throws SQLException {

        String usuario = view1.getTxtNomeCompleto().getText();
        String senha = view1.getTxtSenha().getText();
        int id = Integer.parseInt(view1.getTxtId().getText());
        String sexo = view1.getBoxGenero().getSelectedItem().toString();
        String nascimento = view1.getTxtNascimento().getText();
        String telefone = view1.getTxtTelefone().getText();
        String email = view1.getTxtEmail().getText();
        String cpf = view1.getTxtCpf().getText();
        String cargo = view1.getBoxCargo().getSelectedItem().toString();
        
        Usuario usuarioFull = new Usuario(usuario, senha, sexo, nascimento, telefone, email, cpf, cargo, id);


        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        usuarioDao.insert(usuarioFull);

        view1.getTxtNomeCompleto().setText("");
        view1.getTxtlblConfirmarSenha().setText("");
        view1.getTxtSenha().setText("");
        view1.getTxtId().setText("");
        view1.getBoxGenero().setSelectedItem(1);
        view1.getTxtNascimento().setText("");
        view1.getTxtTelefone().setText("");
        view1.getTxtEmail().setText("");
        view1.getTxtCpf().setText("");
        view1.getBoxCargo().setSelectedItem(1);
       

    }

    public void iniciaTabela() throws SQLException {

        // Buscar Lista com agendamentos do banco de dados
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        ArrayList<Usuario> usuarios = usuarioDao.selectAll();//depurar aqui
        //Exibir essa lista na view
        this.helper = new CadastroHelper(view1);
        helper.preencherTabela(usuarios);

    }

    public void pesquisarNoBancoDeDados() throws SQLException {

// pegar o quer esta em Tela Funcionario
        String nome;
        nome = view1.getTxtNome().getText();
        Usuario usuario = new Usuario(nome);
//Pesquisar no banco de dados 
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        ArrayList<Usuario> usuarios = usuarioDao.selectPorNomes(usuario);
//Jogar na tela 
        helper.preencherTabela(usuarios);
    }

    public void iniciaTabela2() throws SQLException {
         Connection conexao = new Conexao().getConnection();
         UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        ArrayList<Usuario> usuarioSelct = usuarioDao.selectAll();
         
        
        helper.preencherTabela2(usuarioSelct);
    }

    public void excluirFuncionario() throws SQLException {
       //pegar o usuario da tabela
      int id = Integer.parseInt(view1.getTblConsultarFuncionario().getModel().getValueAt(0, 0).toString());
      Usuario usuario = new Usuario(id);
      
       //conectar ao banco de dados 
        Connection conexao = new Conexao().getConnection();
       
       //excluir do banco de dados 
       UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
       usuarioDao.delete(usuario);
       
    }

    public void Alterar() throws SQLException {
        Connection conexao = new Conexao().getConnection();
         String nome, cargo, senha, sexo, Nascimento, telefone, email, rg;
            int id;
            id = Integer.parseInt(view1.getTblConsultarFuncionario().getModel().getValueAt(0, 0).toString());
            nome = view1.getTblConsultarFuncionario().getModel().getValueAt(0, 1).toString();
            senha = view1.getTblConsultarFuncionario().getModel().getValueAt(0, 2).toString(); 
            sexo = view1.getTblConsultarFuncionario().getModel().getValueAt(0, 3).toString();
            Nascimento = view1.getTblConsultarFuncionario().getModel().getValueAt(0, 4).toString();
            telefone = view1.getTblConsultarFuncionario().getModel().getValueAt(0, 5).toString();
            email = view1.getTblConsultarFuncionario().getModel().getValueAt(0, 6).toString();
            rg = view1.getTblConsultarFuncionario().getModel().getValueAt(0, 7).toString();
            cargo = view1.getTblConsultarFuncionario().getModel().getValueAt(0, 8).toString();
        Usuario usuario = new Usuario(nome, senha, sexo, Nascimento, telefone, email, rg, cargo, id);
        
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        usuarioDao.update(usuario);
        
    }
}

