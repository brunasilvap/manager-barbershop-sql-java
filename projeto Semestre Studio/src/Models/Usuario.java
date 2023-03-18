
package Models;

import java.util.Date;


public class Usuario  {
    
    
    protected String  nome, senha, sexo, nascimento, telefone, email, rg, niveldeacesso;
    protected int id ;

    public Usuario(String nome, String senha, String sexo, String nascimento, String telefone, String email, String rg, String niveldeacesso, int id) {
        this.nome = nome;
        this.senha = senha;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
        this.niveldeacesso = niveldeacesso;
        this.id = id;
    }

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(String nome, String senha, int id) {
        this.nome = nome;
        this.senha = senha;
        this.id = id;
    }

     
    
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNiveldeacesso() {
        return niveldeacesso;
    }

    public void setNiveldeacesso(String niveldeacesso) {
        this.niveldeacesso = niveldeacesso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario(String nome, String senha, String niveldeacesso) {
        this.nome = nome;
        this.senha = senha;
        this.niveldeacesso = niveldeacesso;
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

   

  
  
    

   

    
    
}
