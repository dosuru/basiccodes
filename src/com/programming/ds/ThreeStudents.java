package com.programming.ds;

public class ThreeStudents {
	int mark1;
	int mark2;
	int mark3;
	ThreeStudents(int mark1,int mark2,int mark3){
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	public int totalScore() {
		return mark1+mark2+mark3;
		
	}
	public int average() {
		return (mark1+mark2+mark3)/3;
	}

	public static void main(String[] args) {
		ThreeStudents s1= new ThreeStudents(65,76,87);
		ThreeStudents s2= new ThreeStudents(65,90,87);
		ThreeStudents s3= new ThreeStudents(56,76,87);
		System.out.println(s1.totalScore());
		System.out.println(s1.average());
		
		
		
		

	}

}
