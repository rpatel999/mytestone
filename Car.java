package java1;

class Vehicle {}

public class Car extends Vehicle {

	public static void main(String[] args) {
		Vehicle a = new Car();
		boolean result1 = a instanceof Car;
		System.out.println(result1);
		
		boolean result2 = a instanceof Vehicle;
		System.out.println(result2);
	}

}
