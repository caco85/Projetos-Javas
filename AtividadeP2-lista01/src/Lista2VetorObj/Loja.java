package Lista2VetorObj;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class Loja {

    private static Produto[] produtos;
    private int cont;
    public static Scanner scanner = new Scanner(System.in);

    public Loja(int prdts) {
        produtos = new Produto[prdts];
    }

    public void cadastrar(Produto p) {
        String codigo;
        int i;
        System.out.println("Digite o Codigo do produto");
        codigo = scanner.nextLine();
        p = new Produto(codigo);
        System.out.println("Digite o nome do produto");
        p.nomeProduto = scanner.nextLine();
        System.out.println("Digite o nome do fornecedor");
        p.fornecedor = scanner.nextLine();
        System.out.println("Digite o Preço do produto");
        p.preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite  a quantidade do produto");
        p.qtdEstoque = scanner.nextInt();
        scanner.nextLine();
        cont = cont+1;
        if(cont > 0){
            for ( i = 0; i < cont; i++) {
                if (produtos[i]!= null && produtos[i].getCodigo().equals(codigo)) {
                    System.out.println("Ja existe o codigo informado! ");
                    cont = cont-1;
                    break;
                }else if (produtos[i] == null) {
                    produtos[i]= p;
                    System.out.println("Produto cadastrado! ");
                    break;
                }
            }
        }
            
  
    }

    public void exibirProdutos() {
        int i;
        System.out.println("Abaixo a lista dos produtos cadastrados:");
        for (i = 0; i < cont; i++) {
            System.out.println(produtos[i]);
        }
    }

    public void exibirPrdtsFornecedores(String fornecedores) {
        int i;
        System.out.println("Abaixo a lista dos itens fornecido por:" + fornecedores);
        for (i = 0; i <cont; i++) {
            if (produtos[i].getFornecedor().equals(fornecedores)) {
                System.out.println(produtos[i]);
            }
        }
    }

    public void alterarPreco(String cod, int opc) {
        double novoPreco;
        int i;
        for (i = 0; i < cont; i++) {
            if (produtos[i].getCodigo().equals(cod)) {
                if (opc == 1) {
                    System.out.println("Informe o valor de aumento do produto");
                    novoPreco = scanner.nextDouble();
                    produtos[i].setPreco(produtos[i].getPreco() + novoPreco);
                } else {
                    System.out.println("Informe o valor de desconto do produto");
                    novoPreco = scanner.nextDouble();
                    produtos[i].setPreco(produtos[i].getPreco() - novoPreco);
                }
            }
        }
    }

    public void atualizarQtdProduto(String cod) {
        int i, novaQtd;
        for (i = 0; i < cont; i++) {
            if (produtos[i].getCodigo().equals(cod)) {
                System.out.println("Informe a quantidade do produto a ser acrescentado");
                novaQtd = scanner.nextInt();
                produtos[i].setQtdEstoque(produtos[i].getQtdEstoque() + novaQtd);
            }
        }
    }

    public void efetuarVenda(String cod, int qtd) {
        int i;
        double totalPago;
        for (i = 0; i < cont; i++) {
            if (produtos[i].getCodigo().equals(cod)){
                if(produtos[i].getQtdEstoque() >= qtd) {
                    produtos[i].setQtdEstoque(produtos[i].getQtdEstoque() - qtd);
                    totalPago = produtos[i].getPreco() * qtd;
                    System.out.println("O valor gasto na compra foi: " + "R$" + totalPago);
                    System.out.println("");
                } else {
                    System.out.println("Venda Não efetuada, devido falta de produto em estoque");
                    System.out.println("");
                }
            }    
        }
    }
}
