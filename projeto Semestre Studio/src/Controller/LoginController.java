package Controller;

//classe Controle de login serve para controlar tudo que esta em TelaLogin
import Models.Usuario;
import Telas.TelaLogin;
import javax.swing.JOptionPane;
import Controller.Helper.LoginHelper;
import Models.DAO.Conexao;
import Models.DAO.UsuarioDAO;

import Telas.TelaMenuPrincipal;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Vinicius
 */
public class LoginController {

    LoginHelper Helper;
    private final TelaLogin view;

    TelaMenuPrincipal tela;

    public LoginController(TelaLogin view) {
        this.view = view;
        this.Helper = new LoginHelper(view);
    }

    public void entrarNoSistema() throws SQLException {

        String nome, senha;

        //conectar ao banco de dados 
        Connection conexao = new Conexao().getConnection();
        // fazer o pegar o usuario e senha 
        nome = view.getTxtUsuario().getText();
        senha = view.getPswSenhaUsuario().getText();

        Usuario usuarioAltenticado = new Usuario(nome, senha);

        // conectar ao bd
        UsuarioDAO usuariodao = new UsuarioDAO(conexao);

        boolean existe = usuariodao.existeNoBancoPorUsuarioESenha(usuarioAltenticado);

        if (existe) {
            Usuario usuarioComcargo = usuariodao.SelectUsuarioESenha(usuarioAltenticado);
            tela = new TelaMenuPrincipal(usuarioComcargo.getNome(), usuarioComcargo.getNiveldeacesso());
            tela.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "o nome de Usuario, "
                    + usuarioAltenticado.getNome() + "nao existe no banco de dados, ");
        }

    }

}
