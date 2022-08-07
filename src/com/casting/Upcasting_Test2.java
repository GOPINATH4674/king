package com.casting;

public class Upcasting_Test2 extends Upcasting_Test1{
	
public void mul() {
		
		System.out.println("Multiplication");

	}

public static void main(String[] args) {
	
	Upcasting_Test1 u = new Upcasting_Test2();
			
			u.add();
			u.sub();
//			u.mul();
			
}

}
