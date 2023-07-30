/* Write a program to write to a file, then read from the file and display the contents on the
console. */

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class Program2 {
	public static void main(String args[]) throws IOException{

		Scanner scanner = new Scanner(System.in);
		System.out.print("enter something to write to file: ");
		String content = scanner.nextLine();

		try ( BufferedWriter bWriter = new BufferedWriter(new FileWriter("example.txt")) ){
			bWriter.write(content);
			bWriter.newLine();

		    }catch(IOException e){
			System.out.println("Unable to write to file!");
			e.printStackTrace();
		    }

		System.out.println("writing successful!!");
		
		try( BufferedReader bReader = new BufferedReader( new FileReader("example.txt")) ){

			System.out.print("file contents: ");

			String line;
			while( (line = bReader.readLine()) != null ){
				System.out.println(line);
			}
		}
		catch(IOException e){
			System.out.println("Unable to read file!");
			e.printStackTrace();
		}
	}
}
