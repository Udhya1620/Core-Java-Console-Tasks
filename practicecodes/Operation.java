package practicecodes;

public class Operation{
	
	public void addition(int a , int b)
	{
	  int sum = a + b ;
	  System.out.println(sum);
	}
	 
	 public void subtraction(int a , int b)
	{
	  int sub = a - b ;
	  System.out.println(sub);
	}
	 
	public void multiply(int a , int b)
	{
	  int mul = a * b ;
	  System.out.println(mul);
	}
	
	public void division(int a, int b) {
//		while (b == 0) {
			if (b == 0) {
				System.out.println("The Number cannot be divisible by zero");
			} else {
				int div = a / b;

				System.out.println(div);
			}
		}
	
	public void modulus(int a , int b)
	{
	  int mod = a % b ;
	  System.out.println(mod);
	}
//	}
}
