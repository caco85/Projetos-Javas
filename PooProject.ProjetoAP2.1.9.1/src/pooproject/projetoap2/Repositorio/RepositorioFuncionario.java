package PooProject.ProjetoAP2.Repositorio;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.FuncionarioException;
import PooProject.ProjetoAP2.Excecao.RepositorioFuncionarioException;
import PooProject.ProjetoAP2.Modelo.Funcionario;

public class RepositorioFuncionario implements IRepositorioFuncionario{
	
	private ArrayList<Funcionario> arrayFuncionarios;
	private static RepositorioFuncionario instancia;
	
	public static RepositorioFuncionario getInstance(){
		if (instancia == null) {
			instancia = new RepositorioFuncionario();
			
		}
		return instancia;
	}	
	
	public  RepositorioFuncionario() {
		if (arrayFuncionarios == null){
			arrayFuncionarios = new ArrayList<Funcionario>();
		}
	}
	

	@Override
	public void inserirFuncionario(Funcionario funcionario) throws FuncionarioException, RepositorioFuncionarioException {
		arrayFuncionarios.add(funcionario);
		System.out.println("");
		System.out.println("Cadastro efetuado com sucesso");
		System.out.println("");
	}

	@Override
	public void excluirFuncionario(Funcionario funcionario) throws FuncionarioException, RepositorioFuncionarioException {
		for (int i = 0; i < arrayFuncionarios.size(); i++){
			if (arrayFuncionarios.get(i) == funcionario){
				arrayFuncionarios.remove(i);
				break;
			}
		}
		if(funcionario == null){
			throw new RepositorioFuncionarioException("Funcionário não localizado");
		}
	}

	@Override
	public void excluirFuncionarioPeloNome(String nome) throws FuncionarioException, RepositorioFuncionarioException {
		for (int i = 0; i < arrayFuncionarios.size(); i++){
			if (arrayFuncionarios.get(i).getNomeFuncionario().equals(nome)){
				arrayFuncionarios.remove(i);
				break;
			}
		}
		if(nome == null){
			throw new RepositorioFuncionarioException("Funcionario não localizado");
		}
	}

	@Override
	public Funcionario pesquisarFuncionarioPeloCPF(String cpf)throws FuncionarioException, RepositorioFuncionarioException {
		Funcionario funcionario = null;
		for (int i = 0 ; i <arrayFuncionarios.size(); i++){
			if (arrayFuncionarios.get(i).getCpf().equals(cpf)){
				funcionario = arrayFuncionarios.get(i);
				break;
			}
		}
//		if (funcionario == null){
//			throw new RepositorioFuncionarioException("Funcionario não localizado");
//		}
		return funcionario;
	}

	@Override
	public Funcionario pesquisarFuncionarioPeloNome(String nome)throws FuncionarioException, RepositorioFuncionarioException {	
		Funcionario funcionario = null;
		for (int i = 0 ; i <arrayFuncionarios.size(); i++){
			if (arrayFuncionarios.get(i).getNomeFuncionario().equals(nome)){
				funcionario = arrayFuncionarios.get(i);
				break;
			}
		}
//		if (funcionario == null){
//			throw new RepositorioFuncionarioException("Funcionario não localizado");
//		}
		return funcionario;	

	}

	@Override
	public ArrayList<Funcionario> listarFuncionario() throws FuncionarioException, RepositorioFuncionarioException {
		return arrayFuncionarios;
	}

	@Override
	public void atualizarFuncionario(Funcionario funcionario)throws FuncionarioException, RepositorioFuncionarioException {
		for (int i = 0; i < arrayFuncionarios.size(); i++) {
			if(arrayFuncionarios.get(i) == funcionario){
				arrayFuncionarios.set(i, funcionario);
				break;
			}			
		}
		if (funcionario == null){
			throw new RepositorioFuncionarioException("Cliente não localizado");
		
		}
	}

}
