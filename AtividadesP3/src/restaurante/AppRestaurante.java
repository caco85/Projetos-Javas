package restaurante;

/**
 *
 * @author Renato Nunes
 */
public class AppRestaurante {

    public static void main(String[] args) {
        Prato pratoCompartilhado = new Prato();
        Cozinheiro cozinheiro1 = new Cozinheiro(1, pratoCompartilhado, 5);
        Cozinheiro cozinheiro2 = new Cozinheiro(2, pratoCompartilhado, 5);
        Cliente cli1 = new Cliente(1, pratoCompartilhado, 2);
        Cliente cli2 = new Cliente(2, pratoCompartilhado, 8);

        cozinheiro1.start();
        cli1.start();
        cozinheiro2.start();
        cli2.start();
    }
}
