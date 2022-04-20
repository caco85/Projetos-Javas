package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;
import java.util.Scanner;

import PooProject.ProjetoAP2.Excecao.ClienteException;
import PooProject.ProjetoAP2.Excecao.RepositorioClienteException;
import PooProject.ProjetoAP2.Modelo.ClientePF;
import PooProject.ProjetoAP2.Modelo.ClientePJ;
import PooProject.ProjetoAP2.Repositorio.RepositorioCliente;

public class ControladorCliente implements IControladorCliente {
	
	private static ControladorCliente instancia;
	private RepositorioCliente repCliente;
	
	private static Scanner scanner = new Scanner(System.in);
	private static int tipoEscolha;
	
	public static ControladorCliente getInstance() {
		if (instancia == null){
			instancia = new ControladorCliente();
		}
		return instancia;
	}
	public ControladorCliente() {
		repCliente = RepositorioCliente.getInstance();
	}

	@Override
	public void inserirClientePF(ClientePF clientePF) throws ClienteException, RepositorioClienteException {
		if(repCliente.pesquisarClientePeloCPF(clientePF.getCPF()) != null){
			throw new ClienteException("Cliente não cadastrado,pois ja existe cpf cadastrado");
		}else{
			this.repCliente.inserirClientePF(clientePF);
		}
		
	}

	@Override
	public void excluirClientePJ(ClientePJ cliente) throws ClienteException, RepositorioClienteException {
		this.repCliente.excluirClientePJ(cliente);	
			
	}

	@Override
	public void excluirClientePeloNome(String nome) throws ClienteException, RepositorioClienteException {
		if (repCliente.pesquisarClientePeloNome(nome) != null) {
			this.repCliente.excluirClientePeloNome(nome);
		}else{
			throw new ClienteException("Cliente não localizado");
		}
		
	}

	@Override
	public ClientePF pesquisarClientePeloCPF(String cpf) throws ClienteException, RepositorioClienteException {
		return repCliente.pesquisarClientePeloCPF(cpf);
	}

	@Override
	public ClientePF pesquisarClientePeloNome(String nome) throws ClienteException, RepositorioClienteException {
		return repCliente.pesquisarClientePeloNome(nome);
	}

	@Override
	public void inserirClientePJ(ClientePJ clientePJ) throws ClienteException, RepositorioClienteException {
		if(repCliente.pesquisarClientePeloCPF(clientePJ.getCNPJ()) != null){
			throw new ClienteException("Cliente não cadastrado,pois ja existe cpf cadastrado");
		}else{
			this.repCliente.inserirClientePJ(clientePJ);
		}
	}

	@Override
	public ClientePJ pesquisarClientePeloCNPJ(String cnpj) throws ClienteException, RepositorioClienteException {
		return repCliente.pesquisarClientePeloCNPJ(cnpj);
	}

	@Override
	public ArrayList<ClientePF> listarClientesPF() throws ClienteException, RepositorioClienteException {
		return this.repCliente.listarClientesPF();
	}
	@Override
	public ArrayList<ClientePJ> listarClientesPJ() throws ClienteException, RepositorioClienteException {
		return this.repCliente.listarClientesPJ();
	}

	@Override
	public void atualizarClientePF(ClientePF clientePF) throws ClienteException, RepositorioClienteException {
		this.repCliente.atualizarClientePF(clientePF);
	}

