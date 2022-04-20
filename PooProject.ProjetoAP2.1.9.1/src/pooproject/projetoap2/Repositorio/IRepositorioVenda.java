package PooProject.ProjetoAP2.Repositorio;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.RepositorioVendaException;
import PooProject.ProjetoAP2.Excecao.VendaException;
import PooProject.ProjetoAP2.Modelo.Venda;

public interface IRepositorioVenda {
	public void inserirVenda(Venda venda) throws VendaException,RepositorioVendaException ;
	public void excluirVenda(Venda venda) throws VendaException,RepositorioVendaException ;
	public void excluirVendaPeloCodigo(int codigo) throws VendaException,RepositorioVendaException ;
	public Venda pesquisarVendaPeloCodigo(int codigo)throws VendaException,RepositorioVendaException ;
	public ArrayList<Venda> listarVendas()throws VendaException,RepositorioVendaException ;
	public void atualizarVenda(Venda venda)throws VendaException,RepositorioVendaException ;
}
