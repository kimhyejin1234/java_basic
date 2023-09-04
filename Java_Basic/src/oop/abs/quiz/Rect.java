package oop.abs.quiz;

public class Rect extends Shape{

	public Rect(String name,int lenght) {
		super(name,lenght);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return lenght * lenght;
		
	}

	

}
