package com.diegopinheiro.estruturadados1.list05;


public class DoublyListNode<T extends Item> {
	private T data;
	private DoublyListNode<T> next;
	private DoublyListNode<T> previous;
	
	
	public DoublyListNode(T data, DoublyListNode<T> next, DoublyListNode<T> previous) {
		this.data = data;
		this.next = next;
		this.previous = previous;
	}


	public DoublyListNode() {
		
	}


	public T getData() {
		
		return this.data;
	}


	public void setData(T data) {
		this.data = data;
	}

	public DoublyListNode<T> getNext() {
		return next;
	}

	public void setNext(DoublyListNode<T> next) {
		this.next = next;
	}

	public DoublyListNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DoublyListNode<T> previous) {
		this.previous = previous;
	}


	@Override
	public String toString() {
		return this.data.getId();
	}
	



}
