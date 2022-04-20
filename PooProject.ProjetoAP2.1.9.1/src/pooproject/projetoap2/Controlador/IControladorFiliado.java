package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;
import PooProject.ProjetoAP2.Excecao.FiliadoException;
import PooProject.ProjetoAP2.Excecao.RepositorioFiliadoException;
import PooProject.ProjetoAP2.Modelo.Filiado;

public interface IControladorFiliado {
	public void inserirFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException;
	public void excluirFiliado (Filiado filiado)throws FiliadoException,RepositorioFiliadoException ;
	public void  excluirFiliadoPeloNome(String nome)throws FiliadoException,RepositorioFiliadoException; 
	public Filiado pesquisarFiliadoPeloCNPJ(String cnpj)throws FiliadoException,RepositorioFiliadoException; 
	public Filiado  pesquisarFiliadoPeloNome(String nome)throws FiliadoException,RepositorioFiliadoException;
	public ArrayList<Filiado> listarFiliado() throws FiliadoException,RepositorioFiliadoException;
	public void atualizarFiliado(Filiado filiado)throws FiliadoException,RepositorioFiliadoException;
	public  ArrayList<Filiado> listarFiliadosAll(ArrayList<Filiado> arrayFiliadosAll)throws FiliadoException,RepositorioFiliadoException;
	public void escolhaAtualizarFiliado(Filiado filiado)throws FiliadoException,RepositorioFiliadoException;
	public ArrayList<Filiado> calcularProdutos(ArrayList<Filiado> calcularProdutos)throws FiliadoException,RepositorioFiliadoException;
	public Double calcularValorRecebidoFiliado(double preco,int qtd)throws FiliadoException,RepositorioFiliadoException;
}
