package br.unicap.DisciplinaPIII.ProjetoComercial.UI;

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
import br.unicap.DisciplinaPIII.ProjetoComercial.Fachada.Fachada;
import br.unicap.DisciplinaPIII.ProjetoComercial.Fachada.IFachada;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.ClientePJ;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Cliente;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Funcionario;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Endereco;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.ClientePF;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Empresa;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Fornecedores;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Produto;
import br.unicap.DisciplinaPIII.ProjetoComercial.Model.Venda;
import br.unicap.DisciplinaPIII.ProjetoComercial.Util.UtilFuncoesGlobais;
import java.util.Scanner;

/**
 *
 * @author Renato Nunes,Felipe,Augusto
 */
public class GUI {

    public static Scanner scanner = new Scanner(System.in);
   
    private static IFachada fachada = new Fachada();

    public static void main(String[] args) throws ClienteException, RepositoryClienteException, 
            FuncionarioException, RepositoryFuncionarioException,ProdutoException,RepositoryProdutoException,
            VendaException,RepositoryVendaException,FornecedoresException,RepositoryFornecedoresException{
        int opcMenu;
        do {
            System.out.println("Digite a opção desejada! ");
            System.out.println("");
            System.out.println("1- para cadastro de Clientes: ");
            System.out.println("2- para cadastro de Produtos: ");
            System.out.println("3- para cadastro de Empresa; ");
            System.out.println("4- para cadastro de Fornecedores");
            System.out.println("5- para Local de Vendas: ");           
            System.out.println("0-sair do menu princial: ");
            opcMenu = scanner.nextInt();
            switch (opcMenu) {
                case 1:
                    CadastroClientes();
                    break;
                case 2:
                    CadastroProdutos();
                    break;
                case 3:
                    CadastroEmpresa();
                    break;
                    case 4:
                    CadastroFornecedores();
                    break;
                case 5:
                    Venda();
                    break;
                case 0:
                    System.out.println("Você escolheu sair, obrigado!");
                    break;
                default:
                    System.out.println("Você Digitou algo errado! ");
            }
        } while (opcMenu != 0);
    }

