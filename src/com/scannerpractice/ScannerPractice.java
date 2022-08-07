package com.scannerpractice;

import java.util.Scanner;

public class ScannerPractice {
	
	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Name"); 
         String name = sc.nextLine();
         System.out.println(name);
         
         
         System.out.println("Enter Your half name");
         String Half = sc.next();
         System.out.println(Half);
         
         System.out.println("Enter your age");
         int age = sc.nextInt();
         System.out.println(age);
         
         System.out.println("Enter The Decimal Value");
         
         float f = sc.nextFloat();
         System.out.println(f);


	}
}
