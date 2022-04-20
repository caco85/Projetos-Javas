package Aula0303;

/**
 *
 * @author Renato
 */
public class Circulo {
    private double x;
    private double y;
    private double raio;
    
    public Circulo(double x,double y ,double r){
        this.x = x;
        this.y = y;
        this.raio = r;
    }
    
    private double getX() {
        return x;
    }
    private void setX(double x) {
        this.x = x;
    }
    private double getY() {
        return y;
    }
    
    private void setY(double y) {
        this.y = y;
    }

    private double getRaio() {
        return raio;
    }
    private void setRaio(double raio) {
        this.raio = raio;
    }
    public double calcularArea(){
        return Math.PI*(raio*raio) ;
    }
    public void calcularCircunferencia(){
        System.out.println("Circuferencia" + 2 * Math.PI * raio);
    }
    public void distanciaEntre(Circulo c){
        double soma = Math.pow(c.x - this.x,2)+ Math.pow(c.y - this.y, 2);
        double distancia = Math.sqrt(soma);
        System.out.println("Distancia: " + distancia);
    }
}
