package GQ_2;

import java.util.Scanner;
public class Questao1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String frase;
        char a, b;
        System.out.println("Digite uma sequencia de caracteres: ");
        frase = scanner.nextLine();

        while (validarFrase(frase) == false) {
            System.out.println("Sequencia invalida digite apenas letras e espaços");
            frase = scanner.nextLine();
        }
        System.out.println("Digite uma letra");
        a = scanner.next().charAt(0);
        System.out.println("Digite uma outra letra");
        b = scanner.next().charAt(0);
        System.out.println(" A quantide que os caracteres:" + a + " e:" + b + " Apareceu na frase foi:" + contarCarec(frase, a, b));
    }

    public static boolean validarFrase(String n) {
        int i, tam = n.length();
        boolean valido = true;
        char car;
        for (i = 0; i < tam; i++) {
            car = n.charAt(i);
            car = Character.toLowerCase(car);
            if (Character.isLetter(car) == false && Character.isSpaceChar(car) == false) {
                valido = false;
                break;
            }
        }
        return valido;
    }

    public static int contarCarec(String f, char a, char b) {
        int cont = 0, i, tam;
        char car, anterior = 0, atual;
        tam = f.length();
        char[] vet = new char[tam];
        for (i = 0; i < 10; i++) {
            car = f.charAt(i);
            car = Character.toLowerCase(car);
            vet[i] = car;

        }
        for (i = 0; i < tam; i++) {
            atual = vet[i];
            if (i != 0) {
                anterior = vet[i - 1];
            }

            if (atual == b && anterior == a) {
                cont++;
            }

        }
        return cont;
    }

}
