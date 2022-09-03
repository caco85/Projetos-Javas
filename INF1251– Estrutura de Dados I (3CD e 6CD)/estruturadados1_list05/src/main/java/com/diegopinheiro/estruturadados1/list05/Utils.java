package com.diegopinheiro.estruturadados1.list05;


public class Utils<T extends Item> {


	
	public String binaryRepresentation(int n) {
		String result ="" ;
		while(n > 0) {
			
			if(n % 2 != 0) {
				result += "1";
			}else {
				result += "0";
			}
			n = n / 2;	
			
		}
		return   new StringBuilder(result).reverse().toString();
		
	}

	public void reverse(QueueCircularLinkedList<Item> queue) {

		queue.reverse();
		
	}

	public String[] josephusProblem(int m, int n)  {
		String [] sequenceElimenated = new String[n];
		CircularLinkedList<ExpressionItem> list = new CircularLinkedList<ExpressionItem>();
		for (int i = 0; i < n; i++) {
			String id = String.valueOf(i);
			ExpressionItem item = new ExpressionItem(id);
			list.addLast(item);
		}
		DoublyListNode<ExpressionItem> currentNode = list.getHead();
		
		for (int i = 0; i < n; i++) {
			try {
				DoublyListNode<ExpressionItem> next = list.get(currentNode, m-1);
				sequenceElimenated[i]= next.getData().getId();
				currentNode = list.getSuccessor(next);
				list.delete(next);
			} catch (Exception e) {
			}
		}
		
		return sequenceElimenated;
	}
}
