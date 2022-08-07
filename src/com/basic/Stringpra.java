package com.basic;

public class Stringpra {

	public static void main(String[] args) {

		String s = "Vinoth Kumar";

		int le = s.length();
		System.out.println(le);

		boolean eq = s.equals("Vinoth Kumar");

		System.out.println(eq);

		boolean eqi = s.equalsIgnoreCase("Vinoth kumar");
		System.out.println(eqi);

		String up = s.toUpperCase();
		System.out.println(up);

		String lw = s.toLowerCase();
		System.out.println(lw);

		boolean st = s.startsWith("Vinoth Kumar");
		System.out.println(st);

		boolean ed = s.endsWith("Vinoth Kumar");

		System.out.println(ed);

		boolean con = s.contains("K");
		System.out.println(con);

		int in = s.indexOf("t");

		System.out.println(in);

		int la = s.lastIndexOf("r");
		System.out.println(la);
String re = s.replace("Kumar", "kum");
System.out.println(re);
		
		
	}

}
