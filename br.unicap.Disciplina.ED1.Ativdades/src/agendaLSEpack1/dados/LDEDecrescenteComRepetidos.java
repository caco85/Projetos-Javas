package agendaLSEpack1.dados;

/**
 * 
 * @author RenatO nunes
 */
public class LDEDecrescenteComRepetidos <T extends Comparable <T>> { // lista genérica

    private LDENode<T> inicio;
    private LDENode<T> fim;
    private int qtd;
    private int cont;

    public boolean isEmpty() {  // está vazia??
        if (this.qtd == 0) {  // ou if (this.inicio == null)
            return true;
        } else {
            return false;
        }
    }
  // Considere uma lista linear duplamente encadeada genérica. Considere ainda que a referida lista ESTÁ ORDENADA
//    em ordem CRESCENTE e PODE CONTER elementos repetidos. Implemente uma FUNÇÃO para remover todas as
//            cópias de um objeto existentes na lista. A função deverá receber como parâmetro o objeto a ser 
//                    removido. A função deverá retornar quantas ocorrências do objeto foram removidas da lista. 
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

   public void inserirCresc (T obj) {
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
   
    public void remover(T obj) { // versão 1
        LDENode<T> aux, anterior, atual;
        int cont;
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
            this.cont++;
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
//    
    
//    public LDE<T> intersecao(LDE<T> listaB) {
//        LDENode<T> aux, aux2;
//        aux = this.inicio;
//        aux2 = this.listaB.inicio;
//        LDENova<T> novaLista = new LDENova<T>();
//        if (this.isEmpty() == true || listaB.isEmpty() == true) {
//            System.out.println("Lista está vazia");
//
//        }else if  (aux.getInfo().compareTo(aux2.getInfo()) == 0) {
//            while (aux != null) {
//                novaLista.Inserir(aux.getInfo());
//           }
//            aux = aux.getProx();
//        }
//        return novaLista;
//    }
//    public LDE<T> uniao(LDE<T> listaB) {
//        LDENode<T> aux, aux2;
//        aux = this.inicio;
//        aux2 = this.listaB.inicio;
//        LDENova<T> novaLista = new LDENova<T>();
//        if (this.isEmpty() == true || listaB.isEmpty() == true) {
//            System.out.println("Lista está vazia");
//
//        } else if (aux.getInfo().compareTo(aux2.getInfo()) == 0) {
//            System.out.println("Valores repetidos: não pode haver união");
//        } else {
//            while (aux != null || aux2 != null) {
//                novaLista.inserir(aux.getInfo());
//                novaLista.inserir(aux2.getInfo());
//            }
//            aux = aux.getProx();
//            aux2 = aux2.getProx();
//        }
//        return novaLista;
//    }
//    public LDE<T> diferenca(LDE<T> listaB) {
//        LDENode<T> aux, aux2;
//        aux = this.inicio;
//        aux2 = this.listaB.inicio;
//        LDENova<T> novaLista = new LDENova<T>();
//        if (this.isEmpty() == true || listaB.isEmpty() == true) {
//            System.out.println("Lista está vazia");
//
//        } else if (aux.getInfo().compareTo(aux2.getInfo()) == 0) {
//            System.out.println("Valores nas duas lista não pode ser preenchidos! ");
//        } else {
//            while (aux != null || aux2 != null) {
//                novaLista.inserir(aux.getInfo());
//                novaLista.inserir(aux2
//                        .getInfo());
//            }
//            aux = aux.getProx();
//            aux2 = aux2.getProx();
//        }
//        return novaLista;
//    }

  public int removerContador(T obj) { 
        LDENode<T> aux, anterior, atual;
        int cont = 0;
        if (this.isEmpty() == true) { 
            System.out.println("Lista está vazia,nenhum obj removido e acrescentado no contador!"); 
        } else if (this.inicio.getInfo().compareTo(obj) == 0) { 
            if (this.qtd == 1) { // 
                this.inicio = null;
                this.fim = null;
            } else { // 
                this.inicio = this.inicio.getProx();
            }
            this.qtd--;
            cont++;
            System.out.println("Remoção efetuada!");
        } else if (this.fim.getInfo().compareTo(obj) == 0) { 
            aux = this.inicio;
            while (aux.getProx() != this.fim) { 
                aux = aux.getProx();
            }
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
            cont++;
            System.out.println("Remoção efetuada!");
        } else { 
            anterior = this.inicio;
            atual = anterior.getProx();
            while (atual != null) {
                if (atual.getInfo().compareTo(obj) == 0) {
                    anterior.setProx(atual.getProx());
                    this.qtd--;
                    cont++;
                    System.out.println("Remoção efetuada!");
                    
                } else {
                    anterior = anterior.getProx();
                    atual = atual.getProx();
                    cont++;
                }
            }
            System.out.println("Elemento não encontrado!");
        }
        return cont;
    }
}

