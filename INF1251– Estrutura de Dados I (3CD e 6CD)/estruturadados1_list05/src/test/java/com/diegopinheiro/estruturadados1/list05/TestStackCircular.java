
package com.diegopinheiro.estruturadados1.list05;



import org.junit.Assert;
import org.junit.Test;

public class TestStackCircular {

	
	@Test
	public void testPushPop() {
		StackCircularLinkedList<Conta> stack = new StackCircularLinkedList<>();
		boolean actual = stack.isEmpty();
		boolean expected = true;
		Assert.assertEquals(expected, actual);
		
		stack.push(new Conta("1"));
		Assert.assertFalse(stack.isEmpty());
		
		stack.push(new Conta("2"));
		
		Conta c;
		String expectedId;
		String actualId;
		
		try {
			c = stack.pop();
			expectedId = "2";
			actualId = c.getId();
			Assert.assertEquals(expectedId, actualId);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		
		try {
			c = stack.pop();
			expectedId = "1";
			actualId = c.getId();
			Assert.assertEquals(expectedId, actualId);
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		
		Assert.assertTrue(stack.isEmpty());
	}
	
	
	@Test
	public void testPopEmptyStack() throws Exception {
		StackCircularLinkedList<Conta> stack = new StackCircularLinkedList<>();
		boolean expected = true;
		boolean actual = stack.isEmpty();		
		Assert.assertEquals(expected, actual);

		try {
			Conta c;
			c = stack.pop();
			Assert.fail("Stack is empty");
		}catch (Exception e) {
			// Success
			Assert.assertTrue(true);
		}
	}
}
