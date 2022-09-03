package com.diegopinheiro.estruturadados1.list05;

import org.junit.Assert;
import org.junit.Test;

import com.diegopinheiro.estruturadados1.list05.Utils;
import com.diegopinheiro.estruturadados1.list05.ExpressionItem;
import com.diegopinheiro.estruturadados1.list05.Item;
import com.diegopinheiro.estruturadados1.list05.QueueCircularLinkedList;



public class TestReverse {
	

	@Test
	public void testReverse() {
		Utils activity = new Utils();
		QueueCircularLinkedList<Item> queue = new QueueCircularLinkedList<Item>();
		int size = 10;
		for (int i = 0; i<size ; i++) {
			queue.enqueue(new ExpressionItem(String.valueOf(i)));
		}
		activity.reverse(queue);
		for (int i = size - 1; i >= 0; i--) {
			try {
				String expected = String.valueOf(i);
				String actual = queue.dequeue().getId();
				Assert.assertEquals(expected, actual);	
			} catch (Exception e) {
				Assert.fail();
			}
			
		}
	}
	
}
