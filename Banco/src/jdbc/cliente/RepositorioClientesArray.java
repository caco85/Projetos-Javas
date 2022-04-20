package jdbc.cliente;

public class RepositorioClientesArray implements RepositorioClientes {

    private Cliente[] clientes;
    private int indice;
    public static final int TAMANHO_DAFAULT = 100;

    public RepositorioClientesArray() {
        clientes = new Cliente[TAMANHO_DAFAULT];
        indice = 0;
    }

    /**
     * Propositadamente com visibilidade default
     */
    RepositorioClientesArray(Cliente[] clientes, int indice) {
        this.clientes = clientes;
        this.indice = indice;
    }

    public void inserir(Cliente cliente) {
        clientes[indice] = cliente;
        indice = indice + 1;
    }

    public void remover(String cpf) throws ClienteNaoEncontradoException {
        int i = getIndice(cpf);
        clientes[i] = clientes[indice-1];
        indice = indice - 1;
        clientes[indice] = null;
    }

    public Cliente procurar(String cpf) throws ClienteNaoEncontradoException {
        int i = getIndice(cpf);
        return clientes[i];
    }

    public void atualizar(Cliente cliente) throws ClienteNaoEncontradoException {
        int i = getIndice(cliente.getCpf());
        clientes[i] = cliente;
    }

    public boolean existe(String cpf) {
        boolean resposta;
        try {
            getIndice(cpf);
            resposta = true;
        } catch(ClienteNaoEncontradoException ex) {
            resposta = false;
        }
        return resposta;
    }

    private int getIndice(String cpf) throws ClienteNaoEncontradoException {
        int resposta = -1;
        boolean achou = false;
        for (int i = 0; !achou && (i < indice); i = i + 1) {
            if (clientes[i].getCpf().equals(cpf)) {
                resposta = i;
                achou = true;
            }
        }
        if (!achou) throw new ClienteNaoEncontradoException(cpf);
        return resposta;
    }

}