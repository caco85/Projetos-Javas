package SimuladorAFD;

import java.io.File;
import java.util.Scanner;

public class App {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\Renat\\OneDrive\\Documentos\\palavras.txt",
				path2 = "C:\\Users\\Renat\\OneDrive\\Documentos\\palavras2.txt",
				path3 = "C:\\Users\\Renat\\OneDrive\\Documentos\\palavras3.txt";
		File file;

		AutomatoEx aut;
		char[] palavras = null;
		int opcMenu;
		String palavra;
		try {
			do {

				Menu();
				opcMenu = scanner.nextInt(); scanner.nextLine();
				System.out.println("");

				switch (opcMenu) {

				case 1:
					System.out.println("Digite a palavra  para o Automato do teste 1 \n" + "(abb)*c //alfabeto   ");
					palavra = scanner.nextLine();
					palavras = palavra.toCharArray();
					aut = new AutomatoEx(palavras);
					aut.estados();

					file = new File(path);
					imprimirArquivo(file);
					break;
				case 2:
					System.out.println("Digite a palavra  para o Automato do teste 1 \n"
							+ "0 1 //alfabeto//{w E {0,1}* |w possua pelo menos dois 0´s consecutivos}  ");
					palavra = scanner.nextLine();
					palavras = palavra.toCharArray();
					aut = new AutomatoEx(palavras);
					aut.estados2();
					file = new File(path2);
					imprimirArquivo(file);
					break;
				case 3:
					System.out.println("Digite a palavra  para o Automato do teste 1 \n"
							+ "0 1 //alfabeto	//{w E {0,1}* |w possua pelo menos três 1´s consecutivos}  ");
					palavra = scanner.nextLine();
					palavras = palavra.toCharArray();
					aut = new AutomatoEx(palavras);
					aut.estados3();
					file = new File(path3);
					imprimirArquivo(file);
					break;
				case 0:
					System.out.println("Você escolheu sair, obrigado!");
					System.out.println("-------------");
					break;
				default:
					System.err.println("Você Digitou algo errado! ");
					System.out.println("-------------");
				}

			} while (opcMenu != 0);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	private static void Menu() {
		System.out.println("Digite a opção desejada! ");
		System.out.println("1 - para testar o exemplo de automato 1: ");
		System.out.println("2 - para testar o exemplo de automato 2: ");
		System.out.println("3 - para testar o exemplo de automato 3; ");
		System.out.println("0 - sair do menu princial: ");
		System.out.println("");

	};

	private static void imprimirArquivo(File file) throws Exception {
		Scanner scanner2 = new Scanner(file);
		System.out.println("A referencia do automato é: ");

		while (scanner2.hasNext()) {
			System.out.println(scanner2.nextLine());
		}

		System.out.println("-------------");
		scanner2.close();
	}
}
