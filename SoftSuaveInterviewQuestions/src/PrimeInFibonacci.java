
import java.util.ArrayList;
public class PrimeInFibonacci {
    public static void main(String[] args){
int start = 3, end = 100, limit = 40;
   int a = 0, b = 1, sumOfPrime = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
       for(int i = start; i<end; i++){

           arrayList.add(a);
              int temp = a + b;
               a = b;
               b = temp;

           if(a>end){break;}    }

        System.out.println(arrayList);

        for (Integer integer : arrayList) {
            if (integer >= start && integer <= end) {
                boolean prime = true;
                for (int j = 2; j < Math.sqrt(integer); j++) {
                    if (integer % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if(prime){ sumOfPrime += integer;}
            }
        }
         if(limit<sumOfPrime){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
       }
    }
