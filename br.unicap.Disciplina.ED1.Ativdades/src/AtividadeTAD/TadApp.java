package AtividadeTAD;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class TadApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcMenu, num,numF;
        Deque<Integer> a = new Deque();
        do {
            
            System.out.println("Digite a opção do menu desejada: ");
            MenuOpcoes();
            opcMenu = scanner.nextInt();
            

            switch (opcMenu) {
                case 1:
                    System.out.println("Digite o numero para ser inserido: ");
                    num = scanner.nextInt();
                    a.push(num);
                    break;
                case 2:
                    num = a.pop();
                    System.out.println("O numero removido foi: " + num);
                    break;
                case 3:
                    System.out.println("Digite o numero para ser inserido: ");
                    num = scanner.nextInt();
                    a.inject(num);
                    break;
                case 4:
                    num = a.eject();
                    System.out.println("O numero removido foi: " + num);
                    break;
                case 5:
                    if (a.isEmpty() != false) {
                        System.out.println("Lista vazia");
                    } else {
                        System.out.println("Lista não esta vazia");
                    }
                    break;
                case 6:
                    if (a.isFull() != false) {
                        System.out.println("Lista cheia");
                    } else {
                        System.out.println("Lista não esta cheia");
                    }
                    break;
                case 0:
                    System.out.println("Você escolheu a opção sair! ");
                    while (a.isEmpty() == false) {
                        num = a.topo();
                        System.out.println(num);
                        numF = a.footer();
                        System.out.println(numF);
                    }
                    break;
                default:
                    System.out.println("Você digitou algo errado!");
            }
        } while (opcMenu != 0);

    }

    public static void MenuOpcoes() {
        System.out.println("1 - Para  Inserir A no inicio do Deque:");
        System.out.println("2 - Para  Remove e retorna o elemento que está no início da Deque :");
        System.out.println("3 - Para  Insere o elemento A no final da Deque:");
        System.out.println("4 - Para  Remove e retorna o elemento que está no final da Deque");
        System.out.println("5 - Para  Testa se a Deque está vazia:");
        System.out.println("6 - Para  Testa se a Deque está cheia:");
        System.out.println("0 - Para  Encerrar a aplicação:");
    }

}
