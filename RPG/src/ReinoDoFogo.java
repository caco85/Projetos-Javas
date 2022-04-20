
public abstract class ReinoDoFogo extends Criacao {

	private String nome;
	private int pontosdeVidas;
	
	
	
	
	public ReinoDoFogo() {
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
	
	public  void setPontosdeVidas(int pontosdeVidas) {
		this.pontosdeVidas = pontosdeVidas;
	}
	
	public abstract void retiraPontosdeVida(int retiraPontosDeVidas);
	
}
