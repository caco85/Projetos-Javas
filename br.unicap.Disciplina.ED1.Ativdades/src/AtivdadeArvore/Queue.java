package AtivdadeArvore;
/**
 *
 * @author Renato Nunes
 */
public class Queue<T> {

    private QueueNode<T> inicio;
    private QueueNode<T> fim;

    public boolean isEmpty() {
        if (this.inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(T obj) { // enfileirar, ou seja, inserir no final
        QueueNode<T> novo = new QueueNode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
        } else {
            this.fim.setProx(novo);
            this.fim = novo;
        }
    }

    public T deQueue() { // desenfileirar, ou seja, retirar o objeto do início da fila
        QueueNode<T> aux = this.inicio;
        if (this.inicio == this.fim) {
            this.inicio = null;
            this.fim = null;
        } else {
            this.inicio = this.inicio.getProx();
        }
        return aux.getInfo();
    }

    public T head() {
        return this.inicio.getInfo();
    }

    public boolean isFull() {
        return false;
    }
}
