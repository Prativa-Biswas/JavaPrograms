package com.nt.StringHandling.Questions;
//Write a Java function to find the longest palindromic substring in a given Substring

import java.util.Scanner;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your String");
		String str= sc.nextLine().trim();
		String longPalindrome="";
		for(int i=0;i<str.length();i++)
		{
			
			for(int j=i+1;j<=str.length();j++)
			{
			   String substring = str.substring(i, j);
			   if(isPlindrome(substring) && substring.length()>longPalindrome.length())
					   {
				          longPalindrome=str.substring(i, j);
					   }
					   
			}
			
		}
		System.out.println();
		System.out.println("Longest substrings: "+longPalindrome);
	}
	public static boolean isPlindrome(String s) {
		String st = new StringBuffer(s).reverse().toString();
		if(s.equalsIgnoreCase(st))
			return true;
		
		return false;
	}

}
