package labAssignment4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerAndDeser {
	public static void main(String[] args) {
		Address address = new Address("Defence Colony,Hisar Haryana");
		Employee employee = new Employee("Meghna","001",address,50000.0);
		
		
		// Serialization of employee object
		try {
			ObjectOutputStream serializeObject = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\ve00ym226\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\JavaPractice\\src\\labAssignment4\\serializedFile.txt")));
			serializeObject.writeObject(employee);
			
			System.out.println("Object is written in the file successfully!");
		} catch(IOException e) {
			System.out.println("Input output exception.");
			e.printStackTrace();
		}
		
		// De-serialization of employee object 
		try {
			
			
			ObjectInputStream deserializeObject = new ObjectInputStream(new FileInputStream(new File("C:\\\\Users\\\\ve00ym226\\\\Documents\\\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\\\JavaPractice\\\\src\\\\labAssignment4\\\\serializedFile.txt")));
			Employee desEmployee = (Employee) deserializeObject.readObject();
			
			FileWriter fw = new FileWriter("C:\\Users\\ve00ym226\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\JavaPractice\\src\\labAssignment4\\deserialized.txt");
			fw.write(desEmployee.toString());
			System.out.println(desEmployee);
			fw.close();
		} catch(IOException | ClassNotFoundException e) {
			System.out.println("Input output exception2");
			e.printStackTrace();
		}
		
	}
	
}
