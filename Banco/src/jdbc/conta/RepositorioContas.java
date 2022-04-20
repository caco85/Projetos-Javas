package jdbc.conta;

import jdbc.util.RepositorioException;

public interface RepositorioContas {

	public void inserir(Conta conta) throws RepositorioException;

	public void remover(String numero) throws ContaNaoEncontradaException, RepositorioException;

	public Conta procurar(String numero) throws ContaNaoEncontradaException, RepositorioException;

	public void atualizar(Conta conta) throws ContaNaoEncontradaException, RepositorioException;

	public boolean existe(String numero) throws RepositorioException;

    public RepositorioContas getContas() throws RepositorioException;

    public IteratorContas getIterator() throws RepositorioException;

}