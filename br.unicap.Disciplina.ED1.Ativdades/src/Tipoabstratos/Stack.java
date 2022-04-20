package Tipoabstratos;

/**
 *
 * @author Renato Nunes
 */
public class Stack <T> {
      private StackNode<T> topo;
    
    public boolean isEmpty () {
        if (this.topo == null) {
            return true;
        }
        else {
            return false;
        }       
    }
    
    public boolean isFull () {
        return false;
    }
    
    public void push (T obj) {  // empilhar, ou seja, inserir no topo
        StackNode<T> novo = new StackNode(obj);
        if (this.isEmpty() == true) {
            this.topo = novo;
        }
        else {
            novo.setProx(this.topo);
            this.topo = novo;     
        }
    }
    
    public T pop () { // desempilhar, ou seja, remover e retornar o objeto do topo da lista
        StackNode<T> aux = this.topo;
        this.topo = this.topo.getProx();
        return aux.getInfo();
    }   
    
    public T top () { // retorna o valor que está no topo da pilha
        return this.topo.getInfo();
    }
    
}
