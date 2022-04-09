package serialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("./inputFiles/text.txt"));
		String lineString;
		while((lineString = bufferedReader.readLine()) != null) {
			System.out.println(lineString);
		}
	}
}
