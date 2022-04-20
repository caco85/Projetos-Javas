package jdbc.conta;

public class IteratorContasArray implements IteratorContas {

    private Conta[] contas;
    private int indice;

    public IteratorContasArray(Conta[] contas) {
        this.contas = contas;
        indice = 0;
    }

    public boolean hasNext(){
        return (indice < contas.length) && (contas[indice] != null);
    }

    public Conta next() {
        Conta resposta = null;
        if (hasNext()) {
            resposta = contas[indice];
            indice = indice + 1;
        }
        return resposta;
    }

}