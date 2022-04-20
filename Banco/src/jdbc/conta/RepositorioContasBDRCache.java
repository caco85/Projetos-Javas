package jdbc.conta;

import jdbc.util.RepositorioException;

public class RepositorioContasBDRCache implements RepositorioContas {

    private static final IllegalArgumentException e = new IllegalArgumentException();
    private BDCache bd;

    public RepositorioContasBDRCache(BDCache bd) {
        this.bd = bd;
    }

    public void inserir(Conta conta) throws IllegalArgumentException {
        if (conta != null) {
            bd.insertConta(conta);
        } else {
            throw e;
        }
    }

    public void remover(String numero) throws ContaNaoEncontradaException {
        if (this.existe(numero)) {
            bd.removerConta(numero);
        } else {
            throw new ContaNaoEncontradaException(numero);
        }
    }

    public boolean existe(String numero) {
        return bd.selectConta(numero) != null;
    }

    public Conta procurar(String numero) throws ContaNaoEncontradaException {
        Conta conta = bd.selectConta(numero);
        if (conta == null)
            throw new ContaNaoEncontradaException(numero);
        return conta;
    }

    public void atualizar(Conta conta) throws ContaNaoEncontradaException {
        if (conta != null) {
            if (this.existe(conta.getNumero())) {
                bd.updateConta(conta);
            } else {
                throw new ContaNaoEncontradaException(conta.getNumero());
            }
        } else {
            throw e;
        }
    }

    public RepositorioContas getContas() {
        Conta[] todas = bd.getContas();
        return new RepositorioContasArray(todas, todas.length);
    }

    public IteratorContas getIterator() throws RepositorioException {
        return this.getContas().getIterator();
    }
}