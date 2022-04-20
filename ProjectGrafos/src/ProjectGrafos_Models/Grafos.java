package ProjectGrafos_Models;

import java.io.File;
import java.util.Scanner;

public class Grafos {

	public static void imprimirArquivo(File file) throws Exception {
		Scanner scanner2 = new Scanner(file);
		System.out.println("OS dados do arquivo txt  é: ");

		while (scanner2.hasNext()) {
			System.out.println(scanner2.nextLine());
		}

		System.out.println("-------------");
		scanner2.close();
	}
}
