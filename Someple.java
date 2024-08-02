package oneple;

import java.util.Arrays;

public class Someple {

	public static void main(String[] args) {

		
		
		int[] numbers = {0, 5, 2, 4, 7, 1, 3, 19};
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                oddCount++;
            }
           
        }
        System.out.println("Number of odd numbers in an array: " + oddCount);
	}
}

	
	

