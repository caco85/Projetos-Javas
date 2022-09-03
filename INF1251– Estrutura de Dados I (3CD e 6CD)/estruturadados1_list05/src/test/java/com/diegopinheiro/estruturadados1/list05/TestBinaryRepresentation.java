package com.diegopinheiro.estruturadados1.list05;

import org.junit.Assert;
import org.junit.Test;

import com.diegopinheiro.estruturadados1.list05.Utils;
import com.diegopinheiro.estruturadados1.list05.ExpressionItem;
import com.diegopinheiro.estruturadados1.list05.Item;
import com.diegopinheiro.estruturadados1.list05.QueueCircularLinkedList;



public class TestBinaryRepresentation {
	
	@Test
	public void testBinaryRepresentation() {
		Utils utils = new Utils();
		String actual = utils.binaryRepresentation(50);
		String expected = "110010";
		Assert.assertEquals(expected, actual);
	}
	
	
	
}
