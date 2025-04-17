package Assignments;

import java.util.Scanner;

public class j5part1 {

	public static void main(String[] args) {
		
		System.out.println("task 1 : ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scan.next();
	    char c[] = new char[s.length()];
		
	    for(int i=0;i<s.length(); i++) {
	    	c[i]=s.charAt(i);
	    }
		for(int i=0;i<s.length();i++)
	    System.out.print(c[i]+" ");
	    System.out.println();
	    System.out.println();
	    
	    
	    
	    System.out.println("task 2 : ");
	    //Read a string as input and change every word first letter to uppercase.
	    //Each word will be separated by exactly one space only.
	    
	    String s2 = "this is the second task";
	    
	    char[] c2 = new char[s2.length()];
	    
	    for(int i=0; i<s2.length(); i++) {
	    	c2[i]=s2.charAt(i);
	    }
	    
	    for(int i=0; i<s2.length(); i++) {
	    	if(i==0) {
	    		c2[i] = Character.toUpperCase(c2[i]);
	    	}
	    	else if(c2[i]==' ') {
	    		c2[i+1] = Character.toUpperCase(c2[i+1]);
	    	}
	    	  
	    }
	    
	    for(int i=0; i<s2.length(); i++) {
	    	System.out.print(c2[i]);
	    }   
	    
	    System.out.println();
	    System.out.println();
	    
	    
	    
	    System.out.println("Task 3 :");
	    //3. Read a string as input and change every 4th character to underscore _
	    
	    String s3 = "this is the third task";
	    char[] c3 = new char[s3.length()];
	    
	    for(int i=0; i<s3.length(); i++) {
	    	c3[i]=s3.charAt(i);
	    }
	    
	    for(int i=0; i<s3.length(); i++) {
	    	 if(i%4 == 0) {
	    		c3[i]='_';
	    	}
	    }
	    
	    for(int i=0; i<s3.length(); i++) {
	    	System.out.print(c3[i]);
	    }
	    System.out.println();
	    System.out.println();
	    
	    
	    
	    //4. Read n number of strings as input and arrange in alphabetical order.
	    
	    System.out.println("Enter no of time to give string as input");
	   
	    int n = scan.nextInt();
	    scan.nextLine();
	    String s4[] = new String[n];
	    
	    for(int i = 0; i<n; i++) {
	    	s4[i]= scan.nextLine();
	    }
	   
	    
	    for(int i = 0 ; i< s4.length; i++) {
	    	for(int j = i+1; j<s4.length; j++) {
	    		if(s4[i].compareTo(s4[j])>0) {
	    			String temp = s4[i];
	    			s4[i] = s4[j];
	    			s4[j] = temp;
	    		}
	    	}
	    }
	    
	    
	    for(int i=0; i<s4.length; i++) {
	    	System.out.println(s4[i]);
	    }
	      System.out.println();
	      
	    
	    
	   // 5. Given a string that contains uppercase letters as well as lower case
	    //letters. The task is to move all uppercase characters at the end of
//	    the String. The uppercase characters must be in the same order as
//	    in the original string.
//
//	    Input : &quot;heLLGFg&quot;
//	    Output : &quot;hegLLGF&quot;
//
//	    Input : &quot;Hello&quot;
//	    Output : &quot;elloH&quot;

	    System.out.println("Enter the words combined with capital and small letters : ");
	    
	    String s5 =  scan.next();
	    
	    scan.close();
	    
	    StringBuilder string1 = new StringBuilder();
	    
	    StringBuilder string2 = new StringBuilder();
	    
	    for(int i = 0; i<s5.length();i++) {
	    if(s5.charAt(i)== s5.toUpperCase().charAt(i)) {
	    	string1.append(s5.charAt(i));
	     }
	    else {
	    	string2.append(s5.charAt(i));
	     }
	    }
	    
	    System.out.println(string2.append(string1));
	}

}
