package java1.innerclasses;

class TestOuter1 {
	
	static int st_data = 30;
	int data = 40;
	static class InnerStatic {
		void msg() {
			System.out.println("InnerStatic: msg()");
			System.out.println("\tTestOuter1's st_data = " + st_data);
			//System.out.println("\tTestOuter1's data = " + data);  // Compile error
		}
		static void st_msg() {
			System.out.println("InnerStatic: st_msg()");
			System.out.println("\tTestOuter1's st_data = " + st_data);
			//System.out.println("\tTestOuter1's data = " + data);  // Compile error
		}
	}

	public static void main(String[] args) {
		TestOuter1.InnerStatic toInner = new TestOuter1.InnerStatic();
		toInner.msg();
		
		TestOuter1.InnerStatic.st_msg();
	}

}
