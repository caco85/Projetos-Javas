package GQ_2;

/**
 *
 * @author Renato Nunes 
 */
public class Funcionario {
    public String matricula;
    public String nome;
    public double salario;
    public int anoContracao;
    
    public Funcionario(String m){
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnoContracao() {
        return anoContracao;
    }

    public void setAnoContracao(int anoContracao) {
        this.anoContracao = anoContracao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "matricula=" + matricula + ", nome=" + nome + ", salario=" + salario + ", anoContracao=" + anoContracao + '}';
    }
    
    public String compareTo(String s){
        return s;       
    }
    
}
