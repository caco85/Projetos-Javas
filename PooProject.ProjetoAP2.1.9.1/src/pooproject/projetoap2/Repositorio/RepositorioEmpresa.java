package PooProject.ProjetoAP2.Repositorio;

import java.util.ArrayList;
import PooProject.ProjetoAP2.Excecao.EmpresaException;
import PooProject.ProjetoAP2.Excecao.RepositorioEmpresaException;
import PooProject.ProjetoAP2.Modelo.Empresa;

public class RepositorioEmpresa implements IRepositorioEmpresa{
	private static RepositorioEmpresa instancia;
	private ArrayList<Empresa> arrayEmpresas;
	
	public static RepositorioEmpresa getInstance(){
		if (instancia == null){
			instancia = new RepositorioEmpresa();
		}
		return instancia;
	}
	
	public RepositorioEmpresa(){
		if(arrayEmpresas == null){
			arrayEmpresas = new ArrayList<Empresa>();
		}
	}

	@Override
	public void inserirEmpresa(Empresa empresa) throws EmpresaException, RepositorioEmpresaException {
		arrayEmpresas.add(empresa);	
		System.out.println("");
		System.out.println("Cadastro efetuado com sucesso");
		System.out.println("");
	}

	@Override
	public void excluirEmpresa(Empresa empresa) throws EmpresaException, RepositorioEmpresaException {
		for (int i = 0; i < arrayEmpresas.size(); i++){
			if (arrayEmpresas.get(i) == empresa){
				arrayEmpresas.remove(i);
				break;
			}
		}
		if(empresa == null){
			throw new RepositorioEmpresaException("Empresa não localizado");
		}
	}

	@Override
	public void excluirEmpresaPeloNome(String nome) throws EmpresaException, RepositorioEmpresaException {
		for (int i = 0; i < arrayEmpresas.size(); i++){
			if (arrayEmpresas.get(i).getRazaoSocial().equals(nome)){
				arrayEmpresas.remove(i);
				break;
			}
		}
		if(nome == null){
			throw new RepositorioEmpresaException("Empresa não localizado");
		}
	}

	@Override
	public Empresa pesquisarEmpresaPeloNome(String nome) throws EmpresaException, RepositorioEmpresaException {
		Empresa empresa = null;
		for (int i = 0 ; i <arrayEmpresas.size(); i++){
			if (arrayEmpresas.get(i).getRazaoSocial().equals(nome)){
				empresa = arrayEmpresas.get(i);
				break;
			}
		}
//		if (empresa == null){
//			throw new RepositorioEmpresaException("Empresa não localizado");
//		}
		return empresa;	
	}

	@Override
	public Empresa pesquisarEmpresaPeloCNPJ(String cnpj) throws EmpresaException, RepositorioEmpresaException {
		Empresa empresa = null;
		for (int i = 0 ; i <arrayEmpresas.size(); i++){
			if (arrayEmpresas.get(i).getCNPJ().equals(cnpj)){
				empresa = arrayEmpresas.get(i);
				break;
			}
		}
//		if (empresa == null){
//			throw new RepositorioEmpresaException("Empresa não localizado");
//		}
		return empresa;
	}

	@Override
	public ArrayList<Empresa> listarEmpresas() throws EmpresaException, RepositorioEmpresaException {

		return arrayEmpresas;
	}

	@Override
	public void atualizarEmpresa(Empresa empresa) throws EmpresaException, RepositorioEmpresaException {
		for (int i = 0; i < arrayEmpresas.size(); i++) {
			if(arrayEmpresas.get(i) == empresa){
				arrayEmpresas.set(i, empresa);
				break;
			}			
		}
		if (empresa == null){
			throw new RepositorioEmpresaException("Emprea não localizado");
		
		}
	}

}
