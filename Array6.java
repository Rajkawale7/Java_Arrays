//Find the maximum & minimum number in an array of integers.
package array;
import java.util.Scanner;

public class Array6 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int numbers [] = new int[size];
		
		//INPUTS FROM USERS
		System.out.println("Enter the elements of array: ");
		for (int i=0; i<size; i++) {
			numbers [i] = sc.nextInt();	
		}
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		//OUTPUT
		
		for (int i=0; i<size; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
				}
			if (numbers[i] > max) {
	               max = numbers[i];
		}
		System.out.println("Largest number is: " + max);
		System.out.println("Smallest number is: " + min);
		
		
		}
	}
}