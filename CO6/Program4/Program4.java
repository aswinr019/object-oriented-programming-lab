/* Write a program that reads from a file having integers. Copy even numbers and odd
numbers to separate files. */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class Program4 {
	public static void main(String args[])  {

		try(
			BufferedReader bReader = new BufferedReader( new FileReader("example.txt") );
			BufferedWriter bWriterOdd = new BufferedWriter( new FileWriter("odd.txt") );
			BufferedWriter bWriterEven = new BufferedWriter( new FileWriter("even.txt") );
		   ){
			String line;

			while ( ( line = bReader.readLine() ) != null ) {
				
				if( Integer.parseInt(line) % 2 == 0 ){
					bWriterEven.write(line);
					bWriterEven.newLine();
				}else{
					bWriterOdd.write(line);
					bWriterOdd.newLine();
				}
			}
		}catch(IOException e){
			System.out.println("Unable to read / write to file!");
			e.printStackTrace();
		}

		try (
			BufferedReader bReaderOdd = new BufferedReader( new FileReader("odd.txt") );
			BufferedReader bReaderEven = new BufferedReader( new FileReader("even.txt") );
			BufferedReader bReader = new BufferedReader( new FileReader("example.txt") );
		    ){
			String line;
			System.out.println("Contents of original file");

			while( (line = bReader.readLine()) != null ){
				System.out.println(line);
			}
			System.out.println();

			System.out.println("Contents of odd file");

			while( ( line = bReaderOdd.readLine() ) != null ){
				System.out.println(line);
			}
			System.out.println();

			System.out.println("Contents of even file");

			while( ( line = bReaderEven.readLine() ) != null ){
				System.out.println(line);
			}
			System.out.println();

		    }catch(IOException e){
			System.out.println("Unable to read file!");
			e.printStackTrace();
		    }
	}
}
