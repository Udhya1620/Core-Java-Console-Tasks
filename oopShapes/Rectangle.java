package oopShapes;

public class Rectangle extends Shape{

	 public int length;
	 public int width;
	 
	public Rectangle(int length, int width){
		 this.length = length;
		 this.width = width;
	 }
	

	@Override
	public void calculateArea() {
		int rectanglearea = length*width;
		System.out.println("Area of a rectangle : "+rectanglearea);
	}

}
