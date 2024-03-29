package ProdutorConsumidor;

/**
*
* @author Renato Nunes
*/
public class Produtor extends Thread {
    private int idProdutor;
    private Buffer pilha;
    private int producaoTotal;
 
    public Produtor(int id, Buffer p, int producaoTotal) {
        idProdutor = id;
        pilha = p;
        this.producaoTotal = producaoTotal;
    }
 
    public void run() {
        for (int i = 0; i < producaoTotal; i++) {
            pilha.set(idProdutor, i);
        }
        System.out.println("Produtor #" + idProdutor + " concluido!");
    }
}