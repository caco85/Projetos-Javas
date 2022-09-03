
package restaurante;

/**
 *
 * @author Renato Nunes
 */
public class Cliente extends Thread{
  private int codigoCli;
    private Prato pilha;
    private int totalConsumir;
 
    public Cliente(int codCli, Prato p, int totalConsumir) {
        codigoCli = codCli;
        pilha = p;
        this.totalConsumir = totalConsumir;
    }
 
    public void run() {
        for (int i = 0; i < totalConsumir; i++) {
            pilha.get(codigoCli);
        }
        System.out.println("Cliente #" + codigoCli + " concluido!");
    }
}
