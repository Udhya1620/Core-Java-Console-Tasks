package practicecodes;

import java.util.Scanner;

class DivisionExample{
	void divideNumbers(int a, int b){
	
		try {
			int result = a/b;
			 if(b==0)
			 {
			throw new ArithmeticException();
			}
			 else {
				 System.out.println(result);
			 }
		}
		catch(ArithmeticException e){
			System.out.print("Cannot be divided by Zero");	
		}
	}
}
	
	public class throwExercise{
	
	public static void main(String[] args) {
		DivisionExample d1 = new DivisionExample();
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		d1.divideNumbers(a, b);
		
		
	}
	
}