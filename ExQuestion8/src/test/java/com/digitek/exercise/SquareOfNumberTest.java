package com.digitek.exercise;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class SquareOfNumberTest {
	@Parameter(0)
	public int expectedResult;
	@Parameter(1)
	public int firstParameter;
	
	@Parameters
	public static Collection<Integer[]> values(){
		
		Integer[][] params=new Integer[][]{{16,4},{4,2},{25,5}};
		return Arrays.asList(params);
	}
	@Test
	public void squareTest() {
		SquareOfNumber ob = new SquareOfNumber();
		int actualResult = ob.square(2);
		Assert.assertEquals(4, actualResult);
	}

}
