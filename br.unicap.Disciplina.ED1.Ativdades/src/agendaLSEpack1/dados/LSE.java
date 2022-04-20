/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaLSEpack1.dados;

/**
 *
 * @author Renat
 */

public class LSE <T> {
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
        LSENode<T> novo;
        novo = new LSENode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
        }
        else {
            novo.setProx (this.inicio);
            this.inicio = novo;
        }
        this.qtd++;
    }
    
    public void inserirNoFinal (T obj) {
        // inserir um novo nó no final da lista, inserir depois do último
        LSENode<T> novo;
        novo = new LSENode(obj);       
        if (this.isEmpty() == true) { // a lista está vazia
            this.inicio = novo;
            this.fim = novo;
        }
        else { // a lista não está vazia
            this.fim.setProx (novo); // ou ant.setProx (novo)
            this.fim = novo;         // ERRO: ant = novo;
        }
        this.qtd++;
    }
    
    public void removerNoInicio () {
        if (this.isEmpty () == true) {
            System.out.println("Lista vazia!"); 
        }
        else if (this.inicio.getProx() == null) { 
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
        }
        else {
            this.inicio = this.inicio.getProx();
            this.qtd--;           
        }
    }
//       public void removerNoFinal () {
//        if (this.isEmpty () == true) {
//            System.out.println("Lista vazia!"); 
//        }
//        else if (this.fim.getProx() == null) {
//            this.inicio = null;
//            this.fim = null;
//            this.qtd = 0;
//        }
//        else {
//            this.fim = this.fim.getProx();
//            this.qtd--;           
//        }
//    }
     public void removerNoFinal () {
        int cont;
        LSENode<T> aux = this.inicio;
        if (this.isEmpty () == true) {
            System.out.println("Lista vazia!"); 
        }
        else if (this.inicio.getProx() == null) { // ou if (this.qtd == 1) 
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
        }
        else { // lista tem mais de um nó
            for (cont = 1; cont <= this.qtd - 2; cont++) { // achar penultimo
                aux = aux.getProx();
            }
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
        }
    }
   
    
    public void exibirTodos () {
        LSENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }
    private T buscarValor(T obj){
        LSENode<T> aux;
        aux = this.inicio;
            while (aux != null) {
                if (aux.equals(obj)){
                      aux = aux.getProx();
                      System.out.println("Encontrado!");
                      break;
                }          
            }
            if (aux != obj) {
                aux = null;   
        }
        return (T) aux;
    }
    
    public void atualizarNoLista(T objAntigo ,T objNovo){
           LSENode<T> aux;
           aux = (LSENode<T>) buscarValor(objAntigo);
           
           if(aux == null){
               System.out.println("O numero não foi encontrado na lista");
           }else{
               aux.setProx((LSENode<T>) objNovo);
               System.out.println("Encontrado e foi atualizado com sucesso!");
           }
    }
    

}
