package com.nt.StringHandling.Questions;
//Write a Java program to print all possible substrings of a given string
import java.util.Scanner;

public class FindAllSubstrings {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str= sc.nextLine().trim();
		int n=(str.length()*(str.length()+1))/2;		
		System.out.println("All possible substring are: ");

		for(int i=0;i<=n;i++) // 0
		{		
			for(int j=i+1;j<=str.length();j++)// 1
				System.out.println(str.substring(i, j));
			
		}
 
	}

}
