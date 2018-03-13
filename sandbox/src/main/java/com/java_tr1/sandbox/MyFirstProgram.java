package com.java_tr1.sandbox;

public class MyFirstProgram {

	public static void main(String[] args){
		System.out.println("Hello, world!");

		Square s = new Square(5);
		System.out.println("Square area with side " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4, 5);
		System.out.println("Rectangle area with sides " + r.a + " " + r.b + " = "+ r.area());
	}



}