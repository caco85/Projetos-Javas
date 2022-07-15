package compiladorl3;

/**
 *
 * @author tarcisio v.1
 * @author grupo narutinho v.2
 */
public class CompiladorL3 {
	public static void main(String[] args) {

		try {
			Lexico lexico = new Lexico("src\\compiladorl3\\codigo.txt");

			Sintatico2 sintatico = new Sintatico2(lexico);
			sintatico.S();

//			Token t = null;
//			while ((t = lexico.nextToken()) != null) {
//				System.out.println(t.toString());
//			}

		} catch (SintaticoExceptionToken ex) {

			System.out.println("Ocorreu um erro Sintatico  " + ex.getMessage());
		} catch (LexicoExceptionToken e) {

			System.out.println("Ocorreu um erro Léxico " + e.getMessage());
		} catch (SemanticoExceptionToken ex) {

			System.out.println("Ocorreu um erro Semântico " + ex.getMessage());
		}

	}
}
