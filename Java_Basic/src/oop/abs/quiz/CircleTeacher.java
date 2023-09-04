package oop.abs.quiz;

public class CircleTeacher extends ShapeTeacher {
	private int radius;
	public CircleTeacher(String name , int radius) {
		super(name);
		this.radius = radius;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius * radius * Math.PI;
	}

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}


}
