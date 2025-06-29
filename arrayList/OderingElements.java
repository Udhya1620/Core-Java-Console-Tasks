package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class OderingElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(5);
		nums.add(4);
		nums.add(7);
		nums.add(17);
		nums.add(12);
		nums.add(3);
		
		
	 System.out.println(nums);
	 
	 Collections.sort(nums);
	 
     System.out.println(nums); 
		
    Collections.sort(nums,Collections.reverseOrder());
    
    System.out.println(nums); 
    
    

	}

}
