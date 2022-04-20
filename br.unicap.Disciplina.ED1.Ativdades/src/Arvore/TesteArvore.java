package Arvore;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class TesteArvore {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tree<Pessoa> abb = new Tree();
        Pessoa p;
        String nome;

        p = new Pessoa("Maria");
        abb.insert(p);
        p = new Pessoa("Pedro");
        abb.insert(p);
        p = new Pessoa("Luis");
        abb.insert(p);
        abb.emOrdem();
        System.out.println();
        abb.passeioPorNivel();
        
        
//        abb.menorEsqRec();
//        System.out.println("");
//        abb.menornoEsq()

        System.out.print("Informe o nome da pessoa procurada: ");
        nome = in.nextLine();
        p = new Pessoa(nome);
        if (abb.find(p) == null) {
            System.out.println("Não achou");
        } else {
            p.setIdade(10);
            System.out.println(p);
        }

    }

}
