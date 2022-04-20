package agendaLSEpack1.dados;

/**
 *
 * @author Renato Nunes
 */
public class LSEOrdenadaAgenda<T extends Comparable<T>> {

    private LSENode<T> inicio;
    private LSENode<T> fim;
    private int qtd;

    public boolean isEmpty() {  // está vazia??
        if (this.qtd == 0) {  // ou if (this.inicio == null)
            return true;
        } else {
            return false;
        }
    }

    public void inserirOrdenado(T obj) {
        LSENode<T> novo = new LSENode(obj);
        LSENode<T>  anterior = null, atual;
        if (this.isEmpty() == true) { // caso 1: lista vazia
            this.inicio = novo;
            this.fim = novo;
            this.qtd++;
        } else { //
            if (obj.compareTo(this.inicio.getInfo()) < 0) { // caso 2.1: inserção no início da lista
                novo.setProx(this.inicio);
                this.inicio = novo;
                this.qtd++;
            } else if (obj.compareTo(this.fim.getInfo()) > 0) { // caso 2.2: inserção no final da lista
                this.fim.setProx(novo);
                this.fim = novo;
                this.qtd++;
            } else { // caso 2.3: inserção no meio da lista
                atual = this.inicio;     //iniciar com o primeiro nó
                while (true) {
                    if (atual.getInfo().compareTo(obj) == 0) {
                        System.out.println("Valor repetido! Inserção não efetuada");
                        return;  // sair do método de inserção
                    } else if (atual.getInfo().compareTo(obj) > 0) {
                        anterior.setProx(novo);
                        novo.setProx(atual);
                        this.qtd++;
                        System.out.println("Inserção efetuada");
                        return;
                    } else {
                        anterior = atual;
                        atual = atual.getProx();
                    }
                }
            }
        }
    }

    public void remover(T obj) { // versão 1
        LSENode<T> aux, anterior, atual;
        if (this.isEmpty() == true) { // Caso 1: Lista vazia?
            System.out.println("Lista está vazia");
        } else if (this.inicio.getInfo().compareTo(obj) == 0) { // Caso 2.1: remoção do primeiro
            if (this.qtd == 1) { // a lista só tem um elemento
                this.inicio = null;
                this.fim = null;
            } else { // a lista tem mais de um elemento
                this.inicio = this.inicio.getProx();
            }
            this.qtd--;
            System.out.println("Remoção efetuada!");
        } else if (this.fim.getInfo().compareTo(obj) == 0) { // Caso 2.2: remoção do último
            aux = this.inicio;
            while (aux.getProx() != this.fim) { // chegar no penúltimo
                aux = aux.getProx();
            }
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
            System.out.println("Remoção efetuada!");
        } else { // remoção de um valor no meio da lista
            anterior = this.inicio;
            atual = anterior.getProx();
            while (atual != null) {
                if (atual.getInfo().compareTo(obj) == 0) {
                    anterior.setProx(atual.getProx());
                    this.qtd--;
                    System.out.println("Remoção efetuada!");
                    return;
                } else {
                    anterior = anterior.getProx();
                    atual = atual.getProx();
                }
            }
            System.out.println("Elemento não encontrado!");
        }
    }

    public void exibirTodosContatos() {
        LSENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }

    public LSENode<T> buscaSimples(T obj) {
        LSENode<T> aux = this.inicio;
        while (aux != null) {
            if (aux.getInfo().compareTo(obj) == 0) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }

    public void atualizarProduto(T obj) {
        LSENode<T> aux;
        aux = (LSENode<T>) obj;
        aux.setInfo(obj);
    }
}
