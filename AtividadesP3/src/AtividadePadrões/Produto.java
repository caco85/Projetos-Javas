package AtividadePadrões;

/**
 *
 * @author Renato Nunes
 */
public class Produto extends ItemVenda{

    @Override
    public int retornaQtd() {
        int result = getEan() * getEan();
        return result;
    }
    
}
