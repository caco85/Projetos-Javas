package AtivdadeArvore;

/**
 *
 * @author Renato Nunes
 */
class QueueNode <T> {
     private T info;
    private QueueNode<T> prox;
    
    QueueNode (T obj) {
        this.info = obj;
    }
    
    void setInfo (T obj){
        this.info = obj;
    }    
    
    T getInfo () {
        return this.info;
    }
    
    void setProx (QueueNode prox){
        this.prox = prox;
    }    
    
    QueueNode getProx () {
        return this.prox;
    }
 

}
