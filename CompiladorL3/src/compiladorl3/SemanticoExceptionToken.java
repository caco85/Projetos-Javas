package compiladorl3;

public class SemanticoExceptionToken extends RuntimeException {

    public SemanticoExceptionToken(String textException) {
        super(textException);
    }
}