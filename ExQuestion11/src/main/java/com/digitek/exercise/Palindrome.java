package com.digitek.exercise;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean checkPalindrome(int a){
		int value = a; 
		int r=0;
		int c;
		while(value!=0){
		c = value%10;
		r = c + (r*10);
		//System.out.println(r);
		value = (value/10);
		}
		if(r == a){
			System.out.println(+a+" is a palindrome");
			return true;
		}
		else{
			System.out.println(+a+" is not a palindrome");
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number");
		a = in.nextInt();
		checkPalindrome(a);
		
	}

}
