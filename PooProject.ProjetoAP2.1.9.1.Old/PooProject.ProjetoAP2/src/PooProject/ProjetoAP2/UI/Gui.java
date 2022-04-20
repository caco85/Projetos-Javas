package PooProject.ProjetoAP2.UI;

import java.util.ArrayList;
import java.util.Scanner;

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
import PooProject.ProjetoAP2.Fachada.Fachada;
import PooProject.ProjetoAP2.Modelo.ClientePF;
import PooProject.ProjetoAP2.Modelo.ClientePJ;
import PooProject.ProjetoAP2.Modelo.Empresa;
import PooProject.ProjetoAP2.Modelo.Endereco;
import PooProject.ProjetoAP2.Modelo.Filiado;
import PooProject.ProjetoAP2.Modelo.Financeiro;
import PooProject.ProjetoAP2.Modelo.Funcionario;
import PooProject.ProjetoAP2.Modelo.Produto;
import PooProject.ProjetoAP2.Modelo.Venda;

public class Gui {
 private  static int escolhaPrincipal;
private static int escolhaSub;
private static int tipoEscolha;
private static int tipoPesquisa;
private static int tipoEscolhaSub;
 
private static Scanner scanner = new Scanner(System.in);
private static Fachada fachada = Fachada.getInstance();
 
