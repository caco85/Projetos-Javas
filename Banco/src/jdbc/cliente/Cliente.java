package jdbc.cliente;

import jdbc.conta.*;
import jdbc.util.RepositorioException;

public class Cliente {

    private String nome;
    private String cpf;
    private CadastroContas contas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new CadastroContas(new RepositorioContasArray());
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrar(Conta conta) throws ContaJaCadastradaException, RepositorioException {
        contas.cadastrar(conta);
    }

    public void remover(String numero) throws ContaNaoEncontradaException, RepositorioException {
        contas.remover(numero);
    }

    public RepositorioContas getContas() throws RepositorioException {
        return contas.getContas();
    }


}
