package br.unicap.DisciplinaPIII.ProjetoComercial.Repository;


import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.ProdutoException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryProdutoException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Produto;
import java.util.ArrayList;

public class RepositoryProduto implements IRepositoryProduto {

    private ArrayList<Produto> arrayProduto;

    private static RepositoryProduto instancia;
    public static RepositoryProduto getInstance() {
        if (instancia == null) {
            instancia = new RepositoryProduto();
        }
        return instancia;
    }
    
    public RepositoryProduto() {
        if (this.arrayProduto == null) {
            this.arrayProduto = new Factory<Produto>().datastructure();
        }
    }

    @Override
    public void cadastrarProduto(Produto produto)throws ProdutoException,RepositoryProdutoException {
        this.arrayProduto.add(produto);
    }

    @Override
    public ArrayList<Produto> listarProduto()throws ProdutoException,RepositoryProdutoException {
        return this.arrayProduto;
    }

    @Override
    public Produto buscarProduto(String idProduto)throws ProdutoException,RepositoryProdutoException {
        Produto produto = null;
        for (int i = 0; i < this.arrayProduto.size(); i++) {
            if (this.arrayProduto.get(i).getIdProduto().equals(idProduto)) {
                produto = this.arrayProduto.get(i);
                break;
            }
        }
        return produto;
    }

    @Override
    public void atualizarProduto(Produto produto)throws ProdutoException,RepositoryProdutoException {
        for (int i = 0; i < arrayProduto.size(); i++) {
            if (arrayProduto.get(i).equals(produto)) {
                arrayProduto.set(i, produto);
                break;
            }
        }
    }

    @Override
    public void removerProduto(Produto produto) throws ProdutoException,RepositoryProdutoException{
        for (int i = 0; i < this.arrayProduto.size(); i++) {
            if (this.arrayProduto.get(i).equals(produto)) {
                this.arrayProduto.remove(i);
                break;
            }
        }
    }
}
