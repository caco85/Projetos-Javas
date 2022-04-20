/*


Ao final, o programa (main) deverá exibir o conteúdo dos vetores totalPorEstabelecimento e
totalPorProduto.
OBS: O programador é livre para criar outros procedimentos ou funções que julgar necessários.
 */
package GQ_2;

import java.util.*;

/**
 *
 * @author Renato Nunes
 */
public class Questão3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tam = 3;
        int tam2 = 10;
        int[][] matrizProdutos = new int[tam][tam2];
        String[] nomeFilial = new String[tam];
        long[] totalPorEstab = new long[tam];
        long[] totalGProdutos = new long[tam2];

        preencherMatriz(matrizProdutos, nomeFilial);
        System.out.println("");
        totalPorEstab(matrizProdutos, totalPorEstab);
        totalGeral(matrizProdutos, totalGProdutos);
        exibir(totalPorEstab, totalGProdutos, nomeFilial);

    }

    public static void preencherMatriz(int[][] mat, String[] n) {
        int i, j;
        String nome = "Filial Numero: ";
        System.out.println("Digite a quantidade de produtos");
        for (i = 0; i < mat.length; i++) {
            n[i] = nome + (i + 1);
            for (j = 0; j < mat[i].length; j++) {
                System.out.print("[" + (i + 1) + "]{" + (j + 1) + "] = ");
                mat[i][j] = 1;//scanner.nextInt();
            }
        }

    }

    public static void totalPorEstab(int[][] mat, long[] totalEst) {
        int i, j;
        long total = 0;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                total = total + mat[i][j];
            }
            totalEst[i] = total;
            total = 0;
        }
    }

    public static void totalGeral(int[][] mat, long[] totalGeral) {
        int i, j;
        long total = 0;
        for (i = 0; i < mat.length; i++) {
            //     total = 0;
            for (j = 0; j < totalGeral.length; j++) {
                total = total + mat[i][j];
                totalGeral[j] = total;
            }

        }
    }

    public static void exibir(long[] totalEst, long[] totalG, String[] n) {
        int i, j;
        for (i = 0; i < n.length; i++) {
            System.out.println("o Total do Filial:" + n[i] + " Foi: " + totalEst[i]);

        }
        System.out.println("");
        for (j = 0; j < totalG.length; j++) {
            System.out.println("o Total do Produto: " + (j + 1) + " Foi: " + totalG[j]);
        }
    }
}
