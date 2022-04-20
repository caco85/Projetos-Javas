package br.unicap.DisciplinaPIII.ProjetoComercial.Repository;

import java.util.ArrayList;

import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.FornecedoresException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryFornecedoresException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Fornecedores;



public class RepositoryFornecedores implements IRepositoryFornecedores {

    private ArrayList<Fornecedores> arrayFornecedores;

    private static RepositoryFornecedores instancia;
    public static RepositoryFornecedores getInstance() {
        if (instancia == null) {
            instancia = new RepositoryFornecedores();
        }
        return instancia;
    }
    
    public RepositoryFornecedores() {
        if (this.arrayFornecedores == null) {
            this.arrayFornecedores = new Factory<Fornecedores>().datastructure();
        }
    }

    @Override
    public void cadastrarFornecedores(Fornecedores fornecedores)throws FornecedoresException,RepositoryFornecedoresException {
        this.arrayFornecedores.add(fornecedores);
    }

    @Override
    public ArrayList<Fornecedores> listarFornecedores()throws FornecedoresException,RepositoryFornecedoresException {
        return this.arrayFornecedores;
    }

    @Override
    public Fornecedores buscarFornecedores(String codFornecedor)throws FornecedoresException,RepositoryFornecedoresException {
    	Fornecedores fornecedores = null;
        for (int i = 0; i < this.arrayFornecedores.size(); i++) {
            if (this.arrayFornecedores.get(i).getCodFornecedor().equals(codFornecedor)) {
            	fornecedores = this.arrayFornecedores.get(i);
                break;
            }
        }
        return fornecedores;
    }

    @Override
    public void atualizarFornecedores(Fornecedores fornecedores)throws FornecedoresException,RepositoryFornecedoresException {
        for (int i = 0; i < arrayFornecedores.size(); i++) {
            if (arrayFornecedores.get(i).equals(fornecedores)) {
                arrayFornecedores.set(i, fornecedores);
                break;
            }
        }
    }

    @Override
    public void removerFornecedores(Fornecedores fornecedores) throws FornecedoresException,RepositoryFornecedoresException{
        for (int i = 0; i < this.arrayFornecedores.size(); i++) {
            if (this.arrayFornecedores.get(i).equals(fornecedores)){
                this.arrayFornecedores.remove(i);
                break;
            }
        }
    }
}



