
package problems_for_practice;
import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception{
   
	InvalidAgeException(int age){
		super();
	}	
}
class AgeValidator{
	void checkAge(int age){
		
		try {
			if(age<0 || age>150) {
				throw new InvalidAgeException(age);
			}
		}
			catch(InvalidAgeException in){
				
				System.out.println("Invalid age");
			}
		}
		
	}
	

public class ExceptionPractice2 {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		AgeValidator a1 = new AgeValidator();
		a1.checkAge(a);
		
		
	}

}
