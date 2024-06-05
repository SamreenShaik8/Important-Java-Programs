//swap number withot using third variable
package com.java;

public class Four {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		System.out.println("Before swaping a & b values are:"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping a & b values are:"+a+" "+b);
	}

}
