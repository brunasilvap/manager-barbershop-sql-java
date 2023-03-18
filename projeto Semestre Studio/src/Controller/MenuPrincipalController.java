/*
 //classe Controle de Menu Principal serve para controlar tudo que esta em TelaMenuPrincipal
 */
package Controller;

import Telas.TelaAgendamento;
import Telas.TelaEstoque;
import Telas.TelaMenuPrincipal;
import Telas.TelaServico;
import java.sql.SQLException;

/**
 *
 * @author vinic
 */
public class MenuPrincipalController {
    
    private final TelaMenuPrincipal view;

    public MenuPrincipalController(TelaMenuPrincipal view) {
        this.view = view;
    }
    
    
    public void navegarParaAgenda() throws SQLException, ClassNotFoundException{
        TelaAgendamento objAgendamento = new TelaAgendamento();
        view.getJdpPrincipal().add(objAgendamento);
        objAgendamento.setVisible(true);
     
        
    }

    public void navegarParaEstoque() throws SQLException {
       TelaEstoque objEstoque = new TelaEstoque();
        view.getJdpPrincipal().add(objEstoque);
        objEstoque.setVisible(true);
    }
 
     public void navegarParaServico() throws SQLException {
       TelaServico objServico = new TelaServico();
        view.getJdpPrincipal().add(objServico);
        objServico.setVisible(true);
    }

    public void navegarParaEstoque1() throws SQLException {
        String nome; 
        nome = null;
     TelaEstoque objEstoque = new TelaEstoque(nome);
        view.getJdpPrincipal().add(objEstoque);
        objEstoque.setVisible(true);
    }
}
    

