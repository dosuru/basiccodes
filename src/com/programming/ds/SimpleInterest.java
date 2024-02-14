package com.programming.ds;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int p = sc.nextInt();
//		float t = sc.nextFloat();
//		float r = sc.nextFloat();
//		float intrest = (p*t*r)/100;
//		System.out.println(intrest);
		
		// compound intrest = p(1+r/n)
		
		Scanner sc = new Scanner(System.in);
		int p=sc.nextInt();
		float t = sc.nextFloat();
		int n = sc.nextInt();

		float r = sc.nextFloat();
		float ci = p*(1+r/n);
		int res = (int) (n*t);
		System.out.println(Math.pow(ci, res));
		

	}

}
