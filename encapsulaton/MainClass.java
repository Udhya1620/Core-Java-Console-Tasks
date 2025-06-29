package encapsulaton;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
        
		Calculator cal = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value for A : ");
		int a = scan.nextInt();
		System.out.println("Enter the value for B : ");
		int b = scan.nextInt();
		
		scan.close();
		
		System.out.println("Addition of "+a+" and "+b+" is : "+cal.sum(a , b));
		System.out.println("Subtraction of "+a+" and "+b+" is : "+cal.sub(a , b));
		System.out.println("Product of "+a+" and "+b+" is : "+cal.product(a , b));
		System.out.println("Quotient of "+a+" and "+b+" is : "+cal.quotient(a , b));	
		System.out.println();
		
		//task 2 :
		
        Circle circle = new Circle();
		
		System.out.println("Circle radius : " + circle.radius);
		circle.radius(7);

		System.out.println("Circle radius : " + circle.radius);
		System.out.println("Circle area : " + circle.area());
		System.out.println("Circle perimeter : " + circle.perimeter());
		System.out.println();
		
		// task 3 :
		
		Banking bank = new Banking();

		bank.accountBalance = 2000;
        System.out.println("Account Balance : "+bank.accountBalance);
        
		System.out.println(bank.withDraw(200));

		System.out.println(bank.deposit(400));
		System.out.println();

		// task 4 :

		Employee employee = new Employee();

		System.out.println(employee.id(8934297));
		System.out.println(employee.name("Udhya"));
		System.out.println(employee.department("B.tech-IT"));
		System.out.println(employee.salary(2000000));

	}

}
