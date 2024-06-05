// reverse a string using string builder class
package com.java;

import java.util.Scanner;

public class OneEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		System.out.println("Reversed number is:"+sb.reverse());

	}

}
