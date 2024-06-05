// to calculate lcm of 2 integers
package com.java;

public class Program12 {

	public static void main(String[] args) {
		int n1=4,n2=5,lcm;
		if(n1==0 && n2==0) {
			System.out.println("LCM is zero");
		}
		lcm=(n1>n2)?n1:n2;
		while(true) {
			if(lcm%n1==0 && lcm%n2==0) {
				System.out.println("LCM is:"+lcm);
				break;
			}
			lcm++;
		}

	}

}
