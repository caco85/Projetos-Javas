
package com.diegopinheiro.estruturadados1.list05;



import org.junit.Assert;
import org.junit.Test;

public class TestQueueCircular {

	
	@Test
	public void testPushPop() {
		QueueCircularLinkedList<Conta> stack = new QueueCircularLinkedList<>();
		boolean actual = stack.isEmpty();
		boolean expected = true;
		Assert.assertEquals(expected, actual);
		
		stack.enqueue(new Conta("1"));
		Assert.assertFalse(stack.isEmpty());
		
		stack.enqueue(new Conta("2"));
		
		Conta c;
		String expectedId;
		String actualId;
		
		try {
			c = stack.dequeue();
			expectedId = "1";
			actualId = c.getId();
			Assert.assertEquals(expectedId, actualId);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		
		try {
			c = stack.dequeue();
			expectedId = "2";
			actualId = c.getId();
			Assert.assertEquals(expectedId, actualId);
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		
		Assert.assertTrue(stack.isEmpty());
	}
	
	
	@Test
	public void testPopEmptyStack() throws Exception {
		QueueCircularLinkedList<Conta> stack = new QueueCircularLinkedList<>();
		boolean expected = true;
		boolean actual = stack.isEmpty();		
		Assert.assertEquals(expected, actual);

		try {
			Conta c;
			c = stack.dequeue();
			Assert.fail("Stack is empty");
		}catch (Exception e) {
			// Success
			Assert.assertTrue(true);
		}
	}
}
