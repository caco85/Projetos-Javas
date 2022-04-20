package SegundaListaVetores;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class Funcoes {

    public static Scanner scanner = new Scanner(System.in);

    public static void exibirMedia(double[] medTotal) {
        double media = 0, maior = 0, qtdMenor = 0;
        int i, qtdMaior = 0;
        for (i = 0; i < medTotal.length; i = i + 1) {
            media = media + medTotal[i];
            if (maior < medTotal[i]) {
                maior = medTotal[i];
            }
        }
        media = media / 5;
        for (i = 0; i < medTotal.length; i++) {
            if (media > medTotal[i]) {
                qtdMaior = qtdMaior + 1;
            } else if (media < medTotal[i]) {
                qtdMenor = qtdMenor + 1;
            }
        }

        System.out.println("A média turma é: " + media); //questão 2
        System.out.println("A porcentagem dos alunos abaixo da média é: " + (qtdMenor * 100 / 5)); //questão 3
        System.out.println("A quantidade de alunos acima da media da  turma é: " + qtdMaior); //questão 4
        System.out.println("A maior média  da turma é: " + maior); //questão 5
    }

    //questão 6 
    public static void preencherVetor(int[] v) {
        int i;
        for (i = 0; i < v.length; i = i + 1) {
            System.out.println("Digite os numeros do Vetor");
            v[i] = scanner.nextInt();
        }
    }

    public static int maior(int[] vetNum) {
        int i, maior = 0;
        for (i = 0; i < vetNum.length; i = i + 1) {
            if (maior < vetNum[i]) {
                maior = vetNum[i];
            }
        }
        return maior;
    }

    public static int menor(int[] vetNum) {
        int i, menor = 0;
        for (i = 0; i < vetNum.length; i = i + 1) {
            if (menor < vetNum[i]) {
                menor = vetNum[i];
            }
        }
        return menor;
    }

    //questão 7
    public static void preencherVetorR(double[] v) {
        int i;
        for (i = 0; i < v.length; i = i + 1) {
            System.out.println("Digite os numeros do Vetor");
            v[i] = scanner.nextInt();
        }
    }

    public static double maiorDif(double[] v) {
        double[] dif = new double[1];
        double[] difAnterior = new double[1];
        int i;
        for (i = 1; i < v.length; i = i + 1) {
            difAnterior[0] = v[i] - v[i - 1];
            if (dif[0] < difAnterior[0]) {
                dif = difAnterior;
            }
        }
        return dif[0];
    }

    //questão 8
    public static void jogarDado(int[] v) {
        Random rd = new Random();
        int i, r;
        for (i = 0; i < 1000000; i = i + 1) {
            r = rd.nextInt(6);

            switch (r) {
                case 0:
                    v[0] = v[0] + 1;
                    break;
                case 1:
                    v[1] = v[1] + 1;
                    break;
                case 2:
                    v[2] = v[2] + 1;
                    break;
                case 3:
                    v[3] = v[3] + 1;
                    break;
                case 4:
                    v[4] = v[4] + 1;
                    break;
                case 5:
                    v[5] = v[5] + 1;
                    break;
            }

        }
        System.out.println("A quantidade de 1 foi" + v[0]);
        System.out.println("A quantidade de 2 foi" + v[1]);
        System.out.println("A quantidade de 3 foi" + v[2]);
        System.out.println("A quantidade de 4 foi" + v[3]);
        System.out.println("A quantidade de 5 foi" + v[4]);
        System.out.println("A quantidade de 6 foi" + v[5]);
    }
}