	@Override
	public void atualizarClientePJ(ClientePJ clientePJ) throws ClienteException, RepositorioClienteException {
		this.repCliente.atualizarClientePJ(clientePJ);
		
	}
	@Override
	public ArrayList<ClientePF> listarClientesAll(ArrayList<ClientePF> arrayClientesAll) throws ClienteException, RepositorioClienteException{
		if (arrayClientesAll != null){
			
			for (int i = 0; i< arrayClientesAll.size(); i++){
				arrayClientesAll.get(i);
					System.out.println("Codigo do Cliente : "+arrayClientesAll.get(i).getCodCliente()+ "Nome do Cliente : " + arrayClientesAll.get(i).getNome() + " - CPF: " + arrayClientesAll.get(i).getCPF()
							+"Email :" +arrayClientesAll.get(i).getEmail()+"Data de Nascimento :  "+ arrayClientesAll.get(i).getDataNascimento()+ " Telefone" +arrayClientesAll.get(i).getTelefone() 
							+ ""+arrayClientesAll.get(i).getEndereco());
			
			}
		}
		return arrayClientesAll;
	}
	@Override
	public ArrayList<ClientePJ> listarClientesPJAll(ArrayList<ClientePJ> arrayClientesPJAll) throws ClienteException, RepositorioClienteException{
		if (arrayClientesPJAll != null){
			
			for (int i = 0; i< arrayClientesPJAll.size(); i++){
				arrayClientesPJAll.get(i);
					System.out.println("Codigo do Cliente : "+arrayClientesPJAll.get(i).getCodCliente()+ "Razão Social : " + arrayClientesPJAll.get(i).getRazaoSocial() + " - CNPJ: " + arrayClientesPJAll.get(i).getCNPJ()
							+"Data da fundação :  "+ arrayClientesPJAll.get(i).getDataFundacao()+"Nome Fantasia :  "+ arrayClientesPJAll.get(i).getNomeFantasia() +"Inscrição Estadual" + arrayClientesPJAll.get(i).getInscricaoEstadual()
							+"Email :" +arrayClientesPJAll.get(i).getEmail()+ " Telefone" +arrayClientesPJAll.get(i).getTelefone() + ""+arrayClientesPJAll.get(i).getEndereco());		
			}
		}
		return arrayClientesPJAll;
	}
	@Override
	public void escolhaAtualizarClientePF(ClientePF clientePF) throws ClienteException, RepositorioClienteException {
		System.out.println("escolha a opção desejada \n onde: \n 1 para Atualizar Nome \n 2 Atualizar Email \n 3 Atualizar da Data de Nascimento \n 4 Atualizar da Telefone "
		 		+ "\n 5  Atualizar Nome  e Email \n 6 Nome,Email e Telefone \n 7 sair");
		tipoEscolha = scanner.nextInt();
		switch (tipoEscolha) {
		case 1:
			System.out.println("Digite o novo Nome");
			clientePF.setNome(scanner.nextLine());
			clientePF.setNome(scanner.nextLine());
			repCliente.atualizarClientePF(clientePF);
			break;
		case 2:
			System.out.println("Digite o novo Email");
			clientePF.setEmail(scanner.nextLine());
			clientePF.setEmail(scanner.nextLine());
			repCliente.atualizarClientePF(clientePF);	
			break;
		case 3:
			System.out.println("Digite a nova data de nascimento");
			clientePF.setDataNascimento(scanner.nextLine());
			clientePF.setDataNascimento(scanner.nextLine());
			repCliente.atualizarClientePF(clientePF);	
			break;
		case 4:
			System.out.println("Digite o novo telefone");
			clientePF.setTelefone(scanner.nextLine());
			clientePF.setTelefone(scanner.nextLine());
			repCliente.atualizarClientePF(clientePF);	
			break;
		case 5:
			System.out.println("Digite o novo nome");
			clientePF.setNome(scanner.nextLine());
			System.out.println("Digite o novo Email");
			clientePF.setEmail(scanner.nextLine());			
			repCliente.atualizarClientePF(clientePF);	
			break;
		case 6:
			System.out.println("Digite o novo nome");
			clientePF.setNome(scanner.nextLine());
			System.out.println("Digite o novo Email");
			clientePF.setEmail(scanner.nextLine());			
			System.out.println("Digite o novo telefone");
			clientePF.setTelefone(scanner.nextLine());
			repCliente.atualizarClientePF(clientePF);
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
	public void escolhaAtualizarClientePJ(ClientePJ clientePJ) throws ClienteException, RepositorioClienteException {
		System.out.println("escolha a opção desejada \n onde: \n 1 para Atualizar Razão Social \n 2 Atualizar Email \n 3 Atualizar da Data da Fundação \n 4 Atualizar da Telefone "
		 		+ "\n 5  Atualizar Razão Social  e Email \n 6 Razão Social,Email e Telefone \n 7 sair");
		tipoEscolha = scanner.nextInt();
		switch (tipoEscolha) {
		case 1:
			System.out.println("Digite o novo Nome");
			clientePJ.setRazaoSocial(scanner.nextLine());
			clientePJ.setRazaoSocial(scanner.nextLine());
			repCliente.atualizarClientePJ(clientePJ);
			break;
		case 2:
			System.out.println("Digite o novo Email");
			clientePJ.setEmail(scanner.nextLine());
			clientePJ.setEmail(scanner.nextLine());
			repCliente.atualizarClientePJ(clientePJ);	
			break;
		case 3:
			System.out.println("Digite a nova data de fundação");
			clientePJ.setDataFundacao(scanner.nextLine());
			clientePJ.setDataFundacao(scanner.nextLine());
			repCliente.atualizarClientePJ(clientePJ);	
			break;
		case 4:
			System.out.println("Digite o novo telefone");
			clientePJ.setTelefone(scanner.nextLine());
			clientePJ.setTelefone(scanner.nextLine());
			repCliente.atualizarClientePJ(clientePJ);	
			break;
		case 5:
			System.out.println("Digite o novo nome");
			clientePJ.setRazaoSocial(scanner.nextLine());
			System.out.println("Digite o novo Email");
			clientePJ.setEmail(scanner.nextLine());			
			repCliente.atualizarClientePJ(clientePJ);	
			break;
		case 6:
			System.out.println("Digite o novo nome");
			clientePJ.setRazaoSocial(scanner.nextLine());
			System.out.println("Digite o novo Email");
			clientePJ.setEmail(scanner.nextLine());			
			System.out.println("Digite o novo telefone");
			clientePJ.setTelefone(scanner.nextLine());
			repCliente.atualizarClientePJ(clientePJ);	
			break;
		case 7:
			System.out.println("Você escolheu a opção voltar");			
			break;
		default:
			System.out.println("Você não escolheu uma opção valida");
			break;
		}
	}

}
