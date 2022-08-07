package com.polymorphism;

public class Overloading {
	
	private void student(String name) {
		
		System.out.println("Student Name : " + name);
		

	}
	
	private void student(int id) {
		
		System.out.println("Student Id:" + id);
		

	}
	private void student(String dept, char sec) {
		
		System.out.println("Student Department:" + dept);
		System.out.println("Student Section:" + sec);
		

	}
	private void student(double mark) {
		
		System.out.println("Student Mark:" + mark);
		

	}
	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		
		o.student("Gopinath");
		o.student(67);
		o.student("ECE", 'K');
		o.student(78.7d);
		
	}

}
