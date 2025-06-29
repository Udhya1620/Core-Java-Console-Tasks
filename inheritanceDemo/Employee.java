package inheritanceDemo;

public class Employee {
	
	public String name;
	
	public int employeeId;
	
	public int salary;
	
	Employee(String name, int id, int salary) {
	    this.name = name;
	    this.employeeId = id;
	    this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Id : "+employeeId);
		System.out.println("Salary : "+salary);		
	}
	

	
}
