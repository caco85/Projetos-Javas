package PooProject.ProjetoAP2.Repositorio;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.FinanceiroExcepiton;
import PooProject.ProjetoAP2.Excecao.RepositorioFinanceiroException;
import PooProject.ProjetoAP2.Modelo.Financeiro;

public interface IRepositorioFinanceiro {
	public void inserirFinanceiro(Financeiro financeiro) throws FinanceiroExcepiton,RepositorioFinanceiroException;
	public void excluirFinanceiro (Financeiro financeiro)throws FinanceiroExcepiton,RepositorioFinanceiroException ;
	public ArrayList<Financeiro> listarFinanceiro() throws FinanceiroExcepiton,RepositorioFinanceiroException;
	public void atualizarFinanceiro(Financeiro financeiro)throws FinanceiroExcepiton,RepositorioFinanceiroException;
	public Financeiro pesquisarFinanceiroPeloCodigo(int codigo)throws FinanceiroExcepiton,RepositorioFinanceiroException ;
}
