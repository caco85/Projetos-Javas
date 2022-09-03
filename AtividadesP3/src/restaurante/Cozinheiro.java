package restaurante;

/**
 *
 * @author Renato Nunes
 */
public class Cozinheiro extends Thread{
    private int codigoCozinheiro;
    private Prato pilha;
    private int producaoTotal;
 
    public Cozinheiro(int id, Prato p, int producaoTotal) {
        codigoCozinheiro = id;
        pilha = p;
        this.producaoTotal = producaoTotal;
    }
 
    public void run() {
        for (int i = 0; i < producaoTotal; i++) {
            pilha.set(codigoCozinheiro, i);
        }
        System.out.println("Cozinheiro #" + codigoCozinheiro + " concluido!");
    }
    
}
