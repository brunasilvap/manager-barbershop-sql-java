/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Models.Usuario;
import Telas.TelaFuncionarios;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinic
 */
public class CadastroHelper {

    private final TelaFuncionarios view;

    public CadastroHelper(TelaFuncionarios view) {
        this.view = view;

    }

    public void preencherTabela(ArrayList<Usuario> usuarios) {
        //Tabela tambem funciona com MVC precisamos pegar o mode da tabela
        DefaultTableModel tableModel = (DefaultTableModel) view.getTblConsultarFuncionario().getModel();
        tableModel.setNumRows(0);

        //Percorrer a lista preenchendo o tableModel
        for (Usuario usuario : usuarios) {

            tableModel.addRow(new Object[]{
                usuario.getId(),
                usuario.getNome(),
                usuario.getSenha(),
                usuario.getSexo(),
                usuario.getNascimento(),
                usuario.getTelefone(),
                usuario.getEmail(),
                usuario.getRg(),
                usuario.getNiveldeacesso()
            });

        }

    }

    public void preencherTabela2(ArrayList<Usuario> usuarios) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTabelaLista3().getModel();
        tableModel.setNumRows(0);

        //Percorrer a lista preenchendo o tableModel
        for (Usuario usuario : usuarios) {

            tableModel.addRow(new Object[]{
                usuario.getId(),
                usuario.getNome(),
                usuario.getNiveldeacesso()
            });

        }
    }
}
