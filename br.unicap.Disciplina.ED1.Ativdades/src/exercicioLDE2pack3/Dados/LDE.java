package exercicioLDE2pack3.Dados;

/**
 *
 * @author Renato Nunes
 */
public class LDE  <T extends Comparable <T>> { // lista genérica

    private LDENode<T> inicio;
    private LDENode<T> fim;
    private int qtd;

    public boolean isEmpty() {  // está vazia??
        if (this.qtd == 0) {  // ou if (this.inicio == null)
            return true;
        } else {
            return false;
        }
    }
    
    public void inserir (T obj) {
        LDENode<T> novo = new LDENode (obj); 
        LDENode<T> aux, proximo;
        if (this.isEmpty() == true) { // Caso 1: lista vazia
            this.inicio = novo;
            this.fim = novo;
            this.qtd = 1;
        }
        else { // Caso 2: lista não vazia
            if (obj.compareTo(this.inicio.getInfo()) > 0) { // Caso 2.1: inserção no início
                novo.setProx(this.inicio);
                this.inicio.setAnt(novo);
                this.inicio = novo;
                this.qtd++;
            }
            else if (obj.compareTo(this.fim.getInfo()) <= 0) { // Caso 2.2: inserção no final
                this.fim.setProx (novo);
                novo.setAnt(this.fim);
                this.fim = novo;
                this.qtd++;
            }
            else {  // Caso 2.3: inserção no meio
                aux = this.fim;
                while (aux.getInfo().compareTo(obj) < 0) {
                    aux = aux.getAnt();
                }
                proximo = aux.getProx();
                aux.setProx(novo);
                novo.setAnt(aux);
                novo.setProx(proximo);
                proximo.setAnt(novo);
                this.qtd++;                
            }            
        }      
    }
    
    public void exibirTodos () {
        LDENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }
    public LDENode<T> buscaSimples(T obj) {
        LDENode<T> aux = this.inicio;
        while (aux != null) {
            if (aux.getInfo().compareTo(obj) == 0) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }
}

