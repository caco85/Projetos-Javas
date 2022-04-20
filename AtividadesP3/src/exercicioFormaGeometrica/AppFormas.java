package exercicioFormaGeometrica;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class AppFormas {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double lado = 5, raio = 5;
        FormaGeometrica fg = new Circulo(raio);
        fg.area(); 
        System.out.println("");
        fg.comprimento();
        System.out.println("");
        
        FormaGeometrica fgQuad = new Quadrado(lado);
        fgQuad.area();
        System.out.println("");
        fgQuad.comprimento();
        

    }
}
