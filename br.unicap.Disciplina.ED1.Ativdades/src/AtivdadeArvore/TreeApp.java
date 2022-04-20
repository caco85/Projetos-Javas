package AtivdadeArvore;


import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class TreeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        String codigo,descricao,fornecedor;
        int opcMenu,qtd;
        double preco;
        Produto p;
        do {
            Menu();
            System.err.println("Digite a Opção desejada!");
            opcMenu = scanner.nextInt();

            switch (opcMenu) {
                case 1:
                    System.out.println("Digite o Codigo: ");
                    codigo = scanner.nextLine();
                    p = new Produto(codigo);
                    System.out.println("Digite a Descrição do produto: ");
                    descricao = scanner.nextLine();
                    p.setDescricao(descricao);
                    System.out.println("Digite o fornecedor  do produto: ");
                    fornecedor = scanner.nextLine();
                    p.setFornecedor(fornecedor);
                    System.out.println("Digite o preço do produto: ");
                    preco = scanner.nextDouble();
                    p.setPreco(preco);
                    System.out.println("Digite a quantidade em estoque do produto: ");
                    qtd = scanner.nextInt();
                    p.setQtdEstoque(qtd);
                    
                    cadastro.cadastrar(p);
                    
                    break;
                case 2:
                    cadastro.exibirOrdem();
                    break;
                case 3:
                    System.out.println("Digite o Codigo: ");
                    codigo = scanner.nextLine();
                    p = new Produto(codigo);
                    cadastro.procurar(p);
                    break;
                case 4:
                    System.out.println("Digite o Codigo: ");
                    codigo = scanner.nextLine();
                    p = new Produto(codigo);
                    cadastro.procurar(p);
                    
                    break;
                case 5:
                      cadastro.exibir();
                    break;
                case 0:
                    System.out.println("Você escolheu a opção sair! ");
                    break;
                default:
                    System.out.println("Você escolheu algo errado! ");
            }

        } while (opcMenu != 0);

    }

    public static void Menu() {
        System.out.println("1 - Cadastra novo produto: ");
        System.out.println("2 - exibir produto em ordem crescente: ");
        System.out.println("3 - Alterar preço do produto: ");
        System.out.println("4 - Alterar quantidade em estoque: ");
        System.out.println("5 - exibir  produto cadastrado: ");
        System.out.println("0 - Sair: ");
    }

}