 public static void main(String[] args) throws ClienteException, RepositorioClienteException, VendaException, RepositorioVendaException, EnderecoException, EmpresaException, RepositorioEmpresaException, ProdutoException, RepositorioProdutoException, FuncionarioException, RepositorioFuncionarioException, FiliadoException, RepositorioFiliadoException, FinanceiroExcepiton, RepositorioFinanceiroException {
	 while(escolhaPrincipal != 5 ){
		 System.out.println("Usuarios sejam bem vindos \n escolha a opção desejada \n onde:"
		 		+ "\n 1 para Cadastro \n 2 Efetuar Compras \n 3 Area da Empresa \n 4 Area da Pesquisa "
		 		+ "\n 5 Sair");
		 escolhaPrincipal = scanner.nextInt();
		 switch (escolhaPrincipal) {
		case 1:
			escolhaCadastro();		
			break;
		case 2:
			escolhaEfetuarCompras();
			break;
		case 3:
			escolhaEmpresa();
			break;
		case 4:
			escolhaPesquisa();
			break;
		case 5:
			System.out.println("Você  escolheu a opção sair. Obrigado!");
			System.exit(0);
			break;
		default:
			System.out.println("Você não escolheu uma opção valida,retornar para o menu principal Obrigado!");
			break;
		}
	 }
	
}
 public static void escolhaCadastro() throws ClienteException,RepositorioClienteException, EnderecoException, ProdutoException, RepositorioProdutoException, FuncionarioException, RepositorioFuncionarioException, FiliadoException, RepositorioFiliadoException {
	 System.out.println("Usuarios sejam bem vindos \n escolha a opção desejada \n onde:"
		 		+ "\n 1 para Cadastra Cliente PF \n 2 Cadastrar Cliente PJ \n 3 Cadastrar a Empresa"
		 		+ "\n 4 Cadastrar Funcionario \n 5 Cadastrar Produto \n 6 Cadastrar Filiado "
		 		+ "\n 7  volta Ao Menu  Principal"); 
	 escolhaSub = scanner.nextInt();
	switch (escolhaSub) {
		case 1:
			ClientePF cf = new ClientePF();	
			System.out.println("Digite o Código do Cliente");
			cf.setCodCliente(scanner.nextInt());
			System.out.println("Digite o Nome do Cliente");
			cf.setNome(scanner.nextLine());
			cf.setNome(scanner.nextLine());
			System.out.println("Digite o CPF do Cliente");
			cf.setCPF(scanner.next());
			System.out.println("Digite o email do Cliente");
			cf.setEmail((scanner.nextLine()));
			cf.setEmail((scanner.nextLine()));
			System.out.println("Digite a data do Nascimento do Cliente");
			cf.setDataNascimento(scanner.nextLine());
			System.out.println("Digite o telefone  do Cliente");
			cf.setTelefone(scanner.nextLine());
			
			Endereco e1  = new Endereco();
			fachada.cadastrarEndereco(e1);
			cf.setEndereco(e1);
			try {
				fachada.inserirClientePF(cf);
			} catch (ClienteException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioClienteException ex) {
				System.out.println(ex.getMessage());
			}
			break;
		case 2:
			ClientePJ cj = new ClientePJ();
			System.out.println("Digite o Código do Cliente");
			cj.setCodCliente(scanner.nextInt());
			System.out.println("Digite o Nome do Cliente");
			cj.setRazaoSocial(scanner.nextLine());
			System.out.println("Digite o CNPJ do Cliente");
			cj.setCNPJ(scanner.nextLine());
			System.out.println("Digite a Data da Funda;'ao do Cliente");
			cj.setDataFundacao(scanner.nextLine());
			System.out.println("Digite o Nome Fantasia do Cliente");
			cj.setNomeFantasia(scanner.nextLine());
			System.out.println("Digite o email do Cliente");
			System.out.println("Digite o  numero de Inscri;'ao Estadual do Cliente");
			cj.setInscricaoEstadual(scanner.nextInt());
			cj.setEmail(scanner.nextLine());
			System.out.println("Digite o telefone  do Cliente");
			cj.setTelefone(scanner.nextLine());
			Endereco e2  = new Endereco();
			fachada.cadastrarEndereco(e2);
			cj.setEndereco(e2);
			try {
				fachada.inserirClientePJ(cj);
			} catch (ClienteException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioClienteException ex) {
				System.out.println(ex.getMessage());
			}
			break;	
	   case 3:
			Empresa emp = new Empresa();
			emp.setCodEmpresa(1);
			emp.setCNPJ("01234567890001-15");
			emp.setRazaoSocial("Chocolate & Banana");
			emp.setDataFundacao("13/10/2016");
			emp.setNomeFantasia("ChocoBanana");
			emp.setInscricaoEstadual(1234567);
			emp.setLogin("Admin");
			Endereco e3 = new Endereco();
			e3.setNomeRua("Caramelo");
			e3.setNumCasa(137);
			e3.setComplemento("Cobertura de Morango");
			e3.setCep("12345-167");
			e3.setBairro("Brigadeiro");
			e3.setCidade("Flocos");
			e3.setEstado("Jujuba");
			emp.setEndereco(e3);

			try {
				fachada.inserirEmpresa(emp);
			} catch (EmpresaException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioEmpresaException ex) {
				System.out.println(ex.getMessage());
			}
			 Financeiro fin1 = new Financeiro();
			 fin1.setCodigo(1);
			 fin1.setPatrimonio(100000);
			 fin1.setGanhoMensalVendas(0);
			 fin1.setGastoDispesasMensais(400);
			 fin1.setGastoMensalFuncionario(0);
			 fin1.setGastoMensalProduto(0);
			 fin1.setGastoMensalPropaganda(200);
				try {
					fachada.inserirFinanceiro(fin1);
				} catch (FinanceiroExcepiton e) {
					System.out.println(e.getMessage());
				}catch (RepositorioFinanceiroException ex) {
					System.out.println(ex.getMessage());
				}
			 
			break; 
	   case 4:
		   Funcionario f = new Funcionario();
		   	fachada.cadastrarFuncionarios(f);
			Endereco e4  = new Endereco();
			fachada.cadastrarEndereco(e4);			
			f.setEnd(e4);
			try {
				fachada.inserirFuncionario(f);
			} catch (FuncionarioException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioFuncionarioException ex) {
				System.out.println(ex.getMessage());
			}
			break;
	   case 5:
			Produto p = new Produto();
			fachada.cadastrarProduto(p);
			System.out.println("Digite a Quantidade");
			p.setQtdProduto(scanner.nextInt());	
			try {
				fachada.inserirProduto(p);
			} catch (ProdutoException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioProdutoException ex) {
				System.out.println(ex.getMessage());
			}
			break;
	   case 6:
		   	Filiado fil = new Filiado();
		   	System.out.println("Digite o Codigo do Filiado");
		   	fil.setCodFiliado(scanner.nextInt());
			System.out.println("Digite o Nome do Filiado");
		   	fil.setNomeFiliado(scanner.nextLine());
		   	System.out.println("Digite o CNPJ do Filiado");
		   	fil.setCNPJ(scanner.nextLine());
			System.out.println("Digite o Tipo de Fornecimento do Filiado");
		   	fil.setTipoFornecimento(scanner.nextLine());
			System.out.println("Digite o Email do Filiado");
		   	fil.setEmail(scanner.nextLine());
			System.out.println("Digite o Telefone do Filiado");
		   	fil.setTelefone(scanner.nextLine());
			System.out.println("Digite a Quantidade do Filiado");
		   	fil.setQtdFornecida(scanner.nextInt());
			System.out.println("Digite o Valor por Unidade do Filiado");
		   	fil.setValorUnidade(scanner.nextDouble());
			System.out.println("Digite o Valor Recebido  do Filiado");
		   	fil.setValorRecebido(fachada.calcularValorRecebidoFiliado(fil.getValorUnidade(), fil.getQtdFornecida()));
			try {
				fachada.inserirFiliado(fil);
			} catch (FiliadoException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioFiliadoException ex) {
				System.out.println(ex.getMessage());
			}
			break;
	   case 7:
		   System.out.println("Você  escolheu a opção voltar ao Menu, Obrigado!");
			break;
		default:
			System.out.println("Você não escolheu uma opção valida,retornar para o menu principal Obrigado!");
			break;
	}
}
 public static void escolhaEfetuarCompras() throws VendaException, RepositorioVendaException{
	 Venda v = new Venda();
	 	fachada.cadastrarVenda(v);
		try {
			fachada.inserirVenda(v);
		} catch (VendaException e) {
			System.out.println(e.getMessage());
		}catch (RepositorioVendaException ex) {
			System.out.println(ex.getMessage());
		}
 }
 public static void escolhaEmpresa() throws VendaException, RepositorioVendaException, FinanceiroExcepiton, RepositorioFinanceiroException, EmpresaException, RepositorioEmpresaException{	 
	 System.out.println("Usuarios sejam bem vindos \n escolha a opção desejada \n onde:"
		 		+ "\n 1 Verificar o Patrimonio Atual \n 2 Verificar o Valor da Venda Mensal "
		 		+ "\n 3 Verificar o Gasto com Funcionario \n 4 Verificiar o gasto com Produtos "
		 		+ "\n 5 Voltar");
	escolhaSub = scanner.nextInt();
	Financeiro f = null;
	switch (escolhaSub) {
	case 1:	
		Empresa emp = new  Empresa();
		double patrimonioAtual = 0 ;
		f = fachada.pesquisarFinanceiroPeloCodigo(1);
		patrimonioAtual = fachada.calcularPatrimonio(f.getPatrimonio(), f.getGastoMensalFuncionario(), f.getGastoMensalProduto(),f.getGastoDispesasMensais(),
									f.getGastoMensalPropaganda(),f.getGanhoMensalVendas());
		System.out.println("");
		System.out.println(" Patrimonio Atual é R$" + patrimonioAtual);
		System.out.println("");
		f.setPatrimonio(patrimonioAtual);
		fachada.atualizarFinanceiro(f);
		
		emp.setFinanceiro(f);
		fachada.atualizarEmpresa(emp);
		break;
	case 2:	
		try {
			double somarValor = 0 ;
			ArrayList<Venda> calcularVenda = null;
			calcularVenda = fachada.calcularVendas(fachada.listarVendas()); 
			for (int i = 0; i < calcularVenda.size(); i++) {
				somarValor += calcularVenda.get(i).getValorRecebido();
			}
			System.out.println("");
			System.out.println("Valor Recebido R$"+ somarValor);
			System.out.println("");
			f = fachada.pesquisarFinanceiroPeloCodigo(1);
			f.setGanhoMensalVendas(somarValor);
			fachada.atualizarFinanceiro(f);
		
		} catch (VendaException e) {
			System.out.println(e.getMessage());
		}catch (RepositorioVendaException ex) {
			System.out.println(ex.getMessage());
		}
		break;
	case 3:
		try {
			ArrayList<Funcionario> calcularSalarios = null;
			double somarTotalSalario= 0 ;
			calcularSalarios = fachada.calcularSalario(fachada.listarFuncionario());
			for (int i = 0; i < calcularSalarios.size(); i++) {
				somarTotalSalario += calcularSalarios.get(i).getSalario();
			}
			System.out.println("");
			System.out.println("O valor gasto com Salario é  R$"+ somarTotalSalario);
			System.out.println("");
			f = fachada.pesquisarFinanceiroPeloCodigo(1);
			f.setGastoMensalFuncionario(somarTotalSalario);
			fachada.atualizarFinanceiro(f);
		
		} catch (FuncionarioException e) {
			System.out.println(e.getMessage());
		}catch (RepositorioFuncionarioException ex) {
			System.out.println(ex.getMessage());
		}
		break;
	case 4:	
		try {
			ArrayList<Filiado> calcularProdutos = null;
			double somarValorFiliado = 0 ;
			calcularProdutos =	fachada.calcularProdutos(fachada.listarFiliado());
				for (int i = 0; i < calcularProdutos.size(); i++) {
					somarValorFiliado += calcularProdutos.get(i).getValorRecebido();
				}
				System.out.println("Valor Recebido R$"+ somarValorFiliado);
				f = fachada.pesquisarFinanceiroPeloCodigo(1);
				f.setGastoMensalProduto(somarValorFiliado);
				fachada.atualizarFinanceiro(f);
		
		} catch (FiliadoException e) {
			System.out.println(e.getMessage());
		}catch (RepositorioFiliadoException ex) {
			System.out.println(ex.getMessage());
		}
	break;
	case 5:
		System.out.println("Você escolheu a opção voltar obrigado!");
		break;
	default:
		System.out.println("Você não escolheu uma opção Valida");
		break;
	}
	

 }
 public static void escolhaPesquisa() throws VendaException, RepositorioVendaException, EmpresaException, RepositorioEmpresaException{
	 System.out.println("Usuarios sejam bem vindos \n escolha a opção desejada \n onde:"
		 		+ "\n 1 Pesquisa de Clientes \n 2 Pesquisa de Empresa"
		 		+ "\n 3 Pesquisa de Funcionario \n 4 Pesquisa de  Produto \n 5 Pesquisa de Filiado "
		 		+ "\n 6 Pesquisa de  Vendas \n 7 Pesquisar Financeiro \n 8  volta Ao Menu  Principal ");
	 escolhaSub = scanner.nextInt();
	switch (escolhaSub) {
		case 1:
			System.out.println("Escolha pra qual tipo de cliente \n onde: \n 1 Cliente PF \n 2 Cliente PJ");
			tipoEscolha = scanner.nextInt();
			 switch (tipoEscolha) {
			 	case 1:
			 		try {
			 			ClientePF clientePfPesquisa = null ;
			 			System.out.println("Escolha qual tipo de pesquisa\n onde: \n 1 pesquisar pelo nome "
			 				+ "\n 2 pesquisar pelo CPF \n 3 pesquisar todos os clientes PF");
			 			tipoPesquisa = scanner.nextInt();
			 			if (tipoPesquisa == 1) {
							System.out.println("Digite o Nome do Cliente");
							//colocado duplo msm devido o bug do scanner....
							clientePfPesquisa = fachada.pesquisarClientePeloNome(scanner.nextLine());
							clientePfPesquisa = fachada.pesquisarClientePeloNome(scanner.nextLine());
							if (clientePfPesquisa != null){
							System.out.println("Cliente Encontrado ");
							System.out.println(" ");
							System.out.println("Codigo: " + clientePfPesquisa.getCodCliente() + "Nome :" + clientePfPesquisa.getNome() 
							                  + "CPF :" +clientePfPesquisa.getCPF());
							}else{
								System.out.println("Cliente não Encontrado ");
							}
						}else if(tipoPesquisa == 2){
							System.out.println("Digite o CPF do Cliente");
							//colocado duplo msm devido o bug do scanner....
							clientePfPesquisa = fachada.pesquisarClientePeloCPF(scanner.nextLine());
							clientePfPesquisa = fachada.pesquisarClientePeloCPF(scanner.nextLine());
							//clientePfPesquisa = fachada.pesquisarClientePeloCPF(JOptionPane.showInputDialog("Digite o CPF"));
							if (clientePfPesquisa != null) {
								System.out.println("Cliente Encontrado ");
								System.out.println(" ");
								System.out.println("Codigo: " + clientePfPesquisa.getCodCliente() + "Nome :" + clientePfPesquisa.getNome() 
								                  + "CPF :" +clientePfPesquisa.getCPF());	
							} else{
								System.out.println("Cliente não Encontrado ");
							}
						} else if (tipoPesquisa == 3){
							System.out.println("Lista de Clientes Pessoas Fisica");
							System.out.println("");
							fachada.listarClientesAll(fachada.listarClientesPF());
							System.out.println("");
						}else {
							System.out.println("Você não escolheu uma opção valida");
						}
			 			if (clientePfPesquisa != null){
				 			System.out.println("O que deseja fazer com o Cliente encontrado \n onde: \n 1 remover \n 2 atualizar\n3 volta ");
							tipoEscolhaSub = scanner.nextInt();	
							switch (tipoEscolhaSub) {
							case 1:
								System.out.println("Digite o nome do cliente");
								fachada.excluirClientePeloNome(scanner.nextLine());
								break;
							case 2:
								fachada.escolhaAtualizarClientePF(clientePfPesquisa);
								break;
							case 3:
								System.out.println("Você  escolheu uma opção volta");
								break;
							default:
								System.out.println("Você Não escolheu uma opção valida");
								break;
							}
			 			}
			 		} catch (ClienteException e) {
						System.out.println(e.getMessage());
					}catch (RepositorioClienteException ex) {
						System.out.println(ex.getMessage());
					}
			 		break;
			 	case 2:
			 		ClientePJ clientePesquisarCNPJ = null;
			 		try {
			 			System.out.println("Escolha qual tipo de pesquisa\n onde: "
			 				+ "\n 1 pesquisar pelo CNPJ \n 2 listar todos");
			 			tipoPesquisa = scanner.nextInt();
			 			if (tipoPesquisa == 1) {
							System.out.println("Digite o CNPJ do Cliente");
							//bug do scanner
							clientePesquisarCNPJ = fachada.pesquisarClientePeloCNPJ(scanner.nextLine());
							clientePesquisarCNPJ = fachada.pesquisarClientePeloCNPJ(scanner.nextLine());
							if(clientePesquisarCNPJ != null){
							System.out.println("Cliente PJ Encontrado ");
							System.out.println(" ");
							System.out.println("Codigo do Cliente PJ : " + clientePesquisarCNPJ.getCodCliente() + "Razão Social :" + clientePesquisarCNPJ.getRazaoSocial() 
							                  + "CNPJ :" +clientePesquisarCNPJ.getCNPJ());
							}else {
								System.out.println("ClientePJ Não Encontrado ");		
							}
						} else if (tipoPesquisa == 2){
							System.out.println("Lista de Clientes Pessoas Juridicas");
							System.out.println("");
							fachada.listarClientesPJAll(fachada.listarClientesPJ());
							System.out.println("");
						}else {
							System.out.println("Você não escolheu uma opção valida");
						}
			 			if (clientePesquisarCNPJ != null){
				 			System.out.println("O que deseja fazer com o Cliente encontrado \n onde: \n 1 remover \n 2 atualizar\n3 volta ");
							tipoEscolhaSub = scanner.nextInt();	
							switch (tipoEscolhaSub) {
							case 1:
								fachada.excluirClientePJ(clientePesquisarCNPJ);
								break;
							case 2:
								fachada.escolhaAtualizarClientePJ(clientePesquisarCNPJ);
								break;
							case 3:
								System.out.println("Você  escolheu uma opção volta");
								break;
							default:
								System.out.println("Você Não escolheu uma opção valida");
								break;
							}
			 			}	
			 		} catch (ClienteException e) {
						System.out.println(e.getMessage());
					}catch (RepositorioClienteException ex) {
						System.out.println(ex.getMessage());
					}
			 		break;
			 	default:
			 		System.out.println("Você não escolheu uma opção valida");
			 		break;
			}
			break;
		case 2:	
			try {
				Empresa empresaPesquisa = null;
				System.out.println("Digite o nome da Empresa");
				//tirar o bug do scanner
				empresaPesquisa = fachada.pesquisarEmpresaPeloNome(scanner.nextLine());
				empresaPesquisa = fachada.pesquisarEmpresaPeloNome(scanner.nextLine());
				if(empresaPesquisa != null){
				System.out.println("Codigo da Empresa: " + empresaPesquisa.getCodEmpresa() + " Nome: " + empresaPesquisa.getRazaoSocial() 
									+ " Nome Fanstasia" + empresaPesquisa.getNomeFantasia() + " CNPJ: " + empresaPesquisa.getCNPJ() +empresaPesquisa.getFinanceiro());
				}else {
					System.out.println("Empresa Não Encontrado ");
				}
			} catch (EmpresaException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioEmpresaException ex) {
				System.out.println(ex.getMessage());
			}
			break;
		case 3:		
			try {
				Funcionario  funcionarioPesquisa = null;
				System.out.println("Escolha qual tipo de pesquisa para Funcionario\n onde: "
						+ "\n 1 pesquisar pelo nome \n 2 pesquisar pelo CPF \n 3 listar todos");
		 			tipoPesquisa = scanner.nextInt();
		 			switch (tipoPesquisa) {
					case 1:
						System.out.println("Digite o Nome do Funcionario");
						funcionarioPesquisa = fachada.pesquisarFuncionarioPeloNome(scanner.nextLine());
						funcionarioPesquisa = fachada.pesquisarFuncionarioPeloNome(scanner.nextLine());
						if(funcionarioPesquisa != null){
						System.out.println("Funcionario Encontrado ");
						System.out.println(" ");
						System.out.println("Codigo: " + funcionarioPesquisa.getCodFuncionario() + "Nome :" + funcionarioPesquisa.getNomeFuncionario() 
						                  + "CPF :" +funcionarioPesquisa.getCpf());
						}else{
							System.out.println("Funcionario Não Encontrado ");
						}
						break;
					case 2:
						System.out.println("Digite o CPF do Funcionario");
						funcionarioPesquisa = fachada.pesquisarFuncionarioPeloCPF(scanner.nextLine());
						funcionarioPesquisa = fachada.pesquisarFuncionarioPeloCPF(scanner.nextLine());
						if(funcionarioPesquisa != null){
						System.out.println("Funcionario Encontrado ");
						System.out.println(" ");
						System.out.println("Codigo: " + funcionarioPesquisa.getCodFuncionario() + "Nome :" + funcionarioPesquisa.getNomeFuncionario() 
						                  + "CPF :" +funcionarioPesquisa.getCpf());
						}else{
							System.out.println("Funcionario Não Encontrado ");
						}
						break;
					case 3:
						System.out.println("Lista de Funcionarios");
						System.out.println("");
						fachada.listarFuncionariosAll(fachada.listarFuncionario());
						System.out.println("");
						break;
					default:
						System.out.println("Você não escolheu uma opção valida");
						break;
					}
		 			if (funcionarioPesquisa != null){
			 			System.out.println("O que deseja fazer com o Funcionario encontrado \n onde: \n 1 remover \n 2 atualizar\n3 volta ");
						tipoEscolhaSub = scanner.nextInt();	
						switch (tipoEscolhaSub) {
						case 1:
							fachada.excluirFuncionario(funcionarioPesquisa);
							break;
						case 2:
							fachada.escolhaAtualizarFuncionaro(funcionarioPesquisa);
							break;
						case 3:
							System.out.println("Você  escolheu uma opção volta");
							break;
						default:
							System.out.println("Você Não escolheu uma opção valida");
							break;
						}
		 			}
			} catch (FuncionarioException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioFuncionarioException ex) {
				System.out.println(ex.getMessage());
			}
			break;
		case 4:
			try {
				Produto  produtoPesquisa = null;
				System.out.println("Escolha qual tipo de pesquisa para Produto \n onde: "
						+ "\n 1 pesquisar pelo Codigo \n 2 pesquisar pelo Nome \n 3 pesquisar todos os produtos");
		 			tipoPesquisa = scanner.nextInt();
		 			switch (tipoPesquisa) {
					case 1:
						System.out.println("Digite o Nome do Produto");
						produtoPesquisa = fachada.pesquisarProdutoPeloCodigo(scanner.nextInt());
						produtoPesquisa = fachada.pesquisarProdutoPeloCodigo(scanner.nextInt());
						if(produtoPesquisa != null){
						System.out.println("Produto Encontrado ");
						System.out.println(" ");
						System.out.println("Codigo: " + produtoPesquisa.getCodProduto() + "Nome :" + produtoPesquisa.getNomeProduto() 
						                  + "Preço :" +produtoPesquisa.getPreco());
						}else{
							System.out.println("Produto não encontrado ");
						}						
						break;
					case 2:
						System.out.println("Digite o Nome do Produto");
						produtoPesquisa = fachada.pesquisarProdutoPeloNome(scanner.nextLine());
						produtoPesquisa = fachada.pesquisarProdutoPeloNome(scanner.nextLine());
						if(produtoPesquisa != null){
						System.out.println("Produto Encontrado ");
						System.out.println(" ");
						System.out.println("Codigo: " + produtoPesquisa.getCodProduto() + "Nome :" + produtoPesquisa.getNomeProduto() 
						                  + "CPF :" +produtoPesquisa.getPreco());
						}else{
							System.out.println("Produto não Encontrado ");
						}
						break;
					case 3:
						System.out.println("Lista de Produtos");
						System.out.println("");
						fachada.listarProdutosAll(fachada.listarProdutos());
						System.out.println("");
						break;
					default:
						System.out.println("Você não escolheu uma opção valida");
						break;
					}			
					if (produtoPesquisa != null){
			 			System.out.println("O que deseja fazer com o Produto encontrado \n onde: \n 1 remover \n 2 atualizar\n3 volta ");
						tipoEscolhaSub = scanner.nextInt();	
						switch (tipoEscolhaSub) {
						case 1:
							fachada.excluirProduto(produtoPesquisa);
							break;
						case 2:
							fachada.escolhaAtualizarProduto(produtoPesquisa); 
							break;
						case 3:
							System.out.println("Você  escolheu uma opção volta");
							break;
						default:
							System.out.println("Você Não escolheu uma opção valida");
							break;
						}
		 			}
			} catch (ProdutoException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioProdutoException ex) {
				System.out.println(ex.getMessage());
			}
			break;
		case 5:			
			try {
				Filiado  filiadoPesquisa = null;
				System.out.println("Escolha qual tipo de pesquisa para Filiado \n onde: "
						+ "\n 1 pesquisar pelo Codigo \n 2 pesquisar pelo Nome \n 3 listar todos");
		 			tipoPesquisa = scanner.nextInt();
		 			switch (tipoPesquisa) {
					case 1:
						System.out.println("Digite o Nome do Filiado");
						filiadoPesquisa = fachada.pesquisarFiliadoPeloNome(scanner.nextLine());
						filiadoPesquisa = fachada.pesquisarFiliadoPeloNome(scanner.nextLine());
						if 	(filiadoPesquisa != null){ 
							System.out.println("Filiado Encontrado ");
							System.out.println(" ");
							System.out.println("Codigo: " + filiadoPesquisa.getCodFiliado() + "Nome :" + filiadoPesquisa.getNomeFiliado() 
							                  + "CNPJ :" +filiadoPesquisa.getCNPJ());
						}else{
							System.out.println("Filiado não Encontrado ");
						}		
						break;
					case 2:
						System.out.println("Digite o CNPJ do Filiado");
						filiadoPesquisa = fachada.pesquisarFiliadoPeloCNPJ(scanner.nextLine());
						filiadoPesquisa = fachada.pesquisarFiliadoPeloCNPJ(scanner.nextLine());
						if 	(filiadoPesquisa != null){ 
							System.out.println("Filiado Encontrado ");
							System.out.println(" ");
							System.out.println("Codigo: " + filiadoPesquisa.getCodFiliado() + "Nome :" + filiadoPesquisa.getNomeFiliado() 
							                  + "CNPJ :" +filiadoPesquisa.getCNPJ());
						}else{
							System.out.println("Filiado não Encontrado ");
						}
						break;
					case 3:
						System.out.println("Lista de Filiados");
						System.out.println("");
						fachada.listarFiliadosAll(fachada.listarFiliado());
						System.out.println("");
						break;
					default:
						System.out.println("Você não escolheu uma opção valida");
						break;
					}
		 			if (filiadoPesquisa != null){
			 			System.out.println("O que deseja fazer com o Filiado encontrado \n onde: \n 1 remover \n 2 atualizar\n3 volta ");
						tipoEscolhaSub = scanner.nextInt();				
						switch (tipoEscolhaSub) {
						case 1:
							fachada.excluirFiliado(filiadoPesquisa);
							break;
						case 2:
							fachada.escolhaAtualizarFiliado(filiadoPesquisa);
							break;
						case 3:
							System.out.println("Você  escolheu uma opção volta");
							break;
						default:
							System.out.println("Você Não escolheu uma opção valida");
							break;
						}
		 			}
			} catch (FiliadoException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioFiliadoException ex) {
				System.out.println(ex.getMessage());
			}
			break;
		case 6:
			try {
				Venda  vendaPesquisa = null;
				System.out.println("Escolha qual tipo de pesquisa para Venda \n onde: "
						+ "\n 1 pesquisar pelo Codigo \n 2 listar todas as vendas");
		 			tipoPesquisa = scanner.nextInt();
		 			switch (tipoPesquisa) {
					case 1:
						System.out.println("Digite o Codigo da Venda");
						vendaPesquisa = fachada.pesquisarVendaPeloCodigo(scanner.nextInt());
						vendaPesquisa = fachada.pesquisarVendaPeloCodigo(scanner.nextInt());
						if(vendaPesquisa != null){
						System.out.println("Venda Encontrado ");
						System.out.println(" ");
						System.out.println("Codigo: " + vendaPesquisa.getCodVenda() + "Forma de Pagamento :" + vendaPesquisa.getTipoPagamento() 
						                  + "Valor Recebido :" +vendaPesquisa.getValorRecebido());
						}else {
							System.out.println("Venda Não Encontrado ");
							System.out.println(" ");
						}
						break;
					case 2:
						System.out.println("Lista de Vendas");
						System.out.println("");
						fachada.listarVendasAll(fachada.listarVendas());
						System.out.println("");
						break;
					default:
						System.out.println("Você não escolheu uma opção valida");
						break;
					}
		 			if (vendaPesquisa != null){
			 			System.out.println("O que deseja fazer com a Venda encontrado \n onde: \n 1 remover \n 2 atualizar\n3 volta ");
						tipoEscolhaSub = scanner.nextInt();		
						switch (tipoEscolhaSub) {
						case 1:
							fachada.excluirVenda(vendaPesquisa);
							break;
						case 2:
							fachada.escolhaAtualizarVenda(vendaPesquisa);
							break;
						case 3:
							System.out.println("Você  escolheu uma opção volta");
							break;
						default:
							System.out.println("Você Não escolheu uma opção valida");
							break;
						}
		 			}
			} catch (VendaException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioVendaException ex) {
				System.out.println(ex.getMessage());
			}
			break;
		case 7:
			try {
				Financeiro financeiroPesquisa = null;
				System.out.println("Digite o Codigo do Financeiro");
				//tirar o bug do scanner
				financeiroPesquisa = fachada.pesquisarFinanceiroPeloCodigo(scanner.nextInt());
				financeiroPesquisa = fachada.pesquisarFinanceiroPeloCodigo(scanner.nextInt());
				if(financeiroPesquisa != null){
				System.out.println("Codigo do Financeiro: " + financeiroPesquisa.getCodigo() + " Patrimonio  R$" + financeiroPesquisa.getPatrimonio() 
									+ "Gasto Mensal Funcionario R$" + financeiroPesquisa.getGastoMensalFuncionario() + " Gasto Mensal Produto  R$" + financeiroPesquisa.getGastoMensalProduto()
									+"Gasto Mensal Produto  R$" + financeiroPesquisa.getGastoMensalProduto()+" Gasto Dispesas Mensais R$" + financeiroPesquisa.getGastoDispesasMensais()
									+"Gasto Mensal Proganda  R$" + financeiroPesquisa.getGastoMensalPropaganda() + "Ganho Mensal Vendas R$" + financeiroPesquisa.getGanhoMensalVendas());
				}else {
					System.out.println("Financeiro Não Encontrado ");
				}
			} catch (FinanceiroExcepiton e) {
				System.out.println(e.getMessage());
			}catch (RepositorioFinanceiroException ex) {
				System.out.println(ex.getMessage());
			}		
			break;
		case 8:
		   System.out.println("Você  escolheu a opção voltar ao Menu, Obrigado!");
			break;
		default:
			System.out.println("Você não escolheu uma opção valida,retornar para o menu principal Obrigado!");
			break;
	}	 
 }
}
