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
class LSENode <T> {
       private T info;
    private LSENode<T> prox;
    
    LSENode (T obj) {  // construtor
        this.info = obj;
    }    
    void setInfo (T obj){
        this.info = obj;
    }     
    
    T getInfo () {
        return this.info;
    }
    void setProx (LSENode<T> prox){
        this.prox = prox;
    }    
    LSENode<T> getProx () {
        return this.prox;
    }    
}
