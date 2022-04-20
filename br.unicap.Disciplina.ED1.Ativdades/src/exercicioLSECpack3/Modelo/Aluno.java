package exercicioLSECpack3.Modelo;

/**
 *
 * @author Renato Nunes
 */
public class Aluno implements Comparable <Aluno> {
    private String matricula;
    private String nome;
    private double mediaFinal;
    private int qtdFaltas;

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
        public void setNome (String n){
        this.nome = n;
    }   
    public String getNome () {
        return this.nome;
    }  
    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public int getQtdFaltas() {
        return qtdFaltas;
    }

    public void setQtdFaltas(int qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }
    
  

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", mediaFinal=" + mediaFinal + ", qtdFaltas=" + qtdFaltas + '}';
    }
    
    @Override
    public int compareTo(Aluno a) {
        return this.matricula.compareTo(a.getMatricula());
    }
}
