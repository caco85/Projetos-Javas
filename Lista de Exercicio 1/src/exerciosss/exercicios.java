/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciosss;

import java.util.Scanner;

public class exercicios {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
//lista 4 
         
        // ex 1 ok
        int i, j, n1, n2;
        System.out.print("Digite o primeiro numero: ");
        n1 = entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        n2 = entrada.nextInt();
        if (n1 < n2) {
            for (i = n1; i <= n2; i = i + 1) {
                System.out.println(i);
            }
        } else if (n2 < n1) {
            for (j = n1; j >= n2; j = j - 1) {
                System.out.println(j);
            }
        } else {
            System.out.println("Você digitou os numeros iguais ou invalidos.\n"
                    + n1 + "\n" + n2);
        }
        //ex 2 ok
        int num, soma = 0, maiorImpar = Integer.MIN_VALUE,
                qtdPositivos = 0, pares = 0,contador =0;
        double porcPares;
        System.out.print("Digite um número inteiro: ");
        num = entrada.nextInt();
        while (num >= 0) {
            qtdPositivos = qtdPositivos + 1;
            contador = contador + 1;
            if (num != 0) {              
                soma = soma + num;
            }
            if (num % 2 != 0 && num > maiorImpar) {
                maiorImpar = num;
            }else if (num % 2 == 0){
               pares = pares +1;
            }else{
            }
            System.out.print("Digite um número inteiro ");
            num = entrada.nextInt();
        }
        if(num <0){
            contador = contador + 1;
        }
        porcPares = pares *100 /contador;
        System.out.println("O soma dos números digitados é "
                + soma);
        System.out.println("A quantidade de numeros não negativo são: "
                + qtdPositivos);
        System.out.println("p percentual de numeros pares:  "
                + porcPares);
        if (maiorImpar != Integer.MIN_VALUE) {
            System.out.println("O maior ímpar digitado foi "
                    + maiorImpar);
        } else {
            System.out.println("Nenhum ímpar digitado.");
        }
       
        //ex3
        double b, exp, x = 1,m;
        System.out.print("Digite a base");
        b = entrada.nextDouble();
        System.out.print("Digite o Expoente");
        exp = entrada.nextDouble();
        if (b != 0) {
            for (m = 0; m < exp; m = m + 1) {
                x *= b;
            }
            System.out.println(x);
        } else {
            System.out.println("A base não pode ser 0");
        }
        //ex 4 ok
        int numTabuada;
        System.out.print("Digite um numero de 1 a 10: ");
        numTabuada = entrada.nextInt();

