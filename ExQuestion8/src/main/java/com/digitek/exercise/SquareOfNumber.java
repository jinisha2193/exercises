package com.digitek.exercise;

import java.util.Scanner;

public class SquareOfNumber {
	
	public static int square(int a){
		a*=a;
		return a;
	}
	
	public static void main(String args[]){
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		a = in.nextInt();
		int r = square(a);
		System.out.println("The Square of "+a+" is : "+r);
		
	}

}
