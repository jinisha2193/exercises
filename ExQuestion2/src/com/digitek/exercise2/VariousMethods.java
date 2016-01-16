package com.digitek.exercise2;

public class VariousMethods {
	
	public static void noParameterNoReturn(){
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("The sum of "+a+" and "+b+" is : " +c );
		
	}
	public static void withParameterNoReturn(String a ,int b){
		
		System.out.println("Age of "+a+" is : "+b);
		
	}
	
	public static int withParameterWithReturn(int a,int b){
		
		int result = a*b;
		return result;
	}
	public static int noParameterWithReturn(){
		int a = 70;
		int b = 40;
		int result = a-b;
		return result;
	}
	
	public static void main(String args[]){
		noParameterNoReturn();
		int r = withParameterWithReturn(20,10);
		System.out.println("The product of 20 and 30 is : "+r);
		int s = noParameterWithReturn();
		System.out.println("The difference between 50 and 30 is : "+s);	
		withParameterNoReturn("JOHN",30);
	}
	

}
