package compiladorl3;

/**
 *
 * @author tarcisio v.1
 * @author grupo narutinho v.2
 */
public class Token {
	public static int TIPO_INTEIRO = 0;
	public static int TIPO_REAL = 1;
	public static int TIPO_CHAR = 2;
	public static int TIPO_IDENTIFICADOR = 3;
	public static int TIPO_OPERADOR_RELACIONAL = 4;
	public static int TIPO_OPERADOR_ARITMETICO = 5;
	public static int TIPO_CARACTER_ESPECIAL = 6;
	public static int TIPO_PALAVRA_RESERVADA = 7;
	public static int TIPO_ATRIBUICAO = 8;
	public static int TIPO_FIM_CODIGO = 99;

	public static int TIPO_STRING = 9; // extras
	public static int TIPO_SOMA_DUAS_VEZES = 10; // ok extra 2
	public static int TIPO_SUBTRAI_DUAS_VEZES = 11; // ok extra 3
	public static int TIPO_COMENTARIO = 12; // ok extra 4
	public static int TIPO_IDENTIFICADOR_UPCASE = 13; // ok extra 5

	private int tipo; // tipo do token
	private String lexema; // conteúdo do token

	public Token(String lexema, int tipo) {
		this.lexema = lexema;
		this.tipo = tipo;
	}

	public String getLexema() {
		return this.lexema;
	}

	public int getTipo() {
		return this.tipo;
	}

	@Override
	public String toString() {
		switch (this.tipo) {
		case 0:
			return this.lexema + " - INTEIRO";
		case 1:
			return this.lexema + " - REAL";
		case 2:
			return this.lexema + " - CHAR";
		case 3:
			return this.lexema + " - IDENTIFICADOR";
		case 4:
			return this.lexema + " - OPERADOR_RELACIONAL";
		case 5:
			return this.lexema + " - OPERADOR_ARITMETICO";
		case 6:
			return this.lexema + " - CARACTER_ESPECIAL";
		case 7:
			return this.lexema + " - PALAVRA_RESERVADA";
		case 8:
			return this.lexema + " - TIPO_ATRIBUICAO";
		case 9:
			return this.lexema + " - TIPO_STRING";
		case 10:
			return this.lexema + " - TIPO_SOMA_DUAS_VEZES";
		case 11:
			return this.lexema + " - TIPO_SUBTRAI_DUAS_VEZES";
		case 12:
			return this.lexema + " - TIPO_COMENTARIO ";
		case 13:
			return this.lexema + " - TIPO_IDENTIFICADOR_UPCASE ";
		case 99:
			return this.lexema + " - FIM_CODIGO";
		}
		return "";
	}

}
