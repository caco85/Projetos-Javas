package br.unicap.DisciplinaPIII.ProjetoComercial.Controller;

import java.util.ArrayList;

import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.FornecedoresException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryFornecedoresException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Fornecedores;
import br.unicap.DisciplinaPIII.ProjetoComercial.Repository.IRepositoryFornecedores;
import br.unicap.DisciplinaPIII.ProjetoComercial.Repository.RepositoryFornecedores;


public class ControllerFornecedores {
	private IRepositoryFornecedores repFornecedores;
    private static ControllerFornecedores instancia;
    public static ControllerFornecedores getInstance() {
        if (instancia == null) {
            instancia = new ControllerFornecedores();
        }
        return instancia;
    }
    
    public ControllerFornecedores() {
        this.repFornecedores = RepositoryFornecedores.getInstance();
    }
    

    public void cadastrarFornecedores(Fornecedores fornecedores) throws FornecedoresException, RepositoryFornecedoresException {
        if (this.repFornecedores.buscarFornecedores(fornecedores.getCodFornecedor()) != null) {
            throw new FornecedoresException("Fornecedor não cadastrado,pois ja existe o codigo cadastrado");
        } else {
            this.repFornecedores.cadastrarFornecedores(fornecedores);
        }
    }
   
    public ArrayList<Fornecedores> listarFornecedores() throws FornecedoresException, RepositoryFornecedoresException{
       return this.repFornecedores.listarFornecedores();
    }
   
    public Fornecedores buscarFornecedores(String codFiliado) throws FornecedoresException, RepositoryFornecedoresException{
        return this.repFornecedores.buscarFornecedores(codFiliado);
    }

    public void atualizarFornecedores(Fornecedores fornecedores) throws FornecedoresException, RepositoryFornecedoresException{
        this.repFornecedores.atualizarFornecedores(fornecedores);
    }

    public void removerFornecedores(Fornecedores fornecedores) throws FornecedoresException, RepositoryFornecedoresException{
        this.repFornecedores.removerFornecedores(fornecedores);
    }
    public ArrayList<Fornecedores> listarFornecedoresAll(ArrayList<Fornecedores> arrayFornecedoresAll) throws FornecedoresException, RepositoryFornecedoresException{
        if (arrayFornecedoresAll != null) {

            for (int i = 0; i < arrayFornecedoresAll.size(); i++) {
                System.out.println(arrayFornecedoresAll.get(i));
            }
        }
        return arrayFornecedoresAll;
    }
}
