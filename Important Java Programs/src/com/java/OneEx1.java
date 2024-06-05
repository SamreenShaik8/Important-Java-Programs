// reverse a string using string buffer class
package com.java;

import java.util.Scanner;

public class OneEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
//		create an object by using string buffer
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		System.out.println("Reversed number is:"+sb.reverse());

	}

}
