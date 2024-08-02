package sample;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Answer {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Type a length: " );
		
		int arr[] = new int[sc.nextInt()];
		
		for( int i = 0; i < arr.length; i++ ) {
			System.out.println("Type value of " + ( i + 1 ) +  " element");
			arr[i] = sc.nextInt();
		}
		
		System.out.println( "Your array: " + Arrays.toString(arr) );

	}
}

