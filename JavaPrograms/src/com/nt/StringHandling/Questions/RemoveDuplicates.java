package com.nt.StringHandling.Questions;
//Write a Java function that removes duplicate characters from a string while maintaining the order of characters.

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your 1st String");
		String str= sc.nextLine();

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			str=str.replaceAll(String.valueOf(ch), "");
			str=str+ch;
		}
		System.out.println(str);
		System.out.println("Enter your 2nd String");
		 str= sc.nextLine();
		String s="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!s.contains(String.valueOf(ch)))
				s=s+ch;
		}
		System.out.println(s);
	}

}
