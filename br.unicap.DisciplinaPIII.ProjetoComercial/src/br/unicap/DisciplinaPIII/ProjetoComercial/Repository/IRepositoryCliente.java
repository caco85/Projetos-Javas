package br.unicap.DisciplinaPIII.ProjetoComercial.Repository;

import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.ClienteException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryClienteException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Renato Nunes
 */
public interface IRepositoryCliente {
    public  void cadastrarCliente(Cliente cliente) throws ClienteException,RepositoryClienteException;
    public  ArrayList<Cliente> listarClientes() throws ClienteException,RepositoryClienteException;
    public  Cliente buscarCliente(String codigoCli) throws ClienteException,RepositoryClienteException;
    public Cliente buscarClienteCPFouCNPJ(String cpfOuCnpj) throws ClienteException,RepositoryClienteException;
    public Cliente buscarClientePeloNome(String nome) throws ClienteException,RepositoryClienteException;
    public  void atualizarCliente(Cliente cliente) throws ClienteException,RepositoryClienteException;
    public  void removerCliente(Cliente cliente) throws ClienteException,RepositoryClienteException;
    
}
