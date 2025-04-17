package J20part1;

import java.util.ArrayList;

public class ArrayListDemo {
    
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		
		a.add("hello");
		a.add("world");
		a.add("in");
		a.add("java");
		a.add("program");
		
		System.out.println("The added elements in list :");
		System.out.println(a);
		
		a.remove(4);
		
		System.out.println("After removing the element in the list :");
		
		for(String temp:a){
			System.out.print(temp+" ");
		}
	}
}
