package com.nt.StringHandling;

public class DiffbtwString_StringBuffer {

	public static void main(String[] args) {

		String name="Prativa";  // a String Variable
		name.concat(" is a Student");
		System.out.println(name); // Output= Prativa 
		
        StringBuffer name1=new StringBuffer("Prativa");
        name1.append(" is a Student");
        System.out.println(name1); // output= Prativa is a student
        
        //String is immutable so one string value created it can not be changed
        //StringBuufer is mutable so modification is possible
		
		
		
		
		
		
		
		
		
	}

}
