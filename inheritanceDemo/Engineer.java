package inheritanceDemo;

public class Engineer extends Employee {
	public String specialization;

	public Engineer(String name, int id, int salary, String specialization) {
		super(name, id, salary);
		this.specialization = specialization;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Specialization : " + specialization);
	}

}
