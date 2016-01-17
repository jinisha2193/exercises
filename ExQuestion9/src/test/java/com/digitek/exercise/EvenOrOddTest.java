package com.digitek.exercise;

import org.junit.Test;

import junit.framework.Assert;

public class EvenOrOddTest {
	
	
	@Test
	public void oddOrEvenWithParameterTest(){
		EvenOrOdd numb = new EvenOrOdd();
		boolean result = numb.oddOrEvenWithParameters(3);
		Assert.assertEquals(false,result);
	}

}
