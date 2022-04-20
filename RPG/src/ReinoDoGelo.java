
public class ReinoDoGelo extends Criacao {
	
	private String nome;
	private int pontosdeVidas;
	
	
	public ReinoDoGelo() {
		super();
		
		


	}


	
	public String getNome() {
		return nome;
	}


	
	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getPontosdeVidas() {
		return pontosdeVidas;
	}


	
	public void setPontosdeVidas(int pontosdeVidas) {
		this.pontosdeVidas = pontosdeVidas;
	}
	
 
	public void retiraPontosdeVida(int retiraPontosDeVidas){
		this.pontosdeVidas -= retiraPontosDeVidas;
	}
	
	public void incluirPontosDeVida(){
		
	}
	

}
