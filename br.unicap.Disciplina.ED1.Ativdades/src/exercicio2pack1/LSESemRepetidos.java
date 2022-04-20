/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2pack1;

/**
 *
 * @author Renato Nunes
 */
public class LSESemRepetidos<T extends Comparable<T>> {

    private LSENode<T> inicio;
    private LSENode<T> fim;
    private int qtd;

    public boolean isEmpty() {  // está vazia??
        if (this.qtd == 0) {  // ou if (this.inicio == null)
            return true;
        } else {
            return false;
        }
    }

    public void inserirNoInicio(T obj) { // inserindo novo nó no início da lista
        LSENode<T> novo, aux;
        novo = new LSENode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd++;
        } else {
            aux = this.buscaSimples(obj);
            if (aux == null) {
                novo.setProx(this.inicio);
                this.inicio = novo;
                this.qtd++;
            } else {
                System.out.println("Valor repetido!");
            }
        }
    }

    public LSENode<T> buscaSimples(T obj) { // busca sequencia simples
        LSENode<T> aux = this.inicio;
        while (aux != null) {
            if (aux.getInfo().compareTo(obj) == 0) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }

    public void inserirNoFinal(T obj) {
        // Implementar inserir um novo nó no final da lista. Não aceitar valores repetidos.

    }

    public void removerNoInicio() {
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.inicio.getProx() == null) { // ou if (this.qtd == 1) 
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
        } else if (this.inicio.getProx() == null) { // ou if (this.qtd == 1) 
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
        } else { // lista tem mais de um nó
            for (cont = 1; cont <= this.qtd - 2; cont++) { // achar penultimo
                aux = aux.getProx();
            }
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
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
      public void exibirUm(T obj) { 
        LSENode<T> aux;
        aux = buscaSimples(obj);
        if (aux == null) {
            System.out.println("Objeto não encontrado");
        } else {
            System.out.println(aux.getInfo());
        }
    }

    public void alterar(T obj) {
        LSENode<T> aux;
        aux = buscaSimples(obj);
        if (aux == null) {
            System.out.println("Objeto não encontrado");
        } else {
            aux.setInfo(obj);
            System.out.println("Alteração efetuada!");
        }
    }

}
