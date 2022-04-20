package simuladorafd;

import java.util.Scanner;

public class TESTE2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        char palavra[];
        String sentenca;

        System.out.println("Digite a entrada da AFD");
        sentenca = scanner.nextLine();
        palavra = sentenca.toCharArray();

        for (int i = 0; i < palavra.length; i++) {
            System.out.println(palavra[i]);
        }
    }

}
