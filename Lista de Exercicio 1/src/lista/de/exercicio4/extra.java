/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.de.exercicio4;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class extra {

    public static Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
//   //questão1
//        double peso, altura, imc;
//
//        System.out.println("Digite peso entre 25 a 635");
//        peso = scaner.nextDouble();
//        System.out.println("Digite altura  entre como ex 150 = 1,50");
//        altura = scaner.nextDouble();
//
//        while (peso < 25 || peso > 635 && altura < 0.55 || altura > 2.52) {
//            System.out.println("Vejo digitou um numero incorreto, repita");
//            System.out.println("Digite peso entre 25 a 635");
//            peso = scaner.nextDouble();
//            System.out.println("Digite altura  entre como ex 150 = 1,50");
//            altura = scaner.nextDouble();
//        }
//        imc = peso / (altura * altura);
//        if (imc < 16) {
//            System.out.println("Baixo peso muito grave: " + imc);
//        } else if (imc >= 16 && imc < 17) {
//            System.out.println("Baixo peso grave: " + imc);
//        } else if (imc >= 17 && imc < 18.50) {
//            System.out.println("Baixo peso: " + imc);
//        } else if (imc >= 18.50 && imc < 25) {
//            System.out.println("Peso normal: " + imc);
//        } else if (imc >= 25 && imc < 30) {
//            System.out.println("Sobreeso : " + imc);
//        } else if (imc >= 30 && imc < 35) {
//            System.out.println("Obesidade grau I  : " + imc);
//        } else if (imc >= 35 && imc < 40) {
//            System.out.println("Obesidade grau II  : " + imc);
//        } else {
//            System.out.println("Obesidade grau III " + imc);
//        }
 //questão 2
        int i, num;
        System.out.print("Digite um número inteiro: ");
        num = scaner.nextInt();
        while (num < 100 || num > 1000) {
            System.out.print("Numero Invalido" + "Digite o número inteiro "
                    + "novamente: ");
            num = scaner.nextInt();

        }
        System.out.println("Numero");
//        for ( i = 0; i <= num; i= 1+1) {
////            if (num % i == 0) {
////                System.out.println(i +"^"+num+"+");
////            }
//            
        
     //questão3
//        int num , num2, qtdM5 = 0, cont = 0, maiorImpar = 0;
//        double qtd3 = 0, qtd7 = 0;
//        do {
//            System.out.print("Digite um número inteiro: ");
//            num = scaner.nextInt();
//            cont = cont + 1;
//            num2 = num;
//            if (maiorImpar < num2) {
//                maiorImpar = num;
//            }
//            if (num % 10 == 3) {
//                qtd3 = qtd3 + 1;
//            } else if (num % 10 == 7) {
//                qtd7 = qtd7 + 1;
//            }
//            if (num != 0) {
//                if (num % 5 == 0) {
//                    qtdM5 = qtdM5 + 1;
//                }
//            }
//
//        } while (num >= 0);
//        qtd7 = qtd7 * 100 / cont;
//        qtd3 = qtd3 * 100 / cont;
//        System.out.println("Maior impar é: " + maiorImpar);
//        System.out.println("A porcentagem de numeros terminados em 3 " + qtd3 +"%");
//        System.out.println("A porcentagem de numeros terminados em 7 " + qtd7 +"%");
//        System.out.println("A quantidade de multiplos de 5 são: " + qtdM5);


//int tabuada = 5;  // tabuada do 5 
//     for(int x = 1; x<= 10; x++){
//   //  System.out.print("Tabuada do: " + tabuada + " ");
//     System.out.print(x + " x " + tabuada + " = ");
//     System.out.println(x * tabuada);   
//    }
//    
  
    }

}
