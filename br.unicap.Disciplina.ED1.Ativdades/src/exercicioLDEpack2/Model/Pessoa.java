
package exercicioLDEpack2.Model;

/**
 *
 * @author Renato Nunes
 */
public class Pessoa implements Comparable<Pessoa>{
    private String rg;
    private String nome;

    public Pessoa(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "rg=" + rg + ", nome=" + nome + '}';
    }
    
    @Override
    public int compareTo(Pessoa p) {
        return this.rg.compareTo(p.getRg());
    }
    
    
}
