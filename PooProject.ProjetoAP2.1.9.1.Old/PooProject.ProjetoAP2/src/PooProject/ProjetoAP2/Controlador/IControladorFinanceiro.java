package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.FinanceiroExcepiton;
import PooProject.ProjetoAP2.Excecao.RepositorioFinanceiroException;
import PooProject.ProjetoAP2.Modelo.Financeiro;

public interface IControladorFinanceiro {
	public void inserirFinanceiro(Financeiro financeiro) throws FinanceiroExcepiton,RepositorioFinanceiroException;
	public void excluirFinanceiro (Financeiro financeiro)throws FinanceiroExcepiton,RepositorioFinanceiroException ;
	public ArrayList<Financeiro> listarFinanceiro() throws FinanceiroExcepiton,RepositorioFinanceiroException;
	public void atualizarFinanceiro(Financeiro financeiro)throws FinanceiroExcepiton,RepositorioFinanceiroException;
	public Financeiro pesquisarFinanceiroPeloCodigo(int codigo)throws FinanceiroExcepiton,RepositorioFinanceiroException ;
	public Double calcularPatrimonio(double patrimonio,double gmF,double gmP,double gdM,double gmPg,double gmV )throws FinanceiroExcepiton,RepositorioFinanceiroException ;
}