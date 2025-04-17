package J10part1;

public abstract class Shape {
	
 protected String shape;
	
 abstract void calculateArea();
 
 public void displayShapeName(String shape) {
	 System.out.println("The name of the Shape is : "+shape);
 }
 
}
