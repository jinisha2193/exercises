package com.digitek.exercise;

import org.junit.Test;

import junit.framework.Assert;

public class PalindromeTest {
	
	@Test
	public void checkPalindromeTest(){
		Palindrome num = new Palindrome();
		boolean result =num.checkPalindrome(661);
		Assert.assertEquals(false, result);
		
	}

}
