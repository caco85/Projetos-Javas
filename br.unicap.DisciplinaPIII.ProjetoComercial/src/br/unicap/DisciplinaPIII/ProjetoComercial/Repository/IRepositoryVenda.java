package br.unicap.DisciplinaPIII.ProjetoComercial.Repository;


import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryVendaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.VendaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Produto;
import java.util.ArrayList;
/**
 *
 * @author Renato Nunes
 */
public interface IRepositoryVenda {

    public void addProduto(Produto produto) throws VendaException, RepositoryVendaException;

    public ArrayList<Produto> listarProdutosVenda()throws VendaException, RepositoryVendaException;

    public Produto buscarProdutoVenda(String idProduto)throws VendaException, RepositoryVendaException;

    public void removerProdutoVenda(Produto produto)throws VendaException, RepositoryVendaException;

}
