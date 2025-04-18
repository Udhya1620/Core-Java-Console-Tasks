package problems_for_practice;

class Animal{
	 Animal(String name){
		System.out.println("Animal");
	}
	 
	 void makeSound() {
		 System.out.println("animal makes sound ");
	 }
}
public class array 
{
	int marks;
	String name;
	
	array(String a , int b ){
		name = a ;
		marks = b;
		}
  public static void main (String[]args) {
	  array h = new array("bello",89);
	 System.out.print(h.marks+h.name);
   }
  }

