//sum of array elements
package array;

public class Array3 {
	
	public static void main(String[] args) {
	int arr [] = {1, 2,3,4,5};
	int sum = 0;
	
	for(int i = 0; i<arr.length; i++){
		sum+= arr[i];
		}
	System.out.println("Sum of the elements of array" + " is " + sum);
			
	}
}
