package com.nt.StringHandling;

public class FinalvsImmutability {

	public static void main(String[] args) {

		final StringBuffer sb= new StringBuffer("Prativa");
		sb.append(" Biswas"); // changeable as it's not immutable // Prativa Biswas
		System.out.println(sb);
		
		//sb=new StringBuffer("Ankita");// not possible we can't re-assign final variable to another object
		System.out.println(sb);

		
	}

}
