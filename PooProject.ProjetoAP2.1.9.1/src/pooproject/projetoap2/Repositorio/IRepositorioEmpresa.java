package PooProject.ProjetoAP2.Repositorio;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.EmpresaException;
import PooProject.ProjetoAP2.Excecao.RepositorioEmpresaException;
import PooProject.ProjetoAP2.Modelo.Empresa;


public interface IRepositorioEmpresa {
	public void inserirEmpresa(Empresa empresa) throws EmpresaException,RepositorioEmpresaException ;
	public void excluirEmpresa (Empresa empresa)throws EmpresaException,RepositorioEmpresaException;
	public void  excluirEmpresaPeloNome(String nome)throws EmpresaException,RepositorioEmpresaException;
	public Empresa  pesquisarEmpresaPeloNome(String nome)throws EmpresaException,RepositorioEmpresaException;
	public Empresa pesquisarEmpresaPeloCNPJ(String cnpj)throws EmpresaException,RepositorioEmpresaException;
	public ArrayList<Empresa> listarEmpresas()throws EmpresaException,RepositorioEmpresaException;
	public void atualizarEmpresa(Empresa empresa)throws EmpresaException,RepositorioEmpresaException;
}