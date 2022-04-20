package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;
import PooProject.ProjetoAP2.Excecao.FinanceiroExcepiton;
import PooProject.ProjetoAP2.Excecao.RepositorioFinanceiroException;
import PooProject.ProjetoAP2.Modelo.Financeiro;
import PooProject.ProjetoAP2.Repositorio.RepositorioFinanceiro;

public class ControladorFinanceiro implements IControladorFinanceiro{
	
	private static  ControladorFinanceiro instancia;
	private RepositorioFinanceiro repFinanceiro;
	
	public static ControladorFinanceiro getInstance() {
		if(instancia == null){
			instancia = new ControladorFinanceiro();
		}
		
		return instancia;
	}
	
	public ControladorFinanceiro() {
		repFinanceiro = RepositorioFinanceiro.getInstance();
		
	}
	
	@Override
	public void inserirFinanceiro(Financeiro financeiro) throws FinanceiroExcepiton, RepositorioFinanceiroException {
		this.repFinanceiro.inserirFinanceiro(financeiro);
	}

	@Override
	public void excluirFinanceiro(Financeiro financeiro) throws FinanceiroExcepiton, RepositorioFinanceiroException {
		this.repFinanceiro.excluirFinanceiro(financeiro);
	}

	@Override
	public ArrayList<Financeiro> listarFinanceiro() throws FinanceiroExcepiton, RepositorioFinanceiroException {
		return this.repFinanceiro.listarFinanceiro();
	}

	@Override
	public void atualizarFinanceiro(Financeiro financeiro) throws FinanceiroExcepiton, RepositorioFinanceiroException {
		this.repFinanceiro.atualizarFinanceiro(financeiro);
	}

	@Override
	public Financeiro pesquisarFinanceiroPeloCodigo(int codigo)	throws FinanceiroExcepiton, RepositorioFinanceiroException {
		return this.repFinanceiro.pesquisarFinanceiroPeloCodigo(codigo);
	}

	@Override
	public Double calcularPatrimonio(double patrimonio, double gmF, double gmP, double gdM, double gmPg, double gmV)
			throws FinanceiroExcepiton, RepositorioFinanceiroException {
		double patrimonioAtual = 0;
		
		patrimonioAtual = (patrimonio + gmV )-(gmF + gmP + gdM + gmPg);
		
		return patrimonioAtual;
	}	
}