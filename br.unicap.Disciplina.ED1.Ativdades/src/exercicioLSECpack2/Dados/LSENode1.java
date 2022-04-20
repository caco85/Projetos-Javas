package exercicioLSECpack2.Dados;

/**
 *
 * @author Renat Nunes
 */
class LSENode1<T> {

    private T info;
    private LSENode1<T> prox;

    LSENode1(T obj) { 
        this.info = obj;
    }

    void setInfo(T obj) {
        this.info = obj;
    }

    T getInfo() {
        return this.info;
    }

    void setProx(LSENode1<T> prox) {
        this.prox = prox;
    }

    LSENode1<T> getProx() {
        return this.prox;
    }
}
