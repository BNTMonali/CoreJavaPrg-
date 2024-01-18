package exceptionPrg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class TryWithMultiResourcePrg {

	// Main driver method
	public static void main(String[] args) throws FileNotFoundException {
		// Try block to check for exceptions

		// Writing data to a file using FileOutputStream
		// by passing input file as a parameter
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\monalee.pawar\\\\git\\\\repository\\\\practicePrg\\\\src\\\\exceptionPrg\\outputfile.txt");
		BufferedReader br = new BufferedReader(new FileReader
				("C:\\Users\\monalee.pawar\\git\\repository\\practicePrg\\src\\exceptionPrg\\inputFile.txt"));
		// Adding resource
		// Reading the stream of character from
		try (fos;br) {

			// Declaring a string holding the
			// stream content of the file
			String text;

			// Condition check using readLine() method
			// which holds true till there is content
			// in the input file
			while ((text = br.readLine()) != null) {

				// Reading from input file passed above
				// using getBytes() method
				byte arr[] = text.getBytes();

				// String converted to bytes
				fos.write(arr);

				// Copying the content of passed input file
				// 'inputgfgtext' file to outputfile.txt
			}

			// Display message when
			// file is successfully copied
			System.out.println("File content copied to another one.");
		}

		// Catch block to handle generic exceptions
		catch (Exception e) {

			// Display the exception on the
			// console window
			System.out.println(e);
		}

		// Display message for successful execution of the
		// program
		System.out.println("Resource are closed and message has been written into the outputfile.txt");
	}
}
