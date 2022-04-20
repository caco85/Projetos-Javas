package br.unicap.DisciplinaPIII.ProjetoComercial.Repository;

import java.util.ArrayList;

import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.EmpresaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryEmpresaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Empresa;



public interface IRepositoryEmpresa {

	public void cadastrarEmpresa(Empresa empresa)throws EmpresaException,RepositoryEmpresaException;
    public ArrayList<Empresa> listarEmpresa()throws EmpresaException,RepositoryEmpresaException;
    public Empresa buscarEmpresa(String codigoEmpresa)throws EmpresaException,RepositoryEmpresaException;
    public void atualizarEmpresa(Empresa empresa)throws EmpresaException,RepositoryEmpresaException;
    public void removerEmpresa(Empresa empresa)throws EmpresaException,RepositoryEmpresaException;
}
