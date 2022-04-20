package br.unicap.DisciplinaPIII.ProjetoComercial.Repository;


import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.FuncionarioException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryFuncionarioException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Funcionario;
import java.util.ArrayList;

public class RepositoryFuncionario implements IRepositoryFuncionario {
    
    private static RepositoryFuncionario instancia;
    private ArrayList<Funcionario> arrayFuncionario;

       
    public static RepositoryFuncionario getInstance() {
        if (instancia == null) {
            instancia = new RepositoryFuncionario();
        }
        return instancia;
    }
    public RepositoryFuncionario() {
        if (this.arrayFuncionario == null) {

            this.arrayFuncionario =  new Factory<Funcionario>().datastructure();
        }
    }

    @Override
    public void cadastrarFuncionario(Funcionario funcionario)throws FuncionarioException,RepositoryFuncionarioException {
        this.arrayFuncionario.add(funcionario); 
    }

    @Override
    public ArrayList<Funcionario> listarFuncionarios()throws FuncionarioException,RepositoryFuncionarioException {
        return this.arrayFuncionario;
    }

    @Override
    public Funcionario buscarFuncionario(String idFuncionario)throws FuncionarioException,RepositoryFuncionarioException {
        Funcionario funcionario = null;

        for (int i = 0; i < this.arrayFuncionario.size(); i++) {
            if (this.arrayFuncionario.get(i).getIdFuncionario().equals(idFuncionario)) {
                funcionario = this.arrayFuncionario.get(i);
                break;
            }
        }
        return funcionario;
    }

    @Override
    public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioException,RepositoryFuncionarioException{
        for (int i = 0; i < arrayFuncionario.size(); i++) {
            if (arrayFuncionario.get(i) == funcionario) {
                arrayFuncionario.set(i, funcionario);
                break;
            }
        }
    }

    @Override
    public void removerFuncionario(Funcionario funcionario)throws FuncionarioException,RepositoryFuncionarioException {
        for (int i = 0; i < this.arrayFuncionario.size(); i++) {
            if (this.arrayFuncionario.get(i).equals(funcionario)) {
                this.arrayFuncionario.remove(i);
                break;
            }
        }
    }     

    @Override
    public Funcionario buscarFuncionarioPeloNome(String nome) throws FuncionarioException, RepositoryFuncionarioException {
              Funcionario funcionario = null;
        for (int i = 0; i < arrayFuncionario.size(); i++) {
            if (arrayFuncionario.get(i).getNome().equals(nome)) {
                funcionario = arrayFuncionario.get(i);
                break;
            }
        }

        return funcionario;
    }
}
