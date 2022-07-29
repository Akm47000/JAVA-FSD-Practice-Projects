package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class filehandling {

	public static void createFileUsingNIO() throws IOException {

		Path path = Paths.get("D:\\files\\testFileNIO3.txt");
//write data using file class 
		String input = "Welcome";
		byte array[] = input.getBytes();

		Files.write(path, array, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		System.out.println("Data Written Successfully");

//if you want to write data of list to files directly 
		Path path1 = Paths.get("D:\\files\\testFileNIO3.txt");
//write data using Files class 

		List<String> list = Arrays.asList("\nLine1", "Line2");
		Files.write(path1, list, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		System.out.println("Lines Written Successfully");

	}

	public static void main(String[] args) {
		try {

			createFileUsingNIO();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}