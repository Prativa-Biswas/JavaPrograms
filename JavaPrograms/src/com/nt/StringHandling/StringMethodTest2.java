package com.nt.StringHandling;

public class StringMethodTest2 {
	public static void main(String[] args) {
		//`method 1
		String s="Prativa";
		System.out.println(s.charAt(5)); // v
		//`method 2
		System.out.println(s.concat(" is a Student")); // Prativa is a Student
		//`method 3
		System.out.println(s.equals("prativa"));// false
		//`method 4
		System.out.println(s.equalsIgnoreCase("prativa"));// true
		System.out.println();
		//`method 5
		System.out.println(s.isEmpty());//false
		System.out.println(s.isBlank());
		String s1=" ";
		System.out.println(s1.isEmpty());//true
		System.out.println(s1.isBlank());
		//`method 6
		System.out.println(s.toUpperCase());
		//`method 7
		System.out.println(s.toLowerCase());
		//`method 8
		System.out.println(s.substring(2));// ativa
		//`method 9
		System.out.println(s.substring(2,5));// ati
		//`method 10
		System.out.println(s.indexOf('a'));// 2(First occurrence)
		System.out.println(s.indexOf(97));//97-a-2(First occurrence)
        System.out.println(s.indexOf("ra"));// give the first char index
        System.out.println(s.indexOf(97, 3, 7));// search 97-a in between index 3 and 7
		//`method 11
		System.out.println(s.lastIndexOf('a'));//(Last occurrence)
		//`method 12
		System.out.println(s.length());
		//`method 13
		System.out.println(s.replace('v','b'));	
		System.out.println(s.replace("va", "bha"));
		System.out.println(s.replaceAll("Prativa", "Prativa Biswas"));
		System.out.println(s.replaceFirst("ra", "ar"));
		//`method 14
		String s2="   Prativa  ";
		System.out.println(s2.length());
		System.out.println(s2.trim().length());
		
	}

}
