package exercicioFormaGeometrica;

/**
 *
 * @author Renato Nunes
 */
public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }
    
    
    
    @Override
    public void area() {
        double area;
        area = 3.14 * (getRaio()* getRaio());
        System.out.println("A area do Circulo é :" + area);
    }

    @Override
    public void comprimento() {
      double comp;
      comp = 2 * 3.14 * getRaio();
      System.out.println("O comprimento do Circulo é :" + comp);
    }
    
}
