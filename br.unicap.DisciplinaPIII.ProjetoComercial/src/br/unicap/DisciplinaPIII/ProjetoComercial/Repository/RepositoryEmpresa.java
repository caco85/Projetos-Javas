package br.unicap.DisciplinaPIII.ProjetoComercial.Repository;

import java.util.ArrayList;

import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.EmpresaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryEmpresaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Empresa;



public class RepositoryEmpresa implements IRepositoryEmpresa {

    private ArrayList<Empresa> arrayEmpresa;

    private static RepositoryEmpresa instancia;
    public static RepositoryEmpresa getInstance() {
        if (instancia == null) {
            instancia = new RepositoryEmpresa();
        }
        return instancia;
    }
    
    public RepositoryEmpresa() {
        if (this.arrayEmpresa == null) {
            this.arrayEmpresa = new Factory<Empresa>().datastructure();
        }
    }

    @Override
    public void cadastrarEmpresa(Empresa empresa)throws EmpresaException,RepositoryEmpresaException {
        this.arrayEmpresa.add(empresa);
    }

    @Override
    public ArrayList<Empresa> listarEmpresa()throws EmpresaException,RepositoryEmpresaException {
        return this.arrayEmpresa;
    }

    @Override
    public Empresa buscarEmpresa(String codigoEmpresa)throws EmpresaException,RepositoryEmpresaException {
    	Empresa empresa = null;
        for (int i = 0; i < this.arrayEmpresa.size(); i++) {
            if (this.arrayEmpresa.get(i).getCodigoEmpresa().equals(codigoEmpresa)) {
            	empresa = this.arrayEmpresa.get(i);
                break;
            }
        }
        return empresa;
    }

    @Override
    public void atualizarEmpresa(Empresa empresa)throws EmpresaException,RepositoryEmpresaException {
        for (int i = 0; i < arrayEmpresa.size(); i++) {
            if (arrayEmpresa.get(i).equals(empresa)) {
                arrayEmpresa.set(i, empresa);
                break;
            }
        }
    }

    @Override
    public void removerEmpresa(Empresa empresa) throws EmpresaException,RepositoryEmpresaException{
        for (int i = 0; i < this.arrayEmpresa.size(); i++) {
            if (this.arrayEmpresa.get(i).equals(empresa)) {
                this.arrayEmpresa.remove(i);
                break;
            }
        }
    }

}
