package java1.innerclasses;

public class LocalInner1 {
	private int data = 30;
	void display() {
		int value = 50;
		class LocalDisplay {
			void msg() {
				System.out.println("Hello from Local Class inside method 'display()'");
				System.out.println("Outer Class Data: " + data);
				System.out.println("Inner Class Value: " + value);
			}
		}
		
		LocalDisplay ld = new LocalDisplay();
		ld.msg();
	}

	public static void main(String[] args) {
		LocalInner1 li1 = new LocalInner1();
		li1.display();
	}

}
