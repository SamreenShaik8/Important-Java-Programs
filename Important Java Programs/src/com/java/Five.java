// to find number of even odd digit in given number
package com.java;

public class Five {

	public static void main(String[] args) {
		int num=12461;
		int even=0;
		int odd = 0;
		while(num>0) {
			int digit=num%10;
			if(digit%2==0) {
				even++;
			}
			else {
				odd++;
			}
			num=num/10;
			
		}
		System.out.println("no of even digits:"+even);
		System.out.println("no of odd digits:"+odd);

	}

}
