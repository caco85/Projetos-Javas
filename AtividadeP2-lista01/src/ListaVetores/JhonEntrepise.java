package ListaVetores;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class JhonEntrepise {
    private static String mes;
    public static Scanner scanner = new Scanner(System.in);
    public static void receberValor(double [] v){
       int i;
        for ( i = 0; i < v.length; i = i+1) {
            System.out.println("No mes de " + mesExt(i));
            v[i]= scanner.nextDouble();
            if (v[i]<0) {
                v[i]= 0;
            }
           
        }
        
    }
    public static void calcLucros(double [] v1,double [] v2,double [] v3){
        int i;
        for ( i = 0; i < v3.length; i++) {
            v3[i]= v1[i]-v2[i];
        }
    }
    public static void exibirValores(double [] v){
        int i;
        double total =0;
        for ( i = 0; i < v.length; i = i+1) {
            System.out.println("Valor no mês " +mesExt(i)+ " = " + v[i]);
           
            total = total + v[i];
            
        }
        System.out.println();
        System.out.println("O valor total foi = " + total); //questão 2   
        System.out.println("Media dos 12 Meses = " + total/12); //questão 3
        System.out.println();
    }
   public static String mesExt(int i) {
        switch (i) {
            case 0:
                mes = "Janeiro";
                break;
            case 1:
                mes = "Fevereiro";
                break;
            case 2:
                mes = "Março";
                break;
            case 3:
                mes = "Abril";
                break;
            case 4:
                mes = "Maio";
                break;
            case 5:
                mes = "Junho";
                break;
            case 6:
                mes = "Julho";
                break;
            case 7:
                mes = "Agosto";
                break;
            case 8:
                mes = "Setembro";
                break;
            case 9:
                mes = "Outubro";
                break;
            case 10:
                mes = "Novembro";
                break;
            case 11:
                mes = "Dezembro";
                break;
        }
        return mes;
    }
}
