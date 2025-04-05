package com.nt.StringHandling.Questions;

import java.util.Scanner;

//Given a string, find the first non-repeating character.
public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your String");
		String str= sc.nextLine().toLowerCase();
		for(int i=0;i<str.length();i++) // nitin // n
		{
			char ch=str.charAt(i);
			int first = str.indexOf(ch); // 1
			int last = str.lastIndexOf(ch);// 3
			if(first==last)
			{
				System.out.println("First  non-repeating character: "+ch);
				return;
			}						
	    }
			System.out.println("No non-repeating character found");
		sc.close();
	}
}

