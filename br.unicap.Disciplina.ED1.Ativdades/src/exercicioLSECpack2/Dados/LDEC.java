package exercicioLSECpack2.Dados;

/**
 *
 * @author Renato Nunes
 */
public class LDEC<T extends Comparable<T>> {

    private LDENode<T> inicio;
    private LDENode<T> fim;
    private int qtd;

    public boolean isEmpty() {
        if (this.inicio == null) { // ou if (this.qtd == 0)
            return true;
        } else {
            return false;
        }
    }

    public void inserirNoInicio(T obj) {
        LDENode<T> novo = new LDENode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd = 1;
            this.inicio.setAnt(this.fim);
            this.fim.setProx(this.inicio);
        } else {
            novo.setProx(this.inicio);
            this.inicio.setAnt(novo);
            this.inicio = novo;
            this.qtd++;
            this.inicio.setAnt(this.fim);
            this.fim.setProx(this.inicio);
        }
    }

    public LDEC<T> concatLista(LDEC<T> listaA, LDEC<T> listaB) {

        if (listaA.isEmpty() == true || listaB.isEmpty() == true) {
            System.out.println(" listas estão  vazias");
        } else {
            listaA.concatLista(listaA, listaB);
        }
        return listaA;
    }

    public LDEC<T> dividirLista(LDEC<T> listaA, LDEC<T> listaB) {

        if (listaA.isEmpty() == true || listaB.isEmpty() == true) {
            System.out.println(" listas estão  vazias");
            return null;
        } else {
            listaA.dividirLista(listaA, listaB);
        }
        return listaA;
    }

}
