package com.nt.StringHandling;

public class DiffreentPerspectOfImutability {

	public static void main(String[] args) {

		String s1= new String("prativa");
		String s2= s1.toUpperCase(); //PRATIVA
		String s3= s1.toLowerCase(); //prativa  so no new object created as the content is same so s3 referring to s1 object
		
		System.out.println(s1==s2);// false
		System.out.println(s1==s3);//true
	}

}
