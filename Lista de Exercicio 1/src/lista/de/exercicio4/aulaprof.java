/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.de.exercicio4;

import java.util.Scanner;

/**
 *
 * @author marim
 */
public class aulaprof {
    
    public static Scanner entrada = new Scanner(System.in);
 
    public static void main(String[] args) {
//        int num, soma = 0, maiorImpar = Integer.MIN_VALUE,
//                qtd = 0, qtd7 = 0;
//        double media;
//        System.out.print("Digite um número inteiro: ");
//        num = entrada.nextInt();
//        while (num >= 0) {
//            if (num != 0) {
//                qtd = qtd + 1;
//                soma = soma + num;
//            }
//            if (num % 2 != 0 && num > maiorImpar) {
//                maiorImpar = num;
//            }
//            if (num % 10 == 7) {
//                qtd7 = qtd7 + 1;
//            }
//            System.out.print("Digite um número inteiro " +
//                    "(negativo para finalizar): ");
//            num = entrada.nextInt();
//        }
//        System.out.println("O somatório dos números digitados é " +
//                soma);
//        if (maiorImpar != Integer.MIN_VALUE) {
//            System.out.println("O maior ímpar digitado foi " + 
//                    maiorImpar);
//        } else {
//            System.out.println("Nenhum ímpar digitado.");
//        }
//        if (qtd != 0) {
//            media = (double) soma / (double) qtd;
//            System.out.println("A média dos números digitados é " +
//                    media);
//        } else {
//            System.out.println("Nenhum número digitado.");
//        }
//        System.out.println(qtd7 + " números terminados em 7.");
                          
        
         //numeros primos
        int i, num, qtdDivisores = 0;
        System.out.print("Digite valor entre 1 e 1000: ");
        num = entrada.nextInt();
        while (num < 1 || num > 1000) {
            System.out.println("Valor inválido!");
            System.out.print("Digite valor entre 1 e 1000: ");
            num = entrada.nextInt();
        }
        for (i = 1; i <= num; i = i + 1) {
            if (num % i == 0) {
                qtdDivisores = qtdDivisores + 1;
            }
        }
        if (qtdDivisores == 2) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }
            //multiplos de 4
//        int i, num;
//        System.out.print("Digite valor entre 30 e 70: ");
//        num = entrada.nextInt();
//        while (num < 30 || num >70) {
//            System.out.println("Valor inválido!");
//            System.out.print("Digite valor entre 30 e 70: ");
//            num = entrada.nextInt();
//        }
//        for (i = 1; i <= num; i = i + 1) {
//            if (i % 4 == 0) {
//                System.out.println(i);
//            }
//        }
  
    }    
    
 
}
