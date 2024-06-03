//Write a program to print Armstrong number
package com.java;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		
		while(num>0) {
			int e=num%10;
			sum=sum+(e*e*e);
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("The number is armstrong:");
		}
		else {
			System.out.println("The number is not armstrong");
		}
		

	}

}
