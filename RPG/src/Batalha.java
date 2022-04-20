
public class Batalha {
		
	ReinoDoFogo reinoDoFogo;
	ReinoDoGelo reinoDoGelo;
	
	public ReinoDoFogo getPersonagemFogo() {
		return reinoDoFogo;
	}
	
	public void setPersonagemFogo(ReinoDoFogo rf) {
		this.reinoDoFogo = rf;
	}
	
	public ReinoDoGelo getPersonagemGelo() {
		return reinoDoGelo;
	}
	
	public void setPersonagemGelo(ReinoDoGelo rg) {
		this.reinoDoGelo = rg;
	}
	
	public String vencedor(){
		if(reinoDoFogo.getPontosdeVidas() > reinoDoGelo.getPontosdeVidas()){
			return  reinoDoFogo.getNome();
		}else if(reinoDoFogo.getPontosdeVidas() < reinoDoGelo.getPontosdeVidas()){
			return  reinoDoGelo.getNome();
		}else{
			return " Draw ";
		}
		
		
	}
	
	public String perdedor(){
		if(reinoDoFogo.getPontosdeVidas() < reinoDoGelo.getPontosdeVidas()){
			return reinoDoFogo.getNome();
		}else if(reinoDoFogo.getPontosdeVidas() > reinoDoGelo.getPontosdeVidas()){
			return reinoDoGelo.getNome();
		}else{
			return " Draw ";
		}
	}
}
