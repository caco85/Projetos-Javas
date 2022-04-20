package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;
import java.util.Scanner;
import PooProject.ProjetoAP2.Excecao.ProdutoException;
import PooProject.ProjetoAP2.Excecao.RepositorioProdutoException;
import PooProject.ProjetoAP2.Modelo.Produto;
import PooProject.ProjetoAP2.Repositorio.RepositorioProduto;
import util.Constants;

public class ControladorProduto implements IControladorProduto {
	private static Scanner scanner = new Scanner(System.in);
	public RepositorioProduto repProduto;
	public static ControladorProduto instancia;
	
	private int tipoEscolha ;
	private int tipoEscolhaSub;
	
	public static ControladorProduto getInstance(){
		if (instancia == null) {
			instancia = new ControladorProduto();
		}
		return instancia;
	}
	public ControladorProduto() {
		repProduto = RepositorioProduto.getInstance();
	}

	@Override
	public void inserirProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		if(repProduto.pesquisarProdutoPeloCodigo(produto.getCodProduto()) != null){
			//quando o produto ja existe ele add +1 na qtd
			produto.setQtdProduto(produto.getQtdProduto()+1); 
			repProduto.atualizarProduto(produto);
		}
		else{
			this.repProduto.inserirProduto(produto);
			}
	}

	@Override
	public void excluirProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		this.repProduto.excluirProduto(produto);
		
	}

	@Override
	public void excluirProdutoPeloNome(String nome) throws ProdutoException, RepositorioProdutoException {
		if(repProduto.pesquisarProdutoPeloNome(nome)!= null){
			this.repProduto.excluirProdutoPeloNome(nome);
		}else{
			throw new ProdutoException("Produto não localizado");
		}
	}

	@Override
	public Produto pesquisarProdutoPeloCodigo(int codigo) throws ProdutoException, RepositorioProdutoException {
		return repProduto.pesquisarProdutoPeloCodigo(codigo);
	}

	@Override
	public Produto pesquisarProdutoPeloNome(String nome) throws ProdutoException, RepositorioProdutoException {
		return repProduto.pesquisarProdutoPeloNome(nome);
	}
	@Override
	public ArrayList<Produto> listarProdutos() throws ProdutoException, RepositorioProdutoException {

		return repProduto.listarProdutos();
	}
	@Override
	public void atualizarProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		this.repProduto.atualizarProduto(produto);
	}
	@Override
	public ArrayList<Produto> listarProdutosAll(ArrayList<Produto> arrayProdutosAll)throws ProdutoException, RepositorioProdutoException {
	if (arrayProdutosAll != null){
			
			for (int i = 0; i< arrayProdutosAll.size(); i++){
				arrayProdutosAll.get(i);
					System.out.println("Codigo do produto : "+arrayProdutosAll.get(i).getCodProduto()+ " Nome Produto : " + arrayProdutosAll.get(i).getNomeProduto() + " Quantidade: " + arrayProdutosAll.get(i).getQtdProduto()
							+" Preço :  "+ arrayProdutosAll.get(i).getPreco()+" Sabor :  "+ arrayProdutosAll.get(i).getTipoProduto());		
			}
		}
		return arrayProdutosAll;
	}
	@Override
	public void cadastrarProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {		
		System.out.println("Escolha a opção de Cadastro \n onde:\n 1  Ovos Trufados "
				+ " \n 2 Ovos de Colher \n 3 trufas");
		tipoEscolha = scanner.nextInt();		
		if (tipoEscolha == 1){
			System.out.println("Escolha o tipo de Ovo trufado \n onde: "
					+ "\n 1 Pequeno Morango, 2 pequeno Chocolate , 3 pequeno Prestigio, 4 pequeno Chocobanana  "
					+ "\n 5 Medio Morango, 6 Medio Chocolate , 7 Medio Prestigio, 8 Medio Chocobanana"
					+ "\n 9 Grande Morango, 10 Grande Chocolate , 11 Grande Prestigio, 12 Grande Chocobanana");
			tipoEscolhaSub = scanner.nextInt();
			switch (tipoEscolhaSub) {
			case 1:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoPMor.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoTrufadoPMor.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoPMor.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoTrufadoPMor.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoPMor.getPreco());
				produto.setPreco(Constants.Produtos.OvoTrufadoPMor.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoPMor.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoTrufadoPMor.getRecheio());
				break;
			case 2:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoPChoco.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoTrufadoPChoco.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoPChoco.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoTrufadoPChoco.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoPChoco.getPreco());
				produto.setPreco(Constants.Produtos.OvoTrufadoPChoco.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoPChoco.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoTrufadoPChoco.getRecheio());			
				break;
			case 3:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoPPres.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoTrufadoPPres.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoPPres.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoTrufadoPPres.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoPPres.getPreco());
				produto.setPreco(Constants.Produtos.OvoTrufadoPPres.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoPPres.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoTrufadoPPres.getRecheio());
				break;
			case 4:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoPChoba.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoTrufadoPChoba.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoPChoba.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoTrufadoPChoba.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoPChoba.getPreco());
				produto.setPreco(Constants.Produtos.OvoTrufadoPChoba.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoPChoba.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoTrufadoPChoba.getRecheio());
				break;
			case 5:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoMMor.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoTrufadoMMor.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoMMor.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoTrufadoMMor.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoMMor.getPreco());
				produto.setPreco(Constants.Produtos.OvoTrufadoMMor.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoMMor.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoTrufadoMMor.getRecheio());
				break;
			case 6:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoMChoco.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoTrufadoMChoco.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoMChoco.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoTrufadoMChoco.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoMChoco.getPreco());
				produto.setPreco(Constants.Produtos.OvoTrufadoMChoco.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoMChoco.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoTrufadoMChoco.getRecheio());
				System.out.println("Digite a Quantidade");
				produto.setQtdProduto(scanner.nextInt());
				break;
			case 7:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoMPres.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoTrufadoMPres.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoMPres.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoTrufadoMPres.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoMPres.getPreco());
				produto.setPreco(Constants.Produtos.OvoTrufadoMPres.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoMPres.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoTrufadoMPres.getRecheio());
				break;
			case 8:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoMChoba.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoTrufadoMChoba.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoMChoba.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoTrufadoMChoba.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoMChoba.getPreco());
				produto.setPreco(Constants.Produtos.OvoTrufadoMChoba.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoMChoba.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoTrufadoMChoba.getRecheio());
				break;
			case 9:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoGMor.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoTrufadoGMor.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoGMor.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoTrufadoGMor.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoGMor.getPreco());
				produto.setPreco(Constants.Produtos.OvoTrufadoGMor.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoGMor.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoTrufadoGMor.getRecheio());
				break;
			case 10:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoGChoco.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoTrufadoGChoco.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoGChoco.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoTrufadoGChoco.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoGChoco.getPreco());
				produto.setPreco(Constants.Produtos.OvoTrufadoGChoco.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoGChoco.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoTrufadoGChoco.getRecheio());
				break;
			case 11:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoGPres.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoTrufadoGPres.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoGPres.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoTrufadoGPres.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoGPres.getPreco());
				produto.setPreco(Constants.Produtos.OvoTrufadoGPres.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoGPres.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoTrufadoGPres.getRecheio());
				break;
			case 12:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoGChoba.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoTrufadoGChoba.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoGChoba.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoTrufadoGChoba.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoGChoba.getPreco());
				produto.setPreco(Constants.Produtos.OvoTrufadoGChoba.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoGChoba.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoTrufadoGChoba.getRecheio());
				break;
			default:
				System.out.println("Você não escolheu uma opção valida.");
				break;
			}

		}else if (tipoEscolha == 2){
			System.out.println("Escolha o tipo de Ovo de Colher \n onde: "
					+ "\n 1 Pequeno Morango, 2 pequeno Chocolate , 3 pequeno Prestigio, 4 pequeno Chocobanana  "
					+ "\n 5 Medio Morango, 6 Medio Chocolate , 7 Medio Prestigio, 8 Medio Chocobanana"
					+ "\n 9 Grande Morango, 10 Grande Chocolate , 11 Grande Prestigio, 12 Grande Chocobanana");
			tipoEscolhaSub = scanner.nextInt();
			switch (tipoEscolhaSub) {
			case 1:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherdoPMor.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoColherdoPMor.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherdoPMor.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoColherdoPMor.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoColherdoPMor.getPreco());
				produto.setPreco(Constants.Produtos.OvoColherdoPMor.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoColherdoPMor.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoColherdoPMor.getRecheio());
				break;
			case 2:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherPChoco.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoColherPChoco.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherPChoco.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoColherPChoco.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoColherPChoco.getPreco());
				produto.setPreco(Constants.Produtos.OvoColherPChoco.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoColherPChoco.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoColherPChoco.getRecheio());				
				break;
			case 3:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherPPres.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoColherPPres.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherPPres.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoColherPPres.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoColherPPres.getPreco());
				produto.setPreco(Constants.Produtos.OvoColherPPres.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoColherPPres.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoColherPPres.getRecheio());
				break;
			case 4:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherPChoba.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoColherPChoba.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherPChoba.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoColherPChoba.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoColherPChoba.getPreco());
				produto.setPreco(Constants.Produtos.OvoColherPChoba.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoColherPChoba.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoColherPChoba.getRecheio());
				break;
			case 5:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherMMor.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoColherMMor.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherMMor.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoColherMMor.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoColherMMor.getPreco());
				produto.setPreco(Constants.Produtos.OvoColherMMor.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoColherMMor.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoColherMMor.getRecheio());
				break;
			case 6:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherMChoco.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoColherMChoco.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherMChoco.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoColherMChoco.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoColherMChoco.getPreco());
				produto.setPreco(Constants.Produtos.OvoColherMChoco.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoColherMChoco.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoColherMChoco.getRecheio());
				break;
			case 7:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherMPres.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoColherMPres.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherMPres.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoColherMPres.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoColherMPres.getPreco());
				produto.setPreco(Constants.Produtos.OvoColherMPres.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoColherMPres.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoColherMPres.getRecheio());
				break;
			case 8:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherMChoba.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoColherMChoba.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherMChoba.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoColherMChoba.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoColherMChoba.getPreco());
				produto.setPreco(Constants.Produtos.OvoColherMChoba.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoColherMChoba.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoColherMChoba.getRecheio());;
				break;
			case 9:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherGMor.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoColherGMor.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherGMor.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoColherGMor.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoColherGMor.getPreco());
				produto.setPreco(Constants.Produtos.OvoColherGMor.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoColherGMor.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoColherGMor.getRecheio());
				break;
			case 10:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherGChoco.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoColherGChoco.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherGChoco.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoColherGChoco.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoColherGChoco.getPreco());
				produto.setPreco(Constants.Produtos.OvoColherGChoco.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoColherGChoco.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoColherGChoco.getRecheio());
				break;
			case 11:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherGPres.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoColherGPres.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherGPres.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoColherGPres.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoColherGPres.getPreco());
				produto.setPreco(Constants.Produtos.OvoColherGPres.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoColherGPres.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoColherGPres.getRecheio());
				break;
			case 12:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherGChoba.getCodigo());
				produto.setCodProduto(Constants.Produtos.OvoColherGChoba.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherGChoba.getNome());
				produto.setNomeProduto(Constants.Produtos.OvoColherGChoba.getNome());
				System.out.println(" Preço:" + Constants.Produtos.OvoColherGChoba.getPreco());
				produto.setPreco(Constants.Produtos.OvoColherGChoba.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.OvoColherGChoba.getRecheio());
				produto.setTipoProduto(Constants.Produtos.OvoColherGChoba.getRecheio());		
				break;
			default:
				System.out.println("Você não escolheu uma opção valida.");
				break;	
			}
		}else if (tipoEscolha == 3){
			System.out.println("Escolha o Sabor da Trufa \n onde: "
					+ "\n 1  Morango, 2 Chocolate , 3  Prestigio "
					+ "\n 4 Chocobanana, 5 Maracuja , 6 Bem Casado");
			tipoEscolhaSub = scanner.nextInt();
			switch (tipoEscolhaSub) {
			case 1:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.trufaMor.getCodigo());
				produto.setCodProduto(Constants.Produtos.trufaMor.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.trufaMor.getNome());
				produto.setNomeProduto(Constants.Produtos.trufaMor.getNome());
				System.out.println(" Preço:" + Constants.Produtos.trufaMor.getPreco());
				produto.setPreco(Constants.Produtos.trufaMor.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.trufaMor.getRecheio());
				produto.setTipoProduto(Constants.Produtos.trufaMor.getRecheio());
				break;
			case 2:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.trufaChoco.getCodigo());
				produto.setCodProduto(Constants.Produtos.trufaChoco.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.trufaChoco.getNome());
				produto.setNomeProduto(Constants.Produtos.trufaChoco.getNome());
				System.out.println(" Preço:" + Constants.Produtos.trufaChoco.getPreco());
				produto.setPreco(Constants.Produtos.trufaChoco.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.trufaChoco.getRecheio());
				produto.setTipoProduto(Constants.Produtos.trufaChoco.getRecheio());			
				break;
			case 3:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.trufaPres.getCodigo());
				produto.setCodProduto(Constants.Produtos.trufaPres.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.trufaPres.getNome());
				produto.setNomeProduto(Constants.Produtos.trufaPres.getNome());
				System.out.println(" Preço:" + Constants.Produtos.trufaPres.getPreco());
				produto.setPreco(Constants.Produtos.trufaPres.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.trufaPres.getRecheio());
				produto.setTipoProduto(Constants.Produtos.trufaPres.getRecheio());
				break;
			case 4:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.trufaChoba.getCodigo());
				produto.setCodProduto(Constants.Produtos.trufaChoba.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.trufaChoba.getNome());
				produto.setNomeProduto(Constants.Produtos.trufaChoba.getNome());
				System.out.println(" Preço:" + Constants.Produtos.trufaChoba.getPreco());
				produto.setPreco(Constants.Produtos.trufaChoba.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.trufaChoba.getRecheio());
				produto.setTipoProduto(Constants.Produtos.trufaChoba.getRecheio());
				break;
			case 5:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.trufaMar.getCodigo());
				produto.setCodProduto(Constants.Produtos.trufaMar.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.trufaMar.getNome());
				produto.setNomeProduto(Constants.Produtos.trufaMar.getNome());
				System.out.println(" Preço:" + Constants.Produtos.trufaMar.getPreco());
				produto.setPreco(Constants.Produtos.trufaMar.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.trufaMar.getRecheio());
				produto.setTipoProduto(Constants.Produtos.trufaMar.getRecheio());
				break;
			case 6:
				System.out.println(" Codigo do Produto: " + Constants.Produtos.trufaBC.getCodigo());
				produto.setCodProduto(Constants.Produtos.trufaBC.getCodigo());
				System.out.println(" Nome do Produto: " + Constants.Produtos.trufaBC.getNome());
				produto.setNomeProduto(Constants.Produtos.trufaBC.getNome());
				System.out.println(" Preço:" + Constants.Produtos.trufaBC.getPreco());
				produto.setPreco(Constants.Produtos.trufaBC.getPreco());
				System.out.println(" Sabor:"+ Constants.Produtos.trufaBC.getRecheio());
				produto.setTipoProduto(Constants.Produtos.trufaBC.getRecheio());
				break;
			default:
				System.out.println("Você não escolheu uma opção valida.");
				break;
			}
		
		}else {
			System.out.println("Você não escolheu uma opção valida");
		}

	}
	@Override
	public void escolhaAtualizarProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		System.out.println("escolha a opção desejada \n onde: \n 1 para Atualizar Nome do Produto \n 2 Atualizar preço "
				+ "\n 3 Atualizar Sabor \n 4 Atualizar Quantidade  \n 5  Atualizar Nome  e Preço \n 6 Nome,Preço e sabor "
				+ " \n 7 sair");
		tipoEscolha = scanner.nextInt();
		switch (tipoEscolha) {
		case 1:
			System.out.println("Digite o novo Nome");
			produto.setNomeProduto (scanner.nextLine());
			produto.setNomeProduto(scanner.nextLine());
			repProduto.atualizarProduto(produto);
			break;
		case 2:
			System.out.println("Digite o novo preço");
			produto.setPreco(scanner.nextDouble());
			produto.setPreco(scanner.nextDouble());
			repProduto.atualizarProduto(produto);	
			break;
		case 3:
			System.out.println("Digite o novo sabor");
			produto.setTipoProduto(scanner.nextLine());
			produto.setTipoProduto(scanner.nextLine());
			repProduto.atualizarProduto(produto);	
			break;
		case 4:
			System.out.println("Digite a QUANTIDADE");
			produto.setQtdProduto(scanner.nextInt());
			produto.setQtdProduto(scanner.nextInt());
			repProduto.atualizarProduto(produto);	
			break;
		case 5:
			System.out.println("Digite o novo nome");
			produto.setNomeProduto(scanner.nextLine());
			System.out.println("Digite o novo Preço");
			produto.setPreco(scanner.nextDouble());			
			repProduto.atualizarProduto(produto);	
			break;
		case 6:
			System.out.println("Digite o novo nome");
			produto.setNomeProduto(scanner.nextLine());
			System.out.println("Digite o novo Preço");
			produto.setPreco(scanner.nextDouble());
			System.out.println("Digite a nova Quantidade");;
			produto.setQtdProduto(scanner.nextInt());
			repProduto.atualizarProduto(produto);
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
