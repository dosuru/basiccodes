package com.programming.intermediateoops;

public abstract class Shape{
	abstract void draw();
	
	
}
class Line extends Shape{

	@Override
	void draw() {
		System.out.println("Line shape");
		
	}
	
}
class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Rectangle shape");
		
	}
	
}
class Cube extends Shape{

	@Override
	void draw() {
		System.out.println("cube shape");
	}
	
	
}


