
package exercicioFormaGeometrica;

/**
 *
 * @author Renato Nunes
 */
public class extra {
    public static void main(String[] args) {
        double  raio = 3;
      
        area(raio);
        
        }

    public static void area(double raio) {
        double area,pi = 3.14;
        area = pi * (raio * raio);
        System.out.println("A area do Circulo é = " + area+"cm");
    }
}
