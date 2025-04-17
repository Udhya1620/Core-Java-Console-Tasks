package J11part2;

public class J11part2 {

	public static void main(String[] args) {

		Iphone14 iphone14 = new Iphone14();
		iphone14.getDetails(6.1, "A15", "Dual");
		iphone14.displayFeatures();

		System.out.println("---------------");

		Iphone15 iphone15 = new Iphone15();
		iphone15.getDetails(6.7, "A16", "Triple");
		iphone15.displayFeatures();

	}

}
