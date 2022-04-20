//2 – Implemente um programa para criar um vetor de 20 nomes (Strings). O vetor deverá
//ser preenchido com nomes (não repetidos) informados pelo usuário. Após o
//preenchimento do vetor, ele deve ser ordenado (ordem alfabética crescente) utilizando
//o método da bolha e o vetor resultante deve ser exibido. Este programa deverá conter
//os seguintes métodos: preencher, ordenar e exibir. O programador é livre para criar
//outros métodos, caso julgue necessário.
package ListadeVetorOrd01;

import java.util.*;

/**
 *
 * @author Renato Nunes
 */
public class VetorOrderBS2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nomes = new String[20];
        preencher(nomes);
        ordenarNomeBS(nomes);
        exibir(nomes);
    }

    public static void preencher(String[] n) {
        String nome;
        int i, dado;
        for (i = 0; i < n.length; i++) {
            System.out.println("Digite o nome: ");
            nome = scanner.nextLine();
            dado = buscarNomeRep(n, nome);
            if (dado != -1) {
                System.out.println("Já existe o nome: " + nome + " no cadastro, informe outro");
                nome = scanner.nextLine();
                n[i] = nome;
            } else {
                n[i] = nome;
            }
        }
    }

    private static int buscarNomeRep(String[] n, String nomeBuscado) {
        int i, pos = -1;
        for (i = 0; i < n.length; i++) {
            if (nomeBuscado.equals(n[i])) {
                pos = i;
                break;
            }
        }
        return pos;
    }
     public static void exibir(String[] n) {
        int i;
        System.out.println("Abaixo segue a lista dos nomes: ");
        for (i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
      public static void ordenarNomeBS(String[] n) {
        int i, fim = n.length - 2, pos = 0;
        boolean troca;
        String aux;
        do {
            troca = false;
            for (i = 0; i <= fim; i++) {
                if (n[i].compareTo(n[i + 1])>0) {
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
}