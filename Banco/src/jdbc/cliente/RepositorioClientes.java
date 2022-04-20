package jdbc.cliente;

import jdbc.util.RepositorioException;
import jdbc.banco.ContaNaoCadastradaException;

public interface RepositorioClientes {

	public void inserir(Cliente cliente) throws RepositorioException;

	public void remover(String cpf) throws ClienteNaoEncontradoException, RepositorioException;

	public Cliente procurar(String cpf) throws ClienteNaoEncontradoException, RepositorioException;

	public void atualizar(Cliente cliente) throws ClienteNaoEncontradoException, RepositorioException;

	public boolean existe(String cpf) throws RepositorioException;

}