package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;
import java.util.Scanner;
import PooProject.ProjetoAP2.Excecao.RepositorioVendaException;
import PooProject.ProjetoAP2.Excecao.VendaException;
import PooProject.ProjetoAP2.Modelo.Venda;
import PooProject.ProjetoAP2.Repositorio.RepositorioVenda;
import util.Constants;

public class ControladorVenda implements IControladorVenda {
	
	private static ControladorVenda instancia;
	private RepositorioVenda repVenda;
	private static Scanner scanner = new Scanner(System.in);
	private int tipoEscolha ;
	private int tipoEscolhaSub;
	private double valorParcelado = 0;
	private int qtdParc = 0;
	private double juros = 0.15;
	public static ControladorVenda getInstance(){
		if (instancia == null) {
			instancia = new ControladorVenda();
		}
		return instancia;
	}
	public ControladorVenda() {
		repVenda = RepositorioVenda.getInstance();
	}
	
	@Override
	public void inserirVenda(Venda venda) throws VendaException, RepositorioVendaException {
		if(repVenda.pesquisarVendaPeloCodigo(venda.getCodVenda()) != null){
			throw new VendaException("Ja existe venda com este codigo");		
		}else{
			this.repVenda.inserirVenda(venda);
		}
		
	}

	@Override
	public void excluirVenda(Venda venda) throws VendaException, RepositorioVendaException {
		this.repVenda.excluirVenda(venda);
	}

	@Override
	public void excluirVendaPeloCodigo(int codigo) throws VendaException, RepositorioVendaException {
		if(repVenda.pesquisarVendaPeloCodigo(codigo) != null){
			this.repVenda.excluirVendaPeloCodigo(codigo);
		}else {
			throw new VendaException("Venda não localizado");
		}
	}

	@Override
	public Venda pesquisarVendaPeloCodigo(int codigo) throws VendaException, RepositorioVendaException {
		return this.repVenda.pesquisarVendaPeloCodigo(codigo);
	}

