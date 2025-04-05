package com.nt.StringHandling;

public class EnsureCapacityOfStr {

	public static void main(String[] args) {

		StringBuffer sb= new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Prativa");
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity()); //will not decrease the capacity only increase
		sb.trimToSize();
		System.out.println(sb.capacity());
		sb.insert(3, "Biswas");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.delete(3, 8);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.deleteCharAt(3));
		System.out.println(sb.reverse());
		sb.setLength(4);
		System.out.println(sb.reverse());
	}

}
