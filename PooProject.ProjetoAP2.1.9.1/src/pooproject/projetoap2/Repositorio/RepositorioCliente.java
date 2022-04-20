package PooProject.ProjetoAP2.Repositorio;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.ClienteException;
import PooProject.ProjetoAP2.Excecao.RepositorioClienteException;
import PooProject.ProjetoAP2.Modelo.Cliente;
import PooProject.ProjetoAP2.Modelo.ClientePF;
import PooProject.ProjetoAP2.Modelo.ClientePJ;

public class RepositorioCliente implements IRepositorioCliente{

	private static RepositorioCliente instancia;
	private ArrayList<Cliente> arrayClientes;
	private ArrayList<ClientePF> arrayClientesPF;
	private ArrayList<ClientePJ> arrayClientesPJ;
	
	public static RepositorioCliente getInstance(){
		if (instancia == null){
			instancia = new RepositorioCliente();
		}
		return instancia;
	}
	
	public RepositorioCliente(){
		if(arrayClientes == null || arrayClientesPF == null || arrayClientesPJ == null){
			arrayClientes = new ArrayList<Cliente>();
			arrayClientesPF = new ArrayList<ClientePF>();
			arrayClientesPJ = new ArrayList<ClientePJ>();
		}

	}
	@Override
	public void inserirClientePF(ClientePF clientePF) throws ClienteException, RepositorioClienteException {	
		arrayClientesPF.add(clientePF);
		System.out.println("");
		System.out.println("Cadastro efetuado com sucesso");
		System.out.println("");

	}
	@Override
	public void excluirClientePJ(ClientePJ cliente) throws ClienteException, RepositorioClienteException {
		for (int i = 0; i < arrayClientes.size(); i++){
			if (arrayClientes.get(i) == cliente){
				arrayClientes.remove(i);
				break;
			}
		}
		if(cliente == null){
			throw new RepositorioClienteException("Cliente não localizado");
		}

	}

	@Override
	public void excluirClientePeloNome(String nome) throws ClienteException, RepositorioClienteException {	
		for (int i = 0; i < arrayClientesPF.size(); i++){
			if (arrayClientesPF.get(i).getNome().equals(nome)){
				arrayClientesPF.remove(i);
				break;
			}
		}
		if(nome == null){
			throw new RepositorioClienteException("Cliente não localizado");
		}	

	}

	@Override
	public ClientePF pesquisarClientePeloCPF(String cpf) throws ClienteException, RepositorioClienteException {
		ClientePF clientePF = null;
		for (int i = 0 ; i <arrayClientesPF.size(); i++){
			if (arrayClientesPF.get(i).getCPF().equals(cpf)){
				clientePF = arrayClientesPF.get(i);
				break;
			}
		}
//		if (clientePF == null){
//			throw new RepositorioClienteException("Cliente não localizado");
//		}
		return clientePF;

	}

	@Override

	public ClientePF pesquisarClientePeloNome(String nome) throws ClienteException, RepositorioClienteException {
		ClientePF clientepf = null;
		for (int i = 0 ; i <arrayClientesPF.size(); i++){
			if (arrayClientesPF.get(i).getNome().equals(nome)){
				clientepf = arrayClientesPF.get(i);
				break;
			}
		}
//		if (clientepf == null){
//			throw new RepositorioClienteException("Cliente não localizado");
//		}
		return clientepf;	

	}

	@Override
	public void inserirClientePJ(ClientePJ clientePJ) throws ClienteException, RepositorioClienteException {
		arrayClientesPJ.add(clientePJ);
		System.out.println("");
		System.out.println("Cadastro efetuado com sucesso");
		System.out.println("");
		
	}

	@Override
	public ClientePJ pesquisarClientePeloCNPJ(String cnpj) throws ClienteException, RepositorioClienteException {
		ClientePJ clientePJ = null;
		for (int i = 0 ; i <arrayClientesPJ.size(); i++){
			if (arrayClientesPJ.get(i).getCNPJ().equals(cnpj)){
				clientePJ = arrayClientesPJ.get(i);
				break;
			}
		}
//		if (clientePJ == null){
//			throw new RepositorioClienteException("Cliente não localizado");
//		}
		return clientePJ;	
	}

	@Override
	public ArrayList<ClientePF> listarClientesPF() throws ClienteException, RepositorioClienteException {
		return arrayClientesPF;
	}

	@Override
	public void atualizarClientePF(ClientePF clientePF) throws ClienteException, RepositorioClienteException {
		for (int i = 0; i < arrayClientesPF.size(); i++) {
			if(arrayClientesPF.get(i) == clientePF){
				arrayClientesPF.set(i, clientePF);
				break;
			}			
		}
		if (clientePF == null){
			throw new RepositorioClienteException("Cliente não localizado");
		
		}
	}

	@Override
	public void atualizarClientePJ(ClientePJ clientePJ) throws ClienteException, RepositorioClienteException {
		for (int i = 0; i < arrayClientesPJ.size(); i++) {
			if(arrayClientesPJ.get(i) == clientePJ){
				arrayClientesPJ.set(i, clientePJ);
				break;
			}			
		}
		if (clientePJ == null){
			throw new RepositorioClienteException("Cliente não localizado");
		
		}
	}

	@Override
	public ArrayList<ClientePJ> listarClientesPJ() throws ClienteException, RepositorioClienteException {
		return arrayClientesPJ;
	}
}
