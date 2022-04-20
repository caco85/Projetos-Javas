/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtividadeString;

import java.util.*;

/**
 *
 * @author Renato Nunes
 */
public class AtividadeString {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int cont = 0, tam = 0,tam2 = 0, i, contL = 0, contN = 0, contV = 0, contO = 0;
        char car, c, digitoVerificador;
        String frase, frase2, conta, nome,cpf;

        //ex1 
//        System.out.println("Digite uma frase qualquer: ");
//        frase = scanner.nextLine();       
//        tam = frase.length();
//        for (i = 0; i < tam; i++) {
//            car = frase.charAt(i);
//            car = Character.toLowerCase(car);
//            if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u') {
//                cont++;
//            }
//        }
//        System.out.println("Esta frase possui " + cont + " vogais.");
        //ex 2
//        System.out.println("Digite uma frase qualquer: ");
//        frase = scanner.nextLine();
//        System.out.println("Digite um Caracteres qualquer: ");
//        c = scanner.next().charAt(0);
//        c =Character.toLowerCase(c);
//        tam = frase.length();
//        for (i = 0; i < tam; i++) {
//            car = frase.charAt(i);
//            car = Character.toLowerCase(car);
//            if (car == c) {
//               cont++; 
//            }
//        }
//        c =Character.toUpperCase(c);
//        if (cont >0 ) {
//             System.out.println("O caracteres: " + c + " apareceu "+cont+" vezes na frase digitada");
//        }else {
//             System.out.println("O caracteres: " + c + "  não aparece  na frase digitada");
//        }
        //ex 3 obs poderia fazer com isDigit e isLetter,mas não sabia se poderia usalas.
//        System.out.println("Digite uma frase qualquer: ");
//        frase = scanner.nextLine();
//        tam = frase.length();
//        for (i = 0; i < tam; i++) {
//            car = frase.charAt(i);
//            car = Character.toLowerCase(car);
//
//            if (car == ' ') {
//                contV++;
//            } else if (car == '0' || car == '1' || car == '2' || car == '3' || car == '4' || car == '5' || car == '6' || car == '7' || car == '8' || car == '9') {
//                contN++;
//            } else if (car == 'a' || car == 'b' || car == 'c' || car == 'd' || car == 'e' || car == 'f' || car == 'g' || car == 'h' || car == 'i'
//                    || car == 'j' || car == 'k' || car == 'l' || car == 'm' || car == 'n' || car == 'o' || car == 'p' || car == 'q' || car == 'r'
//                    || car == 's' || car == 't' || car == 'u' || car == 'v' || car == 'w' || car == 'x' || car == 'y' || car == 'z') {
//                contL++;
//            } else {
//                contO++;
//            }
//
//        }
//        System.out.println("A quantidade de letras são: " + contL + "\n a quantidade de numeros são: " + contN + "\n "
//                + "a quantidade de espaços em branco são: " + contV + " \n a quantidade de simbolos são: " + contO);
        //ex 4 
//        System.out.println("Digite uma frase para ser criptografada:");
//        frase = scanner.nextLine();
//        tam = frase.length();
//        char[] vet = new char[tam];
//        for (i = 0; i < tam; i++) {
//            car = frase.charAt(i);
//            car = Character.toLowerCase(car);
//            switch (car) {
//                case 'a':
//                    vet[i] = '@';
//                    break;
//                case 'e':
//                    vet[i] = '$';
//                    break;
//                case 'i':
//                    vet[i] = '&';
//                    break;
//                case 'o':
//                    vet[i] = '*';
//                    break;
//                case 'u':
//                    vet[i] = '#';
//                    break;
//                default:
//                    vet[i] = car;
//            }
//        }
//        frase2 = new String(vet);
//        System.out.println("Frase criptografada: " + frase2);
        //ex 5
//        boolean flag = true;
//        System.out.println("Digite um nome");
//        nome = scanner.nextLine();
//        tam = nome.length();
//        char[] vet = new char[tam];
//        for (i = 0; i < tam; i++) {
//            car = nome.charAt(i);
//            car = Chacar);racter.toLowerCase(
//            if (car == '0' || car == '1' || car == '2' || car == '3' || car == '4' || car == '5' || car == '6' || car == '7' || car == '8' || car == '9') {
//                System.out.println("O nome esta invalido");
//                flag = false;
//            } else {
//                vet[i] = car;
//            }
//        }
//        if (flag == true) {
//            frase = new String(vet);
//            System.out.println("O nome é:  " + frase);
//        }

