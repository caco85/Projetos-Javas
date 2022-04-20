
public class RepositorioFornecedor {
	private static Fornecedor [] listaFornecedores;
	private static RepositorioFornecedor instancia;
	
	public static RepositorioFornecedor getInstance(){
		if(instancia == null){
			instancia = new RepositorioFornecedor();
		}
		return instancia;
	}
	public RepositorioFornecedor(){
		if (listaFornecedores == null){
			listaFornecedores = new Fornecedor[100];
		}
		
	}
	public boolean inserirFornecedor(Fornecedor f){
		String cnpj = null;
		for (int i = 0; i < listaFornecedores.length; i++) {
			if (listaFornecedores[i] == null ){
				listaFornecedores[i] = f;
				System.out.println("ATENÇÂO \n Cadastrado com sucesso \n    "
						+ " \n   ");
				return true;
			}else if( listaFornecedores[i].getCNPJ().equals(cnpj) ){
				System.out.println("ATENÇÂO \n Não pode ser cadastrado pois o CNPJ ja existente \n    "
						+ "Reinicei o processo \n   ");
				return false;
			}
				
		}		
		return false;
		
	}
	
	public boolean  removerFornecedor(Fornecedor f){
		for (int i = 0; i < listaFornecedores.length; i++) {
			listaFornecedores[i] = null; 
			return true;
		}
		
		return false;
		
	}
	
	public boolean  removerFornecedorPeloCNPJ(String cnpj){
		for (int i = 0; i < listaFornecedores.length; i++) {
			if (listaFornecedores[i] != null && listaFornecedores[i].getCNPJ().equals(cnpj)){
				listaFornecedores[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Fornecedor buscarFornecedorPeloCNPJ(String cnpj){
		
		for (int i = 0; i < listaFornecedores.length; i++) {
			if (listaFornecedores[i] != null && listaFornecedores[i].getCNPJ().equals(cnpj)){
				return listaFornecedores[i];
			}
		}
		
		return null;
	}
	
	public Fornecedor buscarFornecedorPeloTipoServico(String servico){
		
		for (int i = 0; i < listaFornecedores.length; i++) {
			if (listaFornecedores[i] != null && listaFornecedores[i].getTipoServico().equals(servico)){
				return listaFornecedores[i];
			}
		}
		
		return null;
	}
	
	public  Fornecedor[] buscarFornecedorPeloCep(String cep){
		Fornecedor[] fornecedores = null;
		int cont = 0;
		
		for (int i = 0; i < listaFornecedores.length; i++) {
			if (listaFornecedores[i] != null && listaFornecedores[i].getEnd().getCep().equals(cep)){
				cont++;			
			}
		}
		
		if (cont > 0){
			fornecedores = new Fornecedor[cont];
			int p = 0;
			for (int i = 0; i < fornecedores.length; i++) {
				if (listaFornecedores[i] != null && listaFornecedores[i].getEnd().getCep().equals(cep)){
					fornecedores[p] = listaFornecedores[i];
					p++;
				}
			}
			return fornecedores;
		}
		return null;
	}
	

}
