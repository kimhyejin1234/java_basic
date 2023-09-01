package oop.overloading_self;

public class Calculator {
	
	
	public int calcRectArea(int a) {
		return a*a;
	}
	public int calcRectArea(int a , int b) {
		return a+b;
	}

	public double calcRectArea(int a , int b , int c) {
		return (a+b)*c/2;
	}
}
