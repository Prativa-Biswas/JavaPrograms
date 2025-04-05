package com.nt.StringHandling.Questions;

import java.util.HashMap;
import java.util.Scanner;

//Write a program to find the most frequently occurring character in a string.

public class FindtheMostFrequentCharacter {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine().trim().toLowerCase();
		int frequentCount=0;
		char frequentWord='\0';
		
		if(str.isEmpty())
		{
			System.out.println("String is empty. No frequent character.");
			return;
		}
		for(int i=0;i<str.length();i++) // Prativa
		{
			int count=1;
			
			if(str.charAt(i)!=' ')
			{
				for(int j=i+1;j<str.length();j++)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						count++;
					}
				}
			}
			if(count>frequentCount)
			{
				frequentCount=count;
				frequentWord=str.charAt(i);
			}
			
		}
		//System.out.println("The most frequently occurring character in a string is: "+frequentWord);
		System.out.println("The most frequently occurring character in a string is: "+frequentOccuranceChar(str));

		

	}
	public static char frequentOccuranceChar( String s)
	{
		Character fequentChar=null;
		int maxCount=0;
		HashMap<Character ,Integer> countOccurence= new HashMap<Character, Integer>();
		
		for(Character ch:s.toCharArray())
		{
			if(ch!=' ')
			{
				countOccurence.put(ch, countOccurence.getOrDefault(ch, 0)+1);
				if(countOccurence.get(ch)>maxCount) {
					maxCount=countOccurence.get(ch);
					fequentChar=ch;
				}
			}
		}
		return fequentChar;
		
	}

}
