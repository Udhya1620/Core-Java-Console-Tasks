package practicecodes;
import java.util.*;
public class minical {

	public static void main(String[] args) {
		
	 int a,b;
	 Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter the first number :");
	a = scanner.nextInt();
	System.out.println("Please Enter the second number : ");
	b=scanner.nextInt();
     char operator;
     System.out.println("Enter the operator -,+,*,/ or % : ");
     operator = scanner.next().charAt(0);
     
     switch(operator){
    	 case '+':
    		System.out.println(a + " + " + b + " = " + (a+b));
    		break;
    		
    	 case '-':
     		System.out.println(a + " - " + b + " = " + (a-b));
     		break;
     		
    	 case '*':
     		System.out.println(a + " * " + b + " = " + (a*b));
     		break;
     		
    	 case '/':
     		System.out.println(a + " / " + b + " = " + (a/b));
     		break;
     		
    	 case '%':
     		System.out.println(a + " % " + b + " = " + (a%b));
     		break;
     		
     		default:
     			System.out.println("You have entered a incorrect operator or incorrect integer");
     }
     System.out.println(scanner);
	
	}
}
