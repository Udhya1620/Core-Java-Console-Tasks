package J10part1;

public class J10part1 {

	public static void main(String[] args) {
		
		Circle circle = new Circle(90);
		circle.displayShapeName("Circle");
	    circle.calculateArea();
	    
	    System.out.println("--------------------------");
		
		Rectangle rectangle = new Rectangle(90, 80);
		rectangle.displayShapeName("Reactangle");
	    rectangle.calculateArea();

	}

}
