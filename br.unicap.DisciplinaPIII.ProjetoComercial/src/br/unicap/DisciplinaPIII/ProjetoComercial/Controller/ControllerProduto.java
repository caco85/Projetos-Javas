
package br.unicap.DisciplinaPIII.ProjetoComercial.Controller;

import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.ProdutoException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryProdutoException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Produto;
import br.unicap.DisciplinaPIII.ProjetoComercial.Repository.IRepositoryProduto;
import br.unicap.DisciplinaPIII.ProjetoComercial.Repository.RepositoryProduto;
import java.util.ArrayList;

/**
 *
 * @author Renato Nunes
 */
public class ControllerProduto {
    private IRepositoryProduto repProduto;
    private static ControllerProduto instancia;
    public static ControllerProduto getInstance() {
        if (instancia == null) {
            instancia = new ControllerProduto();
        }
        return instancia;
    }
    
    public ControllerProduto() {
        this.repProduto = RepositoryProduto.getInstance();
    }
    

    public void cadastrarProduto(Produto produto) throws ProdutoException, RepositoryProdutoException {
        if (this.repProduto.buscarProduto(produto.getIdProduto()) != null) {
            throw new ProdutoException("Produto não cadastrado,pois ja existe o cpf cadastrado");
        } else {
            this.repProduto.cadastrarProduto(produto);
        }
    }
   
    public ArrayList<Produto> listarProduto() throws ProdutoException, RepositoryProdutoException{
       return this.repProduto.listarProduto();
    }
   
    public Produto buscarProduto(String idProduto) throws ProdutoException, RepositoryProdutoException{
        return this.repProduto.buscarProduto(idProduto);
    }

    public void atualizarProduto(Produto produto) throws ProdutoException, RepositoryProdutoException{
        this.repProduto.atualizarProduto(produto);
    }

    public void removerProduto(Produto produto) throws ProdutoException, RepositoryProdutoException{
        this.repProduto.removerProduto(produto);
    }
    public ArrayList<Produto> listarProdutosAll(ArrayList<Produto> arrayProdutosAll) throws ProdutoException, RepositoryProdutoException{
        if (arrayProdutosAll != null) {

            for (int i = 0; i < arrayProdutosAll.size(); i++) {
                System.out.println(arrayProdutosAll.get(i));

            }
        }
        return arrayProdutosAll;
    }
}

