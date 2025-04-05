package com.nt.StringHandling;

public class StringBufferAppendMethod {

	public static void main(String[] args) {

		//Append method is overloaded method
		StringBuffer sb= new StringBuffer();// capacity =16
		sb.append("PI value is ");// String value
		sb.append(3.14);// float or double value
		sb.append(" It is exactly ");//String value
		sb.append(true);// boolean value
		System.out.println(sb);
	}

}
