
package exercicio3LSE1pack3.tipoDados;

import exercicio3LSE1pack2.Model.Produto;
import exercicio3LSE1pack3.tipoDados.LSESemRepetidos;

/**
 *
 * @author Renato Nunes
 */
public class ProdutoController {
    LSESemRepetidos<Produto> lista = new LSESemRepetidos();

    public void addInicio(Produto p){
        LSENode aux;
        aux = lista.buscaProduto(p);
        if (aux !=null ) {
            System.out.println("Já existe um produto cadastrado com este codigo! ");
        }else {
            lista.inserirNoInicio(p);          
        }
    }
    public void addFinal(Produto p){
          LSENode aux;
        aux = lista.buscaProduto(p);
        if (aux !=null ) {
            System.out.println("Já existe um produto cadastrado com este codigo! ");
        }else {
            lista.inserirNoFinal(p);          
        }
        
    }
    public void removerInicio(){
        lista.removerNoInicio();
    }
    public void removerFinal(){
        lista.removerNoFinal();
    }
    public void removerProduto(Produto p){
        LSENode aux;
        aux = lista.buscar(p);
        if (aux !=null ) {
            lista.removerProdutoNoh(p);
        }else {
            System.out.println("O produto não foi encontrado! ");
        }
    }
    public void exibirTodosProdutos(){
        lista.exibirTodos();
    
    }
    public void exibirProduto(Produto p){
        LSENode aux;
        aux = lista.buscaProduto(p);
        if (aux !=null ) {
            System.out.println(aux.getInfo());
        }else {
            System.out.println("O produto não exite! ");
        }
    }
    public void alterarPreco(Produto p, double novoPreco){
        LSENode aux;
        aux = lista.buscaProduto(p);
        if (aux !=null) {
            if (novoPreco < 0) {
                System.out.println("o Preço esta invalido! ");
            }else {
                p.setPreco(novoPreco);
                lista.atualizarProduto(p);
            }
        }else {
            System.out.println("Produto não cadastrado");
        }
    
    }
    public void alterarQtdEstoque(Produto p, int novaQtdEstoque){
        LSENode aux;
        aux = lista.buscaProduto(p);
        if (aux !=null) {
            if (novaQtdEstoque < 0) {
                System.out.println("o Preço esta invalido! ");
            }else {
                p.setQtdEstoque(novaQtdEstoque);
                lista.atualizarProduto(p);
            }
        }else {
            System.out.println("Produto não cadastrado");
        }
    
    }
    public void realizarVenda(Produto p,int qtdRetirada){
        LSENode aux;
        aux = lista.buscaProduto(p);
        if (aux != null) {
            if (qtdRetirada > p.getQtdEstoque()) {
                p.setQtdEstoque(p.getQtdEstoque()-qtdRetirada);
                lista.atualizarProduto(p);
            }else{
                System.out.println(";venda não autorizada,pois a quantidade do produto é inferior ao que esta em estoque");
            }
        }else {
            System.out.println("Produto não foi encontrado! ");
        }        
    }
}
