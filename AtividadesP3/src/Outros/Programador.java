package Outros;

/**
 *
 * @author Renat
 */
public class Programador extends Funcionario {
 
    public Programador(String nome, double salario) {
        super(nome, salario);
    }
 
    @Override
    public void aumentaSalario() {
        this.setSalario(this.getSalario() * 1.2);
    }
}