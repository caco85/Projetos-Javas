package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;
import java.util.Scanner;

import PooProject.ProjetoAP2.Excecao.FuncionarioException;
import PooProject.ProjetoAP2.Excecao.RepositorioFuncionarioException;
import PooProject.ProjetoAP2.Modelo.Funcionario;
import PooProject.ProjetoAP2.Repositorio.RepositorioFuncionario;
import util.Constants;

public class ControladorFuncionario implements IControladorFuncionario{
	
	public RepositorioFuncionario repFuncinario; 
	public static ControladorFuncionario instancia;
	
	private static Scanner scanner = new Scanner(System.in);
	private static int tipoEscolha;
	
	public static ControladorFuncionario getInstance(){
	 if (instancia == null) {
		 instancia = new ControladorFuncionario();
	}	
	 return instancia;
	}
	public ControladorFuncionario() {
		repFuncinario = RepositorioFuncionario.getInstance();
	}

	@Override
	public void inserirFuncionario(Funcionario funcionario)	throws FuncionarioException, RepositorioFuncionarioException {
		if(repFuncinario.pesquisarFuncionarioPeloCPF(funcionario.getCpf()) != null){
			throw new FuncionarioException("Não cadastrado devido ja existe funcionario ");
		}else{
		this.repFuncinario.inserirFuncionario(funcionario);
		}
	}

	@Override
	public void excluirFuncionario(Funcionario funcionario) throws FuncionarioException, RepositorioFuncionarioException {
		this.repFuncinario.excluirFuncionario(funcionario);
	}

	@Override
	public void excluirFuncionarioPeloNome(String nome) throws FuncionarioException, RepositorioFuncionarioException {
		if(repFuncinario.pesquisarFuncionarioPeloNome(nome) != null ){
			this.repFuncinario.excluirFuncionarioPeloNome(nome);
		}else{
			throw new FuncionarioException("Funcionario não localizado");
		}
	}

	@Override
	public Funcionario pesquisarFuncionarioPeloCPF(String cpf)	throws FuncionarioException, RepositorioFuncionarioException {
		return this.repFuncinario.pesquisarFuncionarioPeloCPF(cpf);
	}

	@Override
	public Funcionario pesquisarFuncionarioPeloNome(String nome) throws FuncionarioException, RepositorioFuncionarioException {
		return this.repFuncinario.pesquisarFuncionarioPeloNome(nome);
	}


	@Override
	public ArrayList<Funcionario> listarFuncionario() throws FuncionarioException, RepositorioFuncionarioException {
		return this.repFuncinario.listarFuncionario();
	}


