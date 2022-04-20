
package lista.de.excercicio3;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class Lista3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       //exc 1 ok
//        int ida,ida2,ida3;
//        System.out.print("Digite a primeira idade: ");
//        ida = scanner.nextInt();
//        System.out.print("Digite a segunda idade: ");
//        ida2 = scanner.nextInt();
//        System.out.print("Digite a terceira idade: ");
//        ida3 = scanner.nextInt();
//        if (ida != ida2 && ida != ida3 && ida2 != ida3) {
//            if (ida < ida2 && ida2 < ida3) {
//                System.out.println(ida + "\n" + ida2 + "\n" + ida3);             
//            }else if(ida < ida3 && ida3 < ida2){
//               System.out.println(ida + "\n" + ida3 + "\n" + ida2);
//
//            }else if (ida2 < ida && ida < ida3) {
//                 System.out.println(ida2 + "\n" + ida + "\n" + ida3);             
//            }else if (ida2 < ida && ida2 < ida3) {
//                 System.out.println(ida2 + "\n" + ida3 + "\n" + ida); 
//            }else{
//                if (ida3 < ida && ida <ida2) {
//                    System.out.println(ida3 + "\n" + ida + "\n" + ida2); 
//                } else {
//                    System.out.println(ida3 + "\n" + ida2 + "\n" + ida); 
//                }  
//            }
//       }else{
//            System.out.println("Digite 3 idades diferentes: ");
//       }
      
//      //exc 2 ok
//        double a,b,x;
//        System.out.print("Digite o valor de a: ");
//        a = scanner.nextInt();
//        System.out.print("Digite o valor de b: ");
//         b = scanner.nextInt();
//
//        if (a>0) {
//            x= (-b/a)*-1;
//            System.out.println("o valor de x é: " + x);
//        } else {
//            System.out.println("Valor inválido para o coeficiente a : ");
//        }
     
    //ex 3 ok
//    double salario, aliquota, parcDed, descMes, salarioDesc, INSS, INSS2;
//        INSS = 0.09;
//        INSS2 = 0.11;
//
//        System.out.print("Digite seu Salário: ");
//        salario = scanner.nextDouble();
//        if (salario > 1903.98) {
//            if (salario <= 2826.65) {
//                salarioDesc = salario - salario * INSS;
//                aliquota = 0.075;
//                parcDed = 142.80;
//                descMes = (salarioDesc * aliquota) - parcDed;
//                System.out.println("Desconto mensal do IRPF: " + descMes);
//
//            } else if (salario > 2826.65 && salario <= 3751.05) {
//                if (salario < 2919.73) {
//                    salarioDesc = salario - salario * INSS;
//                } else {
//                    salarioDesc = salario - salario * INSS2;
//                }
//                aliquota = 0.15;
//                parcDed = 354.80;
//                descMes = (salarioDesc * aliquota) - parcDed;
//                System.out.println("Desconto mensal do IRPF: " + descMes);
//            } else if (salario > 3751.05 && salario <= 4664.68) {
//                salarioDesc = salario - salario * INSS2;
//                aliquota = 0.225;
//                parcDed = 636.13;
//                descMes = (salarioDesc * aliquota) - parcDed;
//                System.out.println("Desconto mensal do IRPF: " + descMes);
//            } else {
//                salarioDesc = salario - salario * INSS2;
//                aliquota = 0.275;
//                parcDed = 869.36;
//                descMes = (salarioDesc * aliquota) - parcDed;
//                System.out.println("Desconto mensal do IRPF: " + descMes);
//            }
//        } else {
//            System.out.println("Isento: ");
//        }
//    
   
    //ex4 ok
//        double salario, descFolha, INSS;
//        System.out.println("Digite seu Salário: ");
//        salario = scanner.nextDouble();
//        if (salario < 1751.82) {
//            INSS = 0.08;
//            descFolha = salario * INSS;
//            System.out.println("Desconto mensal do INSS é : " + descFolha);
//
//        } else if (salario > 1751.82 && salario < 2919.73) {
//            INSS = 0.09;
//            descFolha = salario * INSS;
//            System.out.println("Desconto mensal do INSS é : " + descFolha);
//        } else {
//            INSS = 0.11;
//            descFolha = salario * INSS;
//            System.out.println("Desconto mensal do INSS é : " + descFolha);
//        }

    //ex 5
        int hora;
        System.out.print("Digite a hora em formato militar ex:1800: ");
        hora = scanner.nextInt();
        if (hora >= 0000 && hora < 1200) {
            System.out.println("Bom dia!!! : ");
        } else if (hora >= 1200 && hora < 1801) {
            System.out.println("Boa tarde!!! : ");
        } else if (hora >= 1800 && hora <= 2359) {
            System.out.println("Boa noite!!! : ");
        } else {
            System.out.println("Hora invalida : ");
        }
        
  
    }
}
