package com.nt.StringHandling.Questions;

import java.util.Scanner;

/*Implement a method to perform basic string compression using the counts of repeated characters.

Example: "aaabbccc" → "a3b2c3"*/

public class StringCompression {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String value");
		String str= sc.nextLine(); // aaabbbc
		StringBuffer sb= new StringBuffer();
		int count=1;
		for(int i=0;i<str.length()-1;i++) //0=a/ 1=a/2=a/ 3=b
		{
			if(str.charAt(i)==str.charAt(i+1))// a==a/ a==a/a=!b/ b==b// b==b/ b=!c/
			{
				count++;// 2 /3/ 2 /3
				
			}
			else
			{
				if(count==1)
					sb.append(str.charAt(i));
				else
				sb.append(str.charAt(i)).append(count);// a+3 //b+3
				count=1;
			}			
		}
		sb.append(str.charAt(str.length()-1));
		System.out.println(sb);

	}

}
