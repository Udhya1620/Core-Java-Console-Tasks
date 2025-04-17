package practicecodes;
import java.util.ArrayList;
public class arithmeticOperators {

	public static void main(String[] args) {
	
//		int a = 11, b = 2,c;
//		
//		a++;
//		c = a++;
//		System.out.println(a + c );
//+		
//		int a = 3,b = 4;
//		
//		int c = a & b;
//		System.out.println("a&b " + c );
//		c = a | b;
//		System.out.println("a|b is " + c);
//		c =  ~a;
//		System.out.println("~a is " + c);
//		
//		int mark;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		mark = scanner.nextInt();
//		
//		if(mark >= 90)
//			System.out.println("Grade A");
//		else if (mark >= 80)
//			System.out.println("Grade B");
//		else if (mark >= 70)
//			System.out.println("Grade C");
//		else if (mark >= 60)
//			System.out.println("Grade D");
//		else
//			System.out.println("Grade E ");
//		System.out.println(scanner);
//		
//
//        
//		int day = 2;
//      
//      Scanner scanner = new Scanner(System.in);
//      System.out.println("Enter a number: ");
//      day = scanner.nextInt();
//      
//      switch(day)
//      {
//          case 1:
//              System.out.println("Monday");
//              break;
//          case 2:
//              System.out.println("Tuesday");
//              break;
//          case 3:
//              System.out.println("Wednesday");
//              break;
//          case 4:
//              System.out.println("Thursday");
//              break;
//          case 5:
//              System.out.println("Friday");
//              break;
//          default:
//              System.out.println("Weekend");
//              break;
		
		
		

//        char ch;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a character: ");
//        ch = scanner.next().charAt(0);
//
//        switch (ch) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println(ch + " is vowel");
//                break;
//            default:
//                System.out.println(ch + " is consonant");
//        }
		
		
		
		
//  for a given n, find the nearest number divisible by 10 that is less than or equal to n 
//		int n;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		n = scanner.nextInt();
//		
//		while(true) {
//			if(n%10==0) {
//				System.out.println(n);
//				break;
//				
//			}
//			n--;
//		}
			
		
		
		
		
		
//		double n,sum = 0.0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the number. Enter a negative number to stop:\n ");
//
//		
//		while(true) {
//			n = scanner.nextDouble();
//			if(n < 0.0) {
//				break;
//				
//			}
//			sum += n;
//			
//		}
//		
//		System.out.println("Sum is " + sum);
//		
		
		
//		f:                         //labels
//		for (int i=1;i<=6;i++) {
//			innerLoop:                  //labels
//			for(int j=1;j<=5;j++) {
//				if(i==3 && j==3)
//					break f; 
//				System.out.print(" 9 ");	
//			}
//			System.out.print("\n");
//		}
		
	
//	 for (int i=1; i<=10; i++) {
//		 if(i==7)
//			 continue;
//		 System.out.println(i);
//	 }
//
//		int[] a = {7,8,9,3,2,2,4,2,4,2,8};
//	     System.out.println(a[3]);
//		
//		int[] a = new int[7];
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter 6 element of array: ");
//		
//		for (int i=0;i<a.length;i++)
//		a[i]=scanner.nextInt();
//		
//		for(int i=0;i<a.length;i++)
//		  System.out.println(a[i]);
		
		
		
		
		
		
//		int thisarray[] = {7,5,6,7,8,9,0,};
//		
//		for(int i=0;i<thisarray.length;i++)
//			
//		System.out.println(thisarray[i]);
		
		
		
//		int n1=0,n2=1,n3,i,count=555;    
//		 System.out.println(n1+" "+n2);//printing 0 and 1    
//		    
//		 for(i=1; i<count; ++i)//loop starts from 2 because 0 and 1 are already printed    
//		 {    
//		  n3=n1+n2;    
//		  System.out.println(" "+n3);    
//		  n1=n2;    
//		  n2=n3;     
//		 }    
		 
		
//		int i,j,n;
// 		Scanner sc = new Scanner(System.in);
//    		System.out.println("Enter the no of lines");
// 		n=sc.nextInt();
//    		for(i=1;i<=n;i++)
//    		{
//        		for(j=1;j<=i;j++)
//        		{
//            			System.out.print((char)(i+64));
//        		}
// 
//        		System.out.println(" ");
//    		}
		
		
		
//		int a,b,tv1,tv2;
//	    a = 109;
//		b = 111;
//		tv1=a;
//		tv2=b;
//		a=tv2;
//		b=tv1;
//		System.out.println( a + " " + b );
		
		
		
		
		
		
//		int i,j,n,num;
//		
//	
//		System.out.println("enter no of rows :");
//		Scanner sc = new Scanner(System.in);
//	
//        n = sc.nextInt();
//        num =1;
//		 
//		 for (i=n;i<=n;i++)
//		 {
//			 for (j=n;j<=i;j++)
//			 {
//				 System.out.print(i);
//			 }
//			System.out.println("\n");
//		 }
		
		
		
//		int i,j,n;
//		
//		System.out.println("Enter the no of rows :");
//		Scanner sc = new Scanner(System.in);
//		  n = sc.nextInt();
//		  
//		  for ( i=1;i<=n;i++) {
//			 
//				  for (j=1;j<=i;j++) {
//				 
//				  System.out.print((char)(n-j+1+64));
//			  }
//				  System.out.print("\n");
//			  
//		  }
		
		
		
		
		  ArrayList<String>
          list1 = new ArrayList<String>();

      // Add values in ArrayList
      list1.add("Hii");
      list1.add("Geeks");
      list1.add("for");
      list1.add("Geeks");

      // print list 1
      System.out.println("List1: "
                         + list1);

      // Create ArrayList list2
      ArrayList<String>
          list2 = new ArrayList<String>();

      // Add values in ArrayList
      list2.add("Hii");
      list2.add("Geeks");
      list2.add("Gaurav");

      // print list 2
      System.out.println("List2: "
                         + list2);

      // Create ArrayList list3
      ArrayList<String>
          list3 = new ArrayList<String>(list1);

      // Store the comparison output
      // in ArrayList list3
      list3.retainAll(list2);

      // print list 3
      System.out.println("Common elements: "
                         + list3);
  }
        
		
		  
		
        }
 
	


