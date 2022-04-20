package br.unicap.DisciplinaPIII.ProjetoComercial.Model;


import java.util.ArrayList;

/**
 *
 * @author Renato Nunes
 */
public class ClientePJ extends Cliente {

    private String CNPJ;
    private int inscricaoEstadual;

 
    public ClientePJ(String CNPJ, int inscEstadual, String codigoCliente, String nome, String email, int telefone, Endereco endereco) {
        super(codigoCliente, nome, email, telefone, endereco);
        this.CNPJ = CNPJ;
        this.inscricaoEstadual = inscEstadual;
    }

    public ClientePJ() {
        super();
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "ClientePJ{" + "CNPJ=" + CNPJ + ", inscricaoEstadual=" + inscricaoEstadual + '}';
    }
}
