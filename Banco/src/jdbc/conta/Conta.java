package jdbc.conta;

public class Conta {

    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta(String numero) {
        this (numero,0.0);
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double valor) {
        saldo = saldo + valor;
    }

    public void debitar(double valor) throws SaldoInsuficienteException {
        if (valor <= saldo) {
            saldo = saldo - valor;
        } else {
            throw new SaldoInsuficienteException(numero, saldo);
        }
    }

}
