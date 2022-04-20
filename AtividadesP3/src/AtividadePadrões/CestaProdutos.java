package AtividadePadrões;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Renato Nunes
 */
public class CestaProdutos extends ItemVenda {

    private List<Produto> itens = new ArrayList<Produto>();

    @Override
    public int retornaQtd() {
        int result = 0;
        for (int i = 0; i < itens.size(); i++) {
            result = result + 1;
        }
        return result;
    }

}
