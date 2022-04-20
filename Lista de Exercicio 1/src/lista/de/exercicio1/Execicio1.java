
package lista.de.exercicio1;
import java.util.Scanner;
/**
 *
 * @author Renato Nunes
 */
public class Execicio1 {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int largura,comp,tamTerreno;
        System.out.print("Digite a Largura do seu terreno em metros: ");
        largura = entrada.nextInt();
        System.out.print("Digite o Comprimento do seu terreno em metros: ");
        comp = entrada.nextInt();
        tamTerreno = largura * comp;
        System.out.println(" O Tamanho do seu terreno é: " + tamTerreno +"m");    
    }
}
