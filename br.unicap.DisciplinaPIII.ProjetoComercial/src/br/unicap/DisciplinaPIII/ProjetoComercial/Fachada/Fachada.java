package br.unicap.DisciplinaPIII.ProjetoComercial.Fachada;

import br.unicap.DisciplinaPIII.ProjetoComercial.Controller.ControllerCliente;
import br.unicap.DisciplinaPIII.ProjetoComercial.Controller.ControllerEmpresa;
import br.unicap.DisciplinaPIII.ProjetoComercial.Controller.ControllerFornecedores;
import br.unicap.DisciplinaPIII.ProjetoComercial.Controller.ControllerFuncionario;
import br.unicap.DisciplinaPIII.ProjetoComercial.Controller.ControllerProduto;
import br.unicap.DisciplinaPIII.ProjetoComercial.Controller.ControllerVenda;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.ClienteException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.EmpresaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.FornecedoresException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.FuncionarioException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.ProdutoException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryClienteException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryEmpresaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryFornecedoresException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryFuncionarioException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryProdutoException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.RepositoryVendaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Exception.VendaException;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Cliente;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Empresa;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Fornecedores;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Funcionario;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Renato Nunes
 */
public class Fachada implements IFachada{
    private static Fachada  instancia;
    private ControllerCliente controllerCliente;
    private ControllerFuncionario controllerFuncionario;
    private ControllerProduto controllerProduto;
    private ControllerVenda controllerVenda;
    private ControllerFornecedores controllerFornecedores;
    private ControllerEmpresa controllerEmpresa;
    public static Fachada getInstance() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }

    public Fachada() {
        this.controllerCliente = ControllerCliente.getInstance();
        this.controllerFuncionario = ControllerFuncionario.getInstance();
        this.controllerProduto = ControllerProduto.getInstance();
        this.controllerVenda = ControllerVenda.getInstance();
        this.controllerFornecedores = ControllerFornecedores.getInstance();
        this.controllerEmpresa = ControllerEmpresa.getInstance();
    }
    
        //@cliente------------------
    @Override
    public void cadastrarCliente(Cliente cliente) throws ClienteException, RepositoryClienteException {
        this.controllerCliente.cadastrarCliente(cliente);
    }
    @Override
    public ArrayList<Cliente> listarClientes() throws ClienteException, RepositoryClienteException {
       return this.controllerCliente.listarClientes();
    }
    @Override
    public Cliente buscarCliente(String codigoCli) throws ClienteException, RepositoryClienteException{
       return this.controllerCliente.buscarCliente(codigoCli);
    }
    @Override
    public Cliente buscarClienteCPFouCNPJ(String cpfOuCnpj) throws ClienteException, RepositoryClienteException{
        return this.controllerCliente.buscarClienteCPFouCNPJ(cpfOuCnpj);
    }
    @Override
    public Cliente buscarClientePeloNome(String nome) throws ClienteException, RepositoryClienteException{
        return this.controllerCliente.buscarClientePeloNome(nome);
    }
    @Override
    public void atualizarCliente(Cliente cliente) throws ClienteException, RepositoryClienteException{
       this.controllerCliente.atualizarCliente(cliente);
    }
    @Override
    public void removerCliente(Cliente cliente) throws ClienteException, RepositoryClienteException{
        this.controllerCliente.removerCliente(cliente);
    }
    @Override
    public ArrayList<Cliente> listarClientesAll(ArrayList<Cliente> arrayClientesAll) throws ClienteException, RepositoryClienteException{
        return this.controllerCliente.listarClientesAll(arrayClientesAll);
    } 
  
        //@funcionarios----------------------------
    @Override
    public void cadastrarFuncionario(Funcionario funcionario) throws FuncionarioException,RepositoryFuncionarioException{
        this.controllerFuncionario.cadastrarFuncionario(funcionario);
    }

    @Override
    public ArrayList<Funcionario> listarFuncionarios()throws FuncionarioException,RepositoryFuncionarioException {
       return this.controllerFuncionario.listarFuncionarios();
    }

    @Override
    public Funcionario buscarFuncionario(String idFuncionario) throws FuncionarioException,RepositoryFuncionarioException{
        return this.controllerFuncionario.buscarFuncionario(idFuncionario);
    }

    @Override
    public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioException,RepositoryFuncionarioException{
        this.controllerFuncionario.atualizarFuncionario(funcionario);
    }

    @Override
    public void removerFuncionario(Funcionario funcionario) throws FuncionarioException,RepositoryFuncionarioException{
        this.controllerFuncionario.removerFuncionario(funcionario);
    }

    @Override
    public ArrayList<Funcionario> listarFuncionariosAll(ArrayList<Funcionario> arrayFuncionariosAll) throws FuncionarioException,RepositoryFuncionarioException{
        return this.controllerFuncionario.listarFuncionariosAll(arrayFuncionariosAll);
    }
    @Override
    public Funcionario buscarFuncionarioPeloNome(String nome) throws FuncionarioException, RepositoryFuncionarioException {
        return this.controllerFuncionario.busFuncionarioPeloNome(nome);
    }
    
        //@produto -----------
    @Override
    public void cadastrarProduto(Produto produto) throws ProdutoException, RepositoryProdutoException {
        this.controllerProduto.cadastrarProduto(produto);
    }
    @Override
    public ArrayList<Produto> listarProduto() throws ProdutoException, RepositoryProdutoException {
        return this.controllerProduto.listarProduto();
    }
    @Override
    public Produto buscarProduto(String idProduto) throws ProdutoException, RepositoryProdutoException {
        return this.controllerProduto.buscarProduto(idProduto);
    }
    @Override
    public void atualizarProduto(Produto produto) throws ProdutoException, RepositoryProdutoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void removerProduto(Produto produto) throws ProdutoException, RepositoryProdutoException {
        this.controllerProduto.removerProduto(produto);
    }
    @Override
    public ArrayList<Produto> listarProdutosAll(ArrayList<Produto> listarProdutosAll) throws ProdutoException, RepositoryProdutoException {
        return this.controllerProduto.listarProdutosAll(listarProdutosAll);
    }
    
     //@venda ....
    @Override
    public void addProduto(Produto produto) throws VendaException, RepositoryVendaException {
        this.controllerVenda.addProduto(produto);
    }

    @Override
    public ArrayList<Produto> listarProdutosVenda() throws VendaException, RepositoryVendaException {
        return this.controllerVenda.listarProdutosVenda();
    }

    @Override
    public Produto buscarProdutoVenda(String idProduto) throws VendaException, RepositoryVendaException {
        return  this.controllerVenda.buscarProdutoVenda(idProduto);
    }

    @Override
    public void removerProdutoVenda(Produto produto) throws VendaException, RepositoryVendaException {
        this.controllerVenda.removerProdutoVenda(produto);
    }

    @Override
    public ArrayList<Produto> listarProdutosAllCarrinho(ArrayList<Produto> listarProdutosAllCarrinho) throws VendaException, RepositoryVendaException {
        return this.controllerVenda.listarProdutosAllCarrinho(listarProdutosAllCarrinho);
    }

    @Override
    public void calcularVenda(ArrayList<Produto> listarProdutosAllCarrinho) throws VendaException, RepositoryVendaException {
        this.controllerVenda.calcularVenda(listarProdutosAllCarrinho);
    }
      //@fornecedores
    @Override
    public void cadastrarFornecedores(Fornecedores fornecedores) throws FornecedoresException, RepositoryFornecedoresException {
        this.controllerFornecedores.cadastrarFornecedores(fornecedores);
    }

    @Override
    public ArrayList<Fornecedores> listarFornecedores() throws FornecedoresException, RepositoryFornecedoresException {
        return this.controllerFornecedores.listarFornecedores();
    }

    @Override
    public Fornecedores buscarFornecedores(String codFiliado) throws FornecedoresException, RepositoryFornecedoresException {
        return  this.controllerFornecedores.buscarFornecedores(codFiliado);
    }
    
    @Override
    public void atualizarFornecedores(Fornecedores fornecedores) throws FornecedoresException,RepositoryFornecedoresException {
        this.controllerFornecedores.atualizarFornecedores(fornecedores);
    }

    @Override
    public void removerFornecedores(Fornecedores fornecedores) throws FornecedoresException, RepositoryFornecedoresException {
        this.controllerFornecedores.removerFornecedores(fornecedores);
    }

    @Override
    public ArrayList<Fornecedores> listarFornecedoresAll(ArrayList<Fornecedores> listarFornecedoresAll) throws FornecedoresException, RepositoryFornecedoresException {
        return this.controllerFornecedores.listarFornecedoresAll(listarFornecedoresAll);
    }

    //@empresa
    @Override
    public void cadastrarEmpresa(Empresa empresa) throws EmpresaException, RepositoryEmpresaException {
        this.controllerEmpresa.cadastrarEmpresa(empresa);
    }

    @Override
    public ArrayList<Empresa> listarEmpresa() throws EmpresaException, RepositoryEmpresaException {
        return this.controllerEmpresa.listarEmpresa();
    }

    @Override
    public Empresa buscarEmpresa(String codigoEmpresa) throws EmpresaException, RepositoryEmpresaException {
        return this.controllerEmpresa.buscarEmpresa(codigoEmpresa);
    }
    
    @Override
    public void atualizarEmpresa(Empresa empresa) throws EmpresaException,RepositoryEmpresaException {
        this.controllerEmpresa.atualizarEmpresa(empresa);
    }

    @Override
    public void removerEmpresa(Empresa empresa) throws EmpresaException, RepositoryEmpresaException {
        this.controllerEmpresa.removerEmpresa(empresa);
    }

    @Override
    public ArrayList<Empresa> listarEmpresaAll(ArrayList<Empresa> listarEmpresaAll) throws EmpresaException, RepositoryEmpresaException {
        return this.controllerEmpresa.listarEmpresaAll(listarEmpresaAll);
    }
    
    //add os metodos de //demais classe
}   
