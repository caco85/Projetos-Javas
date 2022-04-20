
import java.util.Scanner;

import javax.swing.JOptionPane;


public class ProjetoApplicacao {
	static int tipoEscolha;
	static int tipoOpcao;
	static int codigo;
	static RepositorioCliente repCliente = RepositorioCliente.getInstance();
	static	RepositorioFornecedor repFornecedor = RepositorioFornecedor.getInstance();
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {	
		while(tipoEscolha != 3){ //menu
			System.out.println("Usuarios sejam bem vindos \n escolha a opção desejada"
					+ " \n onde: \n 1 para Entra na Area de Clientes \n 2 Entrar na Area de Fornecedores \n 3 sair");
			tipoEscolha = scanner.nextInt();
		
			switch (tipoEscolha) {
				case 1:
					escolhaCliente();
					break;
				case 2:
					escolhaFornecedor();
					break;
				case 3:
					System.out.println("Voc� n�o escolheu a op��o sair. Obrigado!");
				System.exit(0);
					break;
					
				default:
					System.out.println("Voc� n�o escolheu uma op��o valida,reinicei o processo. Obrigado!");
					break;
				}
	
		}
	}
	public static void escolhaCliente(){
		//submenu
			System.out.println("Usuarios sejam bem vindos \n escolha a op��o desejada"
					+ " \n onde: \n 1 para cadastrar Clientes \n 2 Remover Cliente pelo C�digo"
					+ " \n 3 Remover Cliente pelo nome \n 4 Pesquisa cliente pelo C�digo"
					+ " \n 5 Pesquisar Clientes por bairro \n 6 sair");
			
			tipoOpcao = scanner.nextInt();
			//op��o cliente
			switch (tipoOpcao) {
			case 1:
				Cliente c = new Cliente();	
				
				//pra limpar o buff do teclado....tirando o bug
				c.setNome(scanner.nextLine()); 
				
				System.out.println("Digite o C�digo do Cliente");
				c.setCodigo(scanner.nextInt()); 
				System.out.println("Digite o Nome do Cliente");
				c.setNome(scanner.nextLine());
				c.setNome(scanner.nextLine()); 
				System.out.println("Digite  A idade do Cliente");
				c.setIdade(scanner.nextInt());
				System.out.println("Digite o Email do Cliente");
				c.setEmail(scanner.next());
				System.out.println("Digite o CPF do Cliente");
				c.setCpf(scanner.next()); 
				System.out.println("Digite a Data de Nascimento do Cliente");
				c.setDataNascimento(scanner.next()); 
				
				Endereco end = new Endereco();
				//pra limpar o buff do teclado....tirando o bug
				
				System.out.println("Digite o nome da Rua");
				end.setRua(scanner.nextLine());
				end.setRua(scanner.nextLine());
				System.out.println("Digite o nome da Bairro");
				end.setBairro(scanner.nextLine());
				System.out.println("Digite o numero da residencia");
				end.setNumeroCasa(scanner.nextInt());
				System.out.println("Digite o Complemento,se houver");
				end.setComplemento(scanner.nextLine());
				end.setComplemento(scanner.nextLine());
				System.out.println("Digite o Cep");
				end.setCep(scanner.next());
				//inserino o end em c
				c.setEnd(end);
				
				repCliente.inserirCliente(c);
				break;
			case 2:
				System.out.println("Digite o Codigo do Cliente que deseja remover");
				 repCliente.removerClientePeloCodigo(scanner.nextInt());
				break;
			case 3:
				//tirando o buf do teclado
				repCliente.removerClientePeloNome(scanner.nextLine());
				System.out.println("Digite o nome do Cliente que deseja remover");
				repCliente.removerClientePeloNome(scanner.nextLine());
				break;
			case 4 :
				System.out.println("Digite o Codigo do Cliente que deseja pesquisar");
				Cliente clientePesquisPeloCodigo = repCliente.buscarClientePeloCodigo(scanner.nextInt());
				
				if(clientePesquisPeloCodigo != null){
					System.out.println("Lista de Clientes por Codigo");
					System.out.println("");
					System.out.println("Nome: " + clientePesquisPeloCodigo.getNome() +" Codigo: " + clientePesquisPeloCodigo.getCodigo()
										+" CNPJ: " + clientePesquisPeloCodigo.getCpf() + " Data de Nascimetno " + clientePesquisPeloCodigo.getDataNascimento()
										+" Email:  " + clientePesquisPeloCodigo.getEmail() +" Idade: " + clientePesquisPeloCodigo.getIdade() 
										+" Data de Nascimento: " + clientePesquisPeloCodigo.getDataNascimento() +"\n" + " Endere�o: " + clientePesquisPeloCodigo.getEnd());
					System.out.println("\n");
					break;
				}else {
					System.out.println("");
					System.out.println("N�o localizado");
					System.out.println("");
					break;
				}
				
			case 5 :
				//tirando o bug do teclado
				repCliente.buscarClientePeloBairro(scanner.nextLine());
			
				System.out.println("Digite o Bairro do Cliente que deseja pesquisar");
				Cliente[] clientePesquisarClientesPeloBairro = repCliente.buscarClientePeloBairro(scanner.nextLine());
			//	Cliente[] clientePesquisarClientesPeloBairro = repCliente.buscarClientePeloBairro(JOptionPane.showInputDialog("Digite o nome do Bairro"));
				
				if(clientePesquisarClientesPeloBairro != null){
					System.out.println("Lista de Clientes por Bairro");
					System.out.println("");
					for (int i = 0; i < clientePesquisarClientesPeloBairro.length; i++) {
//						 clientePesquisarClientesPeloBairro[i];
							System.out.println("Nome: " + clientePesquisarClientesPeloBairro[i].getNome() + " Bairro: " + clientePesquisarClientesPeloBairro[i].getEnd().getBairro()
								+ "CPF: " + clientePesquisarClientesPeloBairro[i].getCpf());
							System.out.println("");	
					}
					break;
				}else {
					System.out.println("");
					System.out.println("N�o localizado,por favor refa�a a pesquisa.");
					System.out.println("");
					break;
				}
				
			case 6 :
				System.out.println("Voc� n�o escolheu a op��o sair. Obrigado!");
				break;
			default:
				System.out.println("Voc� n�o escolheu uma op��o valida,reinicei o processo. Obrigado!");
				break;
			} 
	
	}
	public static void escolhaFornecedor(){
		    System.out.println("Usuarios sejam bem vindos \n escolha a op��o desejada"
					+ " \n onde: \n 1 para cadastrar Fornecedores \n 2 Remover fornecedor pelo CNPJ"
					+ " \n 3 Pesquisar Fornecedor Tipo de Servi�o \n 4 Pesquisar Forncedor pelo cep"
					+ "\n 5 Sair");
			tipoOpcao = scanner.nextInt();
			switch (tipoOpcao) {
				case 1:
				Fornecedor f = new Fornecedor();
				//tirando o bug do teclado
				
				System.out.println("Digite o CNPJ do Fornecedor");
				f.setCNPJ(scanner.next()); 
				System.out.println("Digite o Nome do Fornecedor");
				f.setNome(scanner.nextLine());
				f.setNome(scanner.nextLine()); 
				System.out.println("Digite  o Nome Fantasia do Fornecedor");
				f.setNomeFantasia(scanner.nextLine());
				System.out.println("Digite o Email do Fornecedor");
				f.setEmail(scanner.next());
				System.out.println("Digite a Data da Funda��o do Fornecedor");
				f.setDataFundacao(scanner.next()); 
				System.out.println("Digite o Tipo de Servi�o  do Fornecedor");
				f.setTipoServico(scanner.nextLine());
				f.setTipoServico(scanner.nextLine());
				
				Endereco end = new Endereco();
				//tirando o bug do teclado
				
				System.out.println("Digite o nome da Rua");
				end.setRua(scanner.nextLine());
				System.out.println("Digite o nome da Bairro");
				end.setBairro(scanner.nextLine());
				System.out.println("Digite o numero da residencia");
				end.setNumeroCasa(scanner.nextInt());
				System.out.println("Digite o Complemento,se houver");
				end.setComplemento(scanner.nextLine());
				end.setComplemento(scanner.nextLine());
				System.out.println("Digite o Cep");
				end.setCep(scanner.next());
				
				//inserino o end em f						
				f.setEnd(end);
				
				repFornecedor.inserirFornecedor(f);
				break;
				case 2:
					System.out.println("Digite o CNPJ do Fornecedor que deseja remover");
					repFornecedor.removerFornecedorPeloCNPJ(scanner.next());
					break;
				case 3:
					//tirando o bug do teclado
					repFornecedor.buscarFornecedorPeloTipoServico(scanner.nextLine());
					System.out.println("Digite o tipo de servi�o do Fornecedor que deseja pesquisar");
					Fornecedor fornecedorPesquisarTipoServico = repFornecedor.buscarFornecedorPeloTipoServico(scanner.nextLine());
					if(fornecedorPesquisarTipoServico != null){
						System.out.println("Lista de Fornecedor por Tipo de Servi�o");
						System.out.println("");
						System.out.println("Nome: " + fornecedorPesquisarTipoServico.getNome() +" Nome Fantasia: " + fornecedorPesquisarTipoServico.getNomeFantasia()
											+" CNPJ: " + fornecedorPesquisarTipoServico.getCNPJ() +" Tipo de Servi�os: " + fornecedorPesquisarTipoServico.getTipoServico()
											+ " Email: " + fornecedorPesquisarTipoServico.getEmail() + "Data da Funda��o: " + fornecedorPesquisarTipoServico.getDataFundacao()
											+"\n" +  " Endere�o: " + fornecedorPesquisarTipoServico.getEnd());
						System.out.println("");
						break;
					}else{
						System.out.println("");
						System.out.println("N�o localizado");
						System.out.println("");
						break;
					}
		
				case 4 :
					System.out.println("Digite o Cep do Fornecedor que deseja pesquisar");
					Fornecedor[] fornecedorPesquisaPeloCep = repFornecedor.buscarFornecedorPeloCep(scanner.next());
					 if(fornecedorPesquisaPeloCep != null){
						for (int i = 0; i < fornecedorPesquisaPeloCep.length; i++) {
							System.out.println("");
							System.out.println("Lista de Fornecedor Por CEP");
							System.out.println("Nome: " + fornecedorPesquisaPeloCep[i].getNome() +" Nome Fantasia: " + fornecedorPesquisaPeloCep[i].getNomeFantasia()
												+"CNPJ: " + fornecedorPesquisaPeloCep[i].getCNPJ() + " CEP: " + fornecedorPesquisaPeloCep[i].getEnd().getCep());
							System.out.println("");
							}
						break;
					 }
					 else {
						 System.out.println("");
						 System.out.println("N�o localizado");
						 System.out.println("");
						 break;
					 }
				case 5 :
					System.out.println("Voc� n�o escolheu a op��o sair. Obrigado!");
					break;
				default:
					System.out.println("Voc� n�o escolheu uma op��o valida,reinicei o processo. Obrigado!");
					break;
					}

	}

}
