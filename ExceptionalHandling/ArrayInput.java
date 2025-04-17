package ExceptionalHandling;
import java.util.Scanner;
public class ArrayInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
		System.out.println("Enter the size of array in number");
		int n = scan.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			if(i == 1) {
				System.out.println("Enter "+i+"st index value");
			}
		   else if(i == 2) {
				System.out.println("Enter "+i+"nd index value");
			}
			else if(i == 3) {
				System.out.println("Enter "+i+"rd index value");
			}
			else{System.out.println("Enter "+i+"th index value");}
			a[i] = scan.nextInt();
		}

		System.out.println("enter a index value "
				+ "to find the divisor and quotient");
		int index1 = scan.nextInt();
		System.out.println("enter another index value "
				+ "to find the divisor and quotient");
		int index2 = scan.nextInt();
        System.out.println("Quotient num : "+(a[index1] / a[index2] ));
        System.out.println("Remainder num : "+(a[index1] % a[index2] ));
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Index number is out of bound");
		}
		catch(ArithmeticException e) {
			System.out.println("Avoiding dividing by zero");
		}
		
		scan.close();
	}
}
