
package agendaLSEpack2.model;

/**
 *
 * @author Renato Nunes
 */
public class Contato implements Comparable<Contato>{
    private String nome;
    private int telefone;
    private String email;

    public Contato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", telefone=" + telefone + ", email=" + email + '}';
    }

    @Override
    public int compareTo(Contato c) {
        return this.nome.compareTo(c.getNome());
       
    }
    
    
    
}
