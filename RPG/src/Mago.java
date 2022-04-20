public class Mago extends ReinoDoFogo {

	private int quantidadePoMAgico;

	public Mago() {
		super();
		quantidadePoMAgico = 10;
	}

	public int getQuantidadePoMAgico() {
		return quantidadePoMAgico;
	}

	public void setQuantidadePoMAgico(int quantidadePoMAgico) {
		this.quantidadePoMAgico = quantidadePoMAgico;
	}

	public int usarPoMagico() {
		if (quantidadePoMAgico > 0){
			quantidadePoMAgico -= 1;
			return 1;
		}
		else{
			return 0;
		}

	}

	public void incluirPontosDeVida() {
		if(quantidadePoMAgico > 0){
			quantidadePoMAgico -= 1;
			setPontosdeVidas(getPontosdeVidas() + 3);
		}
	}

	public void retiraPontosdeVida(int retiraPontosDeVidas) {
		this.setPontosdeVidas(getPontosdeVidas() - (retiraPontosDeVidas * 2));
	}
}
