package com.abstraction;

public class Interface3 implements Interface1, Interface2 {

	@Override
	public void person3() {
		
		System.out.println("gopi");
	}

	@Override
	public void person4() {
		
		System.out.println("Dhoni");
		
	}

	@Override
	public void person1() {
		
		System.out.println("Raina");
		
	}

	@Override
	public void person2() {
		
		System.out.println("Virat");
		
	}
	
	public static void main(String[] args) {
		Interface3 i = new Interface3();
		
		i.person1();
		i.person2();
		i.person3();
		i.person4();
		
		
	}

}
