package J8part2;

public class Circle {
	
	 int radius;
	
	 Circle(int radius) 
	 {
     this.radius = radius;	
	  }
	 
	public double area() {
			return 3.14 * radius * radius;
	  }

	public double perimeter() {
			return 2 * 3.14 * radius;
	  }

}
