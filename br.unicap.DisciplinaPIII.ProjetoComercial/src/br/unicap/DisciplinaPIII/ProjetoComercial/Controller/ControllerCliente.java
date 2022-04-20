package br.unicap.DisciplinaPIII.ProjetoComercial.Controller;

import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.ClienteException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryClienteException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Cliente;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.ClientePF;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.ClientePJ;
import br.unicap.DisciplinaPIII.ProjetoComercial.Repository.IRepositoryCliente;
import br.unicap.DisciplinaPIII.ProjetoComercial.Repository.RepositoryCliente;
import java.util.ArrayList;

/**
 *
 * @author Renato Nunes
 */
public class ControllerCliente {

    private IRepositoryCliente repCliente;
    private static ControllerCliente instancia;

    public static ControllerCliente getInstance() {
        if (instancia == null) {
            instancia = new ControllerCliente();
        }
        return instancia;
    }

    public ControllerCliente() {
        this.repCliente = RepositoryCliente.getInstance();
    }

    public void cadastrarCliente(Cliente cliente) throws ClienteException, RepositoryClienteException {
        if (cliente instanceof ClientePF && this.repCliente.buscarClienteCPFouCNPJ(((ClientePF) cliente).getCpf()) != null) {
            throw new ClienteException("Cliente não cadastrado,pois ja existe o cpf cadastrado");
        } else if (cliente instanceof ClientePJ && this.repCliente.buscarClienteCPFouCNPJ(((ClientePJ) cliente).getCNPJ()) != null) {
            throw new ClienteException("Cliente não cadastrado,pois ja existe o cnpj cadastrado");
        } else {
            this.repCliente.cadastrarCliente(cliente);
        }
    }

    public ArrayList<Cliente> listarClientes() throws ClienteException, RepositoryClienteException {
        return this.repCliente.listarClientes();
    }

    public Cliente buscarCliente(String codigoCli) throws ClienteException, RepositoryClienteException {
        return this.repCliente.buscarCliente(codigoCli);
    }

    public Cliente buscarClienteCPFouCNPJ(String cpfOuCnpj) throws ClienteException, RepositoryClienteException {
        return this.repCliente.buscarClienteCPFouCNPJ(cpfOuCnpj);
    }

    public Cliente buscarClientePeloNome(String nome) throws ClienteException, RepositoryClienteException {
        return this.repCliente.buscarClientePeloNome(nome);
    }

    public void atualizarCliente(Cliente cliente) throws ClienteException, RepositoryClienteException {
        this.repCliente.atualizarCliente(cliente);
    }

    public void removerCliente(Cliente cliente) throws ClienteException, RepositoryClienteException {
        this.repCliente.removerCliente(cliente);
    }

    public ArrayList<Cliente> listarClientesAll(ArrayList<Cliente> arrayClientesAll) throws ClienteException, RepositoryClienteException {
        if (arrayClientesAll != null) {

            for (int i = 0; i < arrayClientesAll.size(); i++) {
                System.out.println(arrayClientesAll.get(i));   

            }
        }
        return arrayClientesAll;
    }


}
