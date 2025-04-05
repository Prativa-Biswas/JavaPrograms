package com.nt.StringHandling.Questions;
//Write a Java program to reverse a given string without using the built-in reverse() method

public class StringReverse {

	public static void main(String[] args) {
		String name="Prativa";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
		}
  System.out.println(reverse);

	}

}
