package PooProject.ProjetoAP2.Repositorio;

import java.util.ArrayList;
import PooProject.ProjetoAP2.Excecao.FinanceiroExcepiton;
import PooProject.ProjetoAP2.Excecao.RepositorioFinanceiroException;
import PooProject.ProjetoAP2.Modelo.Financeiro;

public class RepositorioFinanceiro implements IRepositorioFinanceiro{
	private static RepositorioFinanceiro instancia;
	private ArrayList<Financeiro> arrayFinanceiro;
	
	public static RepositorioFinanceiro getInstance(){
		if(instancia == null){
			instancia = new RepositorioFinanceiro();
		}
		return instancia;
	}
	public RepositorioFinanceiro() {
		if(arrayFinanceiro == null){
			arrayFinanceiro = new  ArrayList<Financeiro>();
		}
	}
	@Override
	public void inserirFinanceiro(Financeiro financeiro) throws FinanceiroExcepiton, RepositorioFinanceiroException {
		arrayFinanceiro.add(financeiro);
	}

	@Override
	public void excluirFinanceiro(Financeiro financeiro) throws FinanceiroExcepiton, RepositorioFinanceiroException {
		for (int i = 0; i < arrayFinanceiro.size(); i++){
			if (arrayFinanceiro.get(i) == financeiro){
				arrayFinanceiro.remove(i);
				break;
			}
		}
		if(financeiro == null){
			throw new RepositorioFinanceiroException("não localizado");
		}

	}

	@Override
	public ArrayList<Financeiro> listarFinanceiro() throws FinanceiroExcepiton, RepositorioFinanceiroException {
		return arrayFinanceiro;
	}

	@Override
	public void atualizarFinanceiro(Financeiro financeiro) throws FinanceiroExcepiton, RepositorioFinanceiroException {
		for (int i = 0; i < arrayFinanceiro.size(); i++) {
			if(arrayFinanceiro.get(i) == financeiro){
				arrayFinanceiro.set(i, financeiro);
				break;
			}		
		}
		if (financeiro == null){
			throw new RepositorioFinanceiroException("não localizado");
		
		}
	}
	@Override
	public Financeiro pesquisarFinanceiroPeloCodigo(int codigo) throws FinanceiroExcepiton, RepositorioFinanceiroException {
		Financeiro financeiro = null;
		for (int i = 0 ; i <arrayFinanceiro.size(); i++){
			if (arrayFinanceiro.get(i).getCodigo() == (codigo)){
				financeiro = arrayFinanceiro.get(i);
				break;
			}
		}
//		if (financeiro == null){
//			throw new RepositorioFinanceiroException("não localizado");
//		}
		return financeiro;
	
	}

}
