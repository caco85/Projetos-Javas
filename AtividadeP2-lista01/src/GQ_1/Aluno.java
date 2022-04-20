package GQ_1;

/**
 *
 * @author Renato Nunes
 */
public class Aluno {
    public String matricula;
    public String nome;
    public double media;
    public int qtdFaltas;
    
    public Aluno(String m){
        this.matricula = m;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getQtdFaltas() {
        return qtdFaltas;
    }

    public void setQtdFaltas(int qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", media=" + media + ", qtdFaltas=" + qtdFaltas + '}';
    }
    
}
