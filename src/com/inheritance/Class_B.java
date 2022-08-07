package com.inheritance;

public class Class_B extends Class_A {
	
	public void mul() {
		
		System.out.println("Multiplication");

	}
	
	public static void main(String[] args) {
		Class_B n = new Class_B();
		
		n.add();
		n.sub();
		n.mul();
	}

}
