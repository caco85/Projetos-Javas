package br.unicap.DisciplinaPIII.ProjetoComercial.Repository;


import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.ProdutoException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryProdutoException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Produto;
import java.util.ArrayList;

public interface IRepositoryProduto {

    public void cadastrarProduto(Produto produto)throws ProdutoException,RepositoryProdutoException;
    public ArrayList<Produto> listarProduto()throws ProdutoException,RepositoryProdutoException;
    public Produto buscarProduto(String idProduto)throws ProdutoException,RepositoryProdutoException;
    public void atualizarProduto(Produto produto)throws ProdutoException,RepositoryProdutoException;
    public void removerProduto(Produto produto)throws ProdutoException,RepositoryProdutoException;
    
}
