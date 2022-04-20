package br.unicap.DisciplinaPIII.ProjetoComercial.Repository;

import java.util.ArrayList;

import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.FornecedoresException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryFornecedoresException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Fornecedores;


public interface IRepositoryFornecedores {

    public void cadastrarFornecedores(Fornecedores fornecedores)throws FornecedoresException,RepositoryFornecedoresException;
    public ArrayList<Fornecedores> listarFornecedores()throws FornecedoresException,RepositoryFornecedoresException;
    public Fornecedores buscarFornecedores(String codFornecedor)throws FornecedoresException,RepositoryFornecedoresException;
    public void atualizarFornecedores(Fornecedores fornecedores)throws FornecedoresException,RepositoryFornecedoresException;
    public void removerFornecedores(Fornecedores fornecedores)throws FornecedoresException,RepositoryFornecedoresException;
    
}