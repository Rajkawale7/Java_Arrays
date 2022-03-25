package array;
import java.util.Scanner;
public class Array5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array: ");   //taking the input from user for size of array
		int size = sc.nextInt();                          //storing the input from user for size of array into variable
		
		int number[] = new int [size];         //creating array of that given number of size by user (making syntax of array)
		
		//for input
		for (int i=0; i<size; i++) {  
			System.out.println("Enter the element of array: ");
			number [i] = sc.nextInt();      //storing values into array "number[ith position]" by taking values from users 
		}
		
		
		//for output:: 
		for (int i=0; i<size; i++) {
			System.out.println(number[i]);
		}
	}
}
