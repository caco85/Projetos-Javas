package br.unicap.DisciplinaPIII.ProjetoComercial.Repository;


import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.FuncionarioException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryFuncionarioException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Funcionario;
import java.util.ArrayList;

public interface IRepositoryFuncionario {

    public void cadastrarFuncionario(Funcionario funcionario) throws FuncionarioException,RepositoryFuncionarioException;
    public ArrayList<Funcionario> listarFuncionarios()throws FuncionarioException,RepositoryFuncionarioException;
    public Funcionario buscarFuncionario(String idFuncionario)throws FuncionarioException,RepositoryFuncionarioException;
    public Funcionario buscarFuncionarioPeloNome(String nome)throws FuncionarioException,RepositoryFuncionarioException;
    public void atualizarFuncionario(Funcionario funcionario)throws FuncionarioException,RepositoryFuncionarioException;
    public void removerFuncionario(Funcionario funcionario)throws FuncionarioException,RepositoryFuncionarioException;
  
}
