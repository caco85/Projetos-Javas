package br.unicap.DisciplinaPIII.ProjetoComercial.Model;


import java.util.ArrayList;

/**
 *
 * @author Renato Nunes
 */
public class ClientePF extends Cliente{

    private String cpf;
    private int rg;

    public ClientePF(String codigoCliente, String nome, String email, int telefone, Endereco endereco, String cpf, int rg) {
        super(codigoCliente, nome, email, telefone, endereco);
        this.cpf = cpf;
        this.rg = rg;      
    }

    public ClientePF() {
        super();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "CliemtePF{" + "cpf=" + cpf + ", rg=" + rg + '}';
    }



 
}
