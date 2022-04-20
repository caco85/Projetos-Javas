package exercicioLDECpack1.UI;

import exercicioLDECpack2.Model.Dicionario;
import exercicioLDECpack3.Dados.LDECOrder;
import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class App {

    public static void main(String[] args) {
        LDECOrder termo = new LDECOrder();
        LDECOrder ListaB = new LDECOrder();
        Scanner scanner = new Scanner(System.in);
        String nome, descricao;
        Dicionario dic;
        int opcMenu, qtd;
        do {
            System.out.println("Digite a opção desejada: ");
            opcMenu = scanner.nextInt();
            menuOpcao();
            switch (opcMenu) {
                case 1:
                    System.out.println("Digite o nome: ");
                    nome = scanner.nextLine();
                    dic = new Dicionario(nome);
                    System.out.println("Digite a descrição: ");
                    descricao = scanner.nextLine();
                    dic.setDescrição(descricao);
                    if (termo.isEmpty() == true) {
                        ListaB.inserirOrdenado(dic);
                    } else {
                        nome.charAt(0);
                        dic.setNome(nome);
                        termo.inserirOrdenado(dic);
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome: ");
                    nome = scanner.nextLine();
                    dic = new Dicionario(nome);
                    qtd = ListaB.remover(dic);
                    if (qtd <= 0) {
                        termo.remover(dic);
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome: ");
                    nome = scanner.nextLine();
                    dic = new Dicionario(nome);
                    termo.buscarUm(dic);
                    break;
                case 4:
                    System.out.println("Digite o nome: ");
                    nome = scanner.nextLine();
                    dic = new Dicionario(nome);
                    System.out.println("Digite a nova descrição! ");
                    dic.setDescrição(scanner.nextLine());
                    termo.atualizar(dic);
                    break;
                case 5:
                    termo.exibirTodos();
                    break;
                case 6:
                    System.out.println("Digite o nome: ");
                    nome = scanner.nextLine();
                    dic = new Dicionario(nome);
                    while (dic.getNome().equals(nome)) {
                        termo.exibirTodosMesmaLetra();
                    }
                    break;
                case 0:
                    System.out.println("Voce escolheu sair! ");
                    break;
                default:
                    System.out.println("Voce digitou algo errado! ");
            }

        } while (opcMenu != 0);

    }

    public static void menuOpcao() {
        System.out.println("Digite A opção desejada: ");
        System.out.println("1 - Para cadastrar");
        System.out.println("2 - Para remover");
        System.out.println("3 - Para Exibir um termo: ");
        System.out.println("4- Para Editar um termo:");
        System.out.println("5- Para Exibir todos os termos");
        System.out.println("6 - Para Exibir todos os termo com a letra dada");
        System.out.println("0 - Para Sair");
    }
}
