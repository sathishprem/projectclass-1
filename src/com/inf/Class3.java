package com.inf;

public class Class3 implements Class1,Class2 {

	@Override
	public void method4() {
		System.out.println("12");
		
	}

	@Override
	public void method5() {
		System.out.println("34");
		
	}

	@Override
	public void method1() {
		System.out.println("45");
		
	}

	@Override
	public void method2() {
		System.out.println("56");
		
	}

	@Override
	public void method3() {
		System.out.println("67");
		
	}
	public static void main(String[] args) {
		Class3 b=new Class3();
		b.method4();
		b.method5();
		b.method1();
		b.method2();
		b.method3();
	}

}