	@Override
	public void atualizarFuncionario(Funcionario funcionario)throws FuncionarioException, RepositorioFuncionarioException {
		this.repFuncinario.atualizarFuncionario(funcionario);
		
	}
	@Override
	public ArrayList<Funcionario> listarFuncionariosAll(ArrayList<Funcionario> arrayFuncionariosAll) throws FuncionarioException, RepositorioFuncionarioException{
	if (arrayFuncionariosAll != null){
			
			for (int i = 0; i< arrayFuncionariosAll.size(); i++){
				arrayFuncionariosAll.get(i);
					System.out.println("Codigo do Funcionario : "+arrayFuncionariosAll.get(i).getCodFuncionario()+ " Nome : " + arrayFuncionariosAll.get(i).getNomeFuncionario() + "  CPF: " + arrayFuncionariosAll.get(i).getCpf()
							+"Data de Entrada :  "+ arrayFuncionariosAll.get(i).getDataEntrada()+" Data Saida :  "+ arrayFuncionariosAll.get(i).getDataSaida() +" Ferias" + arrayFuncionariosAll.get(i).getDataFerias()
							+" Cargo :" +arrayFuncionariosAll.get(i).getCargo()+ " Horario" +arrayFuncionariosAll.get(i).getHorario() + ""+arrayFuncionariosAll.get(i).getEndereco());		
			}
		}
		return arrayFuncionariosAll;
	}
	@Override
	public void escolhaAtualizarFuncionaro(Funcionario funcionario)	throws FuncionarioException, RepositorioFuncionarioException {
		System.out.println("escolha a opção desejada \n onde: \n 1 para Atualizar Nome do Funcionario \n 2 Atualizar Salario \n 3 Atualizar da Data de Entrada "
				+ "\n 4 Atualizar a Data de Saida  \n 5  Atualizar Nome  e Salario \n 6 Nome,Salario e Data saida  \n 7 sair");
		tipoEscolha = scanner.nextInt();
		switch (tipoEscolha) {
		case 1:
			System.out.println("Digite o novo Nome");
			funcionario.setNomeFuncionario(scanner.nextLine());
			funcionario.setNomeFuncionario(scanner.nextLine());
			repFuncinario.atualizarFuncionario(funcionario);
			break;
		case 2:
			System.out.println("Digite o novo Salario");
			funcionario.setSalario(scanner.nextDouble());
			funcionario.setSalario(scanner.nextDouble());
			repFuncinario.atualizarFuncionario(funcionario);	
			break;
		case 3:
			System.out.println("Digite a nova data de fundação");
			funcionario.setDataEntrada(scanner.nextLine());
			funcionario.setDataEntrada(scanner.nextLine());
			repFuncinario.atualizarFuncionario(funcionario);	
			break;
		case 4:
			System.out.println("Digite a Nova data de Saida");
			funcionario.setDataSaida(scanner.nextLine());
			funcionario.setDataSaida(scanner.nextLine());
			repFuncinario.atualizarFuncionario(funcionario);	
			break;
		case 5:
			System.out.println("Digite o novo nome");
			funcionario.setNomeFuncionario(scanner.nextLine());
			System.out.println("Digite o novo Salario");
			funcionario.setSalario(scanner.nextDouble());			
			repFuncinario.atualizarFuncionario(funcionario);	
			break;
		case 6:
			System.out.println("Digite o novo nome");
			funcionario.setNomeFuncionario(scanner.nextLine());
			System.out.println("Digite o novo Salario");
			funcionario.setSalario(scanner.nextDouble());
			System.out.println("Digite a nova data de saida");
			funcionario.setDataSaida(scanner.nextLine());
			repFuncinario.atualizarFuncionario(funcionario);	
			
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
	public ArrayList<Funcionario> calcularSalario(ArrayList<Funcionario> calcularSalarios)throws FuncionarioException, RepositorioFuncionarioException {
		return calcularSalarios;
	}
	@Override
	public void cadastrarFuncionarios(Funcionario funcionario)throws FuncionarioException, RepositorioFuncionarioException {
		System.out.println("Escolha qual cargo deseja cadastrar \n onde:\n 1 cadastrar Vendedor \n 2 cadastrar Gerente "
				+ "\n 3 cadastar Cozinheiro \n 4 cadastrar Entregador \n 5 voltar");
		tipoEscolha = scanner.nextInt();
		switch (tipoEscolha) {
		case 1:
			   System.out.println("Cargo" + Constants.Funcionarios.Vendedor.getCargo());
			   funcionario.setCargo( Constants.Funcionarios.Vendedor.getCargo());
			   System.out.println("Salario do Funcinario R$"+  Constants.Funcionarios.Vendedor.getSalario());
			   funcionario.setSalario(Constants.Funcionarios.Vendedor.getSalario());
			   System.out.println("Harario do Funcinario " + Constants.Funcionarios.Vendedor.getHorario());
			   funcionario.setHorario(Constants.Funcionarios.Vendedor.getHorario());
			break;
		case 2:
			   System.out.println("Cargo" + Constants.Funcionarios.Gerente.getCargo());
			   funcionario.setCargo( Constants.Funcionarios.Gerente.getCargo());
			   System.out.println("Salario do Funcinario R$"+  Constants.Funcionarios.Gerente.getSalario());
			   funcionario.setSalario(Constants.Funcionarios.Gerente.getSalario());
			   System.out.println("Harario do Funcinario " + Constants.Funcionarios.Gerente.getHorario());
			   funcionario.setHorario(Constants.Funcionarios.Gerente.getHorario());
			break;
		case 3:
			   System.out.println("Cargo" + Constants.Funcionarios.Cozinheiro.getCargo());
			   funcionario.setCargo( Constants.Funcionarios.Cozinheiro.getCargo());
			   System.out.println("Salario do Funcinario R$"+  Constants.Funcionarios.Cozinheiro.getSalario());
			   funcionario.setSalario(Constants.Funcionarios.Cozinheiro.getSalario());
			   System.out.println("Harario do Funcinario " + Constants.Funcionarios.Cozinheiro.getHorario());
			   funcionario.setHorario(Constants.Funcionarios.Cozinheiro.getHorario());
			break;
		case 4:
			System.out.println("Cargo" + Constants.Funcionarios.Entregador.getCargo());
			   funcionario.setCargo( Constants.Funcionarios.Entregador.getCargo());
			   System.out.println("Salario do Funcinario R$"+  Constants.Funcionarios.Entregador.getSalario());
			   funcionario.setSalario(Constants.Funcionarios.Entregador.getSalario());
			   System.out.println("Harario do Funcinario " + Constants.Funcionarios.Entregador.getHorario());
			   funcionario.setHorario(Constants.Funcionarios.Entregador.getHorario());
			break;
		case 5:
			System.out.println("Você escolheu a opção voltar");
			break;
		default:
			System.out.println("Você não escolheu uma opção valida");
			break;
		}
		   System.out.println("Digite o Codigo do Funcionario");
		   funcionario.setCodFuncionario(scanner.nextInt());
		   System.out.println("Digite o nome do Funcionario");
		   funcionario.setNomeFuncionario(scanner.nextLine());
		   System.out.println("Digite o CPF");
		   funcionario.setCpf(scanner.nextLine());
		   System.out.println("Digete a Data de Entrada do Funcionario");
		   funcionario.setDataEntrada(scanner.nextLine());
		   System.out.println("Digete a Data de Saida do Funcionario");
		   funcionario.setDataSaida(scanner.nextLine());  
		   System.out.println("Digete a Data das Ferias");
		   funcionario.setDataFerias(scanner.nextLine());
		
	}


}
