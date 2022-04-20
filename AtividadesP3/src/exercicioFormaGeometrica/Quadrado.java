package exercicioFormaGeometrica;

/**
 *
 * @author Renato Nunes
 */
public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void area() {
        double area;
        area = getLado() * getLado();
        System.out.println("Area do quadrado é: "+ area);
       
    }

    @Override
    public void comprimento() {
        double comp;
        comp = getLado() *4;
         System.out.println("O comprimento do quadrado é: "+ comp);
    }

    @Override
    public String toString() {
        return "Quadrado{" + "lado=" + lado + '}';
    }
}
