package br.unicap.DisciplinaPIII.ProjetoComercial.Controller;

import java.util.ArrayList;

import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.EmpresaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryEmpresaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Empresa;
import br.unicap.DisciplinaPIII.ProjetoComercial.Repository.IRepositoryEmpresa;
import br.unicap.DisciplinaPIII.ProjetoComercial.Repository.RepositoryEmpresa;



public class ControllerEmpresa {
	
	private IRepositoryEmpresa repEmpresa;
    private static ControllerEmpresa instancia;
    public static ControllerEmpresa getInstance() {
        if (instancia == null) {
            instancia = new ControllerEmpresa();
        }
        return instancia;
    }
    
    public ControllerEmpresa() {
        this.repEmpresa = RepositoryEmpresa.getInstance();
    }
    

    public void cadastrarEmpresa(Empresa empresa) throws EmpresaException, RepositoryEmpresaException {
        if (this.repEmpresa.buscarEmpresa(empresa.getCodigoEmpresa()) != null) {
            throw new EmpresaException("Empresa não cadastrada,pois ja existe o codigo cadastrado");
        } else {
            this.repEmpresa.cadastrarEmpresa(empresa);
        }
    }
   
    public ArrayList<Empresa> listarEmpresa() throws EmpresaException, RepositoryEmpresaException{
       return this.repEmpresa.listarEmpresa();
    }
   
    public Empresa buscarEmpresa(String codigoEmpresa) throws EmpresaException, RepositoryEmpresaException{
        return this.repEmpresa.buscarEmpresa(codigoEmpresa);
    }

    public void atualizarEmpresa(Empresa empresa) throws EmpresaException, RepositoryEmpresaException{
        this.repEmpresa.atualizarEmpresa(empresa);
    }

    public void removerEmpresa(Empresa empresa) throws EmpresaException, RepositoryEmpresaException{
        this.repEmpresa.removerEmpresa(empresa);
    }
    public ArrayList<Empresa> listarEmpresaAll(ArrayList<Empresa> arrayEmpresaAll) throws EmpresaException, RepositoryEmpresaException{
        if (arrayEmpresaAll != null) {

            for (int i = 0; i < arrayEmpresaAll.size(); i++) {
                System.out.println(arrayEmpresaAll.get(i));
                
            }
        }
        return arrayEmpresaAll;
    }
}
