
package br.unicap.DisciplinaPIII.ProjetoComercial.Controller;

import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.FuncionarioException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryFuncionarioException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Funcionario;
import br.unicap.DisciplinaPIII.ProjetoComercial.Repository.IRepositoryFuncionario;
import br.unicap.DisciplinaPIII.ProjetoComercial.Repository.RepositoryFuncionario;
import java.util.ArrayList;

/**
 *
 * @author Renato Nunes
 */
public class ControllerFuncionario {
    private static ControllerFuncionario instancia;
    private IRepositoryFuncionario repFuncionario;

    
    public static ControllerFuncionario getInstance() {
        if (instancia == null) {
            instancia = new ControllerFuncionario();
        }
        return instancia;
    }
    public ControllerFuncionario() {
        this.repFuncionario = RepositoryFuncionario.getInstance();
    }
    public void cadastrarFuncionario(Funcionario funcionario) throws FuncionarioException,RepositoryFuncionarioException{
        if (this.repFuncionario.buscarFuncionario(funcionario.getIdFuncionario()) != null) {
            throw new FuncionarioException("Funcionario não cadastrado,pois ja existe o codigo cadastrado");
        }else {
            this.repFuncionario.cadastrarFuncionario(funcionario);
        }
        
    }
    public ArrayList<Funcionario> listarFuncionarios()throws FuncionarioException,RepositoryFuncionarioException{
       return this.repFuncionario.listarFuncionarios();
    }
    public Funcionario buscarFuncionario(String idFuncionario)throws FuncionarioException,RepositoryFuncionarioException{
        return this.repFuncionario.buscarFuncionario(idFuncionario);
    }
    public void atualizarFuncionario(Funcionario funcionario)throws FuncionarioException,RepositoryFuncionarioException{
        this.repFuncionario.atualizarFuncionario(funcionario);
    }
    public void removerFuncionario(Funcionario funcionario)throws FuncionarioException,RepositoryFuncionarioException{
        this.repFuncionario.removerFuncionario(funcionario);
    }
    public Funcionario busFuncionarioPeloNome(String nome) throws FuncionarioException, RepositoryFuncionarioException{
        return this.repFuncionario.buscarFuncionarioPeloNome(nome);
    }
    public ArrayList<Funcionario> listarFuncionariosAll(ArrayList<Funcionario> arrayFuncionariosAll)throws FuncionarioException,RepositoryFuncionarioException{
           if (arrayFuncionariosAll != null) {

            for (int i = 0; i < arrayFuncionariosAll.size(); i++) {
                System.out.println(arrayFuncionariosAll.get(i));

            }
        }
        return arrayFuncionariosAll;
    }
    
    
}
