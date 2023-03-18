/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Models.Servico;
import Telas.TelaServico;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinic
 */
public class ServicoHelper {
    
    private final TelaServico view;

    public ServicoHelper(TelaServico view) {
        this.view = view;
    }
    
   
    
    public void limparTela(){
    
        view.getTxtNomeServi().setText("");
        view.getTxtValor().setText("");
        view.getTxtpDescricao().setText("");
        view.getTxtIdServico().setText("");
    
    }

    public void preencherTabela(ArrayList<Servico> servicos) {
        
        

        //Tabela tambem funciona com MVC precisamos pegar o mode da tabela
        DefaultTableModel tableModel = (DefaultTableModel) view.getTblListaServico() .getModel();
        tableModel.setNumRows(0);

        //Percorrer a lista preenchendo o tableModel
        for (Servico servico : servicos) {

            tableModel.addRow(new Object[]{
                servico.getId(),
                servico.getNome(),
                servico.getValor(),
                servico.getDescricao()
            });

        }
       
    }
    
    
}
