/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Models.Cliente;
import Telas.TelaClientes;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinic
 */
public class ClientesHelper {
    private final TelaClientes view;

    public ClientesHelper(TelaClientes view) {
        this.view = view;
    }
    
    

    public void preencherTabela(ArrayList<Cliente> clientes) {
           //Tabela tambem funciona com MVC precisamos pegar o mode da tabela
        DefaultTableModel tableModel = (DefaultTableModel) view.getTblConsultarCliente().getModel();
        tableModel.setNumRows(0);

        //Percorrer a lista preenchendo o tableModel
        for (Cliente cliente : clientes) {

            tableModel.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getSexo(),
                cliente.getNascimento(),
                cliente.getEndereco(),
                cliente.getTelefone(),
                cliente.getEmail(),
                cliente.getCpf()
            });

        }
    }
    
}
