package exemplovendas;
/**
 *
 * @author Renato Nunes
 */
public class Produto {
    public String codigo;
    public String nomeProduto;
    public String fornecedor;
    public double preco;
    public int qtdEstoque;
    
    public Produto(String cod){
        this.codigo = cod;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
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
        return "Produto{" + "codigo=" + codigo + ", nomeProduto=" + nomeProduto + ", fornecedor=" + fornecedor + ", preco=" + preco + ", qtdEstoque=" + qtdEstoque + '}';
    }
    
    
    
}
