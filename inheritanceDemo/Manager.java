package inheritanceDemo;

public class Manager extends Employee {
 public String department;
 
   public Manager(String name, int id, int salary, String dep)
   {
	super(name, id, salary);
	this.department = dep;
 }
   
   public void displayDetails() {
	   super.displayDetails();
	   System.out.println("Department is : "+department);
   }
}
