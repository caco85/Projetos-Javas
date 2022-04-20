package lista.de.exercicio4;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class Lista4 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i, num, num2, cont = 0, soma = 0, pares = 0, impar = 0,percPar = 0;
        // ex 1 ok
        System.out.print("Digite o primeiro numero: ");
        num = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextInt();
        if (num < num2) {
            for (i = num; i <= num2; i = i + 1) {
                System.out.println(i);
            }
        } else if (num2 < num) {
            for (i = num; i >= num2; i = i - 1) {
                System.out.println(i);
            }
        } else {
            System.out.println("Você digitou os numeros iguais ou invalidos.\n"
                    + num + "\n" + num2);
        }
        //ex 2 ok
        do {

            System.out.print("Digite um numero: ");
            num = scanner.nextInt();
            cont++;
            if (cont > 1) {
                soma = soma + num;
            } else if (num < 0) {
                soma = soma - (num * -1);
            } else {
                soma = num;
            }
            if (num % 2 == 0) {
                pares = pares + 1;
            } else {
                num2 = num;
                if (impar < num2) {
                    impar = num;
                }
            }
           
            percPar = pares * 100 / cont;
            if (num < 0) {
                System.out.print("A quantidade digitada foi:" + cont + "\n");
                System.out.print("A soma total é:" + soma + "\n");
                System.out.print("O percentual de Pares são:" + percPar + "%" + "\n");
                System.out.print("o Maior numero impar é:" + impar + "\n");
            }
        } while (num >= 0);
        //ex3
        double b = 0, exp = 0, resultado = 1;
        System.out.print("Digite a base");
        b = scanner.nextDouble();
        System.out.print("Digite o Expoente");
        exp = scanner.nextDouble();
        if (b != 0) {
            for (i = 0; i < exp; i = i + 1) {
                resultado *= b;
            }
            System.out.println(resultado);
        } else {
            System.out.println("A base não pode ser 0");
        }
        //ex 4 ok
        System.out.print("Digite um numero: ");
        num = scanner.nextInt();
        if (num != 0) {
            for (i = 1; i <= 10; i = i + 1) {
                System.out.print("Tabuada de: " + num + ":" + num + "x" + i + "= ");
                System.out.println(i * num);
            }
        } else {
            System.out.println("A base não pode ser 0");
        }
        //ex 5
        double n1 = 0, n2 = 0;
        double media = 0;
        int qtdAlunos = 3; //executado essa pro compilador ir mais rapido
        //int qtdAlunos = 60;   obs requerimento do exercio 
        int j = 0;
        while (j < qtdAlunos) {
            System.out.print("Digite a primeira nota: ");
            n1 = scanner.nextInt();
            System.out.print("Digite a segunda nota: ");
            n2 = scanner.nextInt();
            media = (n1 + n2) / 2;
            if (media >= 7) {
                System.out.println("Aprovado por média : " + "Média" + media);
            } else if (media >= 5 && media < 7) {
                System.out.println("Vai pra final : " + "Média: " + media);
            } else {
                System.out.println("Reprovado por media : " + "Média: " + media);
            }
            j = j + 1;
        }
    }

}
