package com.diegopinheiro.estruturadados1.list05;

public class Conta extends Item{

	private String id;
	
	public Conta(String id) {
		this.id = id;
	}
	
	@Override
	public String getId() {
		return this.id;
	}
}
