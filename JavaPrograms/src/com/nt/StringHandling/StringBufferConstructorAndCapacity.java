package com.nt.StringHandling;

public class StringBufferConstructorAndCapacity {

	public static void main(String[] args) {

		StringBuffer sb1= new StringBuffer();
		System.out.println(sb1.capacity());// 16
		sb1.append("misunderstanding");
		System.out.println(sb1.capacity());// 16
		sb1.append("misunderstandings");// 
		System.out.println(sb1.capacity());// 34
		
		StringBuffer sb2= new StringBuffer(100);// capacity 100
		System.out.println(sb2.capacity());// 100
		sb2.append("P");
		System.out.println(sb2.capacity());// 100
		sb2.append("rogramming requires patience,practice,and problem-solving skills to develop efficient and reliable ");
		System.out.println(sb2.capacity());// 100
		sb2.append("software");
		System.out.println(sb2.capacity());//202
		System.out.println(sb2);
		
		StringBuffer sb3= new StringBuffer("Prativa"); //s.length()+16= 7+16=23
         System.out.println(sb3.capacity());//23
         
        
	}

}
