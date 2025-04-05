package com.nt.StringHandling;

public class ArraysOfByteToString {

	public static void main(String[] args) {

		byte []b= {65,97,98,99,100};
		String str= new String(b); // covert byte to characters then to string object
		System.out.println(str);
	}

}
