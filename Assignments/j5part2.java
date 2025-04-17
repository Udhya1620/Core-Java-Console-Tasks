package Assignments;

import java.util.Scanner;

public class j5part2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Username : ");
		String username = scan.next();
		System.out.println("Enter password : ");
		String password = scan.next();
		if(username.toLowerCase().equals("accord") && password.toLowerCase().equals("java")) {
			System.out.println("Your entered password was correct");
			System.out.println("Welcome to our website");
		}
		else{
			System.out.println("Your Entered credentials was incorrect");
			System.out.println("Please try again");
			
		}
		
       System.out.println();
      
     
       
         System.out.println("Enter a word to check it is a palindrome or not : ");
         String  s2 = scan.next();
        // scan.nextLine(); 
         
         int left = 0;
         int right = s2.length()-1;
         boolean palindrome = true;
         while(left<right)
          {
         if(s2.toLowerCase().charAt(right)==s2.toLowerCase().charAt(left)) {
        	left++;
        	right--;
         }
         else {
        	 palindrome = false;
        	 break;
             }
          }
         if(palindrome) {
        	 System.out.println("The entered string "+s2+" is a palindrome");
         }
         else {
        	 System.out.println("The entered string "+s2+" is not a palindrome");
         }
        
         System.out.println();
         
         
         
         //3. Read a sentence as input and remove vowels.
        System.out.print("Enter a string to remove vowels : ");
        String s3 = scan.next();
        scan.nextLine(); 
        String res = "";
        
        for(int i = 0; i<s3.length();i++) {
        char t = Character.toLowerCase(s3.charAt(i));
        if(t != 'a'&& t != 'e'&& t != 'i'&& t != 'o'&& t != 'u' ) {
        	res =res+s3.charAt(i);
         }
        }
        System.out.println("The string with removed vowels : "+res);
        System.out.println();
        
        
      //task4 : Read a string as input and replace all vowels with ##.
        
        System.out.println("Enter a sentence to convert vowels letters to ##");
        String s4 = scan.nextLine();
        scan.close();
        
        System.out.print("The changed words are : ");
        for(int i = 0 ; i<s4.length(); i++) {
        char t = Character.toLowerCase(s4.charAt(i));
   
        if(t== 'a' || t=='e'  || t=='i'  || t=='o' || t=='u') {
        	System.out.print("##");
         }
        else {
        	System.out.print(t);
          }
        }
        System.out.println("\n");
    
        
        
        //task 5 : Read a sentence and split the words using predefined function.
        System.out.println("Task 5 : ");
        String s5 = "Read a sentence and split the words ";	
   
        String[] words = s5.split(" ");
        
        for(int i = 0; i<s4.length(); i++) {
        	System.out.println(words[i]);
         }
      }
   }




