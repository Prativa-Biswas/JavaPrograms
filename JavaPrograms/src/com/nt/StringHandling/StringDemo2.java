package com.nt.StringHandling;

public class StringDemo2 {

	public static void main(String[] args) {

		String s1= new String("You cannot change me");
		String s2= new String("You cannot change me");
		System.out.println(s1==s2); //false
		String s3="You cannot change me";
		System.out.println(s3==s1);// false
		String s4="You cannot change me";
		System.out.println(s3==s4);//true
		String s5="You cannot "+"change me"; // concatenation will happen in compilation time cause both are string literal or constant
		System.out.println(s4==s5);// true
		String s6="You cannot";
		String s7=s6+" change me";  // concatenation will happen in run time cause both are not string literal or constant, one of them is variable
		System.out.println(s4==s7);// false
		final String s8="You cannot";
		String s9=s8+" change me"; // concatenation will happen in compilation time cause both will consider as string literal or constant as final key word there
		System.out.println(s4==s9);//true
	}

}
