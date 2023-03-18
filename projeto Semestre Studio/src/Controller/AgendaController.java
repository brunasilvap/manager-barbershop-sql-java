/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Models.Agendamento;
import Models.Cliente;
import Models.DAO.AgendamentoDAO;
import Models.DAO.Conexao;
import Models.DAO.ServicoDAO;
import Models.DAO.UsuarioDAO;
import Models.Servico;
import Models.Usuario;
import Telas.TelaAgendamento;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class AgendaController {

    private final TelaAgendamento view;
    private final AgendaHelper helper;

    public AgendaController(TelaAgendamento view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }

    //  public void atualizaTabela(){
    //Buscar Lista com agendamentos do banco de dados
    //      AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
    //      ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();//depurar aqui
    //    //Exibir essa lista na view
    //      helper.preencherTabela(agendamentos);
    //  }
    // buscar no banco de dados 
    public void atualizaServico() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        ServicoDAO servidoDao = new ServicoDAO(conexao);
        ArrayList<Servico> servicos = servidoDao.selectAll();

        //exibir cliente 
        helper.preencherServicos(servicos);

    }

    public void atualizaProfissionaisBarbeiro() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        ArrayList<Usuario> usuarios = usuarioDao.selectAllBarbeiro();

        //exibir profissionais
        helper.preencherProfissionais(usuarios);

    }
    
     public void atualizaProfissionaisVisagista() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        ArrayList<Usuario> usuarios = usuarioDao.selectAllVisagista();

        //exibir profissionais
        helper.preencherProfissionais(usuarios);

    }
    
    
    

    public void atualizaValor() {
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }

    public void pegarvalor() throws SQLException, ClassNotFoundException {

        Servico servNome = new Servico(view.getCmbServico().getSelectedItem().toString());
        Connection conexao = new Conexao().getConnection();
        ServicoDAO servdao = new ServicoDAO(conexao);
        Servico serv = servdao.selectPorNome(servNome);

        view.getTxtValor().setText(serv.getValor() + "");

    }

    
   public void agendar() {
       
       //coleta de variaveis 
   int idAgendamento ;
   String hora,servico,profissionalResponsavel,nomeCliente;
   double valor ;       
   String  data;    
   idAgendamento = Integer.parseInt(view.getTxtIdAgendamento().getText());
   nomeCliente = view.getTxtNomeCliente().getText();
   hora = view.getCmbHorario().getSelectedItem().toString();
   servico = view.getCmbServico().getSelectedItem().toString();
   profissionalResponsavel = view.getCmbResponsavel().getSelectedItem().toString();
   valor = Double.parseDouble(view.getTxtValor().getText());
   data = view.getTxtData().getText();
   Servico servicoagenda = new Servico(servico);
   Cliente clienteagenda = new Cliente(nomeCliente);
   Usuario usuarioagenda = new Usuario(profissionalResponsavel);
   String obs = null;
   
   Agendamento agendamento = new Agendamento(idAgendamento,usuarioagenda,clienteagenda,servicoagenda,valor,data,hora,obs);
           
   //conexao com o banco de dados
   try {
       Connection conexao = new Conexao().getConnection();
       
   //inserir o agendamento no banco de dados
   
     
     AgendamentoDAO agendamentoDao = new AgendamentoDAO(conexao);
       Agendamento  agendamentofeito = agendamentoDao.insert(agendamento);
     
   JOptionPane.showMessageDialog(null, "Agendamento Feito Com Sucesso!!!"); 
    //notifica cliente por email
       // Correio correio = new Correio();
      // correio.NotificarPorEmail(agendamentofeito);
        
        
   helper.limparTela();
   
   }  catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ocorreu um erro" + ex.getMessage());
        }
   
}

   public void atualizaTabela() throws SQLException{
   // Buscar Lista com agendamentos do banco de dados
   
         Connection conexao = new Conexao().getConnection();
         AgendamentoDAO agendamentoDAO = new AgendamentoDAO(conexao);
         ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();//depurar aqui
       //Exibir essa lista na view
          helper.preencherTabela(agendamentos);
      }
   
   public void deletaAgendamento() throws SQLException{
   Connection conexao = new Conexao().getConnection();
   
        Agendamento agendamento = new Agendamento(Integer.parseInt(view.getTableAgenda().getModel().getValueAt(view.WHEN_FOCUSED, view.WHEN_FOCUSED).toString()));
         AgendamentoDAO agendamentoDAO = new AgendamentoDAO(conexao);
        agendamentoDAO.delete(agendamento);
   
   }
}
