package java1.innerclasses;

// Anonymous Inner Class
abstract class Person {
	abstract void eat();
}

public class TestAnonymousInner {

	public static void main(String[] args) {
		Person p = new Person() {
			void eat() {
				System.out.println("Nice Fruits");
			}
		};
		
		p.eat();
	}

}
