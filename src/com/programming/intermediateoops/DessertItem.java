package com.programming.intermediateoops;

public abstract class DessertItem {
	
	String name;
	float price;
	float tax;
	DessertItem(String name,float price,float tax){
		this.name=name;
		this.price=price;
		this.tax=tax;
		
	}
	abstract double getCost();

}
class Candy extends DessertItem{

	Candy(String name, float price, float tax) {
		super(name, price, tax);
	}

	@Override
	double getCost() {
		return 120;
	}
	
}
class Cookie extends DessertItem{

	Cookie(String name, float price, float tax) {
		super(name, price, tax);
	}

	@Override
	double getCost() {
		return 140;
	}
	
}
class IceCream extends DessertItem{

	IceCream(String name, float price, float tax) {
		super(name, price, tax);
	}

	@Override
	double getCost() {
		return 2;
	}
	
	
}
class DessertShop{
	
}