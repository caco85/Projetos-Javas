
package exercicioLSECpack2.Dados;

/**
 *
 * @author Renato Nunes
 * 
 */
public class LSENode  <T extends Comparable <T>>{ // Esta classe não é pública. Ela tem visibilidade de pacote
    private LSENode<T> ant;
    private T info;
    private LSENode<T> prox;
    
    LSENode (T obj) {  
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
    void setAnt (LSENode<T> ant){
        this.ant = ant;
    }    
    LSENode<T> getAnt () {
        return this.ant;
    }    
}