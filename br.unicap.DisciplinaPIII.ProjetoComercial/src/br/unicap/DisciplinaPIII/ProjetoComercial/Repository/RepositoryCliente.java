package br.unicap.DisciplinaPIII.ProjetoComercial.Repository;

import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.ClienteException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryClienteException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Cliente;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.ClientePF;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.ClientePJ;
import java.util.ArrayList;

/**
 *
 * @author Renato Nunes
 */
public class RepositoryCliente implements IRepositoryCliente {
 
    private ArrayList<Cliente> arrayClientes;
    private static RepositoryCliente instancia;
    public static RepositoryCliente getInstance() {
        if (instancia == null) {
            instancia = new RepositoryCliente();
        }
        return instancia;
    }
    
    public RepositoryCliente() {
        if (this.arrayClientes == null) {
            this.arrayClientes = new Factory<Cliente>().datastructure();
        }
    }

    @Override
    public void cadastrarCliente(Cliente cliente) throws ClienteException,RepositoryClienteException{
        this.arrayClientes.add(cliente);
    }

    @Override
    public ArrayList<Cliente> listarClientes() throws ClienteException,RepositoryClienteException{
        return this.arrayClientes;
    }

    @Override
    public Cliente buscarCliente(String codigoCli) throws ClienteException,RepositoryClienteException{
        Cliente cliente = null;

        for (int i = 0; i < this.arrayClientes.size(); i++) {
            if (this.arrayClientes.get(i).getCodigoCliente().equals(codigoCli)) {
                cliente = this.arrayClientes.get(i);
                break;
            }
        }
        return cliente;
    }

    @Override
    public void atualizarCliente(Cliente cliente) throws ClienteException,RepositoryClienteException{
        for (int i = 0; i < arrayClientes.size(); i++) {
            if (arrayClientes.get(i).equals(cliente)) {
                arrayClientes.set(i, cliente);
                break;
            }
        }
    }

    @Override
    public void removerCliente(Cliente cliente) throws ClienteException,RepositoryClienteException{
        for (int i = 0; i < this.arrayClientes.size(); i++) {
            if (this.arrayClientes.get(i).equals(cliente)) {
                this.arrayClientes.remove(i);
                break;
            }
        }
    }

    @Override
    public Cliente buscarClienteCPFouCNPJ(String cpfOuCnpj) throws ClienteException,RepositoryClienteException{
        Cliente cliente = null;
        for (int i = 0; i < arrayClientes.size(); i++) {
            if (cliente instanceof ClientePF) {
                if (((ClientePF) arrayClientes.get(i)).getCpf().equals(cpfOuCnpj)) {
                    cliente = arrayClientes.get(i);
                    break;
                }
            } else if (cliente instanceof ClientePJ) {
                if (((ClientePJ) arrayClientes.get(i)).getCNPJ().equals(cpfOuCnpj)) {
                    cliente = arrayClientes.get(i);
                    break;
                }
            }
        }
        return cliente;
    }

    @Override
    public Cliente buscarClientePeloNome(String nome) throws ClienteException,RepositoryClienteException{
        Cliente cliente = null;
        for (int i = 0; i < arrayClientes.size(); i++) {
            if (arrayClientes.get(i).getNome().equals(nome)) {
                cliente = arrayClientes.get(i);
                break;
            }
        }

        return cliente;
    }

}
