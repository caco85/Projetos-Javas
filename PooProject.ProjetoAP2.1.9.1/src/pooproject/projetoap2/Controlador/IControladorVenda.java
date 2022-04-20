package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;
import PooProject.ProjetoAP2.Excecao.RepositorioVendaException;
import PooProject.ProjetoAP2.Excecao.VendaException;
import PooProject.ProjetoAP2.Modelo.Venda;

public interface IControladorVenda {
	public void inserirVenda(Venda venda) throws VendaException,RepositorioVendaException ;
	public void excluirVenda(Venda venda) throws VendaException,RepositorioVendaException ;
	public void excluirVendaPeloCodigo(int codigo) throws VendaException,RepositorioVendaException ;
	public Venda pesquisarVendaPeloCodigo(int codigo)throws VendaException,RepositorioVendaException ;
	public ArrayList<Venda> listarVendas()throws VendaException,RepositorioVendaException ;
	public void atualizarVenda(Venda venda)throws VendaException,RepositorioVendaException ;
	public Double calcularValorRecebido(double preco,int qdt)throws VendaException,RepositorioVendaException;
	public  ArrayList<Venda> listarVendasAll(ArrayList<Venda> arrayVendasAll)throws VendaException,RepositorioVendaException;
	public void cadastrarVenda(Venda venda)throws VendaException,RepositorioVendaException;
	public void escolhaAtualizarVenda(Venda venda)throws VendaException,RepositorioVendaException;
	public ArrayList<Venda> calcularVendas(ArrayList<Venda> calcularVenda)throws VendaException,RepositorioVendaException;
	public Double parcelaVenda(double valor)throws VendaException,RepositorioVendaException;
}
