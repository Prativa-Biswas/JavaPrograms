package com.nt.StringHandling.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//Write a function to check if two strings are anagrams (contain the same characters in a different order).

public class AnagramCheck {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First String");
		String str1=sc.nextLine().toLowerCase().replace("\\s", "");;
		System.out.println("Enter Second String");
		String str2=sc.nextLine().toLowerCase().replace("\\s", "");
	    List<Character> s1=new ArrayList<>();  
	    List<Character> s2=new ArrayList<>();  
		for(int i=0;i<str1.length();i++)
		{
			s1.add(str1.charAt(i));
		}
		
		for(int i=0;i<str2.length();i++)
		{
			s2.add(str2.charAt(i));
		}
	Collections.sort(s1);
	Collections.sort(s2);	
	
	  if(s1.size()!=s2.size() )
		  System.out.println("This two string are not a anagrams");
	  else if(s1.equals(s2))
		  System.out.println("This two string are a anagrams");
	  else
		  System.out.println("This two string are not a anagrams");
	  
	  System.out.println("Is Anagrams: "+anagrmsCheck(str1,str2));
	  
		/*  String text = "Hello World\nWelcome to Java\nEnjoy coding!";
		
		  text.lines().forEach(System.out::println);*/
      
	  
		
	}
	
	public static boolean anagrmsCheck(String s1, String s2)
	{
		char[] array1 = s1.toCharArray();
		char[] array2 = s2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(s1.length()!=s2.length())
			   return false;
		  else if(Arrays.equals(array1,array2))
			  return true;
		  else
			  return false;
			
		
	}

}
