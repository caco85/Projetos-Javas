package com.diegopinheiro.estruturadados1.list05;

import org.junit.Assert;
import org.junit.Test;



public class TestJosephusProblem {
	
	@Test
	public void testJosephusProblem2And7() {
		Utils utils = new Utils();
		String[] actual = utils.josephusProblem(2, 7);
		String[] expected = {"1", "3", "5", "0", "4", "2", "6"};
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testJosephusProblem4And7() {
		Utils utils = new Utils();
		String[] actual = utils.josephusProblem(4, 7);
		String[] expected = {"3", "0", "5", "4", "6", "2", "1"};
		Assert.assertArrayEquals(expected, actual);
	}
}
