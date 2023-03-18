/*
 //classe hellper Serve para ajudar o Controller a exibir Objetos da Controller para a TelaAgenda
 */
package Controller.Helper;

//import Controller.AgendaController;
import Models.Agendamento;
import Models.Cliente;
import Models.Servico;
import Models.Usuario;
import Telas.TelaAgendamento;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class AgendaHelper implements IHelper {

    private final TelaAgendamento view;

    public AgendaHelper(TelaAgendamento view) {
        this.view = view;
    }

    public void preencherServicos(ArrayList<Servico> servicos) {

        DefaultComboBoxModel comboBoxmodel = (DefaultComboBoxModel) view.getCmbServico().getModel();

        for (Servico servico : servicos) {
            comboBoxmodel.addElement(servico.getNome());
        }

    }

    public void preencherProfissionais(ArrayList<Usuario> usuarios) {

        DefaultComboBoxModel comboBoxmodels = (DefaultComboBoxModel) view.getCmbResponsavel().getModel();

        for (Usuario usuario : usuarios) {
            comboBoxmodels.addElement(usuario.getNome());
        }

    }

    public Servico obterServico() {
        return (Servico) view.getCmbServico().getSelectedItem();
    }

    public void setarValor(double valor) {
        view.getTxtValor().setText(valor + "");
    }

    @Override
    public Object obterModelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void limparTela() {
        view.getTxtIdAgendamento().setText("");
        view.getTxtIdCliente().setText("");
        view.getTxtNomeCliente().setText("");
        view.getTxtData().setText("");
        view.getCmbHorario().setSelectedItem(1);
        view.getCmbServico().setSelectedItem(1);
        view.getCmbResponsavel().setSelectedItem(1);
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {

        //Tabela tambem funciona com MVC precisamos pegar o mode da tabela
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgenda().getModel();
        tableModel.setNumRows(0);

        //Percorrer a lista preenchendo o tableModel
        for (Agendamento agendamento : agendamentos) {

            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getData(),
                agendamento.getHora(),
                agendamento.getServico().getNome(),
                agendamento.getValor(),
                agendamento.getProfissionaoResponsavel().getNome(),
                agendamento.getObservacao()
            });

        }
    }
}

