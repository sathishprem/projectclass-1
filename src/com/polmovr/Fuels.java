package com.polmovr;

public class Fuels extends Employee {
	public void petrol() {
		System.out.println("49");
	}
	public void diesel() {
		System.out.println("32");
	}
	@Override
	public void empId(String a) {
		super.empId(a);
	}
	
	
	@Override
	public void empName() {
		super.empName();
	}
	public static void main(String[] args) {
		Fuels z=new Fuels();
		z.petrol();
		z.diesel();
		z.empId("kumar");
		z.empName();
	}
}
