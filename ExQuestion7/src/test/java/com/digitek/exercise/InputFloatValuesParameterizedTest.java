package com.digitek.exercise;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(Parameterized.class)

public class InputFloatValuesParameterizedTest {
	@Parameter(0)
	public float expectedResult;
	@Parameter(1)
	public float firstParameter;
	@Parameter(2)
	public float secondParameter;
	
	@Parameters
	public static Collection<Float[]> values(){
		
		Float[][] params=new Float[][]{{5.5f,1.3f,4.2f},{3.5f,1.3f,2.2f},{6.7f,4.4f,2.3f}};
		return Arrays.asList(params);
	}	
	@Test
	public void addTest(){
		InputFloatValues val = new InputFloatValues();
		float result = val.add(1.3f,2.2f);
		Assert.assertEquals(3.5f, result,0);
	}
	

}
