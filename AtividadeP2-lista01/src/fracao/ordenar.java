package fracao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class ordenar {

    public static Scanner in = new Scanner(System.in);
    public static Random aleatorios = new Random(30);

    public static void main(String[] args) {
        boolean ordenado = false;
        int i;
        int[] array = new int[30];

        // executa o loop de iteração para cada posição do array
        for (i = 0; i < array.length; i++) {
          
            array[i] = aleatorios.nextInt();
            System.out.println("Valor da posição [" + i + "]:" + array[i]);
        }
        ordenado = verificarOrdenação(array, ordenado);
        verifica(ordenado);
        array = trocaIndice(array);
        ordenado = verificarOrdenação(array, ordenado);
        verifica(ordenado);
        

    }

    public static boolean verificarOrdenação(int[] v, boolean ord) {
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] >= v[i + 1]) {
                ord = false;
                break;
            }
        }
        return ord;
    }

    public static void verifica(boolean b) {
        if (b == true) {
            System.out.println("O array está ordenado");
        } else {
            System.out.println("O array não está ordendado");
        }
    }

    public static int[] trocaIndice(int[] v) {
        int i;
        for (i = 0; i < 10; i++) {
            v[i+ 3] = aleatorios.nextInt();
        }
        return v;
    }

}
