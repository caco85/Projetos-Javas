package exercicioLSECpack2.Dados;

import agendaLSEpack1.dados.*;

/**
 *
 * @author Renato Nunes
 */
class LDENode <T extends Comparable <T>>{ // Esta classe não é pública. Ela tem visibilidade de pacote
    private LDENode<T> ant;
    private T info;
    private LDENode<T> prox;
    
    LDENode (T obj) {  // construtor
        this.info = obj;
    }    
    void setInfo (T obj){
        this.info = obj;
    }    
    T getInfo () {
        return this.info;
    }
    void setProx (LDENode<T> prox){
        this.prox = prox;
    }    
    LDENode<T> getProx () {
        return this.prox;
    }    
    void setAnt (LDENode<T> ant){
        this.ant = ant;
    }    
    LDENode<T> getAnt () {
        return this.ant;
    }    
}
