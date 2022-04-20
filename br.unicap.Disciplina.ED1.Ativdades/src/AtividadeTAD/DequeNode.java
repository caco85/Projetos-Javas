package AtividadeTAD;

/**
 *
 * @author Renato Nunes
 */
class DequeNode<T> {

    private T info;
    private DequeNode<T> prox;

    DequeNode(T obj) {
        this.info = obj;
    }

    void setInfo(T obj) {
        this.info = obj;
    }

    T getInfo() {
        return this.info;
    }

    void setProx(DequeNode prox) {
        this.prox = prox;
    }

    DequeNode getProx() {
        return this.prox;
    }

}
