package exercicioLDECpack3.Dados;

/**
 *
 * @author Renato Nunes
 */
public class LDECOrder<T extends Comparable<T>> {

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

    public void inserirOrdenado(T obj) {
        LDENode<T> novo = new LDENode(obj);
        LDENode<T> aux, anterior;
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd = 0;
            this.inicio.setAnt(this.fim);
            this.fim.setProx(this.inicio);
        } else if (obj.compareTo(this.inicio.getInfo()) == 0) {
            System.out.println("Valor repetido. Inserção não realizada.");
        } else if (obj.compareTo(this.inicio.getInfo()) < 0) { // inserçãono início
            novo.setProx(this.inicio);
            this.inicio.setAnt(novo);
            this.inicio = novo;
            this.qtd++;
            this.inicio.setAnt(this.fim);
            this.fim.setProx(this.inicio);
        } else if (obj.compareTo(this.fim.getInfo()) == 0) {
            System.out.println("Valor repetido. Inserção não realizada.");
        } else if (obj.compareTo(this.fim.getInfo()) > 0) { // inserção no final
            this.fim.setProx(novo);
            novo.setAnt(this.fim);
            this.fim = novo;
            this.qtd++;
            this.inicio.setAnt(this.fim);
            this.fim.setProx(this.inicio);
        } else {
            aux = this.inicio.getProx();
            while (true) {
                if (obj.compareTo(aux.getInfo()) == 0) {
                    System.out.println("Valor repetido. Inserção não realizada.");
                    return; // break;
                } else if (obj.compareTo(aux.getInfo()) < 0) {
                    anterior = aux.getAnt();
                    anterior.setProx(novo);
                    novo.setAnt(anterior);
                    novo.setProx(aux);
                    aux.setAnt(novo);
                    this.qtd++;
                    return; // break;
                } else {
                    aux = aux.getProx();
                }
            }
        }
    }

    private LDENode<T> buscaSimples(T obj) {
        LDENode<T> aux = this.inicio;
        while (aux != null) {
            if (aux.getInfo().compareTo(obj) == 0) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }

    public void buscarUm(T obj) {
        LDENode<T> aux;
        aux = buscaSimples(obj);
        if (aux != null) {
            aux = aux.getProx();
        } else {
            System.out.println("Termo não encontrado!");
        }

    }

    public void exibirTodos() {
        LDENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }

    public void exibirTodosMesmaLetra() {
        LDENode<T> aux;
        aux = this.inicio;
        System.out.print(aux.getInfo() + " ");
        aux = aux.getProx();
        System.out.println();
    }

    public void removerUM(T obj) {
        LDENode<T> aux;
        aux = (LDENode) obj;
        aux.setProx(null);
        this.qtd--;
        System.out.println("Produto removido! ");
    }

    public int remover(T obj) {
        int cont = 0;
        LDENode<T> aux, ant, prox;
        if (this.isEmpty() == true) {
            return cont;
        } else if (obj.compareTo(this.inicio.getInfo()) < 0) {
            return cont;
        } else if (obj.compareTo(this.inicio.getInfo()) == 0) { // remoção no início
            aux = this.inicio;
            while (aux != null && obj.compareTo(aux.getInfo()) == 0) {
                this.inicio = this.inicio.getProx();
                this.inicio.setAnt(null);
                aux = this.inicio;
                this.qtd--;
                cont++;
            }
            if (aux == null) {
                this.fim = null;
            }
            return cont;
        } else if (obj.compareTo(this.fim.getInfo()) > 0) {
            return cont;
        } else if (obj.compareTo(this.fim.getInfo()) == 0) { // remoção no final
            aux = this.fim;
            while (obj.compareTo(aux.getInfo()) == 0) {
                this.fim = this.fim.getAnt();
                this.fim.setProx(null);
                this.qtd--;
                cont++;
                aux = this.fim;
            }
            return cont;
        } else {
            aux = this.inicio;
            while (aux != null) {
                if (obj.compareTo(aux.getInfo()) == 0) { // remoção no meio 
                    ant = aux.getAnt();
                    prox = aux.getProx();
                    ant.setProx(prox);
                    prox.setAnt(ant);
                    this.qtd--;
                    cont++;
                    aux = prox;
                } else if (obj.compareTo(aux.getInfo()) < 0) {
                    return cont;
                } else {
                    aux = aux.getProx();
                }
            }
        }
        return cont;
    }

    public void atualizar(T obj) {
        LDENode<T> aux;

        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!!! ");
        } else {
            aux = buscaSimples(obj);
            if (aux != null) {
                aux.setInfo(obj);
                System.out.println("Termo atualizado com sucesso!");
            } else {
                System.out.println("Termo não localizado! ");
            }
        }
    }
}
