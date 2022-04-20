
package fracao;

import java.util.Scanner;

/**
 *
 * @author Renat
 */
public class AtividadeStrings {
    public static Scanner entrada = new Scanner (System.in);  
    public static void main(String[] args) {
        String frase;
        int qtd;
        System.out.println("Digite uma frase");
        frase = entrada.nextLine();
        System.out.println("Digete a quantidade de repetidos da frase");
        qtd = entrada.nextInt();
   
        System.out.println(" A frase replicada é : ");
        replica(frase, qtd);
        System.out.println("");
        System.out.println("A frase sem  acentuação é: ");
    	desacentuar(frase);
        System.out.println("");
        System.out.println("A frase alianha a direia é");
        alinharDireita(frase, qtd);
        
        System.out.println("A frase alianha a esquerda é");
        alinharEsquerda(frase, qtd);
    }
    public static void replica(String s , int qtdTermo){
        int i;
        for ( i = 0; i < qtdTermo; i= i+1) {        
            System.out.print(s);
        }
    }
    public static void alinharDireita(String s ,int qtdTermo){
        int i;
        String nova = " ";
        for (i = 0; i < qtdTermo; i = i+1) {
            nova = nova + " ";
        }
        System.out.println(nova.concat(s));
    }
    public static void alinharEsquerda(String s ,int qtdTermo){
        int i;
        String nova = " ";
        for (i = 0; i < qtdTermo; i = i+1) {
            nova = nova + " ";
        }
        System.out.println(s.concat(nova));
    }
    public static void desacentuar(String s){
        s = s.replaceAll("[ãáâà]" , "a");
        s = s.replaceAll("[ÂÁÃÀ]" , "A");
        s = s.replaceAll("[éèê]" , "e");
        s= s.replaceAll("[ÉÊÈ]" , "E");
        s= s.replaceAll("[ÍÌÎ]" , "I");
        s= s.replaceAll("[íìî]" , "i");
        s= s.replaceAll("[óòõô]" , "o");
        s= s.replaceAll("[ÓÒÕÔ]" , "O");
        s= s.replaceAll("[ÚÙÛ]" , "U");
        s= s.replaceAll("[úùû]" , "u");
        s= s.replace("[Ç]" , "C");
        s= s.replace("[ç]" , "c");
        System.out.println(s);
        
    }
}
