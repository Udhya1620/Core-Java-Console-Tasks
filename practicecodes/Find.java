package practicecodes;

public class Find {
    int add(int a, int b ) {
    	return a + b;
   }
    int add(int a ) {
    	return a ;
   }
    float add( float a , float b ) {
    	return a+b ;
   }
 
    
    
   public static void main(String[]args) {
	   Find fin = new Find();
	  System.out.println(fin.add(1.0f,2));
	
   }  
   int add(int a, int b, int c) {
   	return a + b + c ;
  }
   
}
