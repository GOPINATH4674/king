package com.polymorphism;

public class Overriding_Demo2 extends Overriding_Demo1{
	
	@Override
	public void property(String pro) {
		super.property(pro);
		
		System.out.println("Child property :" + pro);
	}
	
	public static void main(String[] args) {
		
		Overriding_Demo2 k = new Overriding_Demo2();
		
		k.property("Chips");
		
	}

}
