// Write a program to reverse a string
package com.java;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int rev=0;
		
		while(num!=0) {
//			modulus extract the last digit from number
			rev=rev*10+num%10;
//			divide eliminate the last digit
			num=num/10;
		}
		System.out.println("reversed number is:"+rev);
		
	}

}
