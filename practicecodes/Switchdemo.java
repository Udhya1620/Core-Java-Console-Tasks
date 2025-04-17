package practicecodes;
import java.util.Scanner;
public class Switchdemo {

	public static void main(String[] args) {
		
int a,b;

Scanner scan = new Scanner(System.in);
System.out.println("Enter First Number: ");
a = scan.nextInt();
System.out.println("Enter Second Number: ");
b = scan.nextInt();
char operator;
System.out.println("Enter the operator +,-,*,/ or % : ");
operator = scan.next().charAt(0);
scan.close();

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
		System.out.println(" Your have entereda a incorrect operator ");
}

	}

}
