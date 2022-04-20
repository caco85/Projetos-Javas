package agendaLSEpack1.dados;

import agendaLSEpack2.model.Contato;
import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class Agenda<T extends Comparable<T>> {

    private LSENode<T> inicio;
    private LSENode<T> fim;
    private int qtd;

    Scanner scanner = new Scanner(System.in);
    LSEOrdenadaAgenda<Contato> lista = new LSEOrdenadaAgenda();
    Contato c;
    String nome, email;
    int telefone;

    public boolean isEmpty() {  // está vazia??
        if (this.qtd == 0) {  // ou if (this.inicio == null)
            return true;
        } else {
            return false;
        }
    }

    public void cadastar() {
        System.out.println("Digite o nome: ");
        nome = scanner.nextLine();
        c = new Contato(nome);
        System.out.println("Digite o email: ");
        email = scanner.nextLine();
        c.setEmail(email);
        System.out.println("Digite o telefone");
        telefone = scanner.nextInt();
        c.setTelefone(telefone);
        lista.inserirOrdenado(c);
    }

    public void remover() {
        LSENode aux;
        System.out.println("Digite  o nome do Contato que deseja remover: ");
        nome = scanner.nextLine();
        c = new Contato(nome);
        aux = lista.buscaSimples(c);
        if (aux != null) {
            lista.remover(c);
        } else {
            System.out.println("Contato não localizado");
        }

    }

    public void exibir() {
        lista.exibirTodosContatos();
    }

    public void exibirUm() {
        LSENode aux;
        System.out.println("Digite  o nome do Contato que deseja remover: ");
        nome = scanner.nextLine();
        c = new Contato(nome);
        aux = lista.buscaSimples(c);
        if (aux == null) {
            System.out.println("Contato não encontrado");
        } else {
            System.out.println(aux.getInfo());
        }
    }

    public void alterar() {
        LSENode aux;
        int opcSub;
        System.out.println("Digite  o nome do Contato que deseja remover: ");
        nome = scanner.nextLine();
        c = new Contato(nome);
        aux = lista.buscaSimples(c);

        if (aux != null) {
            System.out.println("Digite a opção desejada 1- para alterar email e telefone "
                    + "2 apenas email 3 apenas telefone: ");
            opcSub = scanner.nextInt();
            switch (opcSub) {
                case 1:
                    System.out.println("Digite o novo email! ");
                    email = scanner.nextLine();
                    c.setEmail(email);
                    System.out.println("Digite o novo Telefone! ");
                    c.setTelefone(telefone);
                    lista.atualizarProduto(c);
                    break;
                case 2:
                    System.out.println("Digite o novo email! ");
                    email = scanner.nextLine();
                    c.setEmail(email);

                    lista.atualizarProduto(c);
                    break;
                case 3:
                    System.out.println("Digite o novo Telefone! ");
                    c.setTelefone(telefone);
                    lista.atualizarProduto(c);
                    break;
                default:
                    System.out.println("VocÊ escolheu uma opção invalida,voltou pra o menu principal:2");
            }
        } else {
            System.out.println("Contato não localizado");
        }
    }

    public void copiaAgenda() {

        LSENode<T> aux, novo;
        aux = this.inicio;
        while (aux != null) {
            aux = aux.getProx();
            novo = new LSENode(aux);
            if (this.isEmpty() == true) {
                System.out.println("Não foi possivel copiar devido a lista esta vazia.");
            } else {
                novo.setProx(this.inicio);
                this.inicio = novo;
            }
            this.qtd++;
        }

    }

    public void sair() {
        System.out.println("Voce escolheu a opção sair, obrigado!");
    }

}
