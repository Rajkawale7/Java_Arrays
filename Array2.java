package array;

public class Array2 {
	
	public static void main(String[] args) {
	
		float[] arr;
		arr = new float [5];
		
		arr [0] = 10f;
		arr [1] = 11f;
		arr [2] = 12f;
		arr [3] = 13f;
		arr [4] = 14f;
		
		for (float i=0; i<arr.length;i++){
			System.out.println("Element at index: "+ i +" is "+  arr[(int) i]);
		}
		
	}
}
