package PooProject.ProjetoAP2.Repositorio;



import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.RepositorioVendaException;
import PooProject.ProjetoAP2.Excecao.VendaException;
import PooProject.ProjetoAP2.Modelo.Venda;

public class RepositorioVenda implements IRepositorioVenda{
	 
	private static RepositorioVenda instancia ;
	private  ArrayList<Venda> arrayVendas;
	
	public static RepositorioVenda getInstance(){
		if (instancia == null) {
			instancia = new RepositorioVenda();			
		}
		return instancia;
	}
	private RepositorioVenda() {
		if (arrayVendas == null) {
			arrayVendas = new ArrayList<Venda>();
		}
		
	}
	@Override
	public void inserirVenda(Venda venda) throws VendaException, RepositorioVendaException {
		arrayVendas.add(venda);
		System.out.println("");
		System.out.println("Cadastro efetuado com sucesso");
		System.out.println("");
	}

	@Override
	public void excluirVenda(Venda venda) throws VendaException, RepositorioVendaException {
		for (int i = 0; i < arrayVendas.size(); i++){
			if (arrayVendas.get(i) == venda){
				arrayVendas.remove(i);
				break;
			}
		}
		if(venda == null){
			throw new RepositorioVendaException("Venda não localizada");
		}
	}

	@Override
	public void excluirVendaPeloCodigo(int codigo) throws VendaException, RepositorioVendaException {
		for (int i = 0; i < arrayVendas.size(); i++){
			if (arrayVendas.get(i).getCodVenda() == codigo){
				arrayVendas.remove(i);
				break;
			}
		}
		if(codigo == 0){
			throw new RepositorioVendaException("Venda não localizada");
		}
	
	}

	@Override
	public Venda pesquisarVendaPeloCodigo(int codigo) throws VendaException, RepositorioVendaException {
		Venda venda = null;
		for (int i = 0 ; i <arrayVendas.size(); i++){
			if (arrayVendas.get(i).getCodVenda()==(codigo)){
				venda = arrayVendas.get(i);
				break;
			}
		}
//		if (venda == null){
//			throw new RepositorioVendaException("Venda não localizado");
//		}
		return venda;
	}


	@Override
	public ArrayList<Venda> listarVendas() throws VendaException, RepositorioVendaException {

		return arrayVendas;
	}
	@Override
	public void atualizarVenda(Venda venda) throws VendaException, RepositorioVendaException {
		for (int i = 0; i < arrayVendas.size(); i++) {
			if(arrayVendas.get(i) == venda){
				arrayVendas.set(i, venda);
				break;
			}			
		}
		if (venda == null){
			throw new RepositorioVendaException("Cliente não localizado");
		
		}
		
	}
}
