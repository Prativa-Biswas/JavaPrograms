package com.nt.StringHandling.Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

//Given a sentence, find the longest word in it
public class FindLongestWordinSentence {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your String");
		String str= sc.nextLine().toLowerCase().trim().replaceAll(" ", "\n");
//		String str=sc.nextLine();
		//System.out.println(str);
		
		Optional<String> max = str.lines().max(Comparator.comparingInt(String::length));
			
		
		max.ifPresent(System.out::println);
		
		System.out.println("Enter Another String");
		String str1= sc.nextLine().toLowerCase().trim();
		Optional<String> max2 = Arrays.stream(str1.split("\\s+")).max(Comparator.comparingInt(String::length));
		max2.ifPresent(System.out::println);
	}

}
