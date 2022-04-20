package exercicioLDE2pack3.Dados;

import exercicioLDE2pack2.Model.Tarefa;
import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class cadastroTarefas<T extends Comparable<T>> {

    private LDENode<T> inicio;
    private LDENode<T> fim;
    private int qtd;
    Scanner scanner = new Scanner(System.in);
    LDE<Tarefa> lista = new LDE();

    int pri;
    String desc;
    Tarefa t;

    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserir() {
        LDENode aux;
        System.out.println("Digite a Descrição da Tarefa! ");
        desc = scanner.nextLine();
        t = new Tarefa(desc);
        System.out.println("Digite a Descrição a prioridade! ! ");
        pri = scanner.nextInt();

        while (pri < 1 || pri > 10) {
            System.out.println("Você digitou errado! ");
            System.out.println("Digite a Descrição a prioridade! ! ");
            pri = scanner.nextInt();
        }
        aux = lista.buscaSimples(t);
        if (aux != null) {
            System.out.println("Não cadastrado pois ja existe uma tarefa com esta descrição");
            qtd--;
        } else {
            lista.inserir(t);
            qtd++;
        }

    }

    public void exibir() {
        lista.exibirTodos();
    }

}
