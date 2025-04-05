package com.nt.StringHandling.Questions;

import java.util.Scanner;

public class RemoveSpecificCharacter {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.next().toLowerCase().trim();
		System.out.println("Enter Charater you want to remove");
		String c= sc.next();
		char ch = c.charAt(0);
		StringBuffer string=new StringBuffer(s);

			if(s.contains(c))
			{
				for(int i=0;i<string.length();i++)
				{
					if(string.charAt(i)==ch) {
						 string.deleteCharAt(i);
					}
				}
			}
			else
			{
				System.out.println(s+" does not contain letter "+ c);
				return;
			}
		
			System.out.println(string.toString());
		System.out.println(removeCharacter(s,ch));
		
	}
	
	public static String removeCharacter(String s,char c)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)==c))
				sb.append(s.charAt(i));
		}
		
		return sb.toString();
		
	}

}
