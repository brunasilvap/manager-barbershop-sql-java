/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author vinic
 */
public class Produto {
    
    int id;
    String nome,categoria,discricao,fornecedor;
    double valor,quantidade;

    public Produto(int id, String nome, String fornecedor, double valor, double quantidade) {
        this.id = id;
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    
    public Produto(int id, String nome, String categoria, String discricao, String fornecedor, double valor, double quantidade) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.discricao = discricao;
        this.fornecedor = fornecedor;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Produto(int id) {
        this.id = id;
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDiscricao() {
        return discricao;
    }

    public void setDiscricao(String discricao) {
        this.discricao = discricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

  
}
