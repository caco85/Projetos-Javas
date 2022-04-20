package AtividadeTAD;

/**
 *
 * @author Renato Nunes
 */
public class Deque<T> {

    private DequeNode<T> inicio;
    private DequeNode<T> fim;

    public boolean isEmpty() {
        if (this.inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        return false;
    }

    public void push(T obj) {
        DequeNode<T> novo = new DequeNode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
        } else {
            novo.setProx(this.inicio);
            this.inicio = novo;
        }
    }

    public T pop() {
        DequeNode<T> aux = this.inicio;
        this.inicio = this.inicio.getProx();
        return aux.getInfo();
    }

    public void inject(T obj) {
        DequeNode<T> novo = new DequeNode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
        } else {
            this.fim.setProx(novo);
            this.fim = novo;
        }
    }

    public T eject() {
        DequeNode<T> aux = this.fim;
        this.fim = this.fim.getProx();
        return aux.getInfo();
    }
    public T topo () { 
        return this.inicio.getInfo();
    }
    public T footer(){
        return this.fim.getInfo();
    }
    
}
