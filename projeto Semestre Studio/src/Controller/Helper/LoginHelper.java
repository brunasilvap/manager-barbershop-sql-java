/*
//classe hellper Serve para ajudar o Controller a exibir Objetos da Controller para a TelaLogin

*/
package Controller.Helper;

import Models.DAO.Conexao;
import Models.DAO.UsuarioDAO;
import Models.Usuario;
import Telas.TelaLogin;
import Telas.TelaMenuPrincipal;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class LoginHelper implements IHelper{
    
    private final TelaLogin View;

    public LoginHelper(TelaLogin View) {
        this.View = View;
    }

   
       
    
    
    @Override
    public Usuario obterModelo(){
     String nome = View.getTxtUsuario().getText();
        String senha = View.getPswSenhaUsuario().getText();
        
        Usuario modelo = new Usuario(nome, senha);
        return modelo;
    }
    
    public void setarModelo(Usuario modelo) {
    
    String nome = modelo.getNome();
    String senha = modelo.getSenha();
    View.getTxtUsuario().setText(nome);
    View.getPswSenhaUsuario().setText(senha);
    }
    @Override
    public void limparTela(){
        View.getTxtUsuario().setText("");
        View.getPswSenhaUsuario().setText("");
        
    
    }

    public void EntrarPorEmail() throws SQLException {
        String email,senha;
        
         email = View.getTxtUsuario().getText();
         senha = View.getPswSenhaUsuario().getText();
         Connection conexao = new Conexao().getConnection();
         Usuario usuario = new Usuario(email, senha);
         
         UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        boolean usuarioPoremail = usuarioDao.selectPorEmailESenha(usuario);
        
        if(usuarioPoremail==true){
            
           TelaMenuPrincipal t; 
           t = new TelaMenuPrincipal();
           t.setVisible(true);
           
           
    
    }
        else 
            JOptionPane.showMessageDialog(null, "nao existe esse e-mail no banco de dados");
        return;
         
    }
    
}
