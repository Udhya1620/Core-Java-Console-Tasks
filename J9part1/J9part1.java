package J9part1;

public class J9part1 {
  
	public static void main (String args[]) {
		
		Engineer engineer = new Engineer("user",80384,2000000,"IT");
		engineer.displayDetails();
		System.out.println();
		
		Employee mg = new Manager("secondUser",80304,2000000000,"btech");
		mg.displayDetails();
		
	}
	
}



