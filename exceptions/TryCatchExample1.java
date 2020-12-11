package java1.exceptions;

public class TryCatchExample1 {

	public static void main(String[] args) {
		int i = 50;
		int j = 0;
		int data;
		try {
			data = i / j;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(i / (j + 2));
		}
		System.out.println("i: " + i + ", j: " + j + ", data: ");

		// Compile error as specific errors will not be called and thus will be unreachable
		/*
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (Exception e) {
			System.out.println("common task completed");
		} catch (ArithmeticException e) {
			System.out.println("task1 is completed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		}
		*/
		
		System.out.println("rest of the code...");
	}

}
