package com.diegopinheiro.estruturadados1.list05;



public interface IQueue<T extends Item> {
	
	public void enqueue(T item);
	public T dequeue() throws Exception;
	public boolean isEmpty();

}
