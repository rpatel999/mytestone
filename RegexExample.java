package java1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		// 1st way
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		
		// 2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();
		
		// 3rd way
		boolean b3 = Pattern.matches(".s", "as");
				
		System.out.println("b: " + b + ", b2: " + b2 + ", b3: " + b3);
		
		boolean b4 = Pattern.matches("s", "aaaaas");
		System.out.println("b4: " + b4);
		boolean b5 = Pattern.matches("\\D*", "**((__");
		System.out.println("b5: " + b5);
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)  
		System.out.println(Pattern.matches("[a-zA-Z0-9$%&*^@]{6}", "arun$2"));//true ($ is matched)  


	}

}
