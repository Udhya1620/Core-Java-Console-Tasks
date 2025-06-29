package encapsulaton;

public class Employee {

//	4. Create a class named Employee with public variables ID, name,
//	department and salary. Write separate methods to assign the values and to
//	print the values.
	
	public int ID;
	
	public String name;
	
	public String department;
	
	public int salary;
	
	public String id(int id) {
	    this.ID = id;
		return "The id of a employee is : "+this.ID;
	}
   
	
	public String name(String name) {
	    this.name = name;
		return "The name of a employee is : "+this.name;
	}
	
	
	public String department(String department) {
	    this.department = department;
		return "The department of a employee is : "+this.department;
	}
	
	
	public String salary(int salary) {
	    this.salary = salary;
		return "The salary of a employee is : "+this.salary;
	}
	
	
}
