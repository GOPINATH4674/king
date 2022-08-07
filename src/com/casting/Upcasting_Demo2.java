package com.casting;

public class Upcasting_Demo2 extends Upcasting_Demo1{
	
	@Override
	public void property(String pro) {
		super.property(pro);
		
		System.out.println("Child Property : " + pro);
	}
	
	public static void main(String[] args) {
		
		Upcasting_Demo1 c = new Upcasting_Demo2();
		
		c.property("Gopi");
		
	}

}
 