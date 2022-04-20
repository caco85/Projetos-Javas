package AtividadePadrões;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class CompraCliente {
    public static Scanner scanner = new Scanner(System.in);
    private  List<ItemVenda> itens = new ArrayList<>();

    private int calcularNumItens() {
        int result = 0;
        for (int i = 0; i < itens.size(); i++) {
            result = result + 1;
        }
        return result;
    }

    public boolean validarPequenasCompras() {
        return calcularNumItens() <= 30;
    }
}
