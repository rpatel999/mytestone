package java1.innerclasses;

// Anonymous Inner Class using Interface
interface Eatable {
	void eat();
}

public class TestAnonymousInner1 {

	public static void main(String[] args) {
		Eatable e = new Eatable() {
			public void eat() {
				System.out.println("Interface: Nice Fruits");
			}
		};
		
		e.eat();
	}

}
