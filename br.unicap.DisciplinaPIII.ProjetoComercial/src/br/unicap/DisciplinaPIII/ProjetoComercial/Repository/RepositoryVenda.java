package br.unicap.DisciplinaPIII.ProjetoComercial.Repository;

import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryVendaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.VendaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Renato Nunes
 */
public class RepositoryVenda implements IRepositoryVenda {

    private ArrayList<Produto> arrayCarrinho;
    private static RepositoryVenda instancia;

    public static RepositoryVenda getInstance() {
        if (instancia == null) {
            instancia = new RepositoryVenda();
        }
        return instancia;
    }

    public RepositoryVenda() {
        if (this.arrayCarrinho == null) {
            this.arrayCarrinho = new Factory<Produto>().datastructure();
        }
    }

    @Override
    public void addProduto(Produto produto) throws VendaException, RepositoryVendaException {

        this.arrayCarrinho.add(produto);
    }

    @Override
    public ArrayList<Produto> listarProdutosVenda() {
        return this.arrayCarrinho;
    }

    @Override
    public Produto buscarProdutoVenda(String idProduto) throws VendaException, RepositoryVendaException {
        Produto produto = null;
        for (int i = 0; i < this.arrayCarrinho.size(); i++) {
            if (this.arrayCarrinho.get(i).getIdProduto().equals(idProduto)) {
                produto = this.arrayCarrinho.get(i);
                break;
            }
        }
        return produto;
    }

    @Override
    public void removerProdutoVenda(Produto produto) throws VendaException, RepositoryVendaException {
        for (int i = 0; i < this.arrayCarrinho.size(); i++) {
            if (this.arrayCarrinho.get(i).equals(produto)) {
                this.arrayCarrinho.remove(i);
                break;
            }
        }
    }
}
