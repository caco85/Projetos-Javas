package com.diegopinheiro.estruturadados1.list05;

public class StackCircularLinkedList<T extends Item> implements IStack<T> {
	
	private  CircularLinkedList<T> list;	
	
	
	public StackCircularLinkedList() {
		this.list = new CircularLinkedList<T>();
	}
	
	@Override
	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	@Override
	public void push(T item) {
		this.list.addLast(item);
	}

	@Override
	public T pop() throws Exception {
		if(isEmpty()) {
			
			throw new Exception("Stack is Empty");
		}
		DoublyListNode<T> oldTail = this.list.getTail();
		this.list.delete(oldTail);
		
		return oldTail.getData();
	}



}
