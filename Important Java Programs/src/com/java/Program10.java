// Leap year or not
package com.java;

public class Program10 {

	public static void main(String[] args) {
		int year=2020;
		if(year%400==0) {
			System.out.println("It is a leap year");
		}
		else if(year%4==0 && year%100!=0) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}

}