        for (int n = 1; n <= 10; n = n + 1) {
            System.out.print("Tabuada do: " + numTabuada + " ");
            System.out.print(n + " x " + numTabuada + " = ");
            System.out.println(n * numTabuada);
        }
        //ex 5
        double nota1 = 0, nota2 = 0, media = 0;
        int qtdAlunos = 6, k = 0;
        while (k < qtdAlunos) {
            System.out.print("Digite a primeira nota: ");
            nota1 = entrada.nextInt();
            System.out.print("Digite a segunda nota: ");
            nota2 = entrada.nextInt();
            media = (nota1 + nota2) / 2;
            if (media >= 7) {
                System.out.println("Aprovado por média : " + "Média" + media);
            } else if (media >= 4 && media < 7) {
                System.out.println("Vai pra final : " + "Média: " + media);
            } else {
                System.out.println("Reprovado por media : " + "Média: " + media);
            }
            k = k + 1;
        }
    }
}
//lista 1 
//        //ex 1 //joguem daqui 
//        int t,c,tamanho;
//        System.out.print("Digite a  largura: ");
//        t = entrada.nextInt();
//        System.out.print("Digite o comprimento: ");
//        c = entrada.nextInt();
//        tamanho = t * c;
//        System.out.println("O tamanho : " + tamanho); 
//        //ate aqui no main do ideone...lembre de tirar os comentarios kkkk
//        //ex 2
//        int qtdCavalo,qtdFerraduras;
//        System.out.print("Digite a quantidade de cavalos: ");
//        qtdCavalo = entrada.nextInt();
//        qtdFerraduras = qtdCavalo * 4;
//        System.out.println("A quantidade de ferraduras para troca são: " + qtdFerraduras);  
//      //ex 3
//        double n1,n2,media;
//        System.out.print("Digite a Primeira nota: ");
//        n1 = entrada.nextDouble();
//        System.out.print("Digite a Segunda nota: ");
//        n2 = entrada.nextDouble();
//        media = ((n1 *2)+(n2 *3))/(2+3);
//        System.out.println("A media é: " + media);
//      //ex 4 eu usei uma variavel string coisa q ele não monstrou ainda sem nem se ele vai aceita procurem na net alguma outra forma
//      
//        //ex 5
//        double p,a,cIMC;
//        System.out.println("Digite seu peso: ");
//        p = entrada.nextDouble();
//        System.out.println("Digite sua altura: ");
//        a = entrada.nextDouble();  
//        cIMC = p /(a * a) ;
//        System.out.println("Seu IMC é: " + cIMC);  
//lista 2
//        //exc 1
//        int primeiraIdade, segundaIdade;
//        System.out.print("Digite a primeira idade: ");
//        primeiraIdade = entrada.nextInt();
//        System.out.print("Digite a segunda idade: ");
//        segundaIdade = entrada.nextInt();
//        if (primeiraIdade < segundaIdade) {
//            System.out.println(primeiraIdade + "\n" + segundaIdade);
//        } else {
//            System.out.println(segundaIdade + "\n" + primeiraIdade);
//        }
//        
//          //exc 2 o codigo pega mais num sei se a logica ta certa 
//        double a,b,x;
//        System.out.print("Digite o valor de a: ");
//        a = entrada.nextInt();
//        System.out.print("Digite o valor de b: ");
//        b  = entrada.nextInt();
//
//        if (a > 0) {
//            x = (-b / a) * -1;
//            System.out.println("o valor de x é: " + x);
//        } else {
//            System.out.println("Valor inválido para o coeficiente a ");
//        }
//
////      //ex3 
//        int numero;
//        System.out.print("Digite os numeros: ");
//        numero = entrada.nextInt();
//
//        if (numero % 7  == 0) {
//            System.out.println("Multiplo de 7");
//
//        } else {
//            System.out.println("Não é multiplo de 7");
//        }
//
//        //ex4 
//        int n1;
//        System.out.print("Digite um numero: ");
//        n1 = entrada.nextInt();
//       
//        if (n1 % 8 == 0) {
//            System.out.println("Multiplo de 8");
//
//        } else {
//            System.out.println("Não é multiplo de 8");
//        }
//        //ex5 
//        double n;
//        int novoNum;
//        System.out.print("Digite um numero: ");
//        n = entrada.nextDouble();
//        novoNum = (int) n;
//        if (novoNum != numero) {
//            System.out.println("Houve alteração. "
//              + novoNum);
//
//        } else {
//            System.out.println("Não houve alteração");
//        }
// lista 3
//        //exc 1 
//        int primeiraIdade, segundaIdade, terceiraIdade;
//        System.out.print("Digite a primeira idade: ");
//        primeiraIdade = entrada.nextInt();
//        System.out.print("Digite a segunda idade: ");
//        segundaIdade = entrada.nextInt();
//        System.out.print("Digite a terceira idade: ");
//        terceiraIdade = entrada.nextInt();
//
//        if (primeiraIdade < segundaIdade && segundaIdade < terceiraIdade) {
//            System.out.println(primeiraIdade + "\n" + segundaIdade + "\n" + terceiraIdade);
//        } else if (primeiraIdade < terceiraIdade && terceiraIdade < segundaIdade) {
//            System.out.println(primeiraIdade + "\n" + terceiraIdade + "\n" + segundaIdade);
//
//        } else if (segundaIdade < primeiraIdade && primeiraIdade < terceiraIdade) {
//            System.out.println(segundaIdade + "\n" + primeiraIdade + "\n" + terceiraIdade);
//        } else if (segundaIdade < primeiraIdade && segundaIdade < terceiraIdade) {
//            System.out.println(segundaIdade + "\n" + terceiraIdade + "\n" + primeiraIdade);
//        } else if (terceiraIdade < primeiraIdade && primeiraIdade < segundaIdade) {
//            System.out.println(terceiraIdade + "\n" + primeiraIdade + "\n" + segundaIdade);
//        } else if (terceiraIdade < segundaIdade && segundaIdade < primeiraIdade) {
//            System.out.println(terceiraIdade + "\n" + segundaIdade + "\n" + primeiraIdade);
//        } else {
//            System.out.println("Você digitou uma idade errada: ");
//        }
//
//        //exc 2 ok
//        double a, b, x;
//        System.out.print("Digite o valor de a: ");
//        a = entrada.nextInt();
//        System.out.print("Digite o valor de b: ");
//        b = entrada.nextInt();
//
//        if (a > 0) {
//            x = (-b / a) * -1;
//            System.out.println("o valor de x é: " + x);
//        } else {
//            System.out.println("Valor de a invalido : ");
//        }
//
//        //ex 3 ok
//        double salario, aliquota, parcelaDeduzir, descMes, salarioDesc, INSS, INSS2;
//        INSS = 0.11;
//        
//
//        System.out.print("Digite seu Salário: ");
//        salario = entrada.nextDouble();
//        if (salario > 1903.98) {
//            if (salario <= 2826.65) {
//                salarioDesc = salario - salario * INSS;
//                aliquota = 0.075;
//                parcelaDeduzir = 142.80;
//                descMes = (salarioDesc * aliquota) - parcelaDeduzir;
//                System.out.println("Desconto mensal do IRPF: " + descMes);
//
//            } else if (salario > 2826.65 && salario <= 3751.05) {
//                if (salario < 2919.73) {
//                    salarioDesc = salario - salario * INSS;
//                } else {
//                    salarioDesc = salario - salario * INSS;
//                }
//                aliquota = 0.15;
//                parcelaDeduzir = 354.80;
//                descMes = (salarioDesc * aliquota) - parcelaDeduzir;
//                System.out.println("Desconto mensal do IRPF: " + descMes);
//            } else if (salario > 3751.05 && salario <= 4664.68) {
//                salarioDesc = salario - salario * INSS;
//                aliquota = 0.225;
//                parcelaDeduzir = 636.13;
//                descMes = (salarioDesc * aliquota) - parcelaDeduzir;
//                System.out.println("Desconto mensal do IRPF: " + descMes);
//            } else {
//                salarioDesc = salario - salario * INSS;
//                aliquota = 0.275;
//                parcelaDeduzir = 869.36;
//                descMes = (salarioDesc * aliquota) - parcelaDeduzir;
//                System.out.println("Desconto mensal do IRPF: " + descMes);
//            }
//        } else {
//            System.out.println("Isento: ");
//        }
//
//        //ex4 
//        double s, descFolha, Inss;
//        System.out.println("Digite seu Salário: ");
//        s = entrada.nextDouble();
//        if (s < 1751.82) {
//            Inss = 0.08;
//            descFolha = s * Inss;
//            System.out.println("Desconto mensal do INSS é : " + descFolha);
//
//        } else if (s > 1751.82 && s < 2919.73) {
//            Inss = 0.09;
//            descFolha = s * Inss;
//            System.out.println("Desconto mensal do INSS é : " + descFolha);
//        } else {
//            Inss = 0.11;
//            descFolha = s * Inss;
//            System.out.println("Desconto mensal do INSS é : " + descFolha);
//        }
//
//        //ex 5
//        int hora;
//        System.out.print("Digite a hora em formato militar ex:1800: ");
//        hora = entrada.nextInt();
//        if (hora >= 0000 && hora < 1200) {
//            System.out.println("Bom dia!!! : ");
//        } else if (hora >= 1200 && hora < 1801) {
//            System.out.println("Boa tarde!!! : ");
//        } else if (hora >= 1800 && hora <= 2359) {
//            System.out.println("Boa noite!!! : ");
//        } else {
//            System.out.println("Hora invalida : ");
//        }
