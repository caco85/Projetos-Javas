
package exercicioLDEpack3.dados;

/**
 *
 * @author Renato Nunes
 */
public class LDEAdv <T extends Comparable <T>>{

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
    
    public void exibirTodos () {
        LDENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println();
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
    public void exibirPessoa(T obj){
        LDENode<T> aux;
        aux = buscaSimples(obj);
          if (aux == null) {
            System.out.println("Pessoa não encontrado");
        } else {
            System.out.println(aux.getInfo());
        }
    
    }
    
    public void inserirNoFinal (T obj) {
        LDENode<T> novo = new LDENode (obj);
        if (this.isEmpty() == true) { // 
            this.inicio = novo;
	    this.fim = novo;
        }
        else {
            if(buscaSimples(obj)!= null){
                novo.setProx(this.fim);
                this.fim.setAnt(novo);
                this.fim = novo;
            }else {
                System.out.println("Não cadastrado RG ja existe!");
            }
            
        }
        this.qtd++;
    }
    
    public void removerNoFinal () {
        LDENode<T> aux;
        if (this.isEmpty () == true) {
            System.out.println("Lista vazia!"); 
        }
        else if (this.inicio.getProx() == null) { 
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
        }
        else { 
            aux = this.fim.getAnt(); 
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
        }       
    }
    public void sair(){
        System.out.println("Você escolheu a opção sair,Obrigado!");
    }
    public int contarPessoas(){
         return qtd;
    }
}
