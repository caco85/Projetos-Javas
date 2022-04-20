
package Outros;

/**
 *
 * @author Renato Nunes
 */

abstract class Funcionario {
    private String nome;
    private double salario;
 
    public Funcionario(String nome, double salario) {
        if (nome != null && !nome.trim().equals("")) {
            this.nome = nome;
        } else {
            this.nome = "INDEFINIDO";
        }
        if (salario >= 1000) {
            this.salario = salario;
        } else {
            this.salario = 1000;
        }
    }
 
    public double getSalario() {
        return salario;
    }
 
    public void setSalario(double salario) {
        if (salario > this.salario) {
            this.salario = salario;
        }
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        if (nome != null && !nome.trim().equals("")) {
            this.nome = nome;
        }
    }
 
    public abstract void aumentaSalario();
}
 

 
