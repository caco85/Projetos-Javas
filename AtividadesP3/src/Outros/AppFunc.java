/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class AppFunc {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws java.lang.Exception {
        String nome;
        double salario;
        int opcMenu;
        
            Funcionario f1 = new Gerente("Maria", 5000);
            Funcionario f2 = new Programador("Ana", 3000);
            do {
                Menu();
                System.out.println("Digite a opção desejada"); 
                opcMenu =scanner.nextInt();
                switch(opcMenu){
                    case 1:
                         f1.aumentaSalario();
                         System.out.println("Valor acrescentando com sucesso! ");
                        break;
                    case 2:
                         f2.aumentaSalario();
                          System.out.println("Valor acrescentando com sucesso! ");
                        break;
                    case 3:
                        System.out.println("Salario: " + f1.getSalario());
                        System.out.println("");
                        break;   
                    case 4:
                        System.out.println("Salario: " + f2.getSalario());
                        System.out.println("");
                        break;
                    case 0:
                        System.out.println("Você escolheu a opção sair, obrigado!: ");
                         System.out.println("");
                        break;  
                    default:
                        System.out.println("Você digitou alguma errado! "); 
                        System.out.println("");
                }              
            } while (opcMenu !=0); 
 
    }
    public static void Menu(){
        System.out.println("1 - Aumentar Salario Gerente: ");
        System.out.println("2 - Aumentar Salario Progamador: ");
        System.out.println("3 - Exibir os dados Gerente: ");
        System.out.println("4 - Exibir os dados Progamador: ");
        System.out.println("0 - Para sair:  ");
    }
}


