package com.abstraction;

public class Abstract2 extends Abstract1 {

	@Override
	public void password() {

		System.out.println("Tesrvh576");

	}

	public static void main(String[] args) {
		
		Abstract2 a = new Abstract2();
		
		a.mailId();
		a.userName();
		a.password();
		
	}

}


