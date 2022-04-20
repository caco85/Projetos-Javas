package br.unicap.DisciplinaPIII.ProjetoComercial.Controller;

import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryVendaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.VendaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Produto;
import br.unicap.DisciplinaPIII.ProjetoComercial.Repository.IRepositoryVenda;
import br.unicap.DisciplinaPIII.ProjetoComercial.Repository.RepositoryVenda;
import java.util.ArrayList;

/**
 *
 * @author Renato Nunes
 */
public class ControllerVenda {

    private IRepositoryVenda repVenda;
    private static ControllerVenda instancia;

    public static ControllerVenda getInstance() {
        if (instancia == null) {
            instancia = new ControllerVenda();
        }
        return instancia;
    }

    public ControllerVenda() {
        this.repVenda = RepositoryVenda.getInstance();
    }

    public void addProduto(Produto produto) throws VendaException, RepositoryVendaException {
        this.repVenda.addProduto(produto);
    }

    public ArrayList<Produto> listarProdutosVenda() throws VendaException, RepositoryVendaException {
        return this.repVenda.listarProdutosVenda();
    }

    public Produto buscarProdutoVenda(String idProduto) throws VendaException, RepositoryVendaException {
        return this.repVenda.buscarProdutoVenda(idProduto);
    }

    public void removerProdutoVenda(Produto produto) throws VendaException, RepositoryVendaException {
        this.repVenda.removerProdutoVenda(produto);
    }

    public ArrayList<Produto> listarProdutosAllCarrinho(ArrayList<Produto> listarProdutosAllCarrinho) {
        if (listarProdutosAllCarrinho != null) {

            for (int i = 0; i < listarProdutosAllCarrinho.size(); i++) {
                System.out.println(listarProdutosAllCarrinho.get(i));

            }
        }
        return listarProdutosAllCarrinho;
    }

    public void calcularVenda(ArrayList<Produto> listarProdutosAllCarrinho) throws VendaException, RepositoryVendaException {
        double valorTotal = 0;
        if (listarProdutosAllCarrinho != null) {
            for (int i = 0; i < listarProdutosAllCarrinho.size(); i++) {
                listarProdutosAllCarrinho.get(i);
                valorTotal = (listarProdutosAllCarrinho.get(i).getValor() * listarProdutosAllCarrinho.get(i).getQtdProduto()) + valorTotal;

            }
        }
        System.out.println("O valor total da compra é de: R$" + valorTotal);
    }
}
