package com.digitek.exercise;

import org.junit.Test;

import junit.framework.Assert;

public class PrimeNumberTest {
	@Test
	public void PrimeNumberTest(){
		PrimeNumber n = new PrimeNumber();
		boolean r = n.prime(19);
		Assert.assertEquals(true, r);
	}

}
