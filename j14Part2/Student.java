package j14Part2;

import java.io.Serializable;

public class Student implements Serializable {

	//Create a Student class with regno, name and marks in 5 subjects. It should be serializable. It should
	//contain constructors, getters and setters.
		
	private int regNo ;
	
	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public void setSubjects(int[] subjects) {
		this.subjects = subjects;
	}

	private String name ;
	
	private int[] subjects;
	
	public int[] getSubjects() {
		return subjects;
	}

	public Student(int regNo, String name, int[] subjects) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.subjects = subjects;
	}
	
}
