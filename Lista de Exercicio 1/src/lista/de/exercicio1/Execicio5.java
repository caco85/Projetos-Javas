package lista.de.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class Execicio5 {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        double peso,altura,calcIMC;
        System.out.println("Digite seu peso em kg: ");
        peso = entrada.nextDouble();
        System.out.println("Digite sua altura em metros: ");
        altura = entrada.nextDouble();  
        calcIMC = peso /(altura * altura) ;
        System.out.println("Seu IMC é: " + calcIMC);  
    } 
}