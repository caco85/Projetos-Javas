
public class Criacao {
	
	public boolean personagemMorreu(Object personagem) {
		
		if(personagem instanceof ReinoDoFogo){
			ReinoDoFogo objFogo = (ReinoDoFogo) personagem;
			
			if(objFogo.getPontosdeVidas() > 0){
				return false;
			}else{
				return true;
			}
			
		}else if( personagem instanceof ReinoDoGelo){
			ReinoDoGelo objGelo = (ReinoDoGelo) personagem;
			
			if(objGelo.getPontosdeVidas() > 0){
				return false;
			}else{
				return true;
			}
		}else{
			return false;
		}
	}
		
	

}
