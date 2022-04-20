
package Aula0303;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class AplicacaoCirculo {
    public static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2,3,6);
        double area;
        int x,y,r;
        area = c1.calcularArea();
        System.out.println("Area: "+ area);
        c1.calcularCircunferencia();
        
        System.out.println("Informe o novo circulo");
        System.out.println("Informe o novo x");
        x = scanner.nextInt();
        System.out.println("Informe o novo y");
        y = scanner.nextInt();
        System.out.println("Informe o novo r");
        r = scanner.nextInt();
        Circulo c2= new Circulo(x,y,r);
        area = c2.calcularArea();
        System.out.println("Area: "+ area);
        c2.calcularCircunferencia();
        c1.distanciaEntre(c2);
        
        
        
                
    }
    
}
