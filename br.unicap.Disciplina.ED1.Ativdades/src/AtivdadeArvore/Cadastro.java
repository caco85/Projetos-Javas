package AtivdadeArvore;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class Cadastro {

    Tree<Produto> arv = new Tree<>();
    Tree<Produto> arv2 = new Tree<>();

    public void cadastrar(Produto p) {
        if (arv.find(p) != null) {
            System.out.println("Valor repetido não foi inserido");
        } else {
            arv.insert(p);
            arv2.emOrdem();
        }
    }

    public void exibirOrdem() {
        arv2.passeioPorNivel();
    }

    public void procurar(Produto p) {
        arv.find(p);
    }

    public void atualizarPreço(Produto p) {
        Scanner scanner = new Scanner(System.in);
        double preco;
        if (arv.find(p) != null) {
            System.out.println("Digite o novo preço");
            preco = scanner.nextDouble();
            p.setPreco(preco);
        } else {
            System.out.println("Produto não localizado");
        }

    }

    public void atualizarQtdEstoque(Produto p) {

        Scanner scanner = new Scanner(System.in);
        int qtd;
        if (arv.find(p) != null) {
            System.out.println("Digite o novo preço");
            qtd = scanner.nextInt();
            p.setPreco(qtd);
        } else {
            System.out.println("Produto não localizado");
        }
    }

    public void exibir() {
        arv.passeioPorNivel();
    }
}
