package com.digitek.exercise2;



import org.junit.Test;


import junit.framework.Assert;


public class VariousMethodTest {
	
	@Test
	public void withParameterWithReturnTest(){
		VariousMethods v = new VariousMethods();
		int res = v.withParameterWithReturn(20,10);
		Assert.assertEquals(200,res);
		
	}
	
	
/*	@Parameter(0)
	public int expectedResult;
	@Parameter(1)
	public int firstParameter;
	@Parameter(2)
	public int secondParameter;
	
	
	@Parameters
	public static Collection<Integer[]> values(){
		Integer[][] params = new Integer[][]{{20,50,30},{10,30,20},{30,70,40}};
		return Arrays.asList(params);
	}
	*/
	@Test
	public void noParameterWithReturn(){
		VariousMethods v = new VariousMethods();
		int res = v.noParameterWithReturn();
		Assert.assertEquals(30, res);
	
	
	}
}
