package array;

public class Array {

	public static void main(String args[]) {

		int Size = 5;
        int array[] = new int[Size];
        //initialize the value by using for loop
        for(int i=0;i<Size;i++)
        {
            array[i] = i+1;
            System.out.println("The value for index "+i+" is: "+ array[i]);
        }
    }
}

