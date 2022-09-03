package com.diegopinheiro.estruturadados1.list05;

public interface IStack<T extends Item> {
	
	public boolean isEmpty();
	
	public void push(T elem);
	
	public T pop() throws Exception;
}
