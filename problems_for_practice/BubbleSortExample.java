package problems_for_practice;

import java.util.Date;

public class BubbleSortExample {

    public static void main(String[] args) {
       int[] numbers = {5, 2, 9, 1, 5, 6};

       for (int i = 0; i < numbers.length - 1; i++) {
           for (int j = 0; j < numbers.length - i - 1; j++) {
               if (numbers[j] > numbers[j + 1]) {
                   // Swap numbers[j] and numbers[j+1]
                   int temp = numbers[j];
                   numbers[j] = numbers[j + 1];
                   numbers[j + 1] = temp;
               }
           }
       }

       System.out.print("Sorted Array: ");
       for (int num : numbers) {
           System.out.print(num + " ");
       }
    	
       Date now = new Date();
    	
    }
}
