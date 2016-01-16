package com.digitek.exercise;

import java.util.Scanner;

public class InputFloatValues {
	
	public static float add(float a,float b){
		
		return a+=b;
		
	}
	public static void main(String args[]){
		float a;
		float b;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the first float value :");
		a = in.nextFloat();
		System.out.println("enter the second float value :");
		b = in.nextFloat();
		float r = add(a,b);
		System.out.println("The sum of two float values : "+r);
		
		
	}

}
