package deserialization;

import java.io.Serializable;

public class Employee implements Serializable{

	public Employee(int id, String employee, int salary) {
		super();
		this.id = id;
		this.name = employee;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int id;
	
	public String name;
	
	public int salary;
	

	
	
}
