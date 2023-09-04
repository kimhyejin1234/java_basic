package oop.abs.quiz;

public class RectTearch extends ShapeTeacher{
	private int side;
	private int width;
	private int height;
	public RectTearch(String name , int side) {
		super(name);
		this.side = side;
		// TODO Auto-generated constructor stub
	}
	
	public RectTearch (String name , int width , int height) {
		super(name);
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		if(side != 0) {
			return side * side;
		} else {
			return width * height;
		}
	}

	public final int getSide() {
		return side;
	}

	public final void setSide(int side) {
		this.side = side;
	}

	public final int getWidth() {
		return width;
	}

	public final void setWidth(int width) {
		this.width = width;
	}

	public final int getHeight() {
		return height;
	}

	public final void setHeight(int height) {
		this.height = height;
	}
	
	
	

}
