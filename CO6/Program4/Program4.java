/* Write a program that reads from a file having integers. Copy even numbers and odd
numbers to separate files */

import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class Program4 {
	public static void main(String args[]) throws IOException {

		int number;
		FileReader fileReader = null;
		try {
			FileWriter fileWriterOne = new FileWriter("odd.txt");
			FileWriter fileWriterTwo = new FileWriter("even.txt");
			fileReader = new FileReader("output.txt");

			while( ( number = fileReader.read() ) != -1){
				char character = (char)number;
				if( character % 2 == 0  )
					fileWriterTwo.write(character);
				else
					fileWriterOne.write(character);
			}
			fileWriterOne.close();
			fileWriterTwo.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Unable to read file!");
		}
		System.out.println();
		
		fileReader.close();

	}
}
