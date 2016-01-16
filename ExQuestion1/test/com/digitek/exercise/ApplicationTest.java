package com.digitek.exercise;

import junit.framework.Assert;
import org.junit.Test;

public class ApplicationTest {
	
	@Test
	public void greetingTest(){
		Application app = new Application();
		String result = app.greeting("Hello World");
		Assert.assertEquals("Hello World", result);
		
	}

}
