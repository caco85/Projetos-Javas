package PooProject.ProjetoAP2.Repositorio;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.FiliadoException;
import PooProject.ProjetoAP2.Excecao.RepositorioFiliadoException;
import PooProject.ProjetoAP2.Modelo.Filiado;

public interface IRepositorioFiliado {
	public void inserirFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException;
	public void excluirFiliado (Filiado filiado)throws FiliadoException,RepositorioFiliadoException ;
	public void  excluirFiliadoPeloNome(String nome)throws FiliadoException,RepositorioFiliadoException; 
	public Filiado pesquisarFiliadoPeloCNPJ(String cnpj)throws FiliadoException,RepositorioFiliadoException; 
	public Filiado  pesquisarFiliadoPeloNome(String nome)throws FiliadoException,RepositorioFiliadoException;
	public ArrayList<Filiado> listarFiliado() throws FiliadoException,RepositorioFiliadoException;
	public void atualizarFiliado(Filiado filiado)throws FiliadoException,RepositorioFiliadoException;


}
