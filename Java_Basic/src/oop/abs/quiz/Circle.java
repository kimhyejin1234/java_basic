package oop.abs.quiz;

public class Circle extends Shape {

	public Circle(String name , int lenght) {
		super(name,lenght);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return lenght * lenght * Math.PI;
	}

	

}
