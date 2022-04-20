package PooProject.ProjetoAP2.Controlador;

import java.util.Scanner;

import PooProject.ProjetoAP2.Excecao.EnderecoException;
import PooProject.ProjetoAP2.Modelo.Endereco;

public class ControladorEndereco implements IControladorEndereco {
	
	public static Scanner scanner = new Scanner(System.in);
	private static ControladorEndereco instancia ;
	
	public static ControladorEndereco getInstance(){
		if(instancia == null){
			instancia = new ControladorEndereco();
		}
		return instancia;
	}
	
	@Override
	public void cadastrarEndereco(Endereco e) throws EnderecoException {
		System.out.println("Digite o Nome da Rua");
		e.setNomeRua(scanner.nextLine());
		System.out.println("Digite o numero da Casa");
		e.setNumCasa(scanner.nextInt());
		System.out.println("Digite o Complento");
		e.setComplemento(scanner.next());
		System.out.println("Digite o cep");
		e.setCep(scanner.next());
		System.out.println("Digite o Bairro");
		e.setBairro(scanner.next());
		System.out.println("Digite a Cidade");
		e.setCidade(scanner.next());
		System.out.println("Digite o Estado");
		e.setEstado(scanner.next());
	}

}
