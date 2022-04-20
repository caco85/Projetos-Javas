package p3;
import java.util.Scanner;
public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		CadastroProdutos();
		CadastroFuncionario();
	}
	
	private static void CadastroProdutos() {
		int opc, idProduto,codP = 0;
		String descricao;
		double valor;
		do{
			System.out.println("Bem vindo a area do produto, aqui voce pode escolher as op�es abaixo,"
                    + "Digite a op��o desejada");
			System.out.println("-----------------");
			MenuProduto();
			opc = scanner.nextInt();
			Produto produto;
            switch (opc) {
                case 1:
                    produto = new Produto();
                    idProduto = codP + 1; 
                    System.out.println("Digite o Nome do Produto");
                    descricao = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Digite o Pre�o do Produto");
                    valor = scanner.nextDouble();
                    
                    produto.setidProduto(idProduto);
                    produto.setDescri�ao(descricao);
                    produto.setValor(valor);
                    produto.cadastrarProduto(produto);
                    
                    codP = codP + 1;
                    break;
                    
                case 2:
                	produto = new Produto();
                    System.out.println("Lista de Produtos: ");
                    produto.listarProduto();
                    System.out.println("");
                    break;
                    
                case 3:
                	System.out.println("Digite o id do produto para a pesquisa");
                    idProduto = scanner.nextInt();
                    produto = new Produto();
                    if (produto.buscarProduto(idProduto) != null) {
                        System.out.println("Produto Localizado foi: ID: " + produto.getIdProduto()+ 
                        		" Nome: "+ produto.getDescri�ao() +
                                " Pre�o: "+ produto.getValor());
                    } else {
                        System.out.println("Produto digitado n�o localizado! ");
                    }          
                    break;
                
                case 4:
                	System.out.println("Digite o codigo do Produto para a Atualizar");
                    idProduto = scanner.nextInt();
                    produto = new Produto();
                    if (produto.buscarProduto(idProduto) != null) {
                        System.out.println("Agora digite o que quer atualizar!");
                        System.out.println("1- Nome 2- Pre�o 3- Nome e Pre�o.");
                        int opcAttP = scanner.nextInt();
                        switch(opcAttP){
                        case 1:
                            System.out.println("Digite o novo nome: ");
                            descricao = scanner.nextLine();
                            produto.setDescri�ao(descricao);
                            break;
                        case 2:
                            System.out.println("Digite o novo Pre�o: ");
                            valor = scanner.nextInt();
                            produto.setValor(valor);
                            break;
                        case 3:
                        	System.out.println("Digite o novo nome: ");
                            descricao = scanner.nextLine();
                            produto.setDescri�ao(descricao);
                            System.out.println("Digite o novo Pre�o: ");
                            valor = scanner.nextInt();
                            produto.setValor(valor);
                            break;
                        default:
                    	   System.out.println("Voce escolheu uma op��o invalida");
                        }
                        
                        produto.atualizarProduto(produto);
                    } else {
                        System.out.println("N�o foi possivel Atualizar, Produto digitado n�o localizado");
                    }
                    break;
                case 5:
                	System.out.println("Digite o codigo do Produto para a Remover");
                    idProduto = scanner.nextInt();
                    produto = new Produto();
                    if (produto.buscarProduto(idProduto) != null) {
                        produto.removerProduto(produto);
                    } else {
                    	System.out.println("N�o foi possivel Remover, Produto digitado n�o localizado");
                    }
                    break;
                case 0:
                    System.out.println("Voc� escolheu sair, obrigado!");
                    break;
                default:
                    System.out.println("Voc� Digitou algo errado! ");
            }
                
		}while (opc != 0);
    }
		
	private static void CadastroFuncionario() {
		int opc, idFuncionario,codF = 0;
		String nome, cpf;
		double salario;
		do{
			System.out.println("Bem vindo a area do funcion�rio, aqui voce pode escolher as op�es abaixo,"
                    + "Digite a op��o desejada");
			System.out.println("-----------------");
			menuFuncionario();
			opc = scanner.nextInt();
			Funcionario funcionario;
            switch (opc) {
                case 1:
                    funcionario = new Funcionario();
                    idFuncionario = codF + 1; 
                    System.out.println("Digite o Nome do Funcion�rio");
                    nome = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Digite o CPF do Funcion�rio");
                    cpf = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Digite o sal�rio do Funcion�rio");
                    salario = scanner.nextDouble();
                    
                    funcionario.setIdFuncionario(idFuncionario);
                    funcionario.setNome(nome);
                    funcionario.setSalario(salario);
                    funcionario.setCpf(cpf); 
                    funcionario.cadastrarFuncionario(funcionario);
                    
                    codF = codF + 1;
                    break;
                    
                case 2:
                	funcionario = new Funcionario();
                    System.out.println("Lista de Funcion�rios: ");
                    funcionario.listarFuncionarios();
                    System.out.println("");
                    break;
                    
                case 3:
                	System.out.println("Digite o id do funcion�rio para a pesquisa");
                    idFuncionario = scanner.nextInt();
                    funcionario = new Funcionario();
                    if (funcionario.buscarFuncionario(idFuncionario) != null) {
                        System.out.println("Funcionario Localizado foi: ID: " + funcionario.getIdFuncionario()+ 
                        		" Nome: "+ funcionario.getNome() +
                                "CPF: " + funcionario.getCpf() +
                        		" Sal�rio: "+ funcionario.getSalario());
                    } else {
                        System.out.println("Funcionario digitado n�o localizado! ");
                    }          
                    break;
                
                case 4:
                	System.out.println("Digite o codigo do funcionario para a Atualizar");
                    idFuncionario = scanner.nextInt();
                    funcionario = new Funcionario();
                    if (funcionario.buscarFuncionario(idFuncionario) != null) {
                        System.out.println("Agora digite o que quer atualizar!");
                        System.out.println("1- Nome 2- Sal�rio 3- Nome e Sal�rio.");
                        int opcAttP = scanner.nextInt();
                        switch(opcAttP){
                        case 1:
                            System.out.println("Digite o novo nome: ");
                            nome = scanner.nextLine();
                            funcionario.setNome(nome);
                            break;
                        case 2:
                            System.out.println("Digite o novo Sal�rio: ");
                            salario = scanner.nextInt();
                            funcionario.setSalario(salario);
                            break;
                        case 3:
                        	System.out.println("Digite o novo nome: ");
                            nome = scanner.nextLine();
                            funcionario.setNome(nome);
                            System.out.println("Digite o novo Sal�rio: ");
                            salario = scanner.nextInt();
                            funcionario.setSalario(salario);
                            break;
                        default:
                    	   System.out.println("Voce escolheu uma op��o invalida");
                        }
                        
                        funcionario.atualizarFuncionario(funcionario);
                    } else {
                        System.out.println("N�o foi possivel Atualizar, Funcionario digitado n�o localizado");
                    }
                    break;
                case 5:
                	System.out.println("Digite o codigo do Funcionario para a Remover");
                    idFuncionario = scanner.nextInt();
                    funcionario = new Funcionario();
                    if (funcionario.buscarFuncionario(idFuncionario) != null) {
                    	funcionario.removerFuncionario(funcionario);
                    } else {
                    	System.out.println("N�o foi possivel Remover, Funcionario digitado n�o localizado");
                    }
                    break;
                case 0:
                    System.out.println("Voc� escolheu sair, obrigado!");
                    break;
                default:
                    System.out.println("Voc� Digitou algo errado! ");
            }
                
		}while (opc != 0);
	}
		
    
	
	public static void MenuProduto() {
        System.out.println("Digite 1 - Cadastrar Produto: ");
        System.out.println("Digite 2 - Listar todos os Produtos: ");
        System.out.println("Digite 3 - Listar apenas um Produto: ");
        System.out.println("Digite 4 - Atualizar um Produto: ");
        System.out.println("Digite 5 - remover um Produto: ");
        System.out.println("Digite 0 - Para voltar para o menu principal: ");
    }
	
	public static void menuFuncionario(){
        System.out.println("Digite 1 - Cadastrar Funcionario: ");
        System.out.println("Digite 2 - Listar todos os Funcion�rios: ");
        System.out.println("Digite 3 - Listar apenas um Funcion�rio: ");
        System.out.println("Digite 4 - Atualizar um Funcion�rio: ");
        System.out.println("Digite 5 - remover um Funcion�rio: ");
        System.out.println("Digite 0 - Para voltar para o menu principal: ");
	}
}
