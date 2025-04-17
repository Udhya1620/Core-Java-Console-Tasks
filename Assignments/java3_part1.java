package Assignments;
import java.util.*;
public class java3_part1{
public static void main(String args[]) {
      System.out.println("Task 1");
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter the first number (a) : ");
      int a = scan.nextInt();
      System.out.println("Enter the second number (b) : ");
      int b = scan.nextInt();
      System.out.println("Enter the third number (c) : ");
      int c = scan.nextInt();
      
      if(a > b && a > c ) {
    	  System.out.println("a is the largest number");
      }
      else if(b > a && b > c) {
    	  System.out.println("b is the largest number");
      }
      
      else {
    	  System.out.println("c is the largest number");
      }
      
      System.out.println("");
      System.out.println("");
      
      
      
      System.out.println("Task 2");
      System.out.println("Enter a single digit number");
      int num = scan.nextInt();
      
      switch (num) {
      
      case 1:
    	 System.out.println("One"); 
    	 break;
      case 2:
    	  System.out.println("Two");
    	  break;
    	  
      case 3:
          System.out.println("Three");
          break;
          
      case 4:
    	  System.out.println("Four");
    	  break;
      case 5:
    	  System.out.println("Five");
    	  break;
      case 6:
    	  System.out.println("Six");
    	  break;
      case 7:
    	  System.out.println("Seven");
    	  break;
      case 8:
    	  System.out.println("Eight");
    	  break;
      case 9:
    	  System.out.println("Nine");
    	  break;
      default :
    	  System.out.println("Invalid number");
      }
      
      System.out.println("");
      System.out.println("");
      
      
      
      System.out.println("Task 3");
      System.out.println("Enter the units consumed to find charges : ");
      double units = scan.nextInt();
      scan.close();
      if(units <= 100) {
    	  System.out.println("Free of cost");
      }
      else if(units > 100 && units <= 200) {
    	  System.out.println("Units used = "+units);
    	  System.out.println("Charges to be paid = "+units*0.80);
      }
      else if(units > 200 && units <= 300) {
    	  System.out.println("Units used = "+units);
    	  System.out.println("Charges to be paid = "+units*1.00);
      }
      else if(units > 300 && units <= 400) {
    	  System.out.println("Units used = "+units);
    	  System.out.println("Charges to be paid = "+units*1.20);
      }
      else if(units > 400) {
    	  System.out.println("Units used = "+units);
    	  System.out.println("Charges to be paid = "+units*2.00);
      }
      
      
      }
}
