/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Renato Nunes
 */
public class App {
    	public static void main(String[] args) {
		FabricaDeCarro fabrica = new FabricaFiat();
		Carro carro = fabrica.criarCarro();
		carro.exibirInfo();
		System.out.println();

		fabrica = new FabricaWolks();
		carro = fabrica.criarCarro();
		carro.exibirInfo();
		System.out.println();

	}
    
}
