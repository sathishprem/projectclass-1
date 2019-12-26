package com.polm;

public class Class1 extends Details {
	public void petrol() {
System.out.println("49");
	}
	public void diesel() {
System.out.println("54");
	}
	public static void main(String[] args) {
		Class1 v=new Class1();
		v.javaClass();
		v.javaClass(10);
		v.javaClass(23, 34);
		v.javaClass("satiz", 67);
		v.diesel();
		v.petrol();
		
	}
}
