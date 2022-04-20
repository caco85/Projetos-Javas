package AtividadeMatrizes;
import java.util.Scanner;
/**
 *
 * @author Renato Nunes
 */
public class exemplomatrizes {
    public static void preencher(double[][] mat) {
        Scanner in = new Scanner(System.in);
        int i, j;
        System.out.println("Informe os elementos da matriz");
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {	
                System.out.print("[" + (i+1) + "]{" + (j+1) + "] = ");
                mat[i][j] = in.nextDouble();
            }
        }
    }
    public static void exibir(double[][] mat) {
        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        double[][] matriz1 = new double[2][3];
        double[][] matriz2 = new double[3][4];
        System.out.println("Vamos preencher a primeira matriz com números reais");
        preencher(matriz1);
        System.out.println("Vamos preencher a segunda matriz com números reais");
        preencher(matriz2);
        System.out.println("Matriz 1");
        exibir (matriz1);
        System.out.println("Matriz 2");
        exibir (matriz2);
    }
}
