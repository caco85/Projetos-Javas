package jdbc.conta;

public class SaldoInsuficienteException extends Exception {
    
    private double saldo;
    private String	numero;
    
    public SaldoInsuficienteException (String numero, double saldo) {
        super ("Saldo Insuficiente!");
        this.numero = numero;
        this.saldo = saldo;
    }
    
    
    public String getNumero() {
        return numero;
    }
    
    public double getSaldo() {
        return saldo;
    }

}
