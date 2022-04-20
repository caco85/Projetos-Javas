package AtividadeMatrizes;

import java.util.*;

/**
 *
 * @author Renato Nunes
 */
public class FuncoesMatrizes {

    public static Scanner scanner = new Scanner(System.in);

    // questão 1
    public static double calcularMedia(double n1, double n2) {
        double media;
        media = ((n1 * 2) + (n2 * 3)) / 5;
//        System.out.println(media);
        return media;
    }

    public static void preencherNomeMedia(String[] n, double[][] mat, String[] f) {
        int i, j;
        String nome;
        double m;
        for (i = 0; i < n.length; i++) {
            System.out.println("Digite o nome do Aluno: ");
            nome = scanner.nextLine();
            n[i] = nome;
            for (j = 0; j < n.length; j++) {
                if (j == 2) {
                    // m = ((mat[i][0]* 2) + (mat[i][1]*3)) / 5;
                    m = calcularMedia(mat[i][0], mat[i][1]);
                    mat[i][j] = m;
                } else {
                    System.out.print("Digite a " + f[j]);
                    mat[i][j] = scanner.nextDouble();
                    scanner.nextLine();
                }
            }
        }

    }

    public static void exibirNomeMedia(String[] n, double[][] mat) {
        int i, j;
        for (i = 0; i < n.length; i++) {
            for (j = 0; j <= mat.length; j++) {
                if (j == 2) {
                    System.out.print("o Aluno:" + n[i] + " Recebeu a media: " + mat[i][j]);
                }

            }
            System.out.println();
        }
    }

    //Questão 2
    public static double mediaTurma(double[][] mat) {
        double mediaTurma = 0;
        int i, j, cont = 0;
        for (i = 0; i < mat.length; i++) {
            mediaTurma = mediaTurma + mat[i][2];
            cont++;
        }
        return mediaTurma / cont;

    }

    public static double qtdAbaixoMedia(double[][] mat, double media) {
        int i, cont = 0;
        for (i = 0; i < mat.length; i++) {
            if (media < mat[i][2]) {
                cont++;
            }
        }
        return cont;

    }

    public static void imprimeMenoreMaiorMedia(double[][] mat) {
        int i, cont = 0;
        double maiorMedia = 0, menorMedia = Integer.MIN_VALUE, media;
        for (i = 0; i < mat.length; i++) {
            media = mat[i][2];
            if (media < menorMedia) {
                menorMedia = mat[i][2];
            }
            if (maiorMedia < media) {
                maiorMedia = mat[i][2];
            }

        }
        System.out.println("A maior media: " + maiorMedia + " e" + " A menor media foi: " + menorMedia);
    }

    //questão 3
    public static int maiorIntMatriz(int[][] mat) {
        int i, j, maiorInt = Integer.MIN_VALUE;

        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                if (maiorInt < mat[i][j]) {
                    maiorInt = mat[i][j];
                }
            }
            System.out.println();
        }
        return maiorInt;
    }

    public static void preencherMatrizMultMaior(int[][] mat, int[][] mat2, int maiorMult) {

        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.println("[" + (i + 1) + "][" + (j + 1) + "] = ");
                mat2[i][j] = maiorMult * mat[i][j];
            }
        }
    }
    //Questão 4

    public static void preencherNomeNotas(String[] n, double[][] mat) {
        int i, j;
        String nome;
        double m;
        for (i = 0; i < n.length; i++) {
            System.out.println("Digite o nome do Aluno: ");
            nome = scanner.nextLine();
            n[i] = nome;
            for (j = 0; j < mat.length; j++) {
                System.out.print("Digite a nota ");
                mat[i][j] = scanner.nextDouble();
                scanner.nextLine();
            }
        }
    }

    public static void exibirNomeNota(String[] n, double[][] mat) {
        int i, j, notaAux;
        double menorNota = 0;
        for (i = 0; i < n.length; i++) {
            for (j = 0; j < mat.length; j++) {
                notaAux = (int) mat[i][j];
                System.out.println(notaAux);
                if (notaAux < menorNota) {
                    menorNota = notaAux;
                }

            }
            System.out.println("o Aluno:" + n[i] + " Recebeu a menor nota: " + menorNota);
            //System.out.println();
            menorNota = 0;
        }
    }

    //Questão5 //procedimento tbm usado na questão 3
    public static void preencherMatriz(int[][] mat) {

        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.println("[" + (i + 1) + "][" + (j + 1) + "] = ");
                mat[i][j] = scanner.nextInt();
            }
        }
    }

    public static void calcularTransposta(int[][] mat1, int[][] mat2) {
        int i, j;
        for (i = 0; i < mat1.length; i++) {
            for (j = 0; j < mat1[i].length; j++) {
                mat2[j][i] = mat1[i][j];
            }
        }
        exibirMatriz(mat2);
    }

    //tbm usada na questão 3
    public static void exibirMatriz(int[][] mat) {
        int l, j;
        for (l = 0; l < mat.length; l++) {
            for (j = 0; j < mat[l].length; j++) {
                System.out.print(mat[l][j] + " ");
            }
            System.out.println();
        }
    }

    //Questão6
    public static void preencherTabela(double[][] mat, String[] mes, String[] fruta) {
        int l, j;
        double soma;
        for (j = 0; j < mat[0].length - 1; j++) {
            for (l = 0; l < mat.length - 1; l++) {
                System.out.print("Informe o valor arrecadado em " + mes[j]);
                System.out.print(" com a venda de " + fruta[l] + ": ");
                mat[l][j] = scanner.nextDouble();
            }
        }
        for (l = 0; l < mat.length - 1; l++) {
            soma = 0;
            for (j = 0; j < mat[l].length - 1; j++) {
                soma = soma + mat[l][j];
            }
            mat[l][12] = soma;
        }
        for (j = 0; j < mat[0].length; j++) {
            soma = 0;
            for (l = 0; l < mat.length - 1; l++) {
                soma = soma + mat[l][j];
            }
            mat[8][j] = soma;
        }
    }

    public static double fatMediaMes(double[][] mat) {
        double media = 0;
        int cont = 0, i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                media = mat[i][j];
                cont++;
            }
            System.out.println();
        }
        return media / cont;
    }

    public static double valorAnualFruta(double[][] mat, String[] f, String n) {
        double valorFruta = 0;
        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                if (f[j].compareToIgnoreCase(n) == 0) {
                    valorFruta = valorFruta + mat[i][j];
                }
            }
        }
        return valorFruta;
    }

    public static double valorMes(double[][] mat, String[] f, String m) {
        double valor = 0;
        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                if (f[j].compareToIgnoreCase(m) == 0) {
                    valor = valor + mat[i][j];
                }
            }
        }
        return valor;
    }

    public static double valorAnual(double[][] mat) {
        double valor = 0;
        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                valor = valor + mat[i][j];
            }
        }
        return valor;
    }

}
