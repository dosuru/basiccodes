package com.programming.ds;

//import java.util.ArrayList;
//import java.util.List;
//
//public class ArmStrongNumberRange {
//
//	public static void main(String[] args) {
//		int r;
//		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		
//		for(int i=100;i<1000;i++) {
//			int temp=i;
//			int sum=0;
//			while(temp>=0) {
//				r=temp%10;
//				sum = sum+(r*r*r);
//				temp=temp/10;
//				
//			}
//			if(i==sum) {
//				list.add(i);
//				
//			}
//		}
//		System.out.println(list);
//
//	}
//
//}
import java.util.ArrayList;
import java.util.List;

public class ArmStrongNumberRange {

    public static void main(String[] args) {
        int r;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 100; i < 1000; i++) {
            int sum = 0;
            int temp = i;

            while (temp > 0) {
                r = temp % 10;
                sum = sum + (r * r * r);
                temp = temp / 10;
            }

            if (i == sum) {
                list.add(i);
            }
        }

        System.out.println(list);
    }
}

