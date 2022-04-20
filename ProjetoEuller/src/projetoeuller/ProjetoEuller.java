package projetoeuller;

/**
 *
 * @author Renato Nunes
 */
public class ProjetoEuller {

    public static void main(String[] args) {
//        int i,somaQuadrado = 0,quadradoSoma = 0,diferenca = 0;
//        
//        for ( i = 0; i <= 100; i=i+1) {
//            somaQuadrado = somaQuadrado + (i*i);
//            quadradoSoma = quadradoSoma+i;            
//        }
//        System.out.println("quadrado da soma "+quadradoSoma);
//        quadradoSoma = (quadradoSoma*quadradoSoma);
//        System.out.println("quadrado da som apos o resultado"+quadradoSoma);
//        diferenca = quadradoSoma - somaQuadrado;
//        System.out.println("A diferença é: "+diferenca);
//        System.out.println("soma quadrado"+somaQuadrado);
        //questão 9
        int a = 0, b, c = 0;
        long soma = 0, produto = 0;
        for (int i = 1; i < 100000; i = i + 1) {

            a = i;
            b = a ;
            c = (a * a) + (b * b);
            soma = (a + b + c);
            if (soma == 1000) {
                produto = a * b * c;
                System.out.println("O produto é " + produto);
                break;

            }

        }

    }
    

    //questão 4
//    int i,div=0,menorDiv20 =0,num;
//        for (i = 1;  i<=500000000;i= i+1) {
//           // num = 2520;
//            if (buscarDivisores(i)) {
//                menorDiv20 = i;
//                break;
//            }
//           
//        }
//        System.out.println("Menor numero encontrado divisivel por 1 a 20 é: "+ menorDiv20);   
//        int i, a, b, multi, testePol, pol3d;
//        for (i = 100; i < 1000; i = i + 1) {
//            a = i;
//            b = i + 1;
//
//            multi = a * b;
//            pol3d = multi;
//            testePol = 0;
//            while (multi != 0) {
//                testePol = 10 * testePol + multi % 10;
//                multi = multi / 10;
//            }
//            if (pol3d == testePol) {
//                System.out.println("polindromo 3 digito:" + pol3d);
//            }
//
//        }
    private static boolean buscarDivisores(int numero) {
        for (int j = 1; j <= 20; j = j + 1) {
            if (numero % j != 0) {
                return false;
            }
        }
        return true;
    }

}
