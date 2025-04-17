package J10part1;

public class Circle extends Shape{

  public int radius;
  
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void calculateArea() {
		int circlearea = (22/7)*radius*radius;
		System.out.println("Area of circle is : "+circlearea);
	}

}
