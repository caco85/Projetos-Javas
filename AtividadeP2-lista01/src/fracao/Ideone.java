/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Renat
 */
public class Ideone {

    public static final int QTD = 10;
    public static Scanner entrada = new Scanner(System.in);
    public static Random aleatorios = new Random(11);

    public static void main(String[] args) throws java.lang.Exception {
        Fracao[] fracoes = new Fracao[QTD];
        Fracao[] fracoes2 = new Fracao[QTD];
        for (int i = 0; i < fracoes.length; i = i + 1) {
            Fracao gerada = new Fracao(aleatorios.nextInt(21) - 10,
                    aleatorios.nextInt(10) + 1);
     //       adicionarOrdenado(fracoes, i, gerada);
            insertionSortCrescen(fracoes, i, gerada);
            adicionarOrdenadoDecres(fracoes2, i, gerada);
        }
        imprimir(fracoes, fracoes.length);
        imprimir(fracoes2, fracoes2.length);
        Fracao menor = menor(fracoes);
        System.out.println("Fração com o menor valor é " + menor);
    }

    public static void imprimir(Fracao[] v, int tam) {
        for (int i = 0; i < tam; i = i + 1) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    // se tiver espaço no vetor adiciona a nova fração e retorna o novo
    // tamanho, senão, retorna o tamanho antigo e não adiciona
    // FAZER A IMPLEMENTAÇÃO CORRETA
    // 2 7 15   inserir o 5
    // 2 5 7 15
    public static void adicionarOrdenado(Fracao[] v, int tam, Fracao f) {
        int i = tam;
        while (i > 0 && v[i - 1].compareTo(f) > 0) {
            v[i] = v[i - 1];
            i = i - 1;
        }
        v[i] = f;
    }

    public static void adicionarOrdenadoDecres(Fracao[] v, int tam, Fracao f) {
        int i = tam;
        while (i > 0 && v[i - 1].compareTo(f) < 0) {
            v[i] = v[i - 1];
            i = i - 1;
        }
        v[i] = f;
    }

    public static void insertionSortCrescen(Fracao[] v, int tam, Fracao f) {
        int j = tam;
        int i = j;
        for (j = 1; j < v.length; j = j + 1) {
            while (i > 0 && v[i - 1].compareTo(f) > 0) {
                v[i] = v[i - 1];
                i = i - 1;
            }
            v[i] = f;
        }
    }

    public static void insertionSortDecres(Fracao[] v, int tam, Fracao f) {
        int j = tam;
        int i = j;
     //   for (j = 1; j < v.length; j = j + 1) {
            while (i > 0 && v[i - 1].compareTo(f) < 0) {
                v[i] = v[i + 1];
                i = i + 1;
            }
            v[i] = f;
      //  }
    }

    public static Fracao menor(Fracao[] v) {
        int iMenor = 0;
        for (int i = 1; i < v.length; i = i + 1) {
            if (v[i].compareTo(v[iMenor]) < 0) {
                iMenor = i;
            }
        }
        return v[iMenor];
    }

}
