package jdbc.cliente;

import jdbc.util.RepositorioException;

public class CadastroClientes {

    private RepositorioClientes clientes;

    public CadastroClientes(RepositorioClientes repositorio) {
        this.clientes = repositorio;
    }

    public void cadastrar(Cliente cliente) throws ClienteJaCadastradoException,
            RepositorioException {
        if (cliente != null) {
            if (!clientes.existe(cliente.getCpf())) {
                clientes.inserir(cliente);
            } else {
                throw new ClienteJaCadastradoException(cliente.getCpf());
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void remover(String cpf) throws ClienteNaoEncontradoException, RepositorioException {
        clientes.remover(cpf);
    }

    public void atualizar(Cliente cliente) throws ClienteNaoEncontradoException,
            RepositorioException {
        clientes.atualizar(cliente);
    }

    public Cliente procurar(String cpf) throws ClienteNaoEncontradoException,
            RepositorioException {
        return clientes.procurar(cpf);
    }

}