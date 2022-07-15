package compiladorl3;

import java.util.ArrayList;

/**
 *
 * @author tarcisio v.1
 * @author grupo narutinho v.2
 */

public class Sintatico2 {
	private Lexico lexico;
	private Token token;
	public String tokenSaved;
	int keyToken;

	ArrayList<String> listId = new ArrayList<>();

	public Sintatico2(Lexico lexico) {
		this.lexico = lexico;
	}

	public void save(String id) {
		tokenSaved = id;
		listId.add(tokenSaved);

	}

	public void find(String id) throws SintaticoExceptionToken {
		if (listId.isEmpty()) {
			throw new SemanticoExceptionToken(
					"Tu vacilou  na delcaração de variável. " + "Pertinho de: " + this.token.getLexema());
		} else {
			for (int i = 0; i < listId.size(); i++) {
				if (id.equals(listId.get(i))) {
					keyToken = 1;
				}
			}
			if (keyToken != 1) {
				throw new SemanticoExceptionToken(
						"Tu vacilou na delcaração de variável. " + "Pertinho de: " + this.token.getLexema());
			}
		}
	}

	public void S() throws SintaticoExceptionToken {// S determina estado inicial ---<programa>
		this.token = this.lexico.nextToken();
		if (!token.getLexema().equals("int")) {
			throw new SintaticoExceptionToken("Coloque o int no início");
		}

		this.token = this.lexico.nextToken();
		if (!token.getLexema().equals("main")) {
			throw new SintaticoExceptionToken("Oxe, cadê main?");
		}

		this.token = this.lexico.nextToken();
		if (!token.getLexema().equals("(")) {
			throw new SintaticoExceptionToken("Abre o parêntese do main cabra!");
		}

		this.token = this.lexico.nextToken();
		if (!token.getLexema().equals(")")) {
			throw new SintaticoExceptionToken("Fechar o parêntese do main cabra!");
		}
		this.token = this.lexico.nextToken();

		this.B();
		if (this.token.getTipo() == Token.TIPO_FIM_CODIGO) {
			System.out.println("O Código tá massa! Arretado! Tu botou pra torar!");
		} else {
			throw new SintaticoExceptionToken("Oxe, eu deu bronca perto do fim do programa.");
		}
	}

	private void B() throws SintaticoExceptionToken { // <bloco>
		if (!this.token.getLexema().equals("{")) {
			throw new SintaticoExceptionToken("Oxe, tave esperando um \"{\" pertinho de " + this.token.getLexema());
		}
		this.token = this.lexico.nextToken();

		this.DECLARACAO();

		while (this.token.getTipo() == Token.TIPO_IDENTIFICADOR || this.token.getLexema().equals("while") || this.token.getLexema().equals("if")
				|| this.token.getLexema().equals("{")) {
			this.C();
		}
		
		if (!this.token.getLexema().equals("}")) {
			throw new SintaticoExceptionToken("Oxe, tava esperando um fecha  \"}\" pertinho de " + this.token.getLexema());
		}
		this.token = this.lexico.nextToken();
	}

	private void C() throws SintaticoExceptionToken { // comando
		if (this.token.getTipo() == Token.TIPO_IDENTIFICADOR || this.token.getLexema().equals("{")) {
			this.CB();
		} else if (token.getLexema().equals("while")) {
			this.ITERACAO();
		} else if (token.getLexema().equals("if")) {
			this.token = this.lexico.nextToken();
			if (!token.getLexema().equals("(")) {
				throw new SintaticoExceptionToken("Oxe, tava esperando um \"(\" pertinho de " + this.token.getLexema());
			}
			this.token = this.lexico.nextToken();
			this.Exp_Relacional();

			if (!token.getLexema().equals(")")) {
				throw new SintaticoExceptionToken("Oxe, tava esperando um \")\" pertinho de " + this.token.getLexema());
			}
			this.token = this.lexico.nextToken();
			this.C();

			if (!token.getLexema().equals("else")) {
				this.token = this.lexico.nextToken();
				this.C();
			} else {

			}
		} else {

		}

	}

	private void CB() throws SintaticoExceptionToken { // <comando_básico>
		if (this.token.getTipo() == Token.TIPO_IDENTIFICADOR) {
			this.ATRIBUICAO();
		} else if (this.token.getLexema().equals("{")) {
			this.B();
		}
	}

