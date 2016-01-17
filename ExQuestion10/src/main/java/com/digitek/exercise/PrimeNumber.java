package com.digitek.exercise;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean prime(int a){
		int i,flag=0;
			
			for(i=2;i<=(a/2);){
				if(a%i==0){
					System.out.println(+a+"  is not a prime");
					flag=1;
					break;
				}
				else{
					i++;
				}
				
			}
			
			if(flag==0){
				System.out.println(+a+" is a prime");
				return true;
				
			}
			else
				return false;
		
	}
	public static void main(String args[]){
		int a;
		System.out.println("enter a value :");
		Scanner in = new Scanner (System.in);
		a = in.nextInt();
		prime(a);
	}

}
