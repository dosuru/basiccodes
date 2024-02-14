package com.programming.ds;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		int r;
		int temp=n;
		while(n>0) {
			r = n%10;
			sum = sum+(r*r*r);
			n=n/10;
		}
		if(temp == sum) {
			System.out.println("The given number is Armstrong number");
		}else {
			System.out.println("Not an Armstrong number");
		}

	}

}
