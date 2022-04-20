package Outros;

/**
 *
 * @author Renato Nunes
 */
public class Gerente extends Funcionario {
 
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
 
    @Override
    public void aumentaSalario() {
        this.setSalario(this.getSalario() * 1.1);
    }
}
