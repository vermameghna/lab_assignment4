package labAssignment4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFileByteFormat {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fr = new FileInputStream("C:\\Users\\ve00ym226\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\JavaPractice\\src\\labAssignment4\\photo1.jpg");
			FileOutputStream fw = new FileOutputStream("C:\\\\Users\\\\ve00ym226\\\\Documents\\\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\\\JavaPractice\\\\src\\\\labAssignment4\\\\photo2.jpg");
			
			int i;
			while ((i=fr.read())!= -1) {
				fw.write(i);
			}
			
			fw.flush();
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
		System.out.println("File written successfully!");
	}
}