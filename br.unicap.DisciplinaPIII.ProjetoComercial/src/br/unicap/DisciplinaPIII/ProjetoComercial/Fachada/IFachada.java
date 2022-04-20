package br.unicap.DisciplinaPIII.ProjetoComercial.Fachada;

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
public interface IFachada {
          //@cliente-----------
    public void cadastrarCliente(Cliente cliente) throws ClienteException, RepositoryClienteException ;
    public ArrayList<Cliente> listarClientes() throws ClienteException, RepositoryClienteException;
    public Cliente buscarCliente(String codigoCli) throws ClienteException, RepositoryClienteException;
    public Cliente buscarClienteCPFouCNPJ(String cpfOuCnpj) throws ClienteException, RepositoryClienteException;
    public Cliente buscarClientePeloNome(String nome) throws ClienteException, RepositoryClienteException;
    public void atualizarCliente(Cliente cliente) throws ClienteException, RepositoryClienteException;
    public void removerCliente(Cliente cliente) throws ClienteException, RepositoryClienteException;
    public ArrayList<Cliente> listarClientesAll(ArrayList<Cliente> arrayClientesAll) throws ClienteException, RepositoryClienteException;
        //@funcionario------------
    public void cadastrarFuncionario(Funcionario funcionario)throws FuncionarioException,RepositoryFuncionarioException;
    public ArrayList<Funcionario> listarFuncionarios()throws FuncionarioException,RepositoryFuncionarioException;
    public Funcionario buscarFuncionario(String idFuncionario)throws FuncionarioException,RepositoryFuncionarioException;
    public void atualizarFuncionario(Funcionario funcionario)throws FuncionarioException,RepositoryFuncionarioException;
    public void removerFuncionario(Funcionario funcionario)throws FuncionarioException,RepositoryFuncionarioException;
    public ArrayList<Funcionario> listarFuncionariosAll(ArrayList<Funcionario> arrayFuncionariosAll)throws FuncionarioException,RepositoryFuncionarioException;
    public Funcionario buscarFuncionarioPeloNome(String nome)throws FuncionarioException,RepositoryFuncionarioException;
    //@Produto--------
    public void cadastrarProduto(Produto produto)throws ProdutoException,RepositoryProdutoException;
    public ArrayList<Produto> listarProduto()throws ProdutoException,RepositoryProdutoException;
    public Produto buscarProduto(String idProduto)throws ProdutoException,RepositoryProdutoException;
    public void atualizarProduto(Produto produto)throws ProdutoException,RepositoryProdutoException;
    public void removerProduto(Produto produto)throws ProdutoException,RepositoryProdutoException;
    public ArrayList<Produto> listarProdutosAll(ArrayList<Produto> listarProdutosAll)throws ProdutoException,RepositoryProdutoException;
    
    public void addProduto(Produto produto) throws VendaException,RepositoryVendaException;
    public ArrayList<Produto> listarProdutosVenda() throws VendaException,RepositoryVendaException;
    public Produto buscarProdutoVenda(String idProduto) throws VendaException,RepositoryVendaException;
    public void removerProdutoVenda(Produto produto) throws VendaException,RepositoryVendaException;
    public ArrayList<Produto> listarProdutosAllCarrinho(ArrayList<Produto> listarProdutosAllCarrinho)throws VendaException,RepositoryVendaException;
    public void calcularVenda(ArrayList<Produto> listarProdutosAllCarrinho) throws VendaException,RepositoryVendaException;

    //@Fornecedores
    public void cadastrarFornecedores(Fornecedores fornecedores) throws FornecedoresException, RepositoryFornecedoresException;
    public ArrayList<Fornecedores> listarFornecedores() throws FornecedoresException, RepositoryFornecedoresException;
    public Fornecedores buscarFornecedores(String codFiliado) throws FornecedoresException, RepositoryFornecedoresException;
    public void atualizarFornecedores(Fornecedores fornecedores) throws FornecedoresException,RepositoryFornecedoresException;
    public void removerFornecedores(Fornecedores fornecedores) throws FornecedoresException, RepositoryFornecedoresException;
    public ArrayList<Fornecedores> listarFornecedoresAll(ArrayList<Fornecedores> listarFornecedoresAll) throws FornecedoresException, RepositoryFornecedoresException;
    
    //@Empresa
    public void cadastrarEmpresa(Empresa empresa) throws EmpresaException, RepositoryEmpresaException;
    public ArrayList<Empresa> listarEmpresa() throws EmpresaException, RepositoryEmpresaException;
    public Empresa buscarEmpresa(String codigoEmpresa) throws EmpresaException, RepositoryEmpresaException;
    public void atualizarEmpresa(Empresa empresa) throws EmpresaException,RepositoryEmpresaException;
    public void removerEmpresa(Empresa empresa) throws EmpresaException, RepositoryEmpresaException;
    public ArrayList<Empresa> listarEmpresaAll(ArrayList<Empresa> listarEmpresaAll) throws EmpresaException, RepositoryEmpresaException;
    
    
    
    //add os metodos de//pro dutos abaixo
}
