package exercicioLDE2pack2.Model;

/**
 *
 * @author Renato Nunes
 */
public class Tarefa implements Comparable<Tarefa> {

    private int prioridade;
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "prioridade=" + prioridade + ", descricao=" + descricao + '}';
    }

    @Override
    public int compareTo(Tarefa t) {
        return this.descricao.compareTo(t.getDescricao());
    }

}