	@Override
	public Double calcularValorRecebido(double preco,int qtd) throws VendaException, RepositorioVendaException {
		preco = preco * qtd; 
		return preco;
	}
	@Override
	public ArrayList<Venda> listarVendas() throws VendaException, RepositorioVendaException {

		return this.repVenda.listarVendas();
	}
	@Override
	public void atualizarVenda(Venda venda) throws VendaException, RepositorioVendaException {
		this.repVenda.atualizarVenda(venda);
	}
	@Override
	public ArrayList<Venda> listarVendasAll(ArrayList<Venda> arrayVendasAll) throws VendaException, RepositorioVendaException {
		if (arrayVendasAll != null){
			
			for (int i = 0; i< arrayVendasAll.size(); i++){
				arrayVendasAll.get(i);
					System.out.println("Codigo da Venda : "+arrayVendasAll.get(i).getCodVenda()+ " Tipo de Pagamento: " + arrayVendasAll.get(i).getTipoPagamento() + " Nome do Produto: " + arrayVendasAll.get(i).getNomeProduto()
							+" Codigo do produto :  "+ arrayVendasAll.get(i).getNomeProduto()+"  Preço:  "+ arrayVendasAll.get(i).getPreco() +"Quantidade do Produto" + arrayVendasAll.get(i).getQtdProduto()
							+" Valor Recebido:" +arrayVendasAll.get(i).getValorRecebido());		
			}
		}
		return arrayVendasAll;
	}
	@Override
	public void cadastrarVenda(Venda venda) throws VendaException, RepositorioVendaException {
	
		 
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
					venda.setCodProduto(Constants.Produtos.OvoTrufadoPMor.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoPMor.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoTrufadoPMor.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoPMor.getPreco());
					venda.setPreco(Constants.Produtos.OvoTrufadoPMor.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoPMor.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoTrufadoPMor.getRecheio());
					break;
				case 2:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoPChoco.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoTrufadoPChoco.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoPChoco.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoTrufadoPChoco.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoPChoco.getPreco());
					venda.setPreco(Constants.Produtos.OvoTrufadoPChoco.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoPChoco.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoTrufadoPChoco.getRecheio());
					break;
				case 3:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoPPres.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoTrufadoPPres.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoPPres.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoTrufadoPPres.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoPPres.getPreco());
					venda.setPreco(Constants.Produtos.OvoTrufadoPPres.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoPPres.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoTrufadoPPres.getRecheio());
					break;
				case 4:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoPChoba.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoTrufadoPChoba.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoPChoba.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoTrufadoPChoba.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoPChoba.getPreco());
					venda.setPreco(Constants.Produtos.OvoTrufadoPChoba.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoPChoba.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoTrufadoPChoba.getRecheio());
					break;
				case 5:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoMMor.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoTrufadoMMor.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoMMor.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoTrufadoMMor.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoMMor.getPreco());
					venda.setPreco(Constants.Produtos.OvoTrufadoMMor.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoMMor.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoTrufadoMMor.getRecheio());
					break;
				case 6:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoMChoco.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoTrufadoMChoco.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoMChoco.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoTrufadoMChoco.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoMChoco.getPreco());
					venda.setPreco(Constants.Produtos.OvoTrufadoMChoco.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoMChoco.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoTrufadoMChoco.getRecheio());
					break;
				case 7:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoMPres.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoTrufadoMPres.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoMPres.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoTrufadoMPres.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoMPres.getPreco());
					venda.setPreco(Constants.Produtos.OvoTrufadoMPres.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoMPres.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoTrufadoMPres.getRecheio());
					break;
				case 8:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoMChoba.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoTrufadoMChoba.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoMChoba.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoTrufadoMChoba.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoMChoba.getPreco());
					venda.setPreco(Constants.Produtos.OvoTrufadoMChoba.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoMChoba.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoTrufadoMChoba.getRecheio());
					break;
				case 9:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoGMor.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoTrufadoGMor.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoGMor.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoTrufadoGMor.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoGMor.getPreco());
					venda.setPreco(Constants.Produtos.OvoTrufadoGMor.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoGMor.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoTrufadoGMor.getRecheio());
					break;
				case 10:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoGChoco.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoTrufadoGChoco.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoGChoco.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoTrufadoGChoco.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoGChoco.getPreco());
					venda.setPreco(Constants.Produtos.OvoTrufadoGChoco.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoGChoco.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoTrufadoGChoco.getRecheio());
					break;
				case 11:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoGPres.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoTrufadoGPres.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoGPres.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoTrufadoGPres.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoGPres.getPreco());
					venda.setPreco(Constants.Produtos.OvoTrufadoGPres.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoGPres.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoTrufadoGPres.getRecheio());
					break;
				case 12:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoTrufadoGChoba.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoTrufadoGChoba.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoTrufadoGChoba.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoTrufadoGChoba.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoTrufadoGChoba.getPreco());
					venda.setPreco(Constants.Produtos.OvoTrufadoGChoba.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoTrufadoGChoba.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoTrufadoGChoba.getRecheio());
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
					venda.setCodProduto(Constants.Produtos.OvoColherdoPMor.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherdoPMor.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoColherdoPMor.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoColherdoPMor.getPreco());
					venda.setPreco(Constants.Produtos.OvoColherdoPMor.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoColherdoPMor.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoColherdoPMor.getRecheio());
					break;
				case 2:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherPChoco.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoColherPChoco.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherPChoco.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoColherPChoco.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoColherPChoco.getPreco());
					venda.setPreco(Constants.Produtos.OvoColherPChoco.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoColherPChoco.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoColherPChoco.getRecheio());			
					break;
				case 3:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherPPres.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoColherPPres.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherPPres.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoColherPPres.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoColherPPres.getPreco());
					venda.setPreco(Constants.Produtos.OvoColherPPres.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoColherPPres.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoColherPPres.getRecheio());
					break;
				case 4:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherPChoba.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoColherPChoba.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherPChoba.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoColherPChoba.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoColherPChoba.getPreco());
					venda.setPreco(Constants.Produtos.OvoColherPChoba.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoColherPChoba.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoColherPChoba.getRecheio());
					break;
				case 5:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherMMor.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoColherMMor.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherMMor.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoColherMMor.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoColherMMor.getPreco());
					venda.setPreco(Constants.Produtos.OvoColherMMor.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoColherMMor.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoColherMMor.getRecheio());
					break;
				case 6:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherMChoco.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoColherMChoco.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherMChoco.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoColherMChoco.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoColherMChoco.getPreco());
					venda.setPreco(Constants.Produtos.OvoColherMChoco.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoColherMChoco.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoColherMChoco.getRecheio());
					break;
				case 7:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherMPres.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoColherMPres.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherMPres.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoColherMPres.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoColherMPres.getPreco());
					venda.setPreco(Constants.Produtos.OvoColherMPres.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoColherMPres.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoColherMPres.getRecheio());
					break;
				case 8:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherMChoba.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoColherMChoba.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherMChoba.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoColherMChoba.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoColherMChoba.getPreco());
					venda.setPreco(Constants.Produtos.OvoColherMChoba.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoColherMChoba.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoColherMChoba.getRecheio());
					break;
				case 9:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherGMor.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoColherGMor.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherGMor.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoColherGMor.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoColherGMor.getPreco());
					venda.setPreco(Constants.Produtos.OvoColherGMor.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoColherGMor.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoColherGMor.getRecheio());
					break;
				case 10:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherGChoco.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoColherGChoco.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherGChoco.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoColherGChoco.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoColherGChoco.getPreco());
					venda.setPreco(Constants.Produtos.OvoColherGChoco.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoColherGChoco.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoColherGChoco.getRecheio());
					break;
				case 11:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherGPres.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoColherGPres.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherGPres.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoColherGPres.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoColherGPres.getPreco());
					venda.setPreco(Constants.Produtos.OvoColherGPres.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoColherGPres.getRecheio());
					venda.setTipoProduto(Constants.Produtos.OvoColherGPres.getRecheio());
					break;
				case 12:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.OvoColherGChoba.getCodigo());
					venda.setCodProduto(Constants.Produtos.OvoColherGChoba.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.OvoColherGChoba.getNome());
					venda.setNomeProduto(Constants.Produtos.OvoColherGChoba.getNome());
					System.out.println(" Preço:" + Constants.Produtos.OvoColherGChoba.getPreco());
					venda.setPreco(Constants.Produtos.OvoColherGChoba.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.OvoColherGChoba.getRecheio());
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
					venda.setCodProduto(Constants.Produtos.trufaMor.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.trufaMor.getNome());
					venda.setNomeProduto(Constants.Produtos.trufaMor.getNome());
					System.out.println(" Preço:" + Constants.Produtos.trufaMor.getPreco());
					venda.setPreco(Constants.Produtos.trufaMor.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.trufaMor.getRecheio());
					venda.setTipoProduto(Constants.Produtos.trufaMor.getRecheio());
					break;
				case 2:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.trufaChoco.getCodigo());
					venda.setCodProduto(Constants.Produtos.trufaChoco.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.trufaChoco.getNome());
					venda.setNomeProduto(Constants.Produtos.trufaChoco.getNome());
					System.out.println(" Preço:" + Constants.Produtos.trufaChoco.getPreco());
					venda.setPreco(Constants.Produtos.trufaChoco.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.trufaChoco.getRecheio());
					venda.setTipoProduto(Constants.Produtos.trufaChoco.getRecheio());	
					break;
				case 3:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.trufaPres.getCodigo());
					venda.setCodProduto(Constants.Produtos.trufaPres.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.trufaPres.getNome());
					venda.setNomeProduto(Constants.Produtos.trufaPres.getNome());
					System.out.println(" Preço:" + Constants.Produtos.trufaPres.getPreco());
					venda.setPreco(Constants.Produtos.trufaPres.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.trufaPres.getRecheio());
					venda.setTipoProduto(Constants.Produtos.trufaPres.getRecheio());
					break;
				case 4:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.trufaChoba.getCodigo());
					venda.setCodProduto(Constants.Produtos.trufaChoba.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.trufaChoba.getNome());
					venda.setNomeProduto(Constants.Produtos.trufaChoba.getNome());
					System.out.println(" Preço:" + Constants.Produtos.trufaChoba.getPreco());
					venda.setPreco(Constants.Produtos.trufaChoba.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.trufaChoba.getRecheio());
					venda.setTipoProduto(Constants.Produtos.trufaChoba.getRecheio());
					break;
				case 5:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.trufaMar.getCodigo());
					venda.setCodProduto(Constants.Produtos.trufaMar.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.trufaMar.getNome());
					venda.setNomeProduto(Constants.Produtos.trufaMar.getNome());
					System.out.println(" Preço:" + Constants.Produtos.trufaMar.getPreco());
					venda.setPreco(Constants.Produtos.trufaMar.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.trufaMar.getRecheio());
					venda.setTipoProduto(Constants.Produtos.trufaMar.getRecheio());
					break;
				case 6:
					System.out.println(" Codigo do Produto: " + Constants.Produtos.trufaBC.getCodigo());
					venda.setCodProduto(Constants.Produtos.trufaBC.getCodigo());
					System.out.println(" Nome do Produto: " + Constants.Produtos.trufaBC.getNome());
					venda.setNomeProduto(Constants.Produtos.trufaBC.getNome());
					System.out.println(" Preço:" + Constants.Produtos.trufaBC.getPreco());
					venda.setPreco(Constants.Produtos.trufaBC.getPreco());
					System.out.println(" Sabor:"+ Constants.Produtos.trufaBC.getRecheio());
					venda.setTipoProduto(Constants.Produtos.trufaBC.getRecheio());
					break;
				default:
					System.out.println("Você não escolheu uma opção valida.");
					break;
				}
			}else {
				System.out.println("Você não escolheu uma opção valida");
			}
			
			
			 System.out.println("Digite o codigo da venda");
			 venda.setCodVenda(scanner.nextInt());
			 System.out.println("Digite a Quantidade");
			 venda.setQtdProduto(scanner.nextInt());
			 venda.setValorRecebido(calcularValorRecebido(venda.getPreco(),venda.getQtdProduto()));
			 System.out.println("Informe o Tipo de pagamento\n onde:\n 1 Avista \n 2 Parcelado");
			 tipoEscolhaSub = scanner.nextInt();
			 if (tipoEscolhaSub  == 2){
				 parcelaVenda(venda.getValorRecebido());
				 venda.setValorRecebido(valorParcelado);
			 }
			 else {
				 venda.setTipoPagamento(tipoEscolhaSub);
			 }
			
			
	}
	@Override
	public void escolhaAtualizarVenda(Venda venda) throws VendaException, RepositorioVendaException {
		System.out.println("escolha a opção desejada \n onde: \n 1 para Atualizar Tipo de pagamento \n 2 Atualizar Email "
				+ "\n 3 Atualizar Tipo de Fornecimento \n 4 Atualizar valor Recebido  \n 5  Atualizar Nome  e Email \n 6 Nome,Salario e Tipo de Fornecimento "
				+ " \n 7 sair");
		tipoEscolha = scanner.nextInt();
		switch (tipoEscolha) {
		case 1:
			System.out.println("Digite o novo Tipo de pagamento");
			venda.setTipoPagamento(scanner.nextInt());
			venda.setTipoPagamento(scanner.nextInt());
			repVenda.atualizarVenda(venda);
			break;
		case 2:
			System.out.println("Digite a nova Quantidade");
			venda.setQtdVenda(scanner.nextInt());
			venda.setQtdVenda(scanner.nextInt());
			repVenda.atualizarVenda(venda);	
			break;
		case 3:
			System.out.println("Digite novo valor");
			venda.setValorRecebido(scanner.nextDouble());
			venda.setValorRecebido(scanner.nextDouble());
			repVenda.atualizarVenda(venda);	
			break;
		case 4:
			System.out.println("Digite o novo Tipo de pagamento");
			venda.setTipoPagamento(scanner.nextInt());
			System.out.println("Digite a nova Quantidade");
			venda.setQtdVenda(scanner.nextInt());			
			repVenda.atualizarVenda(venda);	
			break;
		case 5:
			System.out.println("Digite o novo Tipo de pagamento");
			venda.setTipoPagamento(scanner.nextInt());
			System.out.println("Digite a nova Quantidade");
			venda.setQtdVenda(scanner.nextInt());
			System.out.println("Digite o novo valor Recebido");
			venda.setValorRecebido(scanner.nextDouble());
			repVenda.atualizarVenda(venda);	
			break;
		case 6:
			System.out.println("Você escolheu a opção voltar");			
			break;
		default:
			System.out.println("Você não escolheu uma opção valida");
			break;
		}
		
	}
	@Override
	public ArrayList<Venda> calcularVendas(ArrayList<Venda> calcularVenda)	throws VendaException, RepositorioVendaException {

		return calcularVenda;
	}
	@Override
	public Double parcelaVenda(double valor) throws VendaException, RepositorioVendaException {
		System.out.println("Digite em quanta vezes deseja parcela \n ate 10x sem juros");
		qtdParc = scanner.nextInt();
		if (qtdParc > 0 &&  qtdParc <= 10 ){
			valorParcelado = valor / qtdParc;
		}else if ( qtdParc > 10 && qtdParc<= 24){
		valorParcelado = (valor +(valor* juros))/qtdParc;
		}else {
			System.out.println("Você não pode dividir mais que 24x");
		}
		return valorParcelado;
	}

}
