package com.programming.ds;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				flag=true;
				break;
			
			}
		}
		if(flag == true) {
			System.out.println("The number is present");
		}else {
			System.out.println("The number is not present");
		}
	
				
		
		

	}

}
