// largest of three numbers using ternary oeprators
package com.java;

public class Program9 {

	public static void main(String[] args) {
		int a=10,b=80,c=12;
		int largest;
		largest=(a>b && a>c)?a:((b>a && b>c)?b:c);
        System.out.println("Largest number is:"+largest);
	}

}
