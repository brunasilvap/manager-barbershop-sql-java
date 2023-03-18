/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.ClientesHelper;
import Models.Cliente;
import Models.DAO.ClienteDAO;
import Models.DAO.Conexao;
import Telas.TelaClientes;
import Telas.TelaLogin;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinicius
 */
public class ViewClienteController {
    private ClientesHelper helper;
    DefaultTableModel defTable;

    private TelaClientes view;

    TelaLogin t;

    public ViewClienteController(TelaClientes view) {
        this.view = view;
        defTable = (DefaultTableModel) view.getTblConsultarCliente().getModel();
    }

    public void salvaCliente() throws SQLException {
        int id = Integer.parseInt(view.getTxtId().getText());
        String usuario = view.getTxtNomeCompleto().getText();
        String sexo = view.getBoxGenero().getSelectedItem().toString();
        String nascimento = view.getTxtNascimento().getText();
        String telefone = view.getTxtTelefone().getText();
        String email = view.getTxtEmail().getText();
        String cpf = view.getTxtCpf().getText();
        String endereco = view.getTxtEndereco().getText();

        Cliente clienteFull = new Cliente(usuario, nascimento, sexo, endereco, email, telefone, cpf, id);

        Connection conexao = new Conexao().getConnection();
        ClienteDAO clienteDao = new ClienteDAO(conexao);
        clienteDao.insert(clienteFull);

        view.getTxtId().setText("");
        view.getTxtNomeCompleto().setText("");
        view.getBoxGenero().setSelectedItem(1);
        view.getTxtNascimento().setText("");
        view.getTxtTelefone().setText("");
        view.getTxtEmail().setText("");
        view.getTxtCpf().setText("");
        view.getTxtEndereco().setText("");

    }

    public void pesquisarCliente() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String nome = view.getTxtNome().getText();

        Cliente cliente = new Cliente(nome);

        ClienteDAO clienteDao = new ClienteDAO(conexao);

        Cliente clienteSelecionado = clienteDao.selectPorNome(cliente);
        defTable.setRowCount(0);
        Object[] linha = {clienteSelecionado.getId(), clienteSelecionado.getNome(),
            clienteSelecionado.getSexo(), clienteSelecionado.getNascimento(), clienteSelecionado.getEndereco(), clienteSelecionado.getTelefone(),
            clienteSelecionado.getEmail(), clienteSelecionado.getCpf()};
        defTable.addRow(linha);
    }

    public void alterarCliente() throws SQLException {
       String nome, sexo, Nascimento, telefone, email, cpf, endereco;
       Connection conexao = new Conexao().getConnection();
            int id;
            id = Integer.parseInt(view.getTblConsultarCliente().getModel().getValueAt(0, 0).toString());
            nome = view.getTblConsultarCliente().getModel().getValueAt(0, 1).toString();
            sexo = view.getTblConsultarCliente().getModel().getValueAt(0, 2).toString();
            Nascimento = view.getTblConsultarCliente().getModel().getValueAt(0, 3).toString();
            endereco = view.getTblConsultarCliente().getModel().getValueAt(0, 4).toString();
            telefone = view.getTblConsultarCliente().getModel().getValueAt(0, 5).toString();
            email = view.getTblConsultarCliente().getModel().getValueAt(0, 6).toString();
            cpf = view.getTblConsultarCliente().getModel().getValueAt(0, 7).toString();
            Cliente cliente = new Cliente(nome, Nascimento, sexo, endereco, email, telefone, cpf, id);
            ClienteDAO clienteDao = new ClienteDAO(conexao);
            clienteDao.update(cliente);
            
            
    }

    public void excluirCliente() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        int id;
        id = Integer.parseInt(view.getTblConsultarCliente().getModel().getValueAt(0, 0).toString());
        
        Cliente cliente = new Cliente(id);
        
        ClienteDAO clienteDao = new ClienteDAO(conexao);
        clienteDao.delete(cliente);
        
    }

    public void iniciarTabela() throws SQLException {
        // Buscar Lista com agendamentos do banco de dados
        Connection conexao = new Conexao().getConnection();
        ClienteDAO clienteDao = new ClienteDAO(conexao);
        ArrayList<Cliente> clientes = clienteDao.selectAll();//depurar aqui
        //Exibir essa lista na view
        this.helper = new ClientesHelper(view);
        helper.preencherTabela(clientes);
    }

}
