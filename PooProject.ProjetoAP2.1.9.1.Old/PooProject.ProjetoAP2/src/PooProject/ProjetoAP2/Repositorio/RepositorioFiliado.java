package PooProject.ProjetoAP2.Repositorio;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.FiliadoException;
import PooProject.ProjetoAP2.Excecao.RepositorioFiliadoException;
import PooProject.ProjetoAP2.Modelo.Filiado;

public class RepositorioFiliado implements IRepositorioFiliado {
	private ArrayList<Filiado> arrayFiliado;
	private static RepositorioFiliado instancia;
	
	public static RepositorioFiliado getInstance(){
		if (instancia == null) {
			instancia = new RepositorioFiliado();
			
		}
		return instancia;
	}	
	
	public  RepositorioFiliado() {
		if (arrayFiliado == null){
			arrayFiliado = new ArrayList<Filiado>();
		}
	}

	@Override
	public void inserirFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		arrayFiliado.add(filiado);
		System.out.println("");
		System.out.println("Cadastro efetuado com sucesso");
		System.out.println("");
	}

	@Override
	public void excluirFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		for (int i = 0; i < arrayFiliado.size(); i++){
			if (arrayFiliado.get(i) == filiado){
				arrayFiliado.remove(i);
				break;
			}
		}
		if(filiado == null){
			throw new RepositorioFiliadoException("Filiado não localizado");
		}
	}

	@Override
	public void excluirFiliadoPeloNome(String nome) throws FiliadoException, RepositorioFiliadoException {
		for (int i = 0; i < arrayFiliado.size(); i++){
			if (arrayFiliado.get(i).getNomeFiliado() == nome){
				arrayFiliado.remove(i);
				break;
			}
		}
		if(nome == null){
			throw new RepositorioFiliadoException("Filiado não localizado");
		}
	}

	@Override
	public Filiado pesquisarFiliadoPeloCNPJ(String cnpj) throws FiliadoException, RepositorioFiliadoException {
		Filiado filiado = null;
		for (int i = 0 ; i <arrayFiliado.size(); i++){
			if (arrayFiliado.get(i).getCNPJ().equals(cnpj)){
				filiado = arrayFiliado.get(i);
				break;
			}
		}
//		if (filiado == null){
//			throw new RepositorioFiliadoException("Filiado não localizado");
//		}
		return filiado;

	}

	@Override
	public Filiado pesquisarFiliadoPeloNome(String nome) throws FiliadoException, RepositorioFiliadoException {
		Filiado filiado = null;
		for (int i = 0 ; i <arrayFiliado.size(); i++){
			if (arrayFiliado.get(i).getNomeFiliado().equals(nome)){
				filiado = arrayFiliado.get(i);
				break;
			}
		}
//		if (filiado == null){
//			throw new RepositorioFiliadoException("Filiado não localizado");
//		}
		return filiado;
	}

	@Override
	public ArrayList<Filiado> listarFiliado() throws FiliadoException, RepositorioFiliadoException {
		return arrayFiliado;
	}

	@Override
	public void atualizarFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		for (int i = 0; i < arrayFiliado.size(); i++) {
			if(arrayFiliado.get(i) == filiado){
				arrayFiliado.set(i, filiado);
				break;
			}			
		}
		if (filiado == null){
			throw new RepositorioFiliadoException("Filiado não localizado");
		
		}
		
	}

}
