package practicecodes;

import java.util.*;

public class leapyearornot {
	
  @SuppressWarnings("resource")
public static void main (String[]args) {
	  
	  int year ;
	  System.out.println("enter the year : ");
	   Scanner scanner = new Scanner (System.in);
	   year = scanner.nextInt();

	    if (year % 400 == 0) {
	      System.out.println(year + " is a leap year.");
	    } 
	    else if (year % 100 == 0) {
	      System.out.println(year + " is not a leap year.");
	    } 
	    else if (year % 4 == 0) {
	      System.out.println(year + " is a leap year.");
	    } 
	    else {
	      System.out.println(year + " is not a leap year.");
	    }
	  
  }
}
