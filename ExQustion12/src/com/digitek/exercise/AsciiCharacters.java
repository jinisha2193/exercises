package com.digitek.exercise;

public class AsciiCharacters {
	
	public static void displayCharacters()
	{
		System.out.println("value =  Ascii Characters");
		for(int i = 1; i<=122;i++){
			System.out.println(i+"     =  " +(char)i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 displayCharacters();

	}

}
