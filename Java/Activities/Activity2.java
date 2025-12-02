package activities;

import java.util.*;
public class Activity2 {

	public static void main(String[] args) {
		int[] values= {10, 77, 10, 54,-11,10};
		
	System.out.println("Array list" + Arrays.toString(values));
	//int[] numbers;
	int totsum=0;
	
	 for (int number : values) {
        
         if (number == 10) {
           totsum += number;
         }
	}
	 
	 boolean result = (totsum == 30);
	
	 System.out.println(result);
	
}
}