        //ex6
    
//        System.out.println("Digite o cpf");
//        cpf = scanner.next();
//        tam = cpf.length();
//        String cpfTodo = "",cpfAux = "",cpfAux2= "",cpfAux3= "",cpfAux4= "";
//        char[] vet = new char[tam];
//        boolean flag = true;
//        if(tam != 11){
//            System.out.println("Você digitou a quantidade de numeros errado do cpf: ");
//        }else{
//            for (i = 0; i < tam; i++) {
//                car= cpf.charAt(i);
//                if (car == '0' || car == '1' || car == '2' || car == '3' || car == '4' || car == '5' || car == '6' || car == '7' || car == '8' || car == '9') {
//                    vet[i]= car;
//                }else{
//                    System.out.println("O cpf precisa ser só numeros!");
//                    flag = false;
//                    break; // não sei pq esse break não sai do for     
//                }
//                if (i >= 0 && i<3) {
//                    cpfAux = cpfAux + vet[i];
//                }else if( i >= 3 && i<6){
//                    cpfAux2 = cpfAux2 + vet[i];
//                }else if( i >= 6 && i<9){
//                    cpfAux3 = cpfAux3 + vet[i];
//                }else{
//                    cpfAux4 = cpfAux4 + vet[i];
//                }
// 
//            } 
//            if (flag == true) {
//               System.out.println(cpfTodo.concat(cpfAux+"."+cpfAux2+"."+cpfAux3+"-"+cpfAux4)); 
//            }
//         
//        }
       
        //ex7
//        System.out.println("Digite uma frase");
//        frase= scanner.nextLine();
//        tam = frase.length();
//        System.out.println("Digite uma frase");
//        frase2 = scanner.nextLine();
//        tam2 = frase2.length();
//        
//        if (tam == tam2) {
//            System.out.println("As frases são do mesmo tamanho");
//        }else if(tam > tam2){
//            System.out.println("A primeira fase é maior que a segunda");
//        }else {
//            System.out.println("A primeira fase é menor que a segunda");
//        }
        //ex8
        System.out.print("Informe o número da conta: ");
        conta = scanner.nextLine();
        System.out.println("Informe o dígito verificador da conta: ");
        digitoVerificador = scanner.next().charAt(0);
        tam = conta.length();
        if (tam != 6) {
            System.out.println("Número de conta inválido. Informe exatamente 6 caracteres.");
        } else if (verificaConta(conta) == false) {
            System.out.println("Número de conta inválido. Informar apenas dígitos numéricos.");
        } else { // conta é válida
            if (verificaDigito(conta, digitoVerificador) == false) {
                System.out.println("Digito verificador inválido");
            } else {
                System.out.println("Dígito verificador válido");
            }
        }
    }

    //ex 8 funções
    public static boolean verificaDigito(String c, char dig) {
        int tam = c.length(), i, resto;
        int[] vet = new int[tam];
        double soma = 0;
        for (i = 0; i < tam; i++) {
            vet[i] = c.charAt(i) - '0';
        }
        for (i = 0; i < tam; i++) {
            soma = soma + vet[i] * Math.pow(2, i);
        }
        resto = (int) soma % 11;
        if (resto >= 0 && resto <= 9) {
            if (dig - '0' == resto) {
                return true;
            } else {
                return false;
            }
        } else {
            if (dig == 'x' || dig == 'X') {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean verificaConta(String c) {
        int tam = c.length(), i;
        boolean ehValida = true;
        for (i = 0; i < tam; i++) {
            if (Character.isDigit(c.charAt(i)) == false) {
                ehValida = false;
                break;
            }
        }
        return ehValida;
    }

}
