package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.ClienteException;
import PooProject.ProjetoAP2.Excecao.RepositorioClienteException;
import PooProject.ProjetoAP2.Modelo.ClientePF;
import PooProject.ProjetoAP2.Modelo.ClientePJ;

public interface IControladorCliente {
	public void inserirClientePF(ClientePF clientePF) throws ClienteException,RepositorioClienteException ;
	public void excluirClientePJ (ClientePJ cliente)throws ClienteException,RepositorioClienteException;
	public void  excluirClientePeloNome(String nome)throws ClienteException,RepositorioClienteException;
	public ClientePF pesquisarClientePeloCPF(String cpf)throws ClienteException,RepositorioClienteException;
	public ClientePF  pesquisarClientePeloNome(String nome)throws ClienteException,RepositorioClienteException;
	public void inserirClientePJ(ClientePJ clientePJ)throws ClienteException,RepositorioClienteException;
	public ClientePJ pesquisarClientePeloCNPJ(String cnpj)throws ClienteException,RepositorioClienteException;
	public ArrayList<ClientePF> listarClientesPF()throws ClienteException,RepositorioClienteException;	
	public ArrayList<ClientePJ> listarClientesPJ()throws ClienteException,RepositorioClienteException;	
	public void atualizarClientePF(ClientePF clientePF)throws ClienteException,RepositorioClienteException;
	public void atualizarClientePJ(ClientePJ clientePJ)throws ClienteException,RepositorioClienteException;
	public  ArrayList<ClientePF> listarClientesAll(ArrayList<ClientePF> arrayClientesAll)throws ClienteException,RepositorioClienteException;
	public  ArrayList<ClientePJ> listarClientesPJAll(ArrayList<ClientePJ> arrayClientesPJAll)throws ClienteException,RepositorioClienteException;
	public void escolhaAtualizarClientePF(ClientePF clientePF)throws ClienteException,RepositorioClienteException;
	public void escolhaAtualizarClientePJ(ClientePJ clientePJ)throws ClienteException,RepositorioClienteException;
}
