package exercicio3LSE1pack1.UI;

import exercicio3LSE1pack2.Model.Produto;
import exercicio3LSE1pack3.tipoDados.LSESemRepetidos;
import exercicio3LSE1pack3.tipoDados.ProdutoController;
import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class AppLSE2 {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ProdutoController produtoController = new ProdutoController();
        int opcMenu, qtd, opcSub;
        Produto p;
        String codigo, descricao;
        double preco;
        do {
            menuOpc();
            System.out.println("Informe a opção: ");
            opcMenu = scanner.nextInt();
            scanner.nextLine();
            switch (opcMenu) {
                case 1:
                    System.out.println("Informe o codigo do produto: ");
                    codigo = scanner.nextLine();
                    System.out.println("Informe o descrição do produto: ");
                    descricao = scanner.nextLine();
                    System.out.println("Informe o preço do produto: ");
                    preco = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Informe a quantide em estoque do produto: ");
                    qtd = scanner.nextInt();
                    p = new Produto(codigo);
                    p.setDescricao(descricao);
                    p.setPreco(preco);
                    p.setQtdEstoque(qtd);
                    produtoController.addInicio(p);
                    break;
                case 2:
                    System.out.println("Informe o codigo do produto: ");
                    codigo = scanner.nextLine();
                    System.out.println("Informe o descrição do produto: ");
                    descricao = scanner.nextLine();
                    System.out.println("Informe o preço do produto: ");
                    preco = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Informe a quantide em estoque do produto: ");
                    qtd = scanner.nextInt();
                    p = new Produto(codigo);
                    p.setDescricao(descricao);
                    p.setPreco(preco);
                    p.setQtdEstoque(qtd);
                    produtoController.addFinal(p);
                    break;
                case 3:
                    produtoController.removerInicio();
                    break;
                case 4:
                    produtoController.removerFinal();
                    break;
                case 5:
                    produtoController.exibirTodosProdutos();
                    break;
                case 6:
                    System.out.println("Digite o codigo do produto que deseja pesquisar");
                    codigo = scanner.nextLine();
                    p = new Produto(codigo);
                    produtoController.exibirProduto(p);
                    break;
                case 7:
                    System.out.println("Digite o codigo do produto que deseja pesquisar");
                    codigo = scanner.nextLine();
                    p = new Produto(codigo);
                    System.out.println("Digite a opção que deseja alterar: 1 - Atualizar preço: 2 - Atualizar Estoque ");
                    opcSub = scanner.nextInt();

                    switch (opcSub) {
                        case 1:
                            System.out.println("Digite o novo valor do preço: ");
                            preco = scanner.nextDouble();
                            produtoController.alterarPreco(p, preco);
                            break;
                        case 2:
                            System.out.println("Digite o novo valor do preço: ");
                            qtd = scanner.nextInt();
                            produtoController.alterarQtdEstoque(p, qtd);
                            break;
                        default:
                            System.out.println("Você escolheu uma opção");
                    }
                    break;
                case 8:
                    System.out.println("Digite o codigo do produto que deseja remover");
                    codigo = scanner.nextLine();
                    p = new Produto(codigo);
                    produtoController.removerProduto(p);
                    break;
                case 0:
                    System.out.println("Você escolheu sair obrigado!!");
                    break;
                default:
                    System.out.println("Digite uma opção valida!");
            }
        } while (opcMenu != 0);
    }

    private static void menuOpc() {
        System.out.println("1 – Inserir novo produto no início do cadastro ");
        System.out.println("2 – Inserir novo produto no final do cadastro ");
        System.out.println("3 – Remover o primeiro produto do cadastro ");
        System.out.println("4 – Remover o último produto do cadastro ");
        System.out.println("5 – Exibir todos os produtos do cadastro ");
        System.out.println("6 – Exibir os dados de um produto do cadastro ");
        System.out.println("7 – Alterar os dados de um produto do cadastro ");
        System.out.println("8 – Remover um produto do cadastro ");
        System.out.println("0 – Sair do programa ");
    }
}
