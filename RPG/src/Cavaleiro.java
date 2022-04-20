public class Cavaleiro extends ReinoDoFogo {

	private int durabilidadeEspada;

	public Cavaleiro() {
		super();
		durabilidadeEspada = 10;
	}

	public int getDurabilidadeEspada() {
		return durabilidadeEspada;
	}

	private void setDurabilidadeEspada(int durabilidadeEspada) {
		this.durabilidadeEspada = durabilidadeEspada;
	}

	public int usarEspada() {
		if(durabilidadeEspada > 0){
			durabilidadeEspada -= 1;
			return 1;	
		}
		else{
			return 0;
		}
		
	}

	public void retiraPontosdeVida(int retiraPontosDeVidas) {
		this.setPontosdeVidas(getPontosdeVidas() - retiraPontosDeVidas);
	}

}
