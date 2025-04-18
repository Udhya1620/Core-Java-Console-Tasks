package problems_for_practice;

public class MethodOverloading {
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
    MethodOverloading fin = new MethodOverloading();
	  System.out.println(fin.add(1.0f,2));
	
   }  
   
}
