package com.diegopinheiro.estruturadados1.list05;



public class QueueCircularLinkedList<T extends Item> implements IQueue<T>{
	
	private  CircularLinkedList<T> list;	
	
	
	public QueueCircularLinkedList() {
		this.list = new CircularLinkedList<T>();
	}
	
	@Override
	public void enqueue(T item) {
		this.list.addLast(item);
	}


	@Override
	public T dequeue() throws Exception {
		if(isEmpty()) {
			
			throw new Exception();
		}
		DoublyListNode<T> newNode = this.list.getHead();
		this.list.delete(newNode);
		
		return newNode.getData();
	}

	@Override
	public boolean isEmpty() {
		return this.list.isEmpty();
	}
	
	public void reverse() {
		
		this.list.reverse();
	}


	

}
