package com.programming.intermediateoops;

class Employee1 {
	
	float salary=20000;
	public void getSalary() {
		System.out.println("salary ofemployee is "+ salary);
	}

}
class Manager extends Employee1{
	float incentive = 1000;
	public void getSalary() {
		//super.getSalary();
		System.out.println("salary of manager is "+ (salary+incentive));
	}
	
	
}
class Labour extends Employee1{
	float rate=150;
	public void getSalary() {
		//super.getSalary();
		System.out.println("salary of Labour is "+ (salary+rate));
	}
}
public class Employee{
	public static void main(String[] args) {
		Manager m=new Manager();
		m.getSalary();
		Labour l=new Labour();
		l.getSalary();
		
	}
	
}