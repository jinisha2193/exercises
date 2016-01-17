package com.digitek.exercise;

import java.util.Scanner;

public class EvenOrOdd {
	
	
	public static boolean oddOrEvenWithParameters(int a){
		 
		if(a%2 == 0){
			System.out.println(+a+" is even");
			return true;
				}
		else{
			System.out.println(+a+" is odd");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number :");
		a = in.nextInt();
		oddOrEvenWithParameters(a);
	}

}