    private static void CadastroClientes() throws ClienteException, RepositoryClienteException {
        int opcSub, cont = 0, tam, escOpc, opcAtt;
        String codigo, nome, email, cpfouCnpj, telefone,rgOuInscEstadual;
        UtilFuncoesGlobais utilFuncGlobal = new UtilFuncoesGlobais();
        do {
            System.out.println("Bem vindo a area do cliente aqui voce pode escolher as opões abaixo,"
                    + "Digite a opção dejejada");
            System.out.println("-----------------");
            MenuCliente();
            opcSub = scanner.nextInt();scanner.nextLine();
            Cliente clientePF;
            Cliente clientePJ;
            Endereco end;
            switch (opcSub) {
                case 1:
                    try {
                        clientePF = new ClientePF();
                        clientePJ = new ClientePJ();
                        end = new Endereco();

                        codigo = Integer.toString(cont + 1); //auto incremente do codigo.
                        System.out.println("Digite o Nome do Cliente");
                        nome = scanner.nextLine();
                        while (utilFuncGlobal.validarApenasLetra(nome)== false) { 
                            System.out.println("O nome so pode ter letras e/ou com espaço");
                            System.out.println("Digite o Nome do Cliente");
                            nome = scanner.nextLine();
                        }
                        
                        
                        System.out.println("Digite o Email do Cliente");
                        email = scanner.nextLine();
                        System.out.println("Digite o  CPF ou CNPJ do Cliente");
                        cpfouCnpj = scanner.nextLine();
                        tam = cpfouCnpj.length();
                        while (utilFuncGlobal.validarNum(cpfouCnpj) != true || tam != 11 && tam != 14) {
                            System.out.println("o CPF ou CNPJ precisa ser apenas numeros e o tamanho de:"
                                    + " CPF = 11 ou CNPJ = 14! ");
                            System.out.println("Digite o  CPF ou CNPJ do Cliente");
                            cpfouCnpj = scanner.nextLine();
                            tam = cpfouCnpj.length();
                        }
                        System.out.println("Digite o Telefone do Cliente");
                        telefone = scanner.nextLine();
                        while (utilFuncGlobal.validarNum(telefone) != true ) {   
                            System.out.println("Atenção! o Telefone é apenas numero");
                            System.out.println("Digite o Telefone do Cliente");
                            telefone = scanner.nextLine();                            
                        }
                        if (tam == 11) {

                            System.out.println("Digite o  RG do Cliente");
                            rgOuInscEstadual = scanner.nextLine();
                            while (utilFuncGlobal.validarNum(rgOuInscEstadual) != true) {
                                System.out.println("Atenção! o RG  é apenas numero");
                                System.out.println("Digite o  RG do Cliente");
                                rgOuInscEstadual = scanner.nextLine();
                            }
                            clientePF.setCodigoCliente(codigo);
                            clientePF.setNome(nome);
                            ((ClientePF) clientePF).setCpf(cpfouCnpj);
                            ((ClientePF) clientePF).setRg(Integer.parseInt(rgOuInscEstadual));
                            clientePF.setEmail(email);
                            clientePF.setTelefone(Integer.parseInt(telefone));
                            cadastrarEndereco(end);
                            clientePF.setEndereco(end);

                            fachada.cadastrarCliente(clientePF);

                        } else {
                            System.out.println("Digite a inscrição estadual ou zero se não houver: ");
                            rgOuInscEstadual = scanner.nextLine();
                            while (utilFuncGlobal.validarNum(rgOuInscEstadual) != true) {
                                System.out.println("Atenção! a incrição estadual é apenas numero");
                                System.out.println("Digite o inscrição estadual ou zero se não houver: ");
                                rgOuInscEstadual = scanner.nextLine();
                            }
                            clientePJ.setCodigoCliente(codigo);
                            clientePJ.setNome(nome);
                            ((ClientePJ) clientePJ).setCNPJ(cpfouCnpj);
                            ((ClientePJ) clientePJ).setInscricaoEstadual(Integer.parseInt(rgOuInscEstadual));
                            clientePJ.setEmail(email);
                            clientePJ.setTelefone(Integer.parseInt(telefone));
                            cadastrarEndereco(end);
                            clientePJ.setEndereco(end);

                            fachada.cadastrarCliente(clientePJ);
                        }
                        cont = cont + 1;
                    } catch (ClienteException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryClienteException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Lista de Clientes Cadastrado: ");
                        fachada.listarClientesAll(fachada.listarClientes());
                        System.out.println("");
                    } catch (ClienteException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryClienteException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    int opcPesquisa;
                    try {
                        System.out.println("Escolha o tipo de pesquisa");
                        System.out.println("1 - pelo Codigo: 2- PeLo CPF ou CNPJ: 3- Pelo Nome: ");
                        opcPesquisa = scanner.nextInt();scanner.nextLine();
                        Cliente clientePesquisa = new Cliente();

                        if (opcPesquisa == 1) {
                            System.out.println("Digite o codigo do cliente para a pesquisa");
                            codigo = scanner.nextLine();
                            clientePesquisa = fachada.buscarCliente(codigo);
                        } else if (opcPesquisa == 2) {

                            System.out.println("Digite o Cpf ou cnpj do cliente para a pesquisa");
                            cpfouCnpj = scanner.nextLine();
                            clientePesquisa = fachada.buscarClienteCPFouCNPJ(cpfouCnpj);
                        } else if (opcPesquisa == 3) {

                            System.out.println("Digite o nome do cliente para a pesquisa");
                            nome = scanner.nextLine();
                            clientePesquisa = fachada.buscarClientePeloNome(nome);
                        } else {
                            System.out.println("VocÊ digitou algo errado!: ");
                        }

                        if (clientePesquisa != null) {
                            System.out.println("Cliente Localizado foi: Codigo: " + clientePesquisa);
                        } else {
                            System.out.println("Cliente digitado não localizado! ");
                        }
                        break;
                    } catch (ClienteException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryClienteException e) {
                        System.out.println(e.getMessage());
                    }
                case 4:
                    try {
                        System.out.println("Escolha a opção de pesquisa parar atualizar 1- Clientes PF ou 2 Para Clientes PJ: ");
                        escOpc = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite o codigo do cliente para a Atualizar");
                        codigo = scanner.nextLine();
                        if (escOpc == 1) {
                            Cliente clientePesquisaPF = fachada.buscarCliente(codigo);
                            if (clientePesquisaPF != null) {
                                System.out.println("Agora digite o que quer atualizar!");
                                System.out.println("1- Nome 2 - Email 3 - Telefone 4 Nome,Email e Telefone.");
                                opcAtt = scanner.nextInt();
                                scanner.nextLine();
                                switch (opcAtt) {
                                    case 1:
                                        System.out.println("Digite o novo nome: ");
                                        nome = scanner.nextLine();
                                        while (utilFuncGlobal.validarApenasLetra(nome) == false) {
                                            System.out.println("O nome so pode ter letras e/ou com espaço");
                                            System.out.println("Digite o Nome do Cliente");
                                            nome = scanner.nextLine();
                                        }
                                        clientePesquisaPF.setNome(nome);
                                        break;
                                    case 2:
                                        System.out.println("Digite o novo Email: ");
                                        email = scanner.nextLine();
                                        clientePesquisaPF.setEmail(email);
                                        break;
                                    case 3:
                                        System.out.println("Digite o novo Telefone: ");
                                        telefone = scanner.nextLine();
                                        while (utilFuncGlobal.validarNum(telefone) != true) {
                                            System.out.println("Atenção! o Telefone é apenas numero");
                                            System.out.println("Digite o Telefone do Cliente");
                                            telefone = scanner.nextLine();
                                        }
                                        clientePesquisaPF.setTelefone(Integer.parseInt(telefone));      
                                        break;
                                    case 4:
                                        System.out.println("Digite o novo nome: ");
                                        nome = scanner.nextLine();
                                        clientePesquisaPF.setNome(nome);
                                        while (utilFuncGlobal.validarApenasLetra(nome) == false) {
                                            System.out.println("O nome so pode ter letras e/ou com espaço");
                                            System.out.println("Digite o Nome do Cliente");
                                            nome = scanner.nextLine();
                                        }
                                        System.out.println("Digite o novo Email: ");
                                        email = scanner.nextLine();
                                        clientePesquisaPF.setEmail(email);
                                        System.out.println("Digite o novo Telefone: ");
                                        telefone = scanner.nextLine();
                                        while (utilFuncGlobal.validarNum(telefone) != true) {
                                            System.out.println("Atenção! o Telefone é apenas numero");
                                            System.out.println("Digite o Telefone do Cliente");
                                            telefone = scanner.nextLine();
                                        }
                                        clientePesquisaPF.setTelefone(Integer.parseInt(telefone));
                                        break;
                                    default:
                                        System.out.println("Voce escolheu uma opção invalida");
                                }
                                fachada.atualizarCliente(clientePesquisaPF);
                            } else {
                                System.out.println("Não foi possivel Atualizar,Cliente digitado não localizado");
                            }
                        } else if (escOpc == 2) {
                            Cliente clientePesquisaPJ = fachada.buscarCliente(codigo);
                            if (clientePesquisaPJ != null) {
                                System.out.println("Agora digite o que quer atualizar!");
                                System.out.println("1- Nome 2 - Email 3 - Telefone 4 Nome,Email e Telefone.");
                                opcAtt = scanner.nextInt();
                                scanner.nextLine();
                                switch (opcAtt) {
                                    case 1:
                                        System.out.println("Digite o novo nome: ");
                                        nome = scanner.nextLine();
                                        while (utilFuncGlobal.validarApenasLetra(nome) == false) {
                                            System.out.println("O nome so pode ter letras e/ou com espaço");
                                            System.out.println("Digite o Nome do Cliente");
                                            nome = scanner.nextLine();
                                        }
                                        clientePesquisaPJ.setNome(nome);
                                        break;
                                    case 2:
                                        System.out.println("Digite o novo Email: ");
                                        email = scanner.nextLine();
                                        clientePesquisaPJ.setEmail(email);
                                        break;
                                    case 3:
                                       System.out.println("Digite o novo Telefone: ");
                                        telefone = scanner.nextLine();
                                        while (utilFuncGlobal.validarNum(telefone) != true) {
                                            System.out.println("Atenção! o Telefone é apenas numero");
                                            System.out.println("Digite o Telefone do Cliente");
                                            telefone = scanner.nextLine();
                                        }
                                        clientePesquisaPJ.setTelefone(Integer.parseInt(telefone));
                                        break;
                                    case 4:
                                        System.out.println("Digite o novo nome: ");
                                        nome = scanner.nextLine();
                                        while (utilFuncGlobal.validarApenasLetra(nome) == false) {
                                            System.out.println("O nome so pode ter letras e/ou com espaço");
                                            System.out.println("Digite o Nome do Cliente");
                                            nome = scanner.nextLine();
                                        }
                                        clientePesquisaPJ.setNome(nome);
                                        System.out.println("Digite o novo Email: ");
                                        email = scanner.nextLine();
                                        clientePesquisaPJ.setEmail(email);
                                        System.out.println("Digite o novo Telefone: ");
                                        telefone = scanner.nextLine();
                                        while (utilFuncGlobal.validarNum(telefone) != true) {
                                            System.out.println("Atenção! o Telefone é apenas numero");
                                            System.out.println("Digite o novo Telefone ");
                                            telefone = scanner.nextLine();
                                        }
                                        clientePesquisaPJ.setTelefone(Integer.parseInt(telefone));
                                        break;
                                    default:
                                        System.out.println("Voce escolheu uma opção invalida");
                                }
                                fachada.atualizarCliente(clientePesquisaPJ);
                            } else {
                                System.out.println("Não foi possivel Atualizar,Cliente digitado não localizado");
                            }
                        } else {
                            System.out.println("Você Digitou algo errado e foi direcionado para o menu Principal! ");
                        }
                        break;
                    } catch (ClienteException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryClienteException e) {
                        System.out.println(e.getMessage());
                    }
                case 5:
                    try {
                        System.out.println("Digite o codigo do cliente para a Remover");
                        codigo = scanner.nextLine();
                        Cliente clientePesquisaRemover = fachada.buscarCliente(codigo);
                        if (clientePesquisaRemover != null) {
                            fachada.removerCliente(clientePesquisaRemover);
                        } else {
                            System.out.println("Não foi possivel Remover,Cliente digitado não localizado");
                        }
                        break;
                    } catch (ClienteException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryClienteException e) {
                        System.out.println(e.getMessage());
                    }
                case 0:
                    System.out.println("Você escolheu sair, obrigado!");
                    break;
                default:
                    System.out.println("Você Digitou algo errado! ");
            }
        } while (opcSub != 0);
    }

    private static void CadastroProdutos() throws ProdutoException, RepositoryProdutoException{
        int opc, cont = 0;
        String descricao, idProduto,qtd;
        UtilFuncoesGlobais utilFuncGlobal = new UtilFuncoesGlobais();
        double valor;
        do {
            System.out.println("Bem vindo a area do produto, aqui voce pode escolher as opções abaixo,"
                    + "Digite a opção desejada");
            System.out.println("-----------------");
            MenuProduto();
            opc = scanner.nextInt();scanner.nextLine();
            Produto produto;
            switch (opc) {
                case 1:
                    try {
                       
                        idProduto = Integer.toString(cont + 1);
                        produto = new Produto(idProduto);
                        System.out.println("Digite o Descriçao do Produto");
                        descricao = scanner.nextLine();
                        while (utilFuncGlobal.validarApenasLetra(descricao)== false) { 
                            System.out.println("Atenção a descrição so pode ter letras e/ou com espaço");
                            System.out.println("Digite o Descriçao do Produto");
                            descricao = scanner.nextLine();
                        }
                        System.out.println("Digite o Preço do Produto");
                        valor = scanner.nextDouble();
                        
                        System.out.println("Digite a quantidade do produto");
                        qtd = scanner.nextLine();
                        while (utilFuncGlobal.validarNum(qtd) != true)  {
                            System.out.println("Atenção! a quantidade é apenas numero");
                            System.out.println("Digite a quantidade do produto");
                            qtd = scanner.nextLine();
                        }
                        produto.setidProduto(idProduto);
                        produto.setDescricao(descricao);
                        produto.setValor(valor);
                        produto.setQtdProduto(Integer.parseInt(qtd));
                        fachada.cadastrarProduto(produto);
                        cont = cont + 1;
                    } catch (ProdutoException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryProdutoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Lista de Produtos: ");
                        fachada.listarProdutosAll(fachada.listarProduto());
                        System.out.println("");
                    } catch (ProdutoException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryProdutoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Digite o id do produto para a pesquisa");
                        idProduto = scanner.nextLine();
                        produto = new Produto(idProduto);
                        produto = fachada.buscarProduto(idProduto);
                       
                        if (produto != null) {
                            System.out.println("Produto Localizado foi: ID: " + produto);
                        } else {
                            System.out.println("Produto digitado não localizado! ");
                        }
                        break;
                    } catch (ProdutoException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryProdutoException e) {
                        System.out.println(e.getMessage());
                    }

                case 4:
                    try {
                        System.out.println("Digite o codigo do Produto para a Atualizar");
                        idProduto = scanner.nextLine();
                        produto = fachada.buscarProduto(idProduto);
                        if (produto != null) {
                            System.out.println("Agora digite o que quer atualizar!");
                            System.out.println("1- Nome 2- Preço 3- quantidade 4- Nome e Preço e quantidade.");
                            int opcAttP = scanner.nextInt();
                            scanner.nextLine();
                            switch (opcAttP) {
                                case 1:
                                    System.out.println("Digite a nova  descrição do produto: ");
                                    descricao = scanner.nextLine();
                                    produto.setDescricao(descricao);
                                        while (utilFuncGlobal.validarApenasLetra(descricao)== false) { 
                                        System.out.println("Atenção a descrição so pode ter letras e/ou com espaço");
                                        System.out.println("Digite o Descriçao do Produto");
                                        descricao = scanner.nextLine();
                                    }
                                    break;
                                case 2:
                                    System.out.println("Digite o novo Preço: ");
                                    valor = scanner.nextInt();
                                    produto.setValor(valor);
                                    break;
                                case 3:
                                    System.out.println("Digite a nova Quantidade: ");
                                    qtd = scanner.nextLine();
                                    while (utilFuncGlobal.validarNum(qtd) != true) {
                                        System.out.println("Atenção! a quantidade é apenas numero");
                                        System.out.println("Digite a quantidade do produto");
                                        qtd = scanner.nextLine();
                                    }
                                    produto.setQtdProduto(Integer.parseInt(qtd));
                                    break;
                                case 4:
                                    System.out.println("Digite o novo nome: ");
                                    descricao = scanner.nextLine();
                                    while (utilFuncGlobal.validarApenasLetra(descricao) == false) {
                                        System.out.println("Atenção a descrição so pode ter letras e/ou com espaço");
                                        System.out.println("Digite o Descriçao do Produto");
                                        descricao = scanner.nextLine();
                                    }
                                    produto.setDescricao(descricao);
                                    System.out.println("Digite o novo PreÇo: ");
                                    valor = scanner.nextInt();
                                    System.out.println("Digite a nova Quantidade: ");
                                    qtd = scanner.nextLine();
                                    while (utilFuncGlobal.validarNum(qtd) != true) {
                                        System.out.println("Atenção! a quantidade é apenas numero");
                                        System.out.println("Digite a quantidade do produto");
                                        qtd = scanner.nextLine();
                                    }
                                    produto.setQtdProduto(Integer.parseInt(qtd));;
                                    produto.setValor(valor);
                                    break;
                                default:
                                    System.out.println("Voce escolheu uma opção invalida");
                            }
                            fachada.atualizarProduto(produto);
                        } else {
                            System.out.println("Nao foi possivel Atualizar, Produto digitado n�o localizado");
                        }
                        break;
                    } catch (ProdutoException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryProdutoException e) {
                        System.out.println(e.getMessage());
                    }
                case 5:
                    try {
                        System.out.println("Digite o codigo do Produto para a Remover");
                        idProduto = scanner.nextLine();
                        produto = fachada.buscarProduto(idProduto);
                        if (produto != null) {
                            fachada.removerProduto(produto);
                        } else {
                            System.out.println("Nao foi possivel Remover, Produto digitado nao localizado");
                        }
                        break;
                    } catch (ProdutoException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryProdutoException e) {
                        System.out.println(e.getMessage());
                    }
                case 0:
                    System.out.println("Voce escolheu sair, obrigado!");
                    break;
                default:
                    System.out.println("Voce Digitou algo errado! ");
            }

        } while (opc != 0);

    }

    private static void CadastroEmpresa()throws FuncionarioException,RepositoryFuncionarioException {
        int opc, codF = 0,codEmpresa = 0,inscricaoEstadual,tam;
        String nome, cpf, idFuncionario,nomeFantasia, CNPJ, codigoEmpresa, razaoSocial;
        double salario;
        Empresa empresa; 
        Endereco enderecoEmpresa;
         UtilFuncoesGlobais utilFuncGlobal = new UtilFuncoesGlobais();
         try {
                        empresa = new Empresa();
                        enderecoEmpresa = new Endereco();
                        codigoEmpresa = Integer.toString(codEmpresa + 1);
                        nomeFantasia = "Mercadinho Acorda povo";               
                        CNPJ = "05.585.934/0001-56";      
                        razaoSocial = "Mercadinho Fernando Gomes LTDA";
                        inscricaoEstadual = 6189596-29;
                        enderecoEmpresa.setNomeRua("Estrada do Sol");
                        enderecoEmpresa.setNumCasa(1985);
                        enderecoEmpresa.setBairro("Boa Vista");
                        enderecoEmpresa.setCidade("Recife");
                        enderecoEmpresa.setComplemento("Loja 1");
                        enderecoEmpresa.setEstado("PE");
                        enderecoEmpresa.setCep("52011-150");
                        empresa.setNomeFantasia(nomeFantasia);
                        empresa.setCNPJ(CNPJ);
                        empresa.setRazaoSocial(razaoSocial);
                        empresa.setInscricaoEstadual(inscricaoEstadual);
                        empresa.setEndereco(enderecoEmpresa);
                        
                        fachada.cadastrarEmpresa(empresa);
                        codEmpresa = codEmpresa + 1;
                    } catch (EmpresaException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryEmpresaException e) {
                        System.out.println(e.getMessage());
                    }
        
        
        
        do {
            System.out.println("Bem vindo a area do funcionário, aqui voce pode escolher as opçôes abaixo,"
                    + "Digite a opçõeo desejada");
            System.out.println("-----------------");
            menuEmpresa();
            opc = scanner.nextInt();scanner.nextLine();
            Funcionario funcionario;
            switch (opc) {
                case 1:
                    try {
                        
                        idFuncionario = Integer.toString(codF + 1);
                        funcionario = new Funcionario(idFuncionario);
                        System.out.println("Digite o Nome do Funcionário");
                        nome = scanner.nextLine();                  
                        System.out.println("Digite o CPF do Funcionário");
                        cpf = scanner.nextLine(); 
                      
                        tam = cpf.length();
                        while (utilFuncGlobal.validarNum(cpf) != true || tam != 11) {
                            System.out.println("o CPF precisa ser apenas numeros e o tamanho de com 11 numeros:");
                            System.out.println("Digite o CPF do Funcionário");
                            cpf = scanner.nextLine();
                            tam = cpf.length();
                        }
                        
                        System.out.println("Digite o salário do Funcionário");
                        salario = scanner.nextDouble();
                        funcionario.setIdFuncionario(idFuncionario);
                        funcionario.setNome(nome);
                        funcionario.setSalario(salario);
                        funcionario.setCpf(cpf);

                        fachada.cadastrarFuncionario(funcionario);
                        codF = codF + 1;
                    } catch (FuncionarioException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryFuncionarioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Lista de Funcionários: ");
                        fachada.listarFuncionariosAll(fachada.listarFuncionarios());
                        System.out.println("");
                    } catch (FuncionarioException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryFuncionarioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Digite o id do funcionário para a pesquisa");
                    idFuncionario = scanner.nextLine();
                    funcionario = new Funcionario(idFuncionario);
                    try {
                        funcionario = fachada.buscarFuncionario(idFuncionario);
                        if (funcionario != null) {
                            System.out.println("Funcionario Localizado foi: : " + funcionario);
                        } else {
                            System.out.println("Funcionario digitado nâo localizado! ");
                        }
                    } catch (FuncionarioException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryFuncionarioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Digite o codigo do funcionario para a Atualizar");
                    idFuncionario = scanner.nextLine();
                    funcionario = new Funcionario(idFuncionario);
                    try {
                        funcionario = fachada.buscarFuncionario(idFuncionario);
                        if (funcionario != null) {
                            System.out.println("Agora digite o que quer atualizar!");
                            System.out.println("1- Nome 2- Salário 3- Nome e Salário.");
                            int opcAttP = scanner.nextInt();scanner.nextLine();
                            
                            switch (opcAttP) {
                                case 1:
                                    System.out.println("Digite o novo nome: ");
                                    nome = scanner.nextLine();
                                    while (utilFuncGlobal.validarApenasLetra(nome) == false) {
                                        System.out.println("O nome so pode ter letras e/ou com espaço");
                                        System.out.println("Digite o Nome do Funcionario");
                                        nome = scanner.nextLine();
                                        funcionario.setNome(nome);
                                    }
                                        break;
                                case 2:
                                    System.out.println("Digite o novo Salário: ");
                                    salario = scanner.nextInt();
                                    funcionario.setSalario(salario);
                                    break;
                                case 3:
                                    System.out.println("Digite o novo nome: ");
                                    nome = scanner.nextLine();
                                    funcionario.setNome(nome);
                                    while (utilFuncGlobal.validarApenasLetra(nome)== false) { 
                                      System.out.println("O nome so pode ter letras e/ou com espaço");
                                      System.out.println("Digite o novo nome ");
                                      nome = scanner.nextLine();
                                    }
                                    System.out.println("Digite o novo Salário: ");
                                    salario = scanner.nextInt();
                                    funcionario.setSalario(salario);
                                    break;
                                default:
                                    System.out.println("Voce escolheu uma opção invalida");
                            }

                               fachada.atualizarFuncionario(funcionario);
                        } else {
                            System.out.println("Não foi possivel Atualizar, Funcionario digitado não localizado");
                        }
                    } catch (FuncionarioException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryFuncionarioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Digite o codigo do Funcionario para a Remover");
                    idFuncionario = scanner.nextLine();
                    funcionario = new Funcionario(idFuncionario);
                    try {
                        funcionario = fachada.buscarFuncionario(idFuncionario);
                        if (funcionario != null) {
                            fachada.removerFuncionario(funcionario);
                        } else {
                            System.out.println("Não foi possivel Remover, Funcionario digitado não localizado");
                        }
                    } catch (FuncionarioException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryFuncionarioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    
                    codigoEmpresa = "1";
                    empresa = new Empresa();
                    try {
                        empresa = fachada.buscarEmpresa(codigoEmpresa);
                        if (empresa != null) {
                            System.out.println("Empresa Localizada foi: C�digo: " + empresa.getCodigoEmpresa()
                                    + " Nome: " + empresa.getNomeFantasia()
                                    + " CNPJ: " + empresa.getCNPJ()
                                    + " Inscri��o Social: " + empresa.getInscricaoEstadual());
                        } else {
                            System.out.println("Empresa digitado nâo localizada! ");
                        }
                    } catch (EmpresaException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryEmpresaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;    
                case 0:
                    System.out.println("Você escolheu sair, obrigado!");
                    break;
                default:
                    System.out.println("Você Digitou algo errado! ");
            }

        } while (opc != 0);

    }

    private static void Venda()throws VendaException,RepositoryVendaException, ProdutoException{
        int opc, cont = 0, qtdP;
        String idProdutoVenda, idVenda;

        do {
            System.out.println("Bem vindo a area de compra, aqui voce pode escolher as opçoes abaixo,"
                    + "Digite a opção desejada");
            System.out.println("-----------------");
            menuVenda();
            opc = scanner.nextInt();
            scanner.nextLine();
            Venda venda;
            Produto produto;
            venda = new Venda();
            idVenda = Integer.toString(cont + 1);
            venda.setIdVenda(idVenda);
            cont = cont + 1;

            switch (opc) {
                case 1:
                    System.out.println("Digite a id do Produto da Compra");
                    idProdutoVenda = scanner.nextLine();
                    try {
                        produto = new Produto(idProdutoVenda);
                        produto = fachada.buscarProdutoVenda(idProdutoVenda);
                        if (produto != null && produto.getQtdProduto() > 0) {
                            fachada.addProduto(produto);
                            qtdP = produto.getQtdProduto() - 1;
                            produto.setQtdProduto(qtdP);
                        } else {
                            System.out.println("O produto não foi encontrado ou está em falta: ");
                        }
                    } catch (VendaException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryVendaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        venda = new Venda();
                        System.out.println("Lista de Produtos no Carrinho: ");
                        fachada.listarProdutosAllCarrinho(fachada.listarProdutosVenda());
                        System.out.println("");
                    } catch (VendaException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryVendaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Digite o id do produto para a pesquisa");
                    idProdutoVenda = scanner.nextLine();
                    try {
                        produto = new Produto(idProdutoVenda);
                        produto = fachada.buscarProdutoVenda(idProdutoVenda);
                        if (produto != null) {
                            System.out.println("Produto Localizado foi: ID: " + produto);
                        } else {
                            System.out.println("Produto digitado não localizado! ");
                        }
                    } catch (VendaException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryVendaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Digite o codigo do Produto para a Remover");
                    idProdutoVenda = scanner.nextLine();
                    produto = new Produto(idProdutoVenda);
                    produto = fachada.buscarProdutoVenda(idProdutoVenda);
                    if (produto != null) {
                         fachada.removerProdutoVenda(produto);
                    } else {
                        System.out.println("Nao foi possivel Remover, Produto digitado nao localizado");
                    }
                    break;
                case 5:
                    try{
                        fachada.calcularVenda(fachada.listarProdutosAllCarrinho(fachada.listarProdutosVenda()));
                    } catch (VendaException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryVendaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Voce escolheu sair, obrigado!");
                    break;
                default:
                    System.out.println("Voce Digitou algo errado! ");

            }
        } while (opc != 0);
    }

    private static void cadastrarEndereco(Endereco e) {
        String num;
        UtilFuncoesGlobais utilFuncGlobal = new UtilFuncoesGlobais();
        System.out.println("Digite o Nome da Rua");
        e.setNomeRua(scanner.nextLine()); //duplicado devido o erro do buff do teclado
        e.setNomeRua(scanner.nextLine());
        System.out.println("Digite o numero da Casa");
        num = scanner.nextLine();
       
        while (utilFuncGlobal.validarNum(num) != true) {
            System.out.println("Atenção! o numero é apenas numero");
            System.out.println("Digite o numero da Casa");
            num = scanner.nextLine();
        }
        e.setNumCasa(Integer.parseInt(num));
        System.out.println("Digite o Complento");
        e.setComplemento(scanner.nextLine()); //msm coisa de rua
        e.setComplemento(scanner.nextLine());
        System.out.println("Digite o cep");
        e.setCep(scanner.nextLine());
        System.out.println("Digite o Bairro");
        e.setBairro(scanner.nextLine());
        System.out.println("Digite a Cidade");
        e.setCidade(scanner.nextLine());
        System.out.println("Digite o Estado");
        e.setEstado(scanner.nextLine());

    }

    private static void CadastroFornecedores() {
        int opc, cont = 0;
        String nomeFornecedor, CNPJ, codFornecedor, email, telefoneFornecedor, tipoFornecimento;
        int qtdFornecida;
        double valorPorUnidade;
        do {
            System.out.println("Bem vindo a area do Fornecedor, aqui voce pode escolher as opçôes abaixo,"
                    + "Digite a opçõeo desejada");
            System.out.println("-----------------");
            menuFornecedores();
            opc = scanner.nextInt();scanner.nextLine();
            Fornecedores fornecedores;
            switch (opc) {
                case 1:
                    try {
                        
                        codFornecedor = Integer.toString(cont + 1);
                        fornecedores = new Fornecedores(codFornecedor);
                        System.out.println("Digite o Nome do Fornecedor: ");
                        nomeFornecedor = scanner.nextLine();                        
                        System.out.println("Digite o CNPJ do Fornecedor: ");
                        CNPJ = scanner.nextLine();
                        System.out.println("Digite o Email do Fornecedor: ");
                        email = scanner.nextLine();
                        System.out.println("Digite o telefone: ");
                        telefoneFornecedor = scanner.nextLine();
                        System.out.println("Digite o tipo do fornecimento: ");
                        tipoFornecimento = scanner.nextLine();
                        System.out.println("Digite a quantidade fornecida: ");
                        qtdFornecida = scanner.nextInt();scanner.nextLine();
                        System.out.println("Digite o valor por unidade: ");
                        valorPorUnidade = scanner.nextDouble();
                        fornecedores.setNomeFornecedor(nomeFornecedor);
                        fornecedores.setCNPJ(CNPJ);
                        fornecedores.setEmail(email);
                        fornecedores.setTelefone(telefoneFornecedor);
                        fornecedores.setTipoFornecimento(tipoFornecimento);
                        fornecedores.setQtdFornecida(qtdFornecida);
                        fornecedores.setValorPorUnidade(valorPorUnidade);

                        fachada.cadastrarFornecedores(fornecedores);
                        cont = cont + 1;
                    } catch (FornecedoresException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryFornecedoresException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Lista de Fornecedores: ");
                        fachada.listarFornecedoresAll(fachada.listarFornecedores());
                        System.out.println("");
                    } catch (FornecedoresException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryFornecedoresException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Digite o codigo do Fornecedor para a pesquisa");
                    codFornecedor = scanner.nextLine();
                    fornecedores = new Fornecedores(codFornecedor);
                    try {
                        fornecedores = fachada.buscarFornecedores(codFornecedor);
                        if (fornecedores != null) {
                            System.out.println("Fornecedor Localizado foi:  " + fornecedores);
                        } else {
                            System.out.println("Fornecedor digitado nâo localizado! ");
                        }
                    } catch (FornecedoresException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryFornecedoresException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Digite o codigo do Fornecedor para Atualizar");
                    codFornecedor = scanner.nextLine();
                    fornecedores = new Fornecedores(codFornecedor);
                    try {
                        fornecedores = fachada.buscarFornecedores(codFornecedor);
                        if (fornecedores != null) {
                            System.out.println("Agora digite o que quer atualizar!");
                            System.out.println("1- Nome 2- CNPJ 3- Email 4- Telefone 5- Tipo de fornecimento 6- quantidade fornecida"
                                    + " 7- Preço unitrio ");
                            int opcAttP = scanner.nextInt();
                            scanner.nextLine();

                            switch (opcAttP) {
                                case 1:
                                    System.out.println("Digite o novo nome: ");
                                    nomeFornecedor = scanner.nextLine();
                                    fornecedores.setNomeFornecedor(nomeFornecedor);
                                    break;
                                case 2:
                                    System.out.println("Digite o novo CNPJ: ");
                                    CNPJ = scanner.nextLine();
                                    fornecedores.setCNPJ(CNPJ);
                                    break;
                                case 3:
                                    System.out.println("Digite o novo email: ");
                                    email = scanner.nextLine();
                                    fornecedores.setEmail(email);
                                    break;
                                case 4:
                                    System.out.println("Digite o novo Telefone: ");
                                    telefoneFornecedor = scanner.nextLine();
                                    fornecedores.setTelefone(telefoneFornecedor);
                                    break;
                                case 5:
                                    System.out.println("Digite o novo Tipo de fornecimento: ");
                                    tipoFornecimento = scanner.nextLine();
                                    fornecedores.setTipoFornecimento(tipoFornecimento);
                                    break;
                                case 6:
                                    System.out.println("Digite a nova quantidade fornecida: ");
                                    qtdFornecida = scanner.nextInt();
                                    fornecedores.setQtdFornecida(qtdFornecida);
                                    break;
                                case 7:
                                    System.out.println("Digite o novo pre�o unit�rio : ");
                                    valorPorUnidade = scanner.nextDouble();
                                    fornecedores.setValorPorUnidade(valorPorUnidade);
                                    break;
                                default:
                                    System.out.println("Voce escolheu uma opção invalida");
                            }

                            fachada.atualizarFornecedores(fornecedores);
                        } else {
                            System.out.println("Não foi possivel Atualizar, Fornecedor digitado não localizado");
                        }
                    } catch (FornecedoresException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryFornecedoresException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Digite o codigo do Fornecedor para a Remover");
                    codFornecedor = scanner.nextLine();
                    fornecedores = new Fornecedores(codFornecedor);
                    try {
                        fornecedores = fachada.buscarFornecedores(codFornecedor);
                        if (fornecedores != null) {
                            fachada.removerFornecedores(fornecedores);
                        } else {
                            System.out.println("Não foi possivel Remover, Fornecedor digitado não localizado");
                        }
                    } catch (FornecedoresException e) {
                        System.out.println(e.getMessage());
                    } catch (RepositoryFornecedoresException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Você escolheu sair, obrigado!");
                    break;
                default:
                    System.out.println("Você Digitou algo errado! ");
            }

        } while (opc != 0);
    }
    private static void MenuCliente() {
        System.out.println("Digite 1 - Cadastrar Cliente: ");
        System.out.println("Digite 2 - Listar todos os  Clientes: ");
        System.out.println("Digite 3 - Listar apenas um Cliente: ");
        System.out.println("Digite 4 - Atualiar um Cliente: ");
        System.out.println("Digite 5 - remover um Cliente: ");
        System.out.println("Digite 0 - Para voltar para o menu princiapl: ");
    }

    private static void MenuProduto() {
        System.out.println("Digite 1 - Cadastrar Produto: ");
        System.out.println("Digite 2 - Listar todos os Produtos: ");
        System.out.println("Digite 3 - Listar apenas um Produto: ");
        System.out.println("Digite 4 - Atualizar um Produto: ");
        System.out.println("Digite 5 - remover um Produto: ");
        System.out.println("Digite 0 - Para voltar para o menu principal: ");
    }

    private static void menuEmpresa() {
        System.out.println("Digite 1 - Cadastrar Funcionario: ");
        System.out.println("Digite 2 - Listar todos os Funcionarios: ");
        System.out.println("Digite 3 - Listar apenas um Funcionario: ");
        System.out.println("Digite 4 - Atualizar um Funcionario: ");
        System.out.println("Digite 5 - remover um Funcionario: ");
        System.out.println("Digite 6 - Detalhar empresa: ");
        System.out.println("Digite 0 - Para voltar para o menu principal: ");
    }

    private static void menuVenda() {
        System.out.println("Digite 1 - Adicionar produto ao carrinho: ");
        System.out.println("Digite 2 - Listar os Produtos do carrinho: ");
        System.out.println("Digite 3 - Listar um Produto do carrinho: ");
        System.out.println("Digite 4 - Remover um produto do carrinho: ");
        System.out.println("Digite 5 - Calcular vendas: ");
        System.out.println("Digite 0 - Para encerrar a compra e voltar ao menu principal: ");
    }

    private static void menuFornecedores() {
        System.out.println("Digite 1 - Cadastrar Fornecedor: ");
        System.out.println("Digite 2 - Listar todos os Fornecedores: ");
        System.out.println("Digite 3 - Listar apenas um Fornecedores: ");
        System.out.println("Digite 4 - Atualizar um Fornecedor: ");
        System.out.println("Digite 5 - remover um Fornecedor: ");
        System.out.println("Digite 0 - Para voltar para o menu principal: ");
    }

}
