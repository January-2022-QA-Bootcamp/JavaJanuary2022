package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) {
		SerializationClass serializationClass = new SerializationClass(23, "January Batch");
		String fileName = "file.ser";
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(serializationClass);
			objectOutputStream.close();
			fileOutputStream.close();
			System.out.println("Serialized");
		} catch (IOException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		
		try {
			FileInputStream fileInputStream = new FileInputStream(fileName);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			SerializationClass secondObj = (SerializationClass)objectInputStream.readObject(); //new object
			
			//(SerializationClass)objectInputStream.readObject() = new SerializationClass(serializationClass.a,serializationClass.b);
			
			fileInputStream.close();
			objectInputStream.close();
			
			System.out.println(secondObj.a);
			System.out.println(secondObj.b);
			
			System.out.println(secondObj.equals(serializationClass));
			System.out.println(secondObj.hashCode()+"\n"+serializationClass.hashCode());
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("File Not Found");
		}
		
		/*
		 * try { System.out.println(5/0); } catch (ArithmeticException e) {
		 * System.out.println("Exception occured"); }
		 * System.out.println("After statement");
		 */
	}
}
