package com.programming.ds;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maths = sc.nextInt();
		int physics=sc.nextInt();
		int chemistry = sc.nextInt();
		if(maths>60 && physics >60 && chemistry>60) {
			System.out.println("Passed");
		}else if((maths>60 && physics >60) || (physics >60 && chemistry>60) || (maths >60 && chemistry>60)){
			System.out.println("promoted");
			
		}else {
			System.out.println("failed");
		}
			
		

	}

}
