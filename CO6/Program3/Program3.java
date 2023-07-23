/* Write a program to copy one file to another. */

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class Program3 {
	public static void main(String args[]) throws IOException{

		try {
			int character;

			FileReader fileReaderOne = new FileReader("output.txt");
			FileWriter fileWriter = new FileWriter("copy.txt");

			System.out.print("contents of first file : ");
			while( ( character = fileReaderOne.read() ) != -1){
				fileWriter.write(character);
				System.out.printf("%c",character);
			}
			System.out.println("copied successfully!");

			fileReaderOne.close();
			fileWriter.close();

			FileReader fileReaderTwo = new FileReader("copy.txt");
			
			System.out.print("contents of copy file : ");
			while( ( character = fileReaderTwo.read() ) != -1 )
				System.out.printf("%c",character);
			fileReaderTwo.close();

			System.out.println();

		}
		catch(FileNotFoundException e){
			System.out.println("Unable to read file!");
		}
		System.out.println();

	}
}
