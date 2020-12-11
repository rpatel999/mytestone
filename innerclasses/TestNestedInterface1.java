package java1.innerclasses;

// Interface with Inner Interface
interface Showable {
	void show();
	interface Message {
		void msg();
	}
}

public class TestNestedInterface1 implements Showable.Message {
	
	public void msg() {
		System.out.println("Hello nested interface");
	}

	public static void main(String[] args) {
		Showable.Message sMessage = new TestNestedInterface1(); //upcasting
		sMessage.msg();
	}

}
