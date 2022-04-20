package exercicio3LSE1pack3.tipoDados;

import java.util.Scanner;

/**
 *
 * @author Renato Nunes
 */
public class LSESemRepetidos<T extends Comparable<T>> {

    private LSENode<T> inicio;
    private LSENode<T> fim;
    private int qtd;

    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirNoInicio(T obj) {
        LSENode<T> novo, aux;
        novo = new LSENode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd++;
        } else {
            novo.setProx(this.inicio);
            this.inicio = novo;
            this.qtd++;
        }
    }

    public void inserirNoFinal(T obj) {
        LSENode<T> novo, aux;
        novo = new LSENode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd++;
        } else {
            novo.setProx(this.fim);
            this.fim = novo;
            this.qtd++;
        }
    }

    private LSENode<T> buscaSimples(T obj) {
        LSENode<T> aux = this.inicio;
        while (aux != null) {
            if (aux.getInfo().compareTo(obj) == 0) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }

    public LSENode<T> buscaProduto(T obj) {
        LSENode<T> aux = this.inicio;
        while (aux != null) {
            if (aux.getInfo().compareTo(obj) == 0) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }

    public void buscarProdutoSimples(T obj) {
        LSENode<T> aux;
        aux = buscaSimples(obj);
        if (aux == null) {
            System.out.println("Objeto não encontrado");
        } else {
            System.out.println(aux.getInfo());
        }

    }

    public void exibirTodos() {
        LSENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }

    public void atualizarProduto(T obj) {
        LSENode<T> aux;
        aux = (LSENode<T>) obj;
        aux.setInfo(obj);       
    }

    public void removerNoInicio() {
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.inicio.getProx() == null) {
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
        } else {
            this.inicio = this.inicio.getProx();
            this.qtd--;
        }
    }

    public void removerNoFinal() {
        int cont;
        LSENode<T> aux = this.inicio;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.inicio.getProx() == null) {

            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
        } else {
            for (cont = 1; cont <= this.qtd - 2; cont++) {
                aux = aux.getProx();
            }
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
        }
    }

    public void removerProdutoNoh(T obj) {
        LSENode aux;
        aux = (LSENode) obj;
        aux.setProx(null);
        this.qtd--;
        System.out.println("Produto removido! ");
    }

    public LSENode<T> buscar(T obj) {
        LSENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            if (aux.equals(obj)) {
                aux = aux.getProx();
                System.out.println("Encontrado!");
                break;
            }
        }
        if (aux != obj) {
            aux = null;
            System.out.println("O produto não foi encontrado!");
        }
        return aux;
    }

}
