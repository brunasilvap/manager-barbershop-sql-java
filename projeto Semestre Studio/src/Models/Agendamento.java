
package Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vinic
 */
public class Agendamento {
    private int id;
    private Usuario profissionaoResponsavel;
    private Cliente cliente;
    private Servico servico; 
    private Double valor;
    private String data,hora;;
    private String observacao;

    public Agendamento(int id, Usuario profissionaoResponsavel, Cliente cliente, Servico servico, Double valor, String data, String hora) {
        this.id = id;
        this.profissionaoResponsavel = profissionaoResponsavel;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        this.data = data;
        this.hora = hora;
    }

    public Agendamento(int id, Usuario profissionaoResponsavel, Cliente cliente, Servico servico, Double valor, String data, String hora, String observacao) {
        this.id = id;
        this.profissionaoResponsavel = profissionaoResponsavel;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        this.data = data;
        this.hora = hora;
        this.observacao = observacao;
    }

    public Agendamento(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getProfissionaoResponsavel() {
        return profissionaoResponsavel;
    }

    public void setProfissionaoResponsavel(Usuario profissionaoResponsavel) {
        this.profissionaoResponsavel = profissionaoResponsavel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
   
    
    
    
}