	private void DECLARACAO() throws SintaticoExceptionToken {
		if (this.token.getLexema().equals("int") || this.token.getLexema().equals("float")
				|| this.token.getLexema().equals("char")) {
			if (this.token.getLexema().equals("int") || this.token.getLexema().equals("float")
					|| this.token.getLexema().equals("char")) {
				this.token = this.lexico.nextToken();

			} else {
				throw new SintaticoExceptionToken(
						"Tu vacilou na delcaração de variável. " + "Pertinho de: " + this.token.getLexema());
			}

			if (this.token.getTipo() == Token.TIPO_IDENTIFICADOR) {
				save(token.getLexema());
				this.token = this.lexico.nextToken();
			} else {
				throw new RuntimeException(
						"Tu vacilou na delcaração de variável. " + "Pertinho de: " + this.token.getLexema());
			}

			if (this.token.getLexema().equalsIgnoreCase(";")) {
				this.token = this.lexico.nextToken();
			}else {
				throw new RuntimeException(
						"Tu vacilou  na delcaração de variável. " + "Pertinho de: " + this.token.getLexema());
			}
		
			this.DECLARACAO();

		} 
	}

	private void ITERACAO() throws SintaticoExceptionToken {
		if (!token.getLexema().equals("while")) {
			throw new SintaticoExceptionToken("Oxe, cadê while?");
		}
		this.token = this.lexico.nextToken();

		if (!token.getLexema().equals("(")) {
			throw new SintaticoExceptionToken("Abre o parêntese do while cabra!");
		}
		this.token = this.lexico.nextToken();
		this.Exp_Relacional();

		if (!token.getLexema().equals(")")) {
			throw new SintaticoExceptionToken("Fechar o parêntese do while cabra!");
		}
		this.token = this.lexico.nextToken();
		this.C();
	}

	private void ATRIBUICAO() throws SintaticoExceptionToken {
		if (this.token.getTipo() != Token.TIPO_IDENTIFICADOR) {
			throw new RuntimeException("Erro na atribuição. Pertinho de: " + this.token.getLexema());
		}
		find(token.getLexema());

		this.token = this.lexico.nextToken();
		if (this.token.getTipo() != Token.TIPO_ATRIBUICAO) {
			throw new SintaticoExceptionToken("Erro na atribuição. Pertinho de: " + this.token.getLexema());
		}
		this.token = this.lexico.nextToken();
		this.E();
		if (!this.token.getLexema().equals(";")) {
			throw new SintaticoExceptionToken("Erro na atribuição. Pertinho de: " + this.token.getLexema());
		}
		this.token = this.lexico.nextToken();
	}

	private void Exp_Relacional() throws SintaticoExceptionToken {
		this.E();

		if (this.token.getTipo() != Token.TIPO_OPERADOR_RELACIONAL) {
			throw new SintaticoExceptionToken("Oxê cade o operador relacional ? desenrola  cabra!");
		}

		this.token = this.lexico.nextToken();
		this.E();

	}

	private void E() throws SintaticoExceptionToken { // <expr_arit>
		this.TERMO();
		this.El();
	}

	private void El() throws SintaticoExceptionToken {
		if (this.token.getTipo() == Token.TIPO_OPERADOR_ARITMETICO) {
			this.OP();
			this.TERMO();
			this.El();
		} else {
		}
	}

	public void TERMO() throws SintaticoExceptionToken {
		this.FATOR();
		this.Tl();
	}

	private void Tl() throws SintaticoExceptionToken {
		if (token.getLexema().equals("*") || token.getLexema().equals("/")) {
			this.token = this.lexico.nextToken();
			if (token.getLexema().equals("*")) {
				this.token = this.lexico.nextToken();
			} else if (token.getLexema().equals("/")) {
				this.token = this.lexico.nextToken();
			} else {
				throw new SintaticoExceptionToken(
						"Oxe, era para ser um identificador " + "ou número pertinho de " + this.token.getLexema());
			}
			this.FATOR();
			this.Tl();
		}
	}

	private void FATOR() throws SintaticoExceptionToken {
		if (token.getLexema().equals("(")) {
			this.token = this.lexico.nextToken();
			this.E();
			if (!token.getLexema().equals(")")) {
				throw new SintaticoExceptionToken("Fechar o parêntese cabra!");
			}
			this.token = this.lexico.nextToken();
		}
		if (!((this.token.getTipo() == Token.TIPO_IDENTIFICADOR) || (this.token.getTipo() == Token.TIPO_REAL)
				|| (this.token.getTipo() == Token.TIPO_INTEIRO) || (this.token.getTipo() == Token.TIPO_CHAR))) {
			throw new SintaticoExceptionToken(" faltou um Identificador, float, int, char . Pertinho de: " + this.token.getLexema());
		}
		this.token = this.lexico.nextToken();
	}

	private void OP() throws SintaticoExceptionToken {
		if (this.token.getTipo() == Token.TIPO_OPERADOR_ARITMETICO) {
			this.token = this.lexico.nextToken();
		} else {
			throw new SintaticoExceptionToken(
					"Oxe, era para ser um operador " + "aritmético (+,-,/,*) pertinho de " + this.token.getLexema());
		}
	}

}
