
package lista.de.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class Execicio4 {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int numero;
        System.out.print("Digite os numeros: ");
        numero = entrada.nextInt();
        String s = Integer.toString(numero);
        System.out.println("A quantidade de numeros são:  " + s.length());
    }
}
