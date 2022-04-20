package jdbc.banco;

public class ContaNaoCadastradaException extends Exception {
    
    private String numero;
    
    public ContaNaoCadastradaException(String numero){
        super ("Conta do relacionamento n�o cadastrada no sistema!");
        this.numero = numero;
    }
    
    public String getNumero(){
        return numero;
    }
    
}
