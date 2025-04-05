package com.nt.StringHandling;

import java.util.Scanner;

public class StringMethodTest {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your City name: ");
		String city=sc.nextLine().toLowerCase().trim();
		
		if(city.equals("hyderabad"))
			System.out.println("Adaav Hyderabad");
		else if(city.equals("bangalore"))
			System.out.println("Namaskaraa Bngalore");
		else if(city.equals("chennai"))
			System.out.println("Vanakkam TamilNadu");
		else
			System.out.println("Invalid city Name, Enter valid city Name");
	}

}
