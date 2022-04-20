package exercicioLDECpack2.Model;

/**
 *
 * @author Renato Nunes
 */
public class Dicionario implements Comparable<Dicionario>{
    
    private String nome ;
    private String descricao;

    public Dicionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescrição(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Dicionario{" + "nome=" + nome + ", descricao=" + descricao + '}';
    }

    @Override
    public int compareTo(Dicionario d) {
        return this.nome.compareTo(d.getNome()
        );
    }
    
}
