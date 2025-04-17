package Patterns;

public class Alphabets {

	public static void main(String[] args) {
	
		
		cLetter();
		
	//	uLetter();
		
	//	ifelse();
		
	}

	private static void uLetter() {
		
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
	        
			}
		}
		
	}

	private static void cLetter() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				
				if ((i == 7|| i == 1) && (j!=7))
				{
//					if(j!=7) {
				System.out.print("* ");
					//}
				}
				
				else if(j==7 || j==1){
					System.out.print("* ");	
				}
				
				else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

	private static void ifelse()
	{
		int i = 0;
		int j = 1; 
		int k = 2;
		
		if(i>j) {
			System.out.println("i is greater");
		}
		else if(k>j) {
			System.out.println("K is greater");
		}
	}
}
