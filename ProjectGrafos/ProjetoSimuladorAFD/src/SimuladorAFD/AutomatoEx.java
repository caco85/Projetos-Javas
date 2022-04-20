package SimuladorAFD;

public class AutomatoEx {
	private char[] palavras;
	private String estadoAtual;
	
	
	public AutomatoEx(char[] palavras) {
		this.palavras = palavras;
		this.estadoAtual = "q0"; //
		
	}
	
	public void estados() {
	
		for (int i = 0; i < palavras.length; i++) {
			if (estadoAtual == "q0" && palavras[i] == 'a') {
				estadoAtual = "q1";
				System.out.println("q0 --> q1");		
			}else if(estadoAtual == "q0" && palavras[i] == 'b' ) {
				estadoAtual = "q0";
				System.out.println("q0 ^ q0");
			}else if(estadoAtual == "q0" && palavras[i] == 'c') {
				estadoAtual = "q3";
				System.out.println("q0 --> q3");
				System.out.println();
				System.out.println("A palavra foi aceita pelo automato!");
				System.out.println();
				break;
			}else if(estadoAtual == "q1" && palavras[i] == 'a') {
				estadoAtual = "q1";
				System.out.println("q1 ^ q1");
			}else if(estadoAtual == "q1" && palavras[i] == 'b') {
				estadoAtual = "q2";
				System.out.println("q1 --> q2 ");
			
			}else if(estadoAtual == "q2" && palavras[i] == 'a') {
				estadoAtual = "q2";
				System.out.println("q2 ^ q2 ");
			}
			else if(estadoAtual == "q2" && palavras[i] == 'b') {
				estadoAtual = "q0";
				System.out.println("q0 <-- q2 ");
			
			} else if(estadoAtual == "q2" && palavras[i] == 'c'){
				estadoAtual = "q1";
				System.out.println("q1 <-- q2 ");
			}	
		}
		if (estadoAtual != "q3") {
			System.out.println();
			System.out.println("A palavra não foi aceita pelo automato!");
			System.out.println();
		}	
	}

	public void estados2() {
		for (int i = 0; i < palavras.length; i++) {
			if (estadoAtual == "q0" && palavras[i] == '0') {
				estadoAtual = "q1";
				System.out.println("q0 --> q1");		
			}else if(estadoAtual == "q0" && palavras[i] == '1'  ) {
				estadoAtual = "q0";
				System.out.println("q0 ^ q0");
			}else if(estadoAtual == "q1" && palavras[i] == '0' ) {
				estadoAtual = "q2";
				System.out.println("q1 --> q2");
				System.out.println();
				System.out.println("A palavra foi aceita pelo automato!");
				System.out.println();
				break;
			}else if(estadoAtual == "q1" && palavras[i] == '1') {
				estadoAtual = "q0";
				System.out.println("q0 <- q1 ");
			}else {
				System.out.println();
				System.out.println("A palavra não foi aceita pelo automato!");
				System.out.println();
				break;
			}
			
		}
		if (estadoAtual != "q2") {
			System.out.println("");
			System.out.println("qERRO");
			System.out.println("A palavra não foi aceita pelo automato devido não chegar ao estado final,,portando é um automato incompleto!");
			System.out.println();
		}
	}
	public void estados3() {
		for (int i = 0; i < palavras.length; i++) {
			if (estadoAtual == "q0" && palavras[i] == '0') {
				estadoAtual = "q0";
				System.out.println("q0 ^ q0");		
			}else if(estadoAtual == "q0" && palavras[i] == '1'  ) {
				estadoAtual = "q1";
				System.out.println("q0 --> q1");
			}else if(estadoAtual == "q1" && palavras[i] == '0' ) {
				estadoAtual = "q0";
				System.out.println("q0 <-- q1");
			}else if(estadoAtual == "q1" && palavras[i] == '1') {
				estadoAtual = "q2";
				System.out.println("q1 --> q2 ");
			}else if(estadoAtual == "q2" && palavras[i] == '0') {
				estadoAtual = "q0";
				System.out.println("q0 <-- q2 ");
			}else if(estadoAtual == "q2" && palavras[i] == '1') {
				estadoAtual = "q3";
				System.out.println("q2 --> q3 ");
				System.out.println();
				System.out.println("A palavra foi aceita pelo automato!");
				System.out.println();
				break;
			}else {
				System.out.println();
				System.out.println("A palavra não foi aceita pelo automato!");
				System.out.println();
				break;
			}
			
		}
		if (estadoAtual != "q3") {
			System.out.println("");
			System.out.println("qERRO");
			System.out.println("A palavra não foi aceita pelo automato devido não chegar ao estado final,portando é um automato incompleto!");
			System.out.println();
		}
	}
}
