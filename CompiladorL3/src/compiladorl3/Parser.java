/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compiladorl3;

/**
 *
 * @author McLoving
 */
public class Parser {
	private Lexico lexico;
	private Token token;

	public Parser(Lexico lexico) {
		this.lexico = lexico;
	}

	public void programa() throws ExceptionToken {
		this.token = this.lexico.nextToken();
		if (!token.getLexema().equals("main")) {
			throw new RuntimeException("Oxe, cadê main?");
		}

		this.token = this.lexico.nextToken();
		if (!token.getLexema().equals("(")) {
			throw new RuntimeException("Abre o parêntese do main cabra!");
		}

		this.token = this.lexico.nextToken();
		if (!token.getLexema().equals(")")) {
			throw new RuntimeException("Fechar o parêntese do main cabra!");
		}
		this.token = this.lexico.nextToken();

		this.bloco();
		if (this.token.getTipo() == Token.TIPO_FIM_CODIGO) {
			System.out.println("O Código tá massa! Arretado! Tu botou pra torar!");
		} else {
			throw new RuntimeException("Oxe, eu deu bronca preto do fim do programa.");
		}
	}

	private void bloco() throws ExceptionToken {
		if (!this.token.getLexema().equals("{")) {
			throw new RuntimeException("Oxe, tave esperando um \"{\" pertinho de " + this.token.getLexema());
		}
		this.token = this.lexico.nextToken();

		if (this.token.getLexema().equals("int") || this.token.getLexema().equals("float")
				|| this.token.getLexema().equals("char")) {
			this.decl_var();
		}

		this.comando();

		if (!this.token.getLexema().equals("}")) {
			throw new RuntimeException("Oxe, tava esperando um \"}\" pertinho de " + this.token.getLexema());
		}
		this.token = this.lexico.nextToken();
	}

	private void decl_var() throws ExceptionToken {
		this.token = this.lexico.nextToken();
		if (!(this.token.getTipo() == Token.TIPO_IDENTIFICADOR)) {
			throw new RuntimeException(
					"Oxe, era para ser um identificador " + "ou número pertinho de " + this.token.getLexema());
		}
		this.token = this.lexico.nextToken();
		if (!this.token.getLexema().equals(";")) {
			throw new RuntimeException(
					"Tu vacilou  na delcaração de variável. " + "Pertinho de: " + this.token.getLexema());
		}
		this.token = this.lexico.nextToken();
		this.comando();
	}

	private void comando() throws ExceptionToken {
		if (this.token.getTipo() == Token.TIPO_ATRIBUICAO) {
			this.token = this.lexico.nextToken();
			this.comando_basico();
		}
		if ((this.token.getTipo() == Token.TIPO_PALAVRA_RESERVADA)) {
			this.iteracao();
		}
		if ((this.token.getTipo() == Token.TIPO_PALAVRA_RESERVADA) && (token.getLexema().equals("if"))) {
			this.token = this.lexico.nextToken();

			if (!token.getLexema().equals("(")) {
				throw new RuntimeException("Abre o parêntese do main cabra!");
			}
			this.expr_relacional();
			this.token = this.lexico.nextToken();

			if (!token.getLexema().equals(")")) {
				throw new RuntimeException("Fechar o parêntese do main cabra!");
			}
			// <comando> else <comando>?
		}
	}

	private void comando_basico() throws ExceptionToken {
		if (this.token.getTipo() == Token.TIPO_IDENTIFICADOR) {
			this.atribuicao();
		}
		if (this.token.getLexema().equals("{")) {
			this.bloco();
		} else {
			throw new RuntimeException("Erro na atribuição. Pertinho de: " + this.token.getLexema());
		}

	}

	private void atribuicao() throws ExceptionToken {
		if (this.token.getTipo() != Token.TIPO_IDENTIFICADOR) {
			throw new RuntimeException("Erro na atribuição. Pertinho de: " + this.token.getLexema());
		}
		this.token = this.lexico.nextToken();

//        if(this.token.getTipo() != Token.TIPO_ATRIBUICAO){
//            throw new RuntimeException("Erro na atribuição. Pertinho de: " + this.token.getLexema());
//        }
		this.token = this.lexico.nextToken();
		this.expr_arit();

		if (!this.token.getLexema().equals(";")) {
			throw new RuntimeException("Erro na atribuição. Pertinho de: " + this.token.getLexema());
		}
		this.token = this.lexico.nextToken();
	}

	private void iteracao() throws ExceptionToken {
		if (!token.getLexema().equals("while")) {
			throw new RuntimeException("Oxe, cadê while?");
		}
		this.token = this.lexico.nextToken();

		if (!token.getLexema().equals("(")) {
			throw new RuntimeException("Abre o parêntese do main cabra!");
		}
		this.token = this.lexico.nextToken();
		this.expr_relacional();

		if (!token.getLexema().equals(")")) {
			throw new RuntimeException("Fechar o parêntese do main cabra!");
		}
		this.comando();
	}

	private void expr_relacional() {
		// implementar
	}

	private void expr_arit() throws ExceptionToken {
		if (this.token.getTipo() != Token.TIPO_IDENTIFICADOR || !(this.token.getTipo() == Token.TIPO_INTEIRO)
				|| !(this.token.getTipo() == Token.TIPO_REAL)) {
			throw new RuntimeException("Erro na atribuição. Pertinho de: " + this.token.getLexema());
		}
		this.token = this.lexico.nextToken();

		if (this.token.getTipo() == Token.TIPO_OPERADOR_ARITMETICO && this.token.getLexema().equals("+")
				|| this.token.getLexema().equals("-")) {
			this.token = this.lexico.nextToken();
			this.termo();
		} else {
			throw new RuntimeException(
					"Oxe, era para ser um operador " + "aritmético (+,-) pertinho de " + this.token.getLexema());
		}
	}

	private void termo() throws ExceptionToken {
		if (this.token.getTipo() != Token.TIPO_IDENTIFICADOR || !(this.token.getTipo() == Token.TIPO_INTEIRO)
				|| !(this.token.getTipo() == Token.TIPO_REAL)) {
			throw new RuntimeException("Erro na atribuição. Pertinho de: " + this.token.getLexema());
		}
		if (this.token.getTipo() == Token.TIPO_OPERADOR_ARITMETICO && this.token.getLexema().equals("*")
				|| this.token.getTipo() == Token.TIPO_OPERADOR_ARITMETICO && this.token.getLexema().equals("/")) {
			this.token = this.lexico.nextToken();
			this.fator();
		} else {
			throw new RuntimeException(
					"Oxe, era para ser um operador " + "aritmético (*,/) pertinho de " + this.token.getLexema());
		}
	}

	private void fator() throws ExceptionToken {
		this.token = this.lexico.nextToken();
		if (token.getLexema().equals("(")) {
			this.token = this.lexico.nextToken();
			this.expr_arit();
			if (!token.getLexema().equals(")")) {
				throw new RuntimeException("Fechar o parêntese do main cabra!");
			}
		}
		if (!(this.token.getTipo() == Token.TIPO_IDENTIFICADOR) ||
		/* !(this.token.getTipo() == Token.TIPO_FLOAT) || */
				!(this.token.getTipo() == Token.TIPO_INTEIRO) || !(this.token.getTipo() == Token.TIPO_CHAR)) {
			throw new RuntimeException("Erro na atribuição. Pertinho de: " + this.token.getLexema());
		}
		this.token = this.lexico.nextToken();
	}
}
