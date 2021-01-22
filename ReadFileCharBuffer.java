package labAssignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileCharBuffer {
	public static void main(String[] args) throws IOException {
		
		try {
			FileWriter fw = new FileWriter(new File("C:\\Users\\ve00ym226\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\JavaPractice\\src\\labAssignment4\\MyText.txt"));
			BufferedWriter  bufferedWritter = new BufferedWriter(fw);
			
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			
			bufferedWritter.write(b.readLine());
			bufferedWritter.close();
			b.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File is not found!");
		}
		
		System.out.println("Written into file successfully");
	}
}


