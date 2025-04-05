package com.nt.StringHandling;

public class StringDemo1 {

	public static void main(String[] args) {

		String s1= new String("Spring");
		s1.concat("Fall");
		String s2= s1.concat("Winter");
		s2.concat("Summer");
		System.out.println(s1);// output=Spring
		System.out.println(s2);// out put= Springwinter
		
		/*Here  8 Object are getting created 4 in heap area 4 in scp where scp object is not destroyable 
		  but 2 object from heap area are eligible for garbage collection as these two are not referred by any object reference  */
	}

}
