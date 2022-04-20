package ListaVetor3;

/**
 *
 * @author Renato Nunes
 */
public class Funcionario {
    public String matricula;
    public String nome;
    public String cargo;
    public double salario;
    public String dataContratacao;
    
    public Funcionario(String matri){
        this.matricula = matri;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratação) {
        this.dataContratacao = dataContratação;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "matricula=" + matricula + ", nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + ", dataContratacao=" + dataContratacao + '}';
    }
    
    
}
