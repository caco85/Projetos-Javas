package projetoeuller;

/**
 *
 * @author Renato Nunes
 */
public class ProjetoEuller3 {

    public static void main(String[] args) {
        //quest 3
//        int i, j, maiorFatPrimo = 0, n = 0;
//        long numSet = 600851475143L;
//        for (i = 70; i <= 100000; i++) {
//            if (mExtraSelPrimos(i)) {
//                if (numSet % i == 0) {
//                    numSet = numSet / i;
//                    if (numSet > 0) {
//                        maiorFatPrimo = i;
//                        //System.out.println("Maior : " + maiorFatPrimo);
//                    }
//                }
//
//            }
//        }
//        System.out.println("Maior fatorial primo é: " + maiorFatPrimo);
        //quest7

        int k,posicaoPrimo = 0;
        for ( k = 2; k <=10001; k= k+1) {
             if(mExtraSelPrimos(k)){
                posicaoPrimo= posicaoPrimo+1;
            }
        }
        System.out.println("A posição primo do numero 10001 é: " + posicaoPrimo+"°");
        //quest10
//        int m;
//        long somaPrimos = 17;
//        for ( m = 10; m <2000000; m = m+1) {
//            if (m%2 !=0 && m%3!=0 && m%10 != 5 && m%7!=0) {
//                if(mExtraSelPrimos(m)){
//                    somaPrimos= somaPrimos+m;
//               }
//            }
// 
//        }
//         System.out.println("A Soma de todos os  primos em dois milhôes é: " + somaPrimos);
    }

    private static boolean mExtraSelPrimos(int numero) {
        for (int j = 2; j < numero / 2; j = j + 1) {
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }
}
