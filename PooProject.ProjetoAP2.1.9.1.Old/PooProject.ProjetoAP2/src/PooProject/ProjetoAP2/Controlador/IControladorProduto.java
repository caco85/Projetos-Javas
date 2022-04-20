package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.ProdutoException;
import PooProject.ProjetoAP2.Excecao.RepositorioProdutoException;
import PooProject.ProjetoAP2.Modelo.Produto;

public interface IControladorProduto {
	public void inserirProduto(Produto produto) throws ProdutoException,RepositorioProdutoException ;
	public void excluirProduto (Produto produto)throws ProdutoException,RepositorioProdutoException;
	public void  excluirProdutoPeloNome(String nome)throws ProdutoException,RepositorioProdutoException;
	public Produto pesquisarProdutoPeloCodigo(int codigo)throws ProdutoException,RepositorioProdutoException;
	public Produto  pesquisarProdutoPeloNome(String nome)throws ProdutoException,RepositorioProdutoException;
	public ArrayList<Produto> listarProdutos()throws ProdutoException,RepositorioProdutoException;
	public void atualizarProduto(Produto produto)throws ProdutoException,RepositorioProdutoException;
	public  ArrayList<Produto> listarProdutosAll(ArrayList<Produto> arrayProdutosAll)throws ProdutoException,RepositorioProdutoException;
	public void cadastrarProduto(Produto produto)throws ProdutoException,RepositorioProdutoException;
	public void escolhaAtualizarProduto(Produto produto) throws ProdutoException,RepositorioProdutoException;
}
