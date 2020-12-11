package java1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	
	public static void main (String [] args) {
		System.out.println("Hello from Test1!");
		System.out.println("Hello from Test1 from abranch!");
		
		int a = 5;
		final int b;
		b = 6;
		
		a++;
		//b++;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		// Date
		System.out.println("*******************  Date  *******************");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date: " + sdf.format(date));
		
		String dateStr = String.format("Current Date/Time : %tb", date);
		System.out.println(dateStr);
		System.out.println("*******************  Date  *******************");
	}

}
