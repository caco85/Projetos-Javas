package exercicioLSECpack2.Dados;
/**
 * Considere uma lista simplesmente encadeada circular genérica. Implemente um método concatenar, na classe LSEC (lista simplesmente encadeada circular), que deverá fazer a concatenação de duas listas lineares simplesmente encadeadas circulares, de forma que L1 = L1 + L2, ou seja, ao final do método, todos os nós ficarão pertencendo a lista L1 e a lista L2 ficará vazia. A ordem dos nós na lista deverá permanecer a mesma.
 * 
 */
/**
 *
 * @author Renato Nunes
 */
public class LSEC<T extends Comparable<T>> {

    private LSENode1<T> inicio;
    private LSENode1<T> fim;
    private int qtd;

    public boolean isEmpty() {
        if (this.inicio == null) { // ou if (this.qtd == 0)
            return true;
        } else {
            return false;
        }
    }

    public void inserirNoFinal(T obj) {
        LSENode1<T> novo = new LSENode1(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd = 1;
            this.fim.setProx(this.inicio);
        } else {
            novo.setProx(this.fim);
            this.fim = novo;
            this.qtd++;
            this.fim.setProx(this.inicio);
        }
    }

    public void exibirTodos() {
        LSENode1<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia");
        } else {
            aux = this.inicio;
            do {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            } while (aux != this.inicio);
        }
    }

    public void removerNoFinal() {
        LSENode1<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia");
        } else if (this.qtd == 1) {
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
        } else {
            for (aux = this.inicio; aux.getProx() != this.fim; aux = aux.getProx()) {
            }
            this.fim = aux;
            this.fim.setProx(this.inicio);
            this.qtd--;
        }
    }

    private LSENode1<T> buscaSimples(T obj) { // busca sequencia simples
        LSENode1<T> aux = this.inicio;
        while (aux != null) {
            if (aux.getInfo().compareTo(obj) == 0) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }

    public void buscarAluno(T obj) {
        LSENode1<T> aux;
        aux = buscaSimples(obj);
        if (aux == null) {
            System.out.println("Aluno não encontrado");
        } else {
            System.out.println(aux.getInfo());
        }
    }

    public void alterar(T obj) {
        LSENode1<T> aux;
        aux = buscaSimples(obj);
        if (aux == null) {
            System.out.println("Aluno não encontrado");
        } else {
            aux.setInfo(obj);
            System.out.println("Alteração efetuada!");
        }
    }
    public void sair(){
        System.out.println("Você escolheu a opção sair,obrigado!");
    }
    public boolean compareLista(LSEC<T> listaB){
        if ( this.fim.equals(listaB)) {
            return true;
        }
        return false;
    }
    
     public LSEC<T> concatLista(LSEC<T> listaA,LSEC<T> listaB){
        LSEC<T> concLista = null;
        if (listaA.isEmpty() == true && listaB.isEmpty() == true) {
            System.out.println("ambas as listas estão  vazias");
        } else if (listaA.isEmpty() == true || listaB.isEmpty() == true){
            do {
            concLista=listaA;  
            } while (concLista != null);
        }else{
             concLista.concatLista(listaA, listaB);
        }
        return concLista;
    }
     
 
}
