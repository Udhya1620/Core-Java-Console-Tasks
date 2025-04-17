package J8part1;

public class Circle {

	public int radius;

	public void radius(int radiusInput) {
		this.radius = radiusInput;
	}

	public double area() {
		return 3.14 * radius * radius;
	}

	public double perimeter() {
		return 2 * 3.14 * radius;
	}

}
