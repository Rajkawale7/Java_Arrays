package array;
import java.util.Scanner;

public class Array1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your numbers:");
		int Num = sc.nextInt();
		
		int array[] = new int[5];
		
		for (int i=0; i<array.length; i++) {
			System.out.println("Enter Your values:");
			
			array[i]= sc.nextInt();
						
	}
		for (int j=0; j<array.length; j++) {
			System.out.println(array[j]);
			
		
		}
		
		
	}

}
