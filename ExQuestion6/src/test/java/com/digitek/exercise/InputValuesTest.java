package com.digitek.exercise;

import org.junit.Assert;
import org.junit.Test;

public class InputValuesTest {
	
	@Test
	public void addTest(){
		
		InputValues v = new InputValues();
		int result = v.add(3,2);
		Assert.assertEquals(5, result);
		
	}
	
	@Test
	public void subtractTest(){
		
		InputValues v = new InputValues();
		int result = v.subtract(3,2);
		Assert.assertEquals(1, result);
		
	}
	
	@Test
	public void multiplyTest(){
		
		InputValues v = new InputValues();
		int result = v.multiply(3,2);
		Assert.assertEquals(6, result);
		
	}
	
	@Test
	public void divideTest(){
		
		InputValues v = new InputValues();
		int result = v.divide(3,2);
		Assert.assertEquals(1, result);
		
	}

}
