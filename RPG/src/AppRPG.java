
public class AppRPG {
	
	public static void main(String [] args){
		
		/**
		 * Reino do Fogo
		 */
		
		Cavaleiro cv = new Cavaleiro();
		cv.setNome(" Ned Stark");
		cv.setPontosdeVidas(10);
		
		Mago mg = new Mago();
		mg.setNome(" Radagast ");
		mg.setPontosdeVidas(10);
		
		
		/**
		 * Reino do Gelo
		 */
		
		Fada fd= new Fada();
		fd.setNome(" Mari ");
		fd.setPontosdeVidas(10);
		fd.setPontosdeVidas(fd.getPontosdeVidas() + fd.incluirPontosDeVida(3));
		
		
		Monstro mt = new Monstro();
		mt.setNome(" ORC ");
		mt.setPontosdeVidas(10);
		
		/**
		 * Batalha
		 */
		
		Batalha bt = new Batalha();
		bt.setPersonagemFogo(cv);
		bt.setPersonagemGelo(fd);
		
		cv.retiraPontosdeVida(fd.usarMagia());
		
		fd.retiraPontosdeVida(cv.usarEspada());
		fd.retiraPontosdeVida(cv.usarEspada());
		
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		
		System.out.println(" A Fada tem " + fd.getPontosdeVidas() + " pontos de vida");
		System.out.println(" O Cavaleiro tem " + cv.getPontosdeVidas() + " pontos de vida");
		
		System.out.println(" O Vencedor é: " + bt.vencedor());
		System.out.println(" O Perdedor é: " + bt.perdedor());
		
		System.out.println(" Fada morreu ? " + (fd.personagemMorreu(fd) ? "SIM" : "NÃO" ));
		System.out.println(" Cavaleiro morreu ? " + (cv.personagemMorreu(cv) ? "SIM" : "NÃO" ));
		
		Batalha bt1 = new Batalha();
		bt1.setPersonagemFogo(mg);
		bt1.setPersonagemGelo(fd);
		
		cv.retiraPontosdeVida(fd.usarMagia());
		
		fd.retiraPontosdeVida(mg.usarPoMagico());
		fd.retiraPontosdeVida(mg.usarPoMagico());
		
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		cv.retiraPontosdeVida(fd.usarMagia());
		
		System.out.println(" A Fada tem " + fd.getPontosdeVidas() + " pontos de vida");
		System.out.println(" O Cavaleiro tem " + cv.getPontosdeVidas() + " pontos de vida");
		
		System.out.println(" O Vencedor é: " + bt1.vencedor());
		System.out.println(" O Perdedor é: " + bt1.perdedor());
		
		System.out.println(" Fada morreu ? " + (fd.personagemMorreu(fd) ? "SIM" : "NÃO" ));
		System.out.println(" Cavaleiro morreu ? " + (cv.personagemMorreu(cv) ? "SIM" : "NÃO" ));

	}
}
