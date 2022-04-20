package jdbc.banco;

import jdbc.conta.*;
import jdbc.cliente.*;
import jdbc.util.RepositorioException;

public class Banco{

    private CadastroContas contas;
    private CadastroClientes clientes;

    public Banco(){
        initCadastros();
    }

    private void initCadastros(){
        //RepositorioContas repositorioContas = new RepositorioContasBDRCache(new BDCache());
        //RepositorioContas repositorioContas = new RepositorioContasArray();
        //RepositorioClientes repositorioClientes = new RepositorioClientesArray();

        RepositorioContas repositorioContas = RepositorioContasBDR.getInstance();
        RepositorioClientes repositorioClientes = new RepositorioClientesBDR();
        contas = new CadastroContas(repositorioContas);
        clientes = new CadastroClientes(repositorioClientes);

    }

    public void cadastrar(Conta conta) throws ContaJaCadastradaException, RepositorioException {
        contas.cadastrar(conta);
    }

    public double saldo(String numero) throws ContaNaoEncontradaException, RepositorioException {
        Conta conta = contas.procurar(numero);
        return conta.getSaldo();
    }

    public void removerConta(String numero) throws ContaNaoEncontradaException, RepositorioException {
        contas.remover(numero);
    }

    public void debitar(String numero, double valor) throws SaldoInsuficienteException,
            ContaNaoEncontradaException, RepositorioException {
        contas.debitar(numero,valor);
    }

    public void creditar(String numero, double valor) throws ContaNaoEncontradaException,
            RepositorioException {
        contas.creditar(numero,valor);
    }

    public void transferir(String numeroDe, String numeroPara, double valor)
            throws ContaNaoEncontradaException, SaldoInsuficienteException, RepositorioException  {
        contas.transferir(numeroDe,numeroPara,valor);
    }

    public RepositorioContas getContas() throws RepositorioException  {
        return contas.getContas();
    }

    public void cadastrar(Cliente cliente) throws ClienteJaCadastradoException, ContaNaoCadastradaException, RepositorioException {
        RepositorioContas repositorioContas = cliente.getContas();
        IteratorContas iterator = repositorioContas.getIterator();
        while (iterator.hasNext()) {
            Conta conta = iterator.next();
            if (!this.contas.existe(conta.getNumero())) {
                throw new ContaNaoCadastradaException(conta.getNumero());
            }
        }
        clientes.cadastrar(cliente);
    }

    public void atualizar(Cliente cliente) throws ClienteNaoEncontradoException, ContaNaoEncontradaException, RepositorioException {
        RepositorioContas repositorioContas = cliente.getContas();
        IteratorContas iterator = repositorioContas.getIterator();
        while (iterator.hasNext()) {
            Conta conta = iterator.next();
            if (!this.contas.existe(conta.getNumero())) {
                throw new ContaNaoEncontradaException(conta.getNumero());
            }
        }
        clientes.atualizar(cliente);
    }

    public void removerCliente(String nome) throws ClienteNaoEncontradoException, RepositorioException {
        clientes.remover(nome);
    }

    public Cliente procurarCliente(String cpf) throws ClienteNaoEncontradoException,
            RepositorioException  {
        return clientes.procurar(cpf);
    }
}
