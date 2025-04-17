package Patterns;

public class Patterns {

	public static void main(String[] args) {
		
		
		codeE();
		codeL();
	
	}

	private static void codeL() {
		
		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=i-1; j++) {
				System.out.print(" ");
			}
		
				for(int j = 5; j>=i; j--) {
					System.out.print("*");
				}	
				System.out.println();
				}
		
		
			System.out.println();
		
	}

	private static void codeK() {
		for(int i = 5; i>=1; i--) {
			
			for(int j = 1; j<=i-1; j++) {
				System.out.print(" ");
			}
				for(int j = 5; j>=i; j--) {
					System.out.print("*");
				}	
				System.out.println();
				}
		
		
			System.out.println();
			
		
	}

	private static void codeJ() {
		for(int i = 1; i<=5;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i<=4; i++) {
			
			for(int j = i; j<=4; j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		System.out.println();
		
	}

	private static void codeI() {
for(int i = 5; i>=1; i--) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			}
		System.out.println();
		
	}

	private static void codeH() {
		  //code h : 
			for(int i = 5; i>=1; i--) {
				
				for(int j = 1; j<=i; j++) {
					System.out.print(i+" ");
				}
				System.out.println();
				}
			System.out.println();
		
	}

	private static void codeG() {
for(int i = 1; i<=5; i++) {
			
			for(int j = i; j<=5; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			}
		System.out.println();
		
	}

	private static void codeF() {
		int k = 1;
		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
			}
		
		System.out.println();
		
		
	}

	private static void codeD() {
for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			}
		
		
		System.out.println();
				
	}

	private static void codeC() {
for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			}
		
		
		System.out.println();
		
	}

	private static void codeB() {
		
		for(int i = 1; i<=5; i++) {
				
				for(int j = 1; j<=5; j++) {
					System.out.print(i+" ");
				}
				System.out.println();
				}
			
		
	}

	private static void codeA() {
		
         for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=5; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			}
		
	}

	private static void codeE() {

		int printValue = 1;
		for(int i = 1; i<=5; i++) {
			
			printValue = i%2 == 0 ? 0 : 1;

			for(int j = 1; j<=i; j++) {
				// if((i+j)%2 == 0) {
				// 	System.out.print(1+" ");
				// }
				// else {
				// 	System.out.print(0+" ");
				// }
               System.out.print(printValue+" ");
			   printValue = (printValue == 0) ? 1 : 0;

			}
			System.out.println();
			}
	}

}
