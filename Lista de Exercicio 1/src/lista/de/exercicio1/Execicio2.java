package lista.de.exercicio1;
import java.util.Scanner;
/**
 *
 * @author Renato Nunes
 */
public class Execicio2 {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int qtdCav,qtdFers;
        System.out.print("Digite a quantidade de cavalos para a troca das ferraduras");
        qtdCav = entrada.nextInt();
        qtdFers = qtdCav * 4;
        System.out.println("A quantidade de ferraduras são: " + qtdFers);   
    }
}
