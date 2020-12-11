package java1.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
//		FileInputStream in = null;
//		FileOutputStream out = null;
		FileReader in = null;
		FileWriter out = null;
		
		System.out.println(System.getProperty("user.dir"));
		
		try {
//			in = new FileInputStream("iofiles/input.txt");
//			out = new FileOutputStream("iofiles/output.txt");
			in = new FileReader("iofiles/input.txt");
			out = new FileWriter("iofiles/output.txt");
			
			int c;
			while ((c = in.read()) != -1) {
				System.out.println("c: " + c);
				out.write(c);
			}
		}
		finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
