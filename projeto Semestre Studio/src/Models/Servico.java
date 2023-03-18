/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author vinic
 */
public class Servico {
    private int id;
    private String descricao,nome;
    private double valor;

    public Servico(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public Servico(int id) {
        this.id = id;
    }

    public Servico(String nome) {
        this.nome = nome;
    }

    public Servico(double valor) {
        this.valor = valor;
    }

    public Servico(int id, String descricao, String nome, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

   

   
}
            
    

