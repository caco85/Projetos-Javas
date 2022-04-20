package PooProject.ProjetoAP2.Repositorio;


import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.ProdutoException;
import PooProject.ProjetoAP2.Excecao.RepositorioProdutoException;
import PooProject.ProjetoAP2.Modelo.Produto;

public interface IRepositorioProduto {
	public void inserirProduto(Produto produto) throws ProdutoException,RepositorioProdutoException ;
	public void excluirProduto (Produto produto)throws ProdutoException,RepositorioProdutoException;
	public void  excluirProdutoPeloNome(String nome)throws ProdutoException,RepositorioProdutoException;
	public Produto pesquisarProdutoPeloCodigo(int codigo)throws ProdutoException,RepositorioProdutoException;
	public Produto  pesquisarProdutoPeloNome(String nome)throws ProdutoException,RepositorioProdutoException;
	public ArrayList<Produto> listarProdutos()throws ProdutoException,RepositorioProdutoException;
	public void atualizarProduto(Produto produto)throws ProdutoException,RepositorioProdutoException;
	
}
