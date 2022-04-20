package PooProject.ProjetoAP2.Repositorio;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.FuncionarioException;
import PooProject.ProjetoAP2.Excecao.RepositorioFuncionarioException;
import PooProject.ProjetoAP2.Modelo.Funcionario;

public interface IRepositorioFuncionario {
	public void inserirFuncionario(Funcionario funcionario) throws FuncionarioException, RepositorioFuncionarioException;
	public void excluirFuncionario (Funcionario funcionario)throws FuncionarioException,RepositorioFuncionarioException;
	public void  excluirFuncionarioPeloNome(String nome)throws FuncionarioException,RepositorioFuncionarioException;
	public Funcionario pesquisarFuncionarioPeloCPF(String cpf)throws FuncionarioException,RepositorioFuncionarioException;
	public Funcionario  pesquisarFuncionarioPeloNome(String nome)throws FuncionarioException,RepositorioFuncionarioException;
	public ArrayList<Funcionario> listarFuncionario()throws FuncionarioException,RepositorioFuncionarioException;
	public void atualizarFuncionario(Funcionario funcionario)throws FuncionarioException,RepositorioFuncionarioException;
}
