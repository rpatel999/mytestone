package java1;

import java.util.Arrays;

public class SwappingExample {

	public static void main(String[] args) {
		int a = 30;
		int b = 45;
		System.out.println("Before swapping, a = " + a + " and b = " + b);
		
		// Invoke the swap method
		swapFunction (a, b);
		System.out.println("\n** Now, Before and After swapping values will be same here **:");
		System.out.println("After swapping, a = " + a + " and b = " + b);
		
		
		//Array
		int[] intArray = {1,2,3,4,5,6,7,8,9,0};
		int[] reverseIntArray = reverse(intArray);
		System.out.println("intArray: ");
		printArray(intArray);
		System.out.println("\n");
		System.out.println("reverseIntArray: ");
		printArray(reverseIntArray);
		Arrays.sort(reverseIntArray);
		System.out.println("\n");
		System.out.println("Sorted intArray: ");
		printArray(intArray);		
	}
	
	public static void swapFunction( int a, int b) {
		System.out.println("Before swapping (Inside), a = " + a + " b = " + b);
		
		// Swap a and b
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping(Inside), a = " + a + " b = " + b);
	}
	
	public static int[] reverse (int[] list) {
		int[] result = new int[list.length];
		for (int i=0, j=result.length-1; i < list.length; i++, j-- ) {
			result[j] = list[i];
		}
		return result;
	}
	
	public static void printArray( int[] aArray) {
		for (int i : aArray) {
			System.out.print(i);
		}
	}

}
