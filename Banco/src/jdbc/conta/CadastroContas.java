package jdbc.conta;

import jdbc.util.RepositorioException;

public class CadastroContas {

    private RepositorioContas contas;

    public CadastroContas(RepositorioContas repositorio) {
        this.contas = repositorio;
    }

    public void cadastrar(Conta conta) throws ContaJaCadastradaException, RepositorioException {
        if (conta != null) {
            if (!contas.existe(conta.getNumero())) {
                contas.inserir(conta);
            } else {
                throw new ContaJaCadastradaException(conta.getNumero());
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void remover(String numero) throws ContaNaoEncontradaException, RepositorioException{
        contas.remover(numero);
    }

    public boolean existe(String numero) throws RepositorioException {
        return contas.existe(numero);
    }

    public RepositorioContas getContas() throws RepositorioException {
        return contas.getContas();
    }

    public void debitar(String numero, double valor) throws SaldoInsuficienteException,
            ContaNaoEncontradaException, RepositorioException {
        Conta conta = contas.procurar(numero);
        conta.debitar(valor);
        contas.atualizar(conta);
    }

    public void creditar(String numero, double valor) throws ContaNaoEncontradaException, RepositorioException  {
        Conta conta = contas.procurar(numero);
        conta.creditar(valor);
        contas.atualizar(conta);
    }

    public void transferir(String numeroDe, String numeroPara, double valor) throws ContaNaoEncontradaException,
            SaldoInsuficienteException, RepositorioException  {
        Conta contaDe = contas.procurar(numeroDe);
        Conta contaPara = contas.procurar(numeroDe);
        contaDe.debitar(valor);
        contaPara.creditar(valor);
        contas.atualizar(contaDe);
        contas.atualizar(contaPara);
    }

    public Conta procurar(String numero) throws ContaNaoEncontradaException, RepositorioException {
        return contas.procurar(numero);
    }

}