
import java.util.Scanner;



/**
 *
 * @author Renato Nunes
 */
public class AplicacaoFuncoes {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println(FuncoesGlobais.fibonacci(15));
        int n1, n2, n3;
        System.out.println("Digite o primeiro numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = entrada.nextInt();
        System.out.println("Digite o terceiro numero: ");
        n3 = entrada.nextInt();
        System.out.println("Soma de A e B: " + FuncoesGlobais.soma(n1, n2));
        System.out.println("Media de A e B: " + FuncoesGlobais.media(n1, n2));
        System.out.println("Media de A,B e C: " + FuncoesGlobais.media3(n1, n2, n3));
        System.out.println("O maior de A ou B: " + FuncoesGlobais.maior2(n1, n2));
        System.out.println("O maior de A,B ou C: " + FuncoesGlobais.maior3(n1, n2, n3));
    }
}
