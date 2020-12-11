package java1;


public class FreshJuiceTest {

	public static void main(String[] args) {
		FreshJuice juice = new FreshJuice();
		juice.juiceSize = FreshJuice.FreshJuiceSize.LARGE;
		System.out.println("Size: " + juice.juiceSize);

	}

}
