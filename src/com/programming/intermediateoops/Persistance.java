package com.programming.intermediateoops;

public abstract class Persistance {
	abstract void persist();
	

}
class FilePersistance extends Persistance{

	@Override
	void persist() {
		System.out.println("Inside file persistance");
		
	}
	
}
class DataBasePersistance extends Persistance{

	@Override
	void persist() {
		System.out.println("inside Database persistance");
		
	}
	
}
