package com.nt.StringHandling.Questions;

import java.util.Scanner;

public class ConvertRomanNumeralstoInteger {
	
	public static int romanToNumber(String roman)
	{
		int total=0; int prevValue=0;
		for(int i=roman.length()-1;i>=0;i--)
		{
			if(getNumberValue(roman.charAt(i))==0)
				throw new IllegalArgumentException("Invalid Roman Number");
			
			int currentValue=getNumberValue(roman.charAt(i));
			
			if(currentValue<prevValue)
				total-=currentValue;
			else
				total+=currentValue;	
			
			prevValue = currentValue;
		}
		 
		return total;
		
	}
	public static int getNumberValue(char ch)
	{
		switch(ch)
		{
		case 'I':  return 1;
		case 'V':  return 5;
		case 'X':  return 10;
		case 'L':  return 50;
		case 'C':  return 100;
		case 'D': return 500;
        case 'M': return 1000;
		default:  return 0;// invalid character
		}
	}
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Roman number: ");
		String roman=sc.next().toUpperCase();
		
		try {
			int number = romanToNumber(roman);
			if(number>0)
				System.out.println("The Equivalent number for given Roman : "+number);
				else
					System.err.println("Invalid Roman Number");
		}catch(Exception e)
		{
			System.err.println(e.getMessage());;
		}
		
		
		
		
		
	}

}
