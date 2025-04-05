package com.nt.StringHandling.Questions;

import java.util.Scanner;

//Write a Java function to check if a given string is a palindrome (reads the same forward and backward).
public class Palindrome {

	public static void main(String[] args) {
      
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your String");
		String str= sc.nextLine();
		/*String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}*/
		String reverse=new StringBuffer(str).reverse().toString();
		if(str.equalsIgnoreCase(reverse))
		{
			System.out.println(str+" is a pallindrome ");
		}
		else
		{
			System.out.println(str+" is not a pallindrome ");
		}
		
	}

}
