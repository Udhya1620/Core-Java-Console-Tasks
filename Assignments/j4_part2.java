package Assignments;

import java.util.Scanner;

public class j4_part2 {
    public static void main(String[] args) {
        

    	int a[] = {2,3,6,7,5,1};
    	
    	for(int i = 0; i<a.length; i++) {
    		
    		for(int j = i+1; j<a.length; j++) {
    			
    			if(a[i]+a[j] == 9) {
    				System.out.println("The pairs are : "+a[i]+","+a[j]);
    			}
    		}
    	}
    	
    	System.out.println();
    	
    	
    	//task 2 :

    	int ab[][] = {{2,3,4},{6,3,5},{4,3,2}};
    	
    	int temp[][] = new int[3][3];
    	
    	//printing the matrix	
    	System.out.println("Matrix before transpose : ");
        for(int i=0; i<3; i++) {
        	for(int j=0;j<3;j++) {
        		System.out.print(ab[i][j]+" ");
        	}
        	System.out.println();
        }
        
    	//transposing the matrix
		for(int i = 0 ;i<3; i++) {
			for(int j = 0; j<3; j++) {
				temp[j][i]=ab[i][j];
			}
		}
		
		
		System.out.println("Matrix after transpose : ");
	       for(int i=0; i<3; i++) {
	        	for(int j=0;j<3;j++) {
	        		System.out.print(temp[i][j]+" ");
	        	}
	        	System.out.println();
	        }
	       System.out.println();
	       
	       
	     
	       
	       //task 3 
    	//rotate array to left
	       
    	 int ac[]= new int[5];
 	    
   	  Scanner scan = new Scanner(System.in);
         
        System.out.println("Rotate array to left");
          
          System.out.println("Enter "+ac.length+" values for an array : "); 
          
        for(int i = 0; i<ac.length; i++) {
   	   ac[i] = scan.nextInt();
      }
    	
        int temp1 = ac[0];
        
	   for(int i=0;i<ac.length-1;i++) {
				ac[i] = ac[i+1];
			}
   
	    ac[ac.length-1] = temp1;
	    
	    System.out.println("The rotated value are : ");
       for(int i=0; i<ac.length; i++) {
    	
    	System.out.print(ac[i]+" ");
    }
       System.out.println();
       System.out.println();
       
       
    	
    	//task 4 : rotate array to right
    	
	    int al[]= new int[5];
	    
      
     System.out.println("Rotate array to right");
     
       System.out.println("Enter "+al.length+" values for an array : "); 
      
       for(int i = 0; i<al.length; i++) {
    	   al[i] = scan.nextInt();
       }
       scan.close();
       int temp2 = al[al.length-1];
       
      
	   for(int i=al.length-1; i>0; i--) {
				al[i] = al[i-1];
			}
   
	 
	    al[0] = temp2;
         for(int i=0; i<al.length; i++) {
     	System.out.print(al[i]+" ");
     }
  
    
        
    }   
}



































