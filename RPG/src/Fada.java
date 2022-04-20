
public class Fada extends ReinoDoGelo {

	private int durabilidadeMagia ;

	public Fada() {
		super();
		
		durabilidadeMagia = 10;
	}

	
	public int getDurabilidadeMagia() {
		return durabilidadeMagia;
	}


	public void setDurabilidadeMagia(int durabilidadeMagia) {
		this.durabilidadeMagia = durabilidadeMagia;
	}
	
	public int usarMagia(){
		if (durabilidadeMagia > 0) {
			durabilidadeMagia -= 1;			
			return 1;
		}
		else{
			return 0;
		}
		
	}
	
	public int incluirPontosDeVida(int incluirPontosDeVida){
		if(durabilidadeMagia > 0){
			if(incluirPontosDeVida > 0 && incluirPontosDeVida <= 3){
				durabilidadeMagia -= incluirPontosDeVida;
				return incluirPontosDeVida;
			}else{
				return 0;
			}
			
		}else{
			return 0;
		}
		
	}
	
	
	
}
