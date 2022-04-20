package Tipoabstratos;

/**
 *
 * @author Renato Nunes
 */
class StackNode <T>{
     private T info;
    private StackNode<T> prox;
    
    StackNode (T obj) {  // construtor
        this.info = obj;
    }    
    void setInfo (T obj){
        this.info = obj;
    }    
    T getInfo () {
        return this.info;
    }
    void setProx (StackNode prox){
        this.prox = prox;
    }    
    StackNode getProx () {
        return this.prox;
    }

    
}
