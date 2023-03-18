/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Models.Produto;
import Telas.TelaEstoque;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinic
 */
public class EstoqueHelper {

    private final TelaEstoque view;

    public EstoqueHelper(TelaEstoque view) {
        this.view = view;
    }

    public void limparTela() {
        view.getTxtId().setText("");
        view.getTxtNomeProduto().setText("");
        view.getTxtFornecedor().setText("");
        view.getTxtCategoria().setText("");
        view.getTxtValor().setText("");
        view.getTxtQtd().setSelectedItem(1);
        view.getTxtDescricao().setText("");
    }

    public void preencherTabela(ArrayList<Produto> produtos) {
        //Tabela tambem funciona com MVC precisamos pegar o mode da tabela
        DefaultTableModel tableModel = (DefaultTableModel) view.getTblListaDeProdutos().getModel();
        tableModel.setNumRows(0);

        //Percorrer a lista preenchendo o tableModel
        for (Produto produto : produtos) {

            tableModel.addRow(new Object[]{
                produto.getId(),
                produto.getNome(),
                produto.getCategoria(),
                produto.getValor(),
                produto.getQuantidade(),
                produto.getFornecedor(),
                produto.getDiscricao()
            });

        }
    }

}
