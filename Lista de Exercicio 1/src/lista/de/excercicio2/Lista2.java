package lista.de.excercicio2;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class Lista2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //exc 1
//        int idade1,idade2;
//        System.out.print("Digite a primeira idade: ");
//        idade1 = scanner.nextInt();
//        System.out.print("Digite a segunda idade: ");
//        idade2 = scanner.nextInt();
//        if (idade1 < idade2 ) {
//            System.out.println(idade1 + "\n" + idade2);             
//         }else{
//             System.out.println(idade2 + "\n" + idade1);   
//         }

        /**
         * //exc 2 ok double a,b,x; System.out.print("Digite o valor de a: "); a
         * = scanner.nextInt(); System.out.print("Digite o valor de b: "); b =
         * scanner.nextInt();
         *
         * if (a>0) { x= (-b/a)*-1; System.out.println("o valor de x é: " + x);
         * } else { System.out.println("Valor inválido para o coeficiente a :
         * "); }
         */
//      //ex3 ok
//        int numero, d, resto;
//        System.out.print("Digite os numeros: ");
//        numero = scanner.nextInt();
//        d = 7;
//        resto = numero % d;
//
//        if (resto == 0) {
//            System.out.println(" É multiplo de 7");
//
//        } else {
//            System.out.println(" Não é multiplo de 7");
//        }
//         
        //ex4 ok
//        int numero, d;
//        System.out.print("Digite os numeros: ");
//        numero = scanner.nextInt();
//        d = 8;
//        if (numero % d == 0) {
//            System.out.println(" É multiplo de 8");
//
//        } else {
//            System.out.println(" Não é multiplo de 8");
//        }
        //ex5 ok
        double numero;
        int novnum;
        System.out.print("Digite um numero real : ");
        numero = scanner.nextDouble();
        novnum = (int) Math.round(numero);

        if (novnum != numero) {
            if (novnum > numero) {
                System.out.println("Houve alteração arredondado para cima. "
                        + "Numero Convertido é: " + novnum);

            } else {
                System.out.println("Houve alteração arredondado para baixo. "
                        + "Numero Convertido é: " + novnum);
            }
        } else {
            System.out.println("Não houve alteração");
        }

    }

}
