package com.programming.ds;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tax;
		if(n>0 && n<=180000) {
			
			System.out.println("No tax");
			
		}else if(n>180000 && n<=300000) {
			tax =(10*n)/100;
			System.out.println(tax);
		}
		else if(n>300000 && n<=500000) {
			tax =(20*n)/100;
			System.out.println(tax);
		}
		else if(n>500000 && n<=700000) {
			tax =(20*n)/100;
			System.out.println(tax);
		}
		
		
		

	}

}
