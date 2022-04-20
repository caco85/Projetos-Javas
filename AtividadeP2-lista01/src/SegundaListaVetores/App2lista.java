package SegundaListaVetores;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class App2lista {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] vetNome = new String[5];
        double[] vetNota1 = new double[5];
        double[] vetNota2 = new double[5];  
        double[] vetMedia = new double[5];
        int i;
        for (i = 0; i < vetNome.length; i = i + 1) {
            System.out.println("Digite o nome do Aluno");
            vetNome[i] = scanner.nextLine();
            System.out.println("Digite a primeira nota do Aluno");
            vetNota1[i] = scanner.nextDouble();scanner.nextLine();
            System.out.println("Digite a Segunda nota do Aluno");
            vetNota2[i] = scanner.nextDouble();scanner.nextLine();

            vetMedia[i] = ((vetNota1[i] * 2) + (vetNota2[i] * 3)) / 5;

            System.out.println("O Aluno " + vetNome[i] + " obteve a média: " + vetMedia[i]);
        }
        Funcoes.exibirMedia(vetMedia);

//        //questão 6
//        int[] vetNum = new int[20];
//        Funcoes.preencherVetor(vetNum);
//        System.out.println("O maior Elemento do vetor é " + Funcoes.maior(vetNum));
//        System.out.println("O menor Elemento do vetor é " + Funcoes.menor(vetNum));
//
//        //questão 7
//        double[] vetNumR = new double[5];
//        Funcoes.preencherVetorR(vetNumR);
//        System.out.println("A maior diferença entre vetores é: " + Funcoes.maiorDif(vetNumR));
//
//        //questão 8
//        int[] vetdado = new int[6];
//        Funcoes.jogarDado(vetdado);
    }

}
