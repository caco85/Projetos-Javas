package exercicio3LSE1pack1.UI;

import exercicio3LSE1pack2.Model.Produto;
import exercicio3LSE1pack3.tipoDados.LSESemRepetidos;
import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LSESemRepetidos<Produto> lista = new LSESemRepetidos();
        int opcMenu, qtd;
        Produto p;
        String codigo, descricao;
        double preco;
        do {
            MenuOpc();
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
                    lista.inserirNoInicio(p);
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
                    lista.inserirNoFinal(p);
                    break;
                case 3:
                    lista.removerNoInicio();
                    break;
                case 4:
                    lista.removerNoFinal();
                    break;
                case 5:
                    lista.exibirTodos();
                    break;
                case 6:
                    System.out.println("Digite o codigo do produto que deseja pesquisar");
                    codigo = scanner.nextLine();
                    p = new Produto(codigo);
                    lista.buscarProdutoSimples(p);
                    break;
                case 7:
                    subMenu();
                    break;
                case 8:
                    System.out.println("Digite o codigo do produto que deseja remover");
                    codigo = scanner.nextLine();
                    p = new Produto(codigo);
                    lista.removerProdutoNoh(p);
                    break;
                case 0:
                    System.out.println("Você escolheu sair obrigado!!");
                    break;
                default:
                    System.out.println("Digite uma opção valida!");
            }
        } while (opcMenu != 0);
    }

    private static void MenuOpc() {
        System.out.println("1 - Inserir novo produto no início da lista");
        System.out.println("2 - Inserir novo produto no final da lista");
        System.out.println("3 - Remover o primeiro produto da lista ");
        System.out.println("4 - Remover o último produto da lista ");
        System.out.println("5 - Exibir todos os produtos da lista ");
        System.out.println("6 - Exibir os dados de um produto da lista ");
        System.out.println("7 - Alterar os dados de um produto da lista  ");
        System.out.println("8 - Remover um produto da lista  ");
        System.out.println("0 - Sair do programa");
    }

    private static void subMenu() {
        String codigo;
        double preco;
        int opcSub, qtdEstoque;
        LSESemRepetidos<Produto> lista = new LSESemRepetidos();
        Produto p;

        System.out.println("1 - Alterar preço e estoque: ");
        System.out.println("2 - Alterar apenas preço: ");
        System.out.println("3 - Alterar apenas estoque:  ");
        System.out.println("Digite a opção Desejada");
        opcSub = scanner.nextInt();

        System.out.println("Digite o codigo do produto que deseja Alterar");
        codigo = scanner.nextLine();
        p = new Produto(codigo);
        switch (opcSub) {
            case 1:
                System.out.println("Digite o novo valor do preço do produto: ");
                preco = scanner.nextDouble();
                System.out.println("Digite a nova quantidade em estoque do produto: ");
                qtdEstoque = scanner.nextInt();
                p.setPreco(preco);
                p.setQtdEstoque(qtdEstoque);
                lista.atualizarProduto(p);
                break;
            case 2:
                System.out.println("Digite o novo valor do preço do produto: ");
                preco = scanner.nextDouble();
                p.setPreco(preco);
                lista.atualizarProduto(p);
                break;
            case 3:
                System.out.println("Digite a nova quantidade em estoque do produto: ");
                qtdEstoque = scanner.nextInt();
                p.setQtdEstoque(qtdEstoque);
                lista.atualizarProduto(p);
                break;
            default:
                System.out.println("Você Digitou uma opção invalida! foi direcionado pra o menu principal");
        }
    }
}
