package AtividadePadrões;

/**
 *
 * @author Renato Nunes
 */
public abstract class ItemVenda {
    private int ean;
    public abstract int retornaQtd();

    public int getEan() {
        return ean;
    }

    public void setEan(int ean) {
        this.ean = ean;
    }
       
}
