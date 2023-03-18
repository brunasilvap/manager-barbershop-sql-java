/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.ServicoHelper;
import Models.DAO.Conexao;
import Models.DAO.ServicoDAO;
import Models.Servico;
import Telas.TelaServico;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public class ControllerServico {
    
   private  ServicoHelper helper;
   private  TelaServico view;

    public ControllerServico(TelaServico view) {
        this.view = view;
        this.helper = new ServicoHelper(view);
    }

  
    
    
    public void Inserir() throws SQLException{
        String nome,descricao;
        int id;
        double valor;
        
        
        id = Integer.parseInt(view.getTxtIdServico().getText());
        nome = view.getTxtNomeServi().getText();
        valor = Double.parseDouble(view.getTxtValor().getText());
        descricao = view.getTxtpDescricao().getText();
        
        
    
    Servico servico = new Servico(id, descricao, nome, valor);
    Connection conexao = new Conexao().getConnection();
    ServicoDAO servDao = new ServicoDAO(conexao);
    servDao.insert(servico);
    
     helper.limparTela();
    
    }
    
    
    public void AtualizarTabela() throws SQLException{
       

        Connection conexao = new Conexao().getConnection();
        

        ServicoDAO servicoDao = new ServicoDAO(conexao);

        ArrayList<Servico> servicos = servicoDao.selectAll();
         //Exibir essa lista na view
          helper.preencherTabela(servicos);
    } 

    public void Alterar() throws SQLException {
          Connection conexao = new Conexao().getConnection();
         String nome,descricao;
            int id;
            double valor;
            
            id = Integer.parseInt(view.getTblListaServico().getModel().getValueAt(0, 0).toString());
            nome = view.getTblListaServico().getModel().getValueAt(0, 1).toString();
            valor = Double.parseDouble(view.getTblListaServico().getModel().getValueAt(0, 2).toString());
            descricao = view.getTblListaServico().getModel().getValueAt(0, 3).toString(); 
            
            Servico servico = new Servico(id, descricao, nome, valor);
            ServicoDAO servicoDao = new ServicoDAO(conexao);
            servicoDao.update(servico);
    }

    public void deleteServico() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        int  id ;
        id = Integer.parseInt(view.getTblListaServico().getModel().getValueAt(0, 0).toString());
        
        Servico servico = new Servico(id);
        ServicoDAO servicoDao = new ServicoDAO(conexao);
        servicoDao.delete(servico);
    
    }
}
