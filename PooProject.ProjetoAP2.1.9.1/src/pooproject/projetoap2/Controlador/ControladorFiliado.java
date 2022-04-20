package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;
import java.util.Scanner;
import PooProject.ProjetoAP2.Excecao.FiliadoException;
import PooProject.ProjetoAP2.Excecao.RepositorioFiliadoException;
import PooProject.ProjetoAP2.Modelo.Filiado;
import PooProject.ProjetoAP2.Repositorio.RepositorioFiliado;

public class ControladorFiliado implements IControladorFiliado{
	private static ControladorFiliado instancia;
	private RepositorioFiliado repFiliado;
	
	private static Scanner scanner = new Scanner(System.in);
	private static int tipoEscolha;
	
	public static ControladorFiliado getInstance() {
		if (instancia == null){
			instancia = new ControladorFiliado();
		}
		return instancia;
	}
	public ControladorFiliado() {
		repFiliado = RepositorioFiliado.getInstance();
	}
	@Override
	public void inserirFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		if(repFiliado.pesquisarFiliadoPeloCNPJ(filiado.getCNPJ())!= null){
			throw new FiliadoException("Filiado não cadastrado,pois ja existe CNPJ cadastrado");
		}
		else{ 
			this.repFiliado.inserirFiliado(filiado);
		}
	}
	@Override
	public void excluirFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		this.repFiliado.excluirFiliado(filiado);
	}
	@Override
	public void excluirFiliadoPeloNome(String nome) throws FiliadoException, RepositorioFiliadoException {		
		if (repFiliado.pesquisarFiliadoPeloNome(nome) != null) {
			this.repFiliado.excluirFiliadoPeloNome(nome);
		}else{
			throw new FiliadoException("Empresa não localizado");
		}
	}
	@Override
	public Filiado pesquisarFiliadoPeloCNPJ(String cnpj) throws FiliadoException, RepositorioFiliadoException {
		return this.repFiliado.pesquisarFiliadoPeloCNPJ(cnpj);
	}
	@Override
	public Filiado pesquisarFiliadoPeloNome(String nome) throws FiliadoException, RepositorioFiliadoException {
		return this.repFiliado.pesquisarFiliadoPeloNome(nome);
	}
	@Override
	public ArrayList<Filiado> listarFiliado() throws FiliadoException, RepositorioFiliadoException {
		return this.repFiliado.listarFiliado();
	}
	@Override
	public void atualizarFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		this.repFiliado.atualizarFiliado(filiado);
	}
	@Override
	public ArrayList<Filiado> listarFiliadosAll(ArrayList<Filiado> arrayFiliadosAll)throws FiliadoException, RepositorioFiliadoException {
	if (arrayFiliadosAll != null){
				
				for (int i = 0; i< arrayFiliadosAll.size(); i++){
					arrayFiliadosAll.get(i);
						System.out.println("Codigo do Filiado : " + arrayFiliadosAll.get(i).getCodFiliado()+ " Nome: " + arrayFiliadosAll.get(i).getNomeFiliado() + " - CNPJ: " + arrayFiliadosAll.get(i).getCNPJ()
								+": Quantidade "+ arrayFiliadosAll.get(i).getQtdFornecida() + " Tipo de Fornecimento:  "+ arrayFiliadosAll.get(i).getTipoFornecimento() +" Valor recebido:" + arrayFiliadosAll.get(i).getValorRecebido()
								+"Email :" +arrayFiliadosAll.get(i).getEmail()+ " Telefone" +arrayFiliadosAll.get(i).getTelefone() + " Valor da Unidade"+arrayFiliadosAll.get(i).getValorUnidade());		
				}
			}
			return arrayFiliadosAll;
		}
	@Override
	public void escolhaAtualizarFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		System.out.println("escolha a opção desejada \n onde: \n 1 para Atualizar Nome do Funcionario \n 2 Atualizar Email "
				+ "\n 3 Atualizar Tipo de Fornecimento \n 4 Atualizar Telefone  \n 5  Atualizar Nome  e Email \n 6 Nome,Salario e Tipo de Fornecimento "
				+ " \n 7 sair");
		tipoEscolha = scanner.nextInt();
		switch (tipoEscolha) {
		case 1:
			System.out.println("Digite o novo Nome");
			filiado.setNomeFiliado(scanner.nextLine());
			filiado.setNomeFiliado(scanner.nextLine());
			repFiliado.atualizarFiliado(filiado);
			break;
		case 2:
			System.out.println("Digite o novo Email");
			filiado.setEmail(scanner.nextLine());
			filiado.setEmail(scanner.nextLine());
			repFiliado.atualizarFiliado(filiado);	
			break;
		case 3:
			System.out.println("Digite o Tipo de Fornecimento");
			filiado.setTipoFornecimento(scanner.nextLine());
			filiado.setTipoFornecimento(scanner.nextLine());
			repFiliado.atualizarFiliado(filiado);	
			break;
		case 4:
			System.out.println("Digite o novo Telefone");
			filiado.setTelefone(scanner.nextLine());
			filiado.setTelefone(scanner.nextLine());
			repFiliado.atualizarFiliado(filiado);	
			break;
		case 5:
			System.out.println("Digite o novo nome");
			filiado.setNomeFiliado(scanner.nextLine());
			System.out.println("Digite o novo Email");
			filiado.setEmail(scanner.nextLine());			
			repFiliado.atualizarFiliado(filiado);	
			break;
		case 6:
			System.out.println("Digite o novo nome");
			filiado.setNomeFiliado(scanner.nextLine());
			System.out.println("Digite o novo Email");
			filiado.setEmail(scanner.nextLine());
			System.out.println("Digite o Tipo de Fornecimento");
			filiado.setTipoFornecimento(scanner.nextLine());
			repFiliado.atualizarFiliado(filiado);	
			break;
		case 7:
			System.out.println("Você escolheu a opção voltar");			
			break;
		default:
			System.out.println("Você não escolheu uma opção valida");
			break;
		}
	}
	@Override
	public ArrayList<Filiado> calcularProdutos(ArrayList<Filiado> calcularProdutos)	throws FiliadoException, RepositorioFiliadoException {
	
		return calcularProdutos;
	}
	@Override
	public Double calcularValorRecebidoFiliado(double preco, int qtd) throws FiliadoException, RepositorioFiliadoException {
		preco = preco * qtd;
		return preco;
	}
}
