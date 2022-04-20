package PooProject.ProjetoAP2.Fachada;

import java.util.ArrayList;
import PooProject.ProjetoAP2.Controlador.ControladorCliente;
import PooProject.ProjetoAP2.Controlador.ControladorEmpresa;
import PooProject.ProjetoAP2.Controlador.ControladorEndereco;
import PooProject.ProjetoAP2.Controlador.ControladorFiliado;
import PooProject.ProjetoAP2.Controlador.ControladorFinanceiro;
import PooProject.ProjetoAP2.Controlador.ControladorFuncionario;
import PooProject.ProjetoAP2.Controlador.ControladorProduto;
import PooProject.ProjetoAP2.Controlador.ControladorVenda;
import PooProject.ProjetoAP2.Controlador.IControladorCliente;
import PooProject.ProjetoAP2.Controlador.IControladorEmpresa;
import PooProject.ProjetoAP2.Controlador.IControladorEndereco;
import PooProject.ProjetoAP2.Controlador.IControladorFiliado;
import PooProject.ProjetoAP2.Controlador.IControladorFinanceiro;
import PooProject.ProjetoAP2.Controlador.IControladorFuncionario;
import PooProject.ProjetoAP2.Controlador.IControladorProduto;
import PooProject.ProjetoAP2.Controlador.IControladorVenda;
import PooProject.ProjetoAP2.Excecao.ClienteException;
import PooProject.ProjetoAP2.Excecao.EmpresaException;
import PooProject.ProjetoAP2.Excecao.EnderecoException;
import PooProject.ProjetoAP2.Excecao.FiliadoException;
import PooProject.ProjetoAP2.Excecao.FinanceiroExcepiton;
import PooProject.ProjetoAP2.Excecao.FuncionarioException;
import PooProject.ProjetoAP2.Excecao.ProdutoException;
import PooProject.ProjetoAP2.Excecao.RepositorioClienteException;
import PooProject.ProjetoAP2.Excecao.RepositorioEmpresaException;
import PooProject.ProjetoAP2.Excecao.RepositorioFiliadoException;
import PooProject.ProjetoAP2.Excecao.RepositorioFinanceiroException;
import PooProject.ProjetoAP2.Excecao.RepositorioFuncionarioException;
import PooProject.ProjetoAP2.Excecao.RepositorioProdutoException;
import PooProject.ProjetoAP2.Excecao.RepositorioVendaException;
import PooProject.ProjetoAP2.Excecao.VendaException;
import PooProject.ProjetoAP2.Modelo.ClientePF;
import PooProject.ProjetoAP2.Modelo.ClientePJ;
import PooProject.ProjetoAP2.Modelo.Empresa;
import PooProject.ProjetoAP2.Modelo.Endereco;
import PooProject.ProjetoAP2.Modelo.Filiado;
import PooProject.ProjetoAP2.Modelo.Financeiro;
import PooProject.ProjetoAP2.Modelo.Funcionario;
import PooProject.ProjetoAP2.Modelo.Produto;
import PooProject.ProjetoAP2.Modelo.Venda;


