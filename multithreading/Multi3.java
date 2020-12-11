package java1.multithreading;

public class Multi3 implements Runnable {

	@Override
	public void run() {
		System.out.println("Multi3: Thread running...");
	}

	public static void main(String[] args) {
		Multi3 m3 = new Multi3();
		Thread t1 = new Thread(m3);
		t1.start();
	}

}
