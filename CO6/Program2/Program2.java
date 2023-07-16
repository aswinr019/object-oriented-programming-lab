/* Write a program to write to a file, then read from the file and display the contents on the
console. */

import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class Program2 {
	public static void main(String args[]) throws IOException{

		Scanner scanner = new Scanner(System.in);
		System.out.print("enter something to write to file: ");
		String content = scanner.nextLine();

		FileWriter fileWriter = new FileWriter("output.txt");


		for(int i = 0; i < content.length(); i++)
			fileWriter.write(content.charAt(i));
		fileWriter.close();

		System.out.println("writing successful");
		
		int character;
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("output.txt");
			System.out.print("file contents: ");
			while( ( character = fileReader.read() ) != -1)
				System.out.printf("%c",character);
		}
		catch(FileNotFoundException e){
			System.out.println("Unable to read file!");
		}
		System.out.println();
		
		fileReader.close();

	}
}
