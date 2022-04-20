package ListadeVetorOrd01;
//Implemente um programa para criar um vetor de tamanho 100 de números inteiros
//e preenchê-lo com números gerados aleatoriamente. Os números gerados devem estar
//no intervalo de 1 a 10.000. O vetor não deve conter números repetidos. Após o
//preenchimento do vetor, ordene-o por ordem decrescente de valores utilizando o
//método da bolha. Ao final, o programa deverá exibir o vetor obtido. Este programa
//deverá conter os seguintes métodos: preencher, ordenar e exibir. O programador é livre
//para criar outros métodos, caso julgue necessário.

import java.util.*;

/**
 *
 * @author Renato Nunes
 */
public class VetorOrderBS {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        int cont;
        preencher(numeros);
        ordenarBS(numeros);
        exibir(numeros);

    }

    public static void preencher(int[] n) {
        Random rad = new Random();
        int i, r, cont = 0, dado;
        for (i = 0; i < n.length; i++) {
            r = rad.nextInt(10000);
            dado = buscarRep(n, r);
            if (dado != -1) {
                System.out.println("numero não cadastrado pois ja existe");
            } else {
                n[i] = r;
            }
        }
    }
    
//    	public static void adicionarOrdenadoCres(Fracao[] v, int tam, Fracao f) {
//		int i = tam;
//                double chave;
//		while (i > 0 && v[i - 1].compareTo(f) > 0) {
//                        chave = v[i];
//                        v[i] = v[i +1];
//			v[i + 1] = chave;
//			i = i -1;
//		}
//		v[i] = f;
//	}
    public static void ordenarBS(int[] n) {
        int i, fim = n.length - 2, pos = 0, aux;
        boolean troca;
        do {
            troca = false;
            for (i = 0; i <= fim; i++) {
                if (n[i] < n[i + 1]) {
                    aux = n[i];
                    n[i] = n[i + 1];
                    n[i + 1] = aux;
                    troca = true;
                    pos = i;
                }
            }
            fim = pos - 1;
        } while (troca == true);
    }

    public static void exibir(int[] n) {
        int i;
        for (i = 0; i < n.length; i++) {
            if (n[i]!= 0){
                System.out.println(n[i]);
            }
        }
    }

    private static int buscarRep(int[] n, int nbuscado) {
        int i, pos = -1;
        for (i = 0; i < n.length; i++) {
            if (n[i] == nbuscado) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}
