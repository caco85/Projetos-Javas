package PooProject.ProjetoAP2.Repositorio;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.ProdutoException;
import PooProject.ProjetoAP2.Excecao.RepositorioProdutoException;
import PooProject.ProjetoAP2.Modelo.Produto;

public class RepositorioProduto implements IRepositorioProduto {
	private ArrayList<Produto> arrayProdutos;
	private static RepositorioProduto instancia;
	
	public static RepositorioProduto getInstance(){
		if (instancia == null) {
			instancia = new RepositorioProduto();	
		}
		return instancia;
	}
	
	public  RepositorioProduto() {
		if (arrayProdutos == null) {
			arrayProdutos = new ArrayList<Produto>();
			
		}
	}
	
	@Override
	public void inserirProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		arrayProdutos.add(produto);
		System.out.println("");
		System.out.println("Cadastro efetuado com sucesso");
		System.out.println("");
	}

	@Override
	public void excluirProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		for (int i = 0; i < arrayProdutos.size(); i++) {
			if (arrayProdutos.get(i) == produto) {
				arrayProdutos.remove(i);
				break;
			}
		}
		if(produto == null){
			throw new RepositorioProdutoException("Produto não Localizado");
		}
	}

	@Override
	public void excluirProdutoPeloNome(String nome) throws ProdutoException, RepositorioProdutoException {
		for (int i = 0; i < arrayProdutos.size(); i++) {
			if (arrayProdutos.get(i) != null && arrayProdutos.get(i).getNomeProduto().equals(nome)) {
				arrayProdutos.remove(i);
			}
		}
		if(nome == null){
			throw new RepositorioProdutoException("Produto não Localizado");
		}
	}

	@Override
	public Produto pesquisarProdutoPeloCodigo(int codigo) throws ProdutoException, RepositorioProdutoException {
		Produto produto = null;
		for (int i = 0; i < arrayProdutos.size(); i++) {
			if (arrayProdutos.get(i) != null && arrayProdutos.get(i).getCodProduto() == codigo) {
				arrayProdutos.get(i);
				break;
			}
//			else if(produto ==null){
//				throw new RepositorioProdutoException("Produto não Localizado");
//			}
		}
		return produto;
	}

	@Override
	public Produto pesquisarProdutoPeloNome(String nome) throws ProdutoException, RepositorioProdutoException {
		Produto produto = null;
		for (int i = 0; i < arrayProdutos.size(); i++) {
			if (arrayProdutos.get(i) != null && arrayProdutos.get(i).getNomeProduto().equals(nome)) {
				arrayProdutos.get(i);
				break;
				
			} 
//			if(produto ==null){
//				throw new RepositorioProdutoException("Produto não Localizado");
//			}
		}
		return produto;
	}

	@Override
	public ArrayList<Produto> listarProdutos() throws ProdutoException, RepositorioProdutoException {
		return arrayProdutos;
	}

	@Override
	public void atualizarProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		for (int i = 0; i < arrayProdutos.size(); i++){
			if (arrayProdutos.get(i) == produto){
				arrayProdutos.set(i,produto);
				break;
			}
		}
		if(produto == null){
			throw new RepositorioProdutoException("Produto não foi localizado ");
			}
	}
}
