package jdbc.conta;

public class RepositorioContasArray implements RepositorioContas {

    private Conta[] contas;
    private int indice;
    public static final int TAMANHO_DAFAULT = 100;

    public RepositorioContasArray() {
        contas = new Conta[TAMANHO_DAFAULT];
        indice = 0;
    }

    /**
     * Propositadamente com visibilidade default
     */
    RepositorioContasArray(Conta[] contas, int indice) {
        this.contas = contas;
        this.indice = indice;
    }

    public void inserir(Conta conta) {
        contas[indice] = conta;
        indice = indice + 1;
    }

    public void remover(String numero) throws ContaNaoEncontradaException {
        int i = getIndice(numero);
        contas[i] = contas[indice-1];
        indice = indice - 1;
        contas[indice] = null;
    }

    public Conta procurar(String numero) throws ContaNaoEncontradaException {
        int i = getIndice(numero);
        return contas[i];
    }

    public void atualizar(Conta conta) throws ContaNaoEncontradaException {
        int i = getIndice(conta.getNumero());
        contas[i] = conta;
    }

    public boolean existe(String numero) {
        boolean resposta;
        try {
            getIndice(numero);
            resposta = true;
        } catch(ContaNaoEncontradaException ex) {
            resposta = false;
        }
        return resposta;
    }

    public RepositorioContas getContas() {
        //deveria retornar um clone por segurança
        return this;
    }

    public IteratorContas getIterator() {
        IteratorContas iterator = new IteratorContasArray(contas);
        return iterator;
    }

    private int getIndice(String numero) throws ContaNaoEncontradaException {
        int resposta = -1;
        boolean achou = false;
        for (int i = 0; !achou && (i < indice); i = i + 1) {
            if (contas[i].getNumero().equals(numero)) {
                resposta = i;
                achou = true;
            }
        }
        if (!achou) throw new ContaNaoEncontradaException(numero);
        return resposta;
    }

}