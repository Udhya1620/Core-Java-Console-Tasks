package J8part2;

public class J8part2 {

	public static void main(String[] args) {
		
	Circle c = new Circle(5);
	System.out.println("Radius of circle : "+c.radius);
	System.out.println("Area : "+c.area());
	System.out.println("Perimeter : "+c.perimeter());
	System.out.println();
	
	//task 2 : 
	
	@SuppressWarnings("unused")
	Welcome welcome = new Welcome();
	
	@SuppressWarnings("unused")
	Welcome wel = new Welcome("user");
	System.out.println();
	
	//task 3 : 
	
	Banking bank = new Banking(2000);
	
	System.out.println("Account Balance : "+bank.accountBalance);
	System.out.println(bank.withDraw(300));
	System.out.println(bank.deposit(500));

	}

}
