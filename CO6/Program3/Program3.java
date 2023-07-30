/* Write a program to copy one file to another. */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class Program3 {
	public static void main(String args[]) {
		
		try( 
			BufferedReader bReader = new BufferedReader(new FileReader("example.txt")); 
			BufferedWriter bWriter = new BufferedWriter( new FileWriter("copy.txt"));
		   ){
			String line;

			while( ( line = bReader.readLine() ) != null ){
				bWriter.write(line);
				bWriter.newLine();
			}
		   }catch ( IOException e){
			System.out.println("Unable to copy file!");
			e.printStackTrace();
		   }
		try (
			BufferedReader bReaderOriginal = new BufferedReader( new FileReader("example.txt"));
			BufferedReader bReaderCopy = new BufferedReader( new FileReader("copy.txt"));
		    ){
			String line ;

			System.out.println("Contents of original file");
			while( (  line = bReaderOriginal.readLine()) != null ){
				System.out.println(line);
			}
			System.out.println();

			System.out.println("Contents of copy file");
			while( ( line = bReaderCopy.readLine() ) != null ){
				System.out.println(line);
			}

		}catch(IOException e){
			System.out.println("Unable to read file!");
			e.printStackTrace();
		}
	}
}
