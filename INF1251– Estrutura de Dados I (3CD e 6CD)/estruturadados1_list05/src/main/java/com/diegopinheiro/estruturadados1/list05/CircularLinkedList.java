package com.diegopinheiro.estruturadados1.list05;



public class CircularLinkedList<T extends Item> {
	private DoublyListNode<T> sentinel;

	public CircularLinkedList() {
		this.sentinel = new DoublyListNode<T>();
		this.sentinel.setNext(this.sentinel);
		this.sentinel.setPrevious(this.sentinel);
	}

	public DoublyListNode<T> getHead() {
		return sentinel.getNext();
	}

	public boolean isEmpty() {
		
		return this.sentinel.getNext() == this.sentinel;
	}

	public DoublyListNode<T> getTail() {
		return sentinel.getPrevious();
	}
	
	public void addFirst(T item) {
		DoublyListNode<T>  newNode = new  DoublyListNode<T> (item ,this.sentinel.getNext(),this.sentinel);
	    this.sentinel.getNext().setPrevious(newNode);
		this.sentinel.setNext(newNode);

	}

	public void addLast(T item) {
		DoublyListNode<T>  newNode = new  DoublyListNode<T> (item ,this.sentinel,this.getTail());
	    this.sentinel.getPrevious().setNext(newNode);
		this.sentinel.setPrevious(newNode);
	}
	
	public T get(int index) throws Exception{
		return this.get(this.getHead(),index).getData();	
	}
	
	
	public DoublyListNode<T> get(DoublyListNode<T> node,int index) throws Exception{
		
		if(this.isEmpty()) {
			throw new Exception("Empty list");
			
		}
		int i = 0;
		while(i < index) {
			node = this.getSuccessor(node);
			i++;
		}
		return node;
	}
	
	public DoublyListNode<T> search(T item) {
		if(isEmpty()) {
			return null;
		}
		DoublyListNode<T> result = null;
		DoublyListNode<T> currentNode = this.getHead();
		while(currentNode != this.sentinel) {
			if(currentNode.getData() == item) {
				result = currentNode;
				
			}
			currentNode = currentNode.getNext();
		}
		return result;
	}
	public  DoublyListNode<T> getSuccessor(DoublyListNode<T>  currentNode) throws Exception{
		if(this.isEmpty()) {
			throw new Exception("Cannot find sucessor  when list is empty! ");
			
		}
		DoublyListNode<T> successor = currentNode.getNext();
		if(successor == this.sentinel) {
			successor = successor.getNext();
		}
			
		return successor;
	}
	
	public void delete(DoublyListNode<T> head) {
		
		head.getNext().setPrevious(head.getPrevious());
		head.getPrevious().setNext(head.getNext());
		
	}
	
	public void reverse() {
		
		if(this.isEmpty()) {
			return;
		}
		
		DoublyListNode<T> currentNode = this.sentinel;
		do {
			DoublyListNode<T> nextNode = currentNode.getNext();
			currentNode.setNext(currentNode.getPrevious());
			currentNode.setPrevious(nextNode);
			currentNode = nextNode;
		}
		while(currentNode != this.sentinel);
	}

	@Override
	public String toString() {
		String s = "";
		DoublyListNode<T> node = this.getHead();
		while(node != this.sentinel) {
			s += node.getData().getId() + ",";
			node = node.getNext();
			
		}
		return s;
	}

	
}
