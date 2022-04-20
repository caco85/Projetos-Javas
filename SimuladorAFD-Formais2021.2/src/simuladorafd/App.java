package simuladorafd;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        File fileEx = new File("C:\\Users\\Renat\\OneDrive\\Documentos\\palavras.txt");
        File fileEx2 = new File("C:\\Users\\Renat\\OneDrive\\Documentos\\palavras2.txt");
        File fileEx3 = new File("C:\\Users\\Renat\\OneDrive\\Documentos\\palavras3.txt");
        Automatos aut;
        char[] palavras = null;
        int opcMenu;
        String palavra;
        Scanner scanner2 = null;
        
        try {

            do {
                System.out.println("Digite a opção desejada! ");
                System.out.println("--------------------->");
                System.out.println("1- para testar o exemplo de automato 1: ");
                System.out.println("2- para testar o exemplo de automato 2: ");
                System.out.println("3-  para testar o exemplo de automato 3; ");
                System.out.println("0-sair do menu princial: ");
                opcMenu = scanner.nextInt();
                System.out.println("--------------------->");

                switch (opcMenu) {
                    case 1:
                        scanner2 = new Scanner(fileEx);
                        System.out.println("Digite a palavra  para o Automato do teste 1 \n"
                                + "(abb)*c //alfabeto   ");
                        
                         palavra = scanner.nextLine();
//                        palavras = palavra.toCharArray();;
//                        aut = new Automatos(palavras);
//                        aut.estados();
                        System.out.println( palavra);
                        break;
                    case 2:
                        scanner2 = new Scanner(fileEx2);
                        System.out.println("Digite a palavra  para o Automato do teste 1 \n"
                                + "0 1 //alfabeto//{w E {0,1}* |w possua pelo menos dois 0´s consecutivos}  ");
                        palavra = scanner.nextLine();
                        palavras = palavra.toCharArray();
                        aut = new Automatos(palavras);
                        aut.estados();
                        break;

                    case 3:
                        scanner2 = new Scanner(fileEx3);
                        System.out.println("Digite a palavra  para o Automato do teste 1 \n"
                                + "0 1 //alfabeto	//{w E {0,1}* |w possua pelo menos tréz 1´s consecutivos}  ");
                        palavra = scanner.nextLine();scanner.nextLine();
                        palavras = palavra.toCharArray();
                        aut = new Automatos(palavras);
                        aut.estados();
                        break;
                    case 0:
                        System.out.println("Você escolheu sair, obrigado!");
                        System.out.println("-------------");
                        break;
                    default:
                        System.err.println("Você Digitou algo errado! ");
                        System.out.println("-------------");
                }

                System.out.println("A referencia do aautomato é: ");
                while (scanner2.hasNext()) {
                    System.out.println(scanner2.nextLine());
                }
                System.out.println("-------------");
              
            } while (opcMenu != 0);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
           scanner2.close();
        }
    }

}
