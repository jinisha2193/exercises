package com.digitek.exercise;

import java.util.Scanner;

public class InputValues {
	
	public static int add(int a,int b){
		
		int c = a+b;
		return c;
	}
	
	public static int subtract(int a,int b){
		
		int c = a-b;
		return c;
	}
	
	public static int multiply(int a,int b){
		
		int c = a*b;
		return c;
	}
	
	public static int divide(int a,int b){
		
		int c = a/b;
		return c;
	}
	
	public static void main(String args[]){
		
		int a;
		int b;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the first value : ");
		a = in.nextInt();
		System.out.println("enter the second value : ");
		b = in.nextInt();
		
		System.out.println("the first value : "+a);
		System.out.println("the second value : "+b);
		
		int r1=add(a,b);
		int r2=subtract(a,b);
		int r3=multiply(a,b);
		int r4=divide(a,b);
		System.out.println("The sum of "+a+" and "+b+" is : "+r1);
		System.out.println("The difference between "+a+" and "+b+" is : "+r2);
		System.out.println("The product of "+a+" and "+b+" is : "+r3);
		System.out.println("The value of "+a+" divided by "+b+" is : "+r4);
	}

}
