package PooProject.ProjetoAP2.Controlador;

import PooProject.ProjetoAP2.Excecao.EnderecoException;
import PooProject.ProjetoAP2.Modelo.Endereco;

public interface IControladorEndereco {
	public void cadastrarEndereco(Endereco e) throws EnderecoException;

}
