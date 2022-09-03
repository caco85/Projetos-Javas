package com.diegopinheiro.estruturadados1.list05;

public class ExpressionItem extends Item {

	private String character;
	
	public ExpressionItem(String character) {
		this.character = character;
	}
	
	@Override
	public String getId() {
		return this.character;
	}

}
