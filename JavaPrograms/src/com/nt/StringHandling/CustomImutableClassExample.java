package com.nt.StringHandling;

final public class CustomImutableClassExample {
	
	private int i;
	public CustomImutableClassExample(int i)
	{
		this.i=i;
	}
	public CustomImutableClassExample modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else
		{
			return new CustomImutableClassExample(i);
		}
	}	

	public static void main(String[] args) {
		
		CustomImutableClassExample ct1=new CustomImutableClassExample(100);
		CustomImutableClassExample ct2=ct1.modify(10);
		CustomImutableClassExample ct3=ct1.modify(100);
		
		System.out.println(ct1==ct2);// false
		System.out.println(ct1==ct3);// true
		

	}

}
