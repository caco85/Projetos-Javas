/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2pack1;

/**
 *
 * @author Renat
 */
public class LSEOrdenada<T extends Comparable<T>> { // lista genérica

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

    // Este código precisa ser estudado e alterado para melhorar sua eficiência 
    // no caso se ser solicitada a remoção de um valor que não está na lista
    public void remover(T obj) { // versão 1
        LSENode<T> aux, anterior, atual;
        if (this.isEmpty() == true) { // Caso 1: Lista vazia?
            System.out.println("Lista está vazia");
        } else if (this.inicio.getInfo().compareTo(obj) == 0) { // Caso 2.1: remoção do primeiro
            if (this.qtd == 1) { // a lista só tem um elemento
                this.inicio = null;
                this.fim = null;
            } else { // a lista tem mais de um elemento
                this.inicio = this.inicio.getProx();
            }
            this.qtd--;
            System.out.println("Remoção efetuada!");
        } else if (this.fim.getInfo().compareTo(obj) == 0) { // Caso 2.2: remoção do último
            aux = this.inicio;
            while (aux.getProx() != this.fim) { // chegar no penúltimo
                aux = aux.getProx();
            }
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
            System.out.println("Remoção efetuada!");
        } else { // remoção de um valor no meio da lista
            anterior = this.inicio;
            atual = anterior.getProx();
            while (atual != null) {
                if (atual.getInfo().compareTo(obj) == 0) {
                    anterior.setProx(atual.getProx());
                    this.qtd--;
                    System.out.println("Remoção efetuada!");
                    return;
                } else {
                    anterior = anterior.getProx();
                    atual = atual.getProx();
                }
            }
            System.out.println("Elemento não encontrado!");
        }
    }

    public void inserirNoFinal(T obj) {
        LSENode<T> novo = new LSENode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd = 1;
            this.fim.setProx(this.inicio);
        } else {
            novo.setProx(this.fim);
            this.fim = novo;
            this.qtd++;
            this.fim.setProx(this.inicio);
        }
    }

    public void inserirOrdenado(T obj) {
        LSENode<T> novo = new LSENode(obj);
        LSENode<T> anterior, atual;
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd = 0;
//            this.inicio.setAnt(this.fim);
            this.fim.setProx(this.inicio);
        } else if (obj.compareTo(this.inicio.getInfo()) == 0) {
            System.out.println("Valor repetido!não houve inserção!.");
        } else { 
            if (obj.compareTo(this.inicio.getInfo()) < 0) { 
                novo.setProx(this.inicio);
                this.inicio = novo;
                this.qtd++;
//                this.inicio.setAnt(this.fim);
                this.fim.setProx(this.inicio);
            } else if (obj.compareTo(this.fim.getInfo()) > 0) { 
                this.fim.setProx(novo);
                this.fim = novo;
                this.qtd++;
//                this.inicio.setAnt(this.fim);
                this.fim.setProx(this.inicio);
            } else { 
                atual = this.inicio.getProx();  
                while (true) {
                    if (atual.getInfo().compareTo(obj) == 0) {
                        System.out.println("Valor repetido!não houve inserção! ");
                        return; 
                    } else if (atual.getInfo().compareTo(obj) < 0) {
//                        anterior = atual.getAnt();
//                        anterior.setProx(novo);
//                        novo.setAnt(anterior);
                        novo.setProx(atual);
//                        atual.setAnt(novo);
                        this.qtd++;
                        System.out.println("Inserção cadastrada com sucesso!");
                        break;
                    } else {
                        atual = atual.getProx();
                    }
                }
            }
        }
    }
}
