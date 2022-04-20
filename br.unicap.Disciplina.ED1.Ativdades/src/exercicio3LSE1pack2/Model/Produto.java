/*
Sobre cada produto deverão ser mantidas as seguintes informações: código (String), 
descrição (String), preço (double) e estoque (int). O que diferencia um produto de outro é seu código. 
Após criado um produto, seu código não poderá ser alterado. 
 */
package exercicio3LSE1pack2.Model;

/**
 *
 * @author Renato Nunes
 */
public class Produto implements Comparable<Produto>{
    private final String codigo;
    private String descricao;
    private double preco;
    private int qtdEstoque;

    public Produto(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
       // this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + ", qtdEstoque=" + qtdEstoque + '}';
    }

    @Override
    public int compareTo(Produto p) {
      return this.codigo.compareTo(p.getCodigo());
    }
    
    
    
    
}
