package lista.de.exercicio1;
import java.util.Scanner;
/**
 *
 * @author Renato Nunes
 */

public class Execicio3 {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        double nota1,nota2,media;
        System.out.print("Digite a Primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Digite a Segunda nota: ");
        nota2 = entrada.nextDouble();
        media = ((nota1 *2)+(nota2 *3))/(2+3);
        System.out.println("A media é: " + media);
    }
    
}
