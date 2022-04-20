package br.unicap.DisciplinaPIII.ProjetoComercial.Model;


import br.unicap.DisciplinaPIII.ProjetoComercial.Repository.IRepositoryFuncionario;


public class Funcionario {
    
    private String idFuncionario;
    private String nome;
    private double salario;
    private String cpf;

    public Funcionario(String idFuncionario,String nome, double salario,  String cpf, IRepositoryFuncionario repFuncionario) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public Funcionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String id) {
        this.idFuncionario = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "idFuncionario=" + idFuncionario + ", nome=" + nome + ", salario=" + salario + ", cpf=" + cpf + '}';
    }

}
