package ProjectGragos_GUI;

import java.io.File;
import java.util.Scanner;

import ProjectGrafos_Models.Grafos;

public class App {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\aluno.UNICAP\\Documents\\vertices.txt",
				path2 = "C:\\Users\\aluno.UNICAP\\Documents\\arestas.txt";
				
		File file;
		Grafos grafos;
		file = new File(path);
		Grafos.imprimirArquivo(file);
		
		file = new File(path2);
		Grafos.imprimirArquivo(file);
	}

}