public class Fachada implements IControladorCliente,IControladorFuncionario,IControladorProduto,
								IControladorFiliado,IControladorVenda,IControladorEmpresa,IControladorEndereco,IControladorFinanceiro{
	
	private static Fachada  instancia;
	private IControladorCliente controladorCliente;
	private IControladorFuncionario controladorFuncionario;
	private IControladorProduto controladorProduto;
	private IControladorFiliado controladorFiliado;
	private IControladorVenda controladorVenda;
	private IControladorEmpresa controladorEmpresa;
	private IControladorEndereco controladorEndereco;
	private IControladorFinanceiro controladorFinanceiro;

	public static Fachada getInstance(){
		if (instancia == null ){
			instancia = new Fachada();
		}
		return instancia;
	}
	private  Fachada() {
		controladorCliente = ControladorCliente.getInstance();
		controladorFuncionario = ControladorFuncionario.getInstance();
		controladorProduto = ControladorProduto.getInstance();
		controladorFiliado = ControladorFiliado.getInstance();
		controladorVenda = ControladorVenda.getInstance();
		controladorEmpresa = ControladorEmpresa.getInstance();
		controladorEndereco = ControladorEndereco.getInstance();	
		controladorFinanceiro = ControladorFinanceiro.getInstance();
	}

	@Override
	public void inserirClientePF(ClientePF clientePF) throws ClienteException, RepositorioClienteException {
		this.controladorCliente.inserirClientePF(clientePF);
	}

	@Override
	public void excluirClientePJ(ClientePJ cliente) throws ClienteException, RepositorioClienteException {
		this.controladorCliente.excluirClientePJ(cliente);
	}

	@Override
	public void excluirClientePeloNome(String nome) throws ClienteException, RepositorioClienteException {
		this.controladorCliente.excluirClientePeloNome(nome);
	}

	@Override
	public ClientePF pesquisarClientePeloCPF(String cpf) throws ClienteException, RepositorioClienteException {
		return this.controladorCliente.pesquisarClientePeloCPF(cpf);
	}

	@Override
	public ClientePF pesquisarClientePeloNome(String nome) throws ClienteException, RepositorioClienteException {
		return this.controladorCliente.pesquisarClientePeloNome(nome);
	}

	@Override
	public void inserirClientePJ(ClientePJ clientePJ) throws ClienteException, RepositorioClienteException {
		this.controladorCliente.inserirClientePJ(clientePJ);
	}

	@Override
	public ClientePJ pesquisarClientePeloCNPJ(String cnpj) throws ClienteException, RepositorioClienteException {
		return this.controladorCliente.pesquisarClientePeloCNPJ(cnpj);
	}
	@Override
	public ArrayList<ClientePF> listarClientesPF() throws ClienteException, RepositorioClienteException {
		return this.controladorCliente.listarClientesPF();
	}
	@Override
	public ArrayList<ClientePJ> listarClientesPJ() throws ClienteException, RepositorioClienteException {
		return this.controladorCliente.listarClientesPJ();
	}
	@Override
	public void atualizarClientePF(ClientePF clientePF) throws ClienteException, RepositorioClienteException {
		this.controladorCliente.atualizarClientePF(clientePF);
	}
	@Override
	public void atualizarClientePJ(ClientePJ clientePJ) throws ClienteException, RepositorioClienteException {
		this.controladorCliente.atualizarClientePJ(clientePJ);
	}
	
	@Override
	public ArrayList<ClientePF> listarClientesAll(ArrayList<ClientePF> arrayClientesAll) throws ClienteException, RepositorioClienteException {
		return this.controladorCliente.listarClientesAll(arrayClientesAll);
	}
	@Override
	public ArrayList<ClientePJ> listarClientesPJAll(ArrayList<ClientePJ> arrayClientesPJAll) throws ClienteException, RepositorioClienteException {
		return this.controladorCliente.listarClientesPJAll(arrayClientesPJAll);
	}
	@Override
	public void escolhaAtualizarClientePF(ClientePF clientePF) throws ClienteException, RepositorioClienteException {
		this.controladorCliente.escolhaAtualizarClientePF(clientePF);
	}
	@Override
	public void escolhaAtualizarClientePJ(ClientePJ clientePJ) throws ClienteException, RepositorioClienteException {
		this.controladorCliente.escolhaAtualizarClientePJ(clientePJ);
	}
	
	/**    Funcionarios    */
	@Override
	public void inserirFuncionario(Funcionario funcionario) throws FuncionarioException, RepositorioFuncionarioException {
		this.controladorFuncionario.inserirFuncionario(funcionario);
	}
	@Override
	public void excluirFuncionario(Funcionario funcionario) throws FuncionarioException, RepositorioFuncionarioException {
		this.controladorFuncionario.excluirFuncionario(funcionario);
	}
	@Override
	public void excluirFuncionarioPeloNome(String nome) throws FuncionarioException, RepositorioFuncionarioException {
		this.controladorFuncionario.excluirFuncionarioPeloNome(nome);
	}
	@Override
	public Funcionario pesquisarFuncionarioPeloCPF(String cpf) throws FuncionarioException, RepositorioFuncionarioException {
		return this.controladorFuncionario.pesquisarFuncionarioPeloCPF(cpf);
	}
	@Override
	public Funcionario pesquisarFuncionarioPeloNome(String nome) throws FuncionarioException, RepositorioFuncionarioException {
		return controladorFuncionario.pesquisarFuncionarioPeloNome(nome);
	}
	@Override
	public ArrayList<Funcionario> listarFuncionario() throws FuncionarioException, RepositorioFuncionarioException {
		return this.controladorFuncionario.listarFuncionario();
	}
	@Override
	public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioException, RepositorioFuncionarioException {
		this.controladorFuncionario.atualizarFuncionario(funcionario);
		
	}
	@Override
	public ArrayList<Funcionario> listarFuncionariosAll(ArrayList<Funcionario> arrayFuncionariosAll)  throws FuncionarioException, RepositorioFuncionarioException{
		return this.controladorFuncionario.listarFuncionariosAll(arrayFuncionariosAll);
	}
	@Override
	public void escolhaAtualizarFuncionaro(Funcionario funcionario)	throws FuncionarioException, RepositorioFuncionarioException {
		this.controladorFuncionario.escolhaAtualizarFuncionaro(funcionario);
	}	
	@Override
	public ArrayList<Funcionario> calcularSalario(ArrayList<Funcionario> calcularSalarios)throws FuncionarioException, RepositorioFuncionarioException {
		return this.controladorFuncionario.calcularSalario(calcularSalarios);
	}
	@Override
	public void cadastrarFuncionarios(Funcionario funcionario)throws FuncionarioException, RepositorioFuncionarioException {
		this.controladorFuncionario.cadastrarFuncionarios(funcionario);

	}
	/**   Produto  */
	@Override
	public void inserirProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		this.controladorProduto.inserirProduto(produto);
	}
	@Override
	public void excluirProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		this.controladorProduto.excluirProduto(produto);
	}
	@Override
	public void excluirProdutoPeloNome(String nome) throws ProdutoException, RepositorioProdutoException {
		this.controladorProduto.excluirProdutoPeloNome(nome);
	}
	@Override
	public Produto pesquisarProdutoPeloCodigo(int codigo) throws ProdutoException, RepositorioProdutoException {
		return this.controladorProduto.pesquisarProdutoPeloCodigo(codigo);
	}
	@Override
	public Produto pesquisarProdutoPeloNome(String nome) throws ProdutoException, RepositorioProdutoException {
		return this.controladorProduto.pesquisarProdutoPeloNome(nome);	
		}
	@Override
	public ArrayList<Produto> listarProdutos() throws ProdutoException, RepositorioProdutoException {
		return this.controladorProduto.listarProdutos();
	}
	@Override
	public void atualizarProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		this.controladorProduto.atualizarProduto(produto);
	}		
	@Override
	public ArrayList<Produto> listarProdutosAll(ArrayList<Produto> arrayProdutosAll) throws ProdutoException, RepositorioProdutoException {
		
		return this.controladorProduto.listarProdutosAll(arrayProdutosAll);
	}
	@Override
	public void cadastrarProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		this.controladorProduto.cadastrarProduto(produto);
	}
	@Override
	public void escolhaAtualizarProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		this.controladorProduto.escolhaAtualizarProduto(produto);
		
	}

	/** Filiado */
	@Override
	public void inserirFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		this.controladorFiliado.inserirFiliado(filiado);
	}
	@Override
	public void excluirFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		this.controladorFiliado.excluirFiliado(filiado);
	}
	
	@Override
	public void excluirFiliadoPeloNome(String nome) throws FiliadoException, RepositorioFiliadoException {
		 this.controladorFiliado.excluirFiliadoPeloNome(nome);
	}
	@Override
	public Filiado pesquisarFiliadoPeloCNPJ(String cnpj) throws FiliadoException, RepositorioFiliadoException {
		return this.controladorFiliado.pesquisarFiliadoPeloCNPJ(cnpj);
	}
	@Override
	public Filiado pesquisarFiliadoPeloNome(String nome) throws FiliadoException, RepositorioFiliadoException {
		return this.controladorFiliado.pesquisarFiliadoPeloNome(nome);
	}
	@Override
	public ArrayList<Filiado> listarFiliado() throws FiliadoException, RepositorioFiliadoException {
		return this.controladorFiliado.listarFiliado();
		
	}
	@Override
	public void atualizarFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		this.controladorFiliado.atualizarFiliado(filiado);
		
	}
	@Override
	public ArrayList<Filiado> listarFiliadosAll(ArrayList<Filiado> arrayFiliadosAll)  throws FiliadoException, RepositorioFiliadoException{
		return this.controladorFiliado.listarFiliadosAll(arrayFiliadosAll);
	}
	@Override
	public void escolhaAtualizarFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		this.controladorFiliado.escolhaAtualizarFiliado(filiado);
	}
	@Override
	public ArrayList<Filiado> calcularProdutos(ArrayList<Filiado> calcularProdutos)	throws FiliadoException, RepositorioFiliadoException {
		return this.controladorFiliado.calcularProdutos(calcularProdutos);
		
	}
	@Override
	public Double calcularValorRecebidoFiliado(double preco, int qtd) throws FiliadoException, RepositorioFiliadoException {
		return this.controladorFiliado.calcularValorRecebidoFiliado(preco, qtd);
	}
	
	
	/** Venda*/
	@Override
	public void inserirVenda(Venda venda) throws VendaException, RepositorioVendaException {
		this.controladorVenda.inserirVenda(venda);
	}
	@Override
	public void excluirVenda(Venda venda) throws VendaException, RepositorioVendaException {
		this.controladorVenda.excluirVenda(venda);
	}
	@Override
	public void excluirVendaPeloCodigo(int codigo) throws VendaException, RepositorioVendaException {
		this.controladorVenda.excluirVendaPeloCodigo(codigo);
	}
	@Override
	public Venda pesquisarVendaPeloCodigo(int codigo) throws VendaException, RepositorioVendaException {
		return this.controladorVenda.pesquisarVendaPeloCodigo(codigo);
	}
	@Override
	public Double calcularValorRecebido(double preco,int qtd) throws VendaException, RepositorioVendaException {
		return this.controladorVenda.calcularValorRecebido(preco, qtd);
	}
	@Override
	public ArrayList<Venda> listarVendas() throws VendaException, RepositorioVendaException {
		return this.controladorVenda.listarVendas();
	}
	@Override
	public void atualizarVenda(Venda venda) throws VendaException, RepositorioVendaException {
		this.controladorVenda.atualizarVenda(venda);
	}
	@Override
	public ArrayList<Venda> listarVendasAll(ArrayList<Venda> arrayVendasAll) throws VendaException, RepositorioVendaException {
		return this.controladorVenda.listarVendasAll(arrayVendasAll);
	}
	@Override
	public void cadastrarVenda(Venda venda) throws VendaException, RepositorioVendaException {
		this.controladorVenda.cadastrarVenda(venda);
	}
	@Override
	public void escolhaAtualizarVenda(Venda venda) throws VendaException, RepositorioVendaException {
		this.controladorVenda.escolhaAtualizarVenda(venda);
	}
	@Override
	public ArrayList<Venda> calcularVendas(ArrayList<Venda> calcularVenda)throws VendaException, RepositorioVendaException {
		return this.controladorVenda.calcularVendas(calcularVenda);
	}
	@Override
	public Double parcelaVenda(double valor) throws VendaException, RepositorioVendaException {
		return this.controladorVenda.parcelaVenda(valor);
	}
	/**Empresa */
	@Override
	public void inserirEmpresa(Empresa empresa) throws EmpresaException, RepositorioEmpresaException {
		this.controladorEmpresa.inserirEmpresa(empresa);
		}
	@Override
	public void excluirEmpresa(Empresa empresa) throws EmpresaException, RepositorioEmpresaException {
		this.controladorEmpresa.excluirEmpresa(empresa);
	}
	@Override
	public void excluirEmpresaPeloNome(String nome) throws EmpresaException, RepositorioEmpresaException {
		this.controladorEmpresa.excluirEmpresaPeloNome(nome);
	}
	@Override
	public Empresa pesquisarEmpresaPeloNome(String nome) throws EmpresaException, RepositorioEmpresaException {
		return this.controladorEmpresa.pesquisarEmpresaPeloNome(nome);
	}
	@Override
	public Empresa pesquisarEmpresaPeloCNPJ(String cnpj) throws EmpresaException, RepositorioEmpresaException {
		return this.controladorEmpresa.pesquisarEmpresaPeloCNPJ(cnpj);
	}
	@Override
	public ArrayList<Empresa> listarEmpresas() throws EmpresaException, RepositorioEmpresaException {
		return this.controladorEmpresa.listarEmpresas();
	}
	@Override
	public void atualizarEmpresa(Empresa empresa) throws EmpresaException, RepositorioEmpresaException {
		this.controladorEmpresa.atualizarEmpresa(empresa);
	}
	/** Endereço*/
	@Override
	public void cadastrarEndereco(Endereco e) throws EnderecoException {
		this.controladorEndereco.cadastrarEndereco(e);
	}
	/**Financeiro*/
	@Override
	public void inserirFinanceiro(Financeiro financeiro) throws FinanceiroExcepiton, RepositorioFinanceiroException {
		this.controladorFinanceiro.inserirFinanceiro(financeiro);
	}
	@Override
	public void excluirFinanceiro(Financeiro financeiro) throws FinanceiroExcepiton, RepositorioFinanceiroException {
		this.controladorFinanceiro.excluirFinanceiro(financeiro);
		
	}
	@Override
	public ArrayList<Financeiro> listarFinanceiro() throws FinanceiroExcepiton, RepositorioFinanceiroException {
		return this.controladorFinanceiro.listarFinanceiro();
	}
	@Override
	public void atualizarFinanceiro(Financeiro financeiro) throws FinanceiroExcepiton, RepositorioFinanceiroException {
		this.controladorFinanceiro.atualizarFinanceiro(financeiro);
	}
	@Override
	public Financeiro pesquisarFinanceiroPeloCodigo(int codigo)	throws FinanceiroExcepiton, RepositorioFinanceiroException {
		return this.controladorFinanceiro.pesquisarFinanceiroPeloCodigo(codigo);
	}
	@Override
	public Double calcularPatrimonio(double patrimonio, double gmF, double gmP, double gdM, double gmPg, double gmV)
			throws FinanceiroExcepiton, RepositorioFinanceiroException {
		return this.controladorFinanceiro.calcularPatrimonio(patrimonio, gmF, gmP, gdM, gmPg, gmV);
	}


	

	
	}
