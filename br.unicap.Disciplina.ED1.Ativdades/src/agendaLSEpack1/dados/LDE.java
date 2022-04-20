package agendaLSEpack1.dados;

/**
 *
 * @author Renato Nunes
 */
public class LDE<T extends Comparable<T>> { // lista genérica

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

    public void exibirTodos() {
        LDENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }

    public void inserirNoInicio(T obj) {
        LDENode<T> novo = new LDENode(obj);
        if (this.isEmpty() == true) { // Caso 1: lista VAZIA
            this.inicio = novo;
            this.fim = novo;
        } else {
            novo.setProx(this.inicio);
            this.inicio.setAnt(novo);
            this.inicio = novo;
        }
        this.qtd++;
    }

    public void removerNoFinal() {
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.inicio.getProx() == null) { // ou if (this.qtd == 1) 
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
        } else { // lista tem mais de um nó
            aux = this.fim.getAnt(); // referencia o penúltimo nó
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
        }
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
    public class LDECOrdenada <T extends Comparable <T>> {
    private LDENode<T> inicio;
    private LDENode<T> fim;
    private int qtd;
    
    public boolean isEmpty () {
        if (this.qtd == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void inserirOrdenado (T obj) {
        LDENode<T> novo = new LDENode (obj);
        LDENode<T> aux, anterior;
        if (this.isEmpty() ==true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd = 0;
            this.inicio.setAnt(this.fim);
            this.fim.setProx (this.inicio);
        }
        else if (obj.compareTo(this.inicio.getInfo()) == 0) {
            System.out.println("Valor repetido. Inserção não realizada.");
        }
        else if (obj.compareTo(this.inicio.getInfo()) < 0) { // inserçãono início
            novo.setProx (this.inicio);
            this.inicio.setAnt(novo);
            this.inicio = novo;
            this.qtd++;
            this.inicio.setAnt(this.fim);
            this.fim.setProx (this.inicio);
        }
        else if (obj.compareTo(this.fim.getInfo()) == 0) {
            System.out.println("Valor repetido. Inserção não realizada.");
        }
        else if (obj.compareTo(this.fim.getInfo()) > 0) { // inserção no final
            this.fim.setProx(novo);
            novo.setAnt(this.fim);
            this.fim = novo;
            this.qtd++;
            this.inicio.setAnt(this.fim);
            this.fim.setProx (this.inicio);
        }
        else {
            aux = this.inicio.getProx();
            while (true) { 
                if (obj.compareTo(aux.getInfo()) == 0) {
                    System.out.println("Valor repetido. Inserção não realizada.");
                    return; // break;
                }
                else if (obj.compareTo(aux.getInfo()) < 0) {
                    anterior = aux.getAnt();
                    anterior.setProx (novo);
                    novo.setAnt(anterior);
                    novo.setProx (aux);
                    aux.setAnt(novo);
                    this.qtd++;
                    return; // break;
                }
                else {
                    aux = aux.getProx();
                }
            }
        }
    }
}
 public int remover (T obj) {
        int cont = 0;
        LDENode<T> aux, ant, prox;
        if (this.isEmpty() == true) {
            return cont;
        }
        else if (obj.compareTo(this.inicio.getInfo()) < 0) {
            return cont;
        }
        else if (obj.compareTo(this.inicio.getInfo()) == 0) { // remoção no início
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
        }
        else if (obj.compareTo(this.fim.getInfo()) > 0) {
            return cont;
        }
        else if (obj.compareTo(this.fim.getInfo()) == 0) { // remoção no final
            aux = this.fim;
            while (obj.compareTo(aux.getInfo()) == 0) {
                this.fim = this.fim.getAnt();
                this.fim.setProx (null);
                this.qtd--;
                cont++;
                aux = this.fim;
            }
            return  cont;
        }
        else {
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
                }
                else if (obj.compareTo(aux.getInfo()) < 0) {
                    return cont;
                }
                else {
                    aux = aux.getProx();
                }                
            }
        } 
        return cont;
    }    
}
//    public void remover(T obj) {
//        LDENode<T> aux, anterior, atual;        
//        while (this.cont != 0) {//suponha que aqui teria uma busca que contou todos os repetidos para remorção
//            aux = buscarSimples(obj);
//            if (this.isEmpty() == true) {
//                System.out.println("Lista está vazia");
//            } else if (this.inicio.getInfo().compareTo(aux) == 0) {
//                if (this.qtd == 1) {
//                    this.inicio = null;
//                    this.fim = null;
//                } else {
//                    this.inicio = this.inicio.getProx();
//                }
//                this.qtd--;
//                System.out.println("Remoção efetuada!");
//            } else if (this.fim.getInfo().compareTo(aux) == 0) {
//                aux = this.inicio;
//                while (aux.getProx() != this.fim) {
//                    aux = aux.getProx();
//                }
//                aux.setProx(null);
//                this.fim = aux;
//                this.qtd--;
//                System.out.println("Remoção efetuada!");
//            } else {
//                anterior = this.inicio;
//                atual = anterior.getProx();
//                while (atual != null) {
//                    if (atual.getInfo().compareTo(aux) == 0) {
//                        anterior.setProx(atual.getProx());
//                        this.qtd--;
//                        System.out.println("Remoção efetuada!");
//                        return;
//                    } else {
//                        anterior = anterior.getProx();
//                        atual = atual.getProx();
//                    }
//                }
//                System.out.println("Elemento não encontrado!");
//            }
//        }
//
//    }

