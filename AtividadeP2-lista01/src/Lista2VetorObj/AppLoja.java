package Lista2VetorObj;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class AppLoja {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        final int tam = 3;
        int opcMenu,qtdItens,opcPreco;
        String nomeForn,codigo;
//        System.out.print("Digite a quantidade de produtos a serem cadastrada");
//        tam = scanner.nextInt();
        Loja loja = new Loja(tam);
        
        do {
            System.out.println("Bem vindo ao Best Piece");
            System.out.println("MENU");
            System.out.println("Escolha uma opção desejada \n 1 cadastrar produtos  2 exibir produtos "
                    + "3 exibir produtos por fornecedor \n 4 altera o valor do produto 5 atualizar o produto em estoque"
                    + " 6 Efetuar Vendas \n 7 sair: ");
            opcMenu = scanner.nextInt();scanner.nextLine();
            switch (opcMenu) {
                case 1:
                    Produto p = null;
                    loja.cadastrar(p);
                    System.out.println("");
                    break;
                case 2:
                    loja.exibirProdutos();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Digite o nome do Fornecedor");
                    nomeForn = scanner.nextLine();
                    loja.exibirPrdtsFornecedores(nomeForn);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Digite o codigo do produto");
                    codigo = scanner.nextLine();
                    System.out.println("Digite a opção do produto 1 pra aumentar o preço 2 desconto");
                    opcPreco = scanner.nextInt();
                    while (opcPreco != 1 && opcPreco != 2) {                        
                        System.out.println("Você Digitou errado"+"Digite a opção do produto 1 pra aumentar o preço 2 desconto");
                        opcPreco = scanner.nextInt();
                    }
                    loja.alterarPreco(codigo, opcPreco);
                    break;
                case 5:
                    System.out.println("Digite o codigo do produto");
                    codigo = scanner.nextLine();
                    loja.atualizarQtdProduto(codigo);
                    break;
                case 6:
                    System.out.println("Digite o codigo do produto");
                    codigo = scanner.nextLine();
                    System.out.println("Digite a quantidade do produto a ser comprado");
                    qtdItens = scanner.nextInt();
                    loja.efetuarVenda(codigo, qtdItens);
                    break;
                case 7:
                    System.out.println("Você escolheu a opção sair obrigado e volte sempre !");
                    break;
                default:
                    System.err.println("Você escolheu uma opção invalida!");
                    System.out.println("");
            }
        } while (opcMenu != 7);
    }
}
