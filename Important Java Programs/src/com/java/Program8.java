package com.java;

public class Program8 {

	public static void main(String[] args) {
		int n1=20,n2=28,hcf,lcm;
		hcf=(n1>n2)?n2:n1;
		while(true) {
			if(n1 % hcf ==0 && n2 % hcf==0) {
				System.out.println("hcf is:"+hcf);
				break;
			}
			hcf--;
		}
		lcm=(n1*n2)/hcf;
		System.out.println("lcm is:"+lcm);
		

	}

}
