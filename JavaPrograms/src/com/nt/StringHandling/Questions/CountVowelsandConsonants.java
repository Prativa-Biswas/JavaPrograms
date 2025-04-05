package com.nt.StringHandling.Questions;
//Write a Java program that counts the number of vowels and consonants in a given string.

import java.util.Scanner;

public class CountVowelsandConsonants {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your String");
		String str= sc.nextLine().toLowerCase();
		int countV=0;
		int countC=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.toLowerCase().charAt(i)=='a'||str.toLowerCase().charAt(i)=='e'||str.toLowerCase().charAt(i)=='o'||
					str.charAt(i)=='u'||str.toLowerCase().charAt(i)=='i')
			{
				countV++;
			}
			else
			{
				countC++;
			}
		}
		System.out.println("Count of number of Vowles in the String: "+countV);
		System.out.println("Count of number of Consonants in the String: "+countC);
	}

}
