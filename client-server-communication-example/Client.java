import java.net.Socket;
import java.io.*;


public class Client {

  public static void main(String args[]) {
    
    try {

      System.out.println("Client started");

      Socket socket = new Socket("localhost",3000);

      BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

      System.out.print("Enter a string : ");
      String str = userInput.readLine();

      PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
      out.println(str);
      
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      System.out.println(in.readLine());

    } catch (Exception e){
      System.out.println(e.getMessage());
    }
  }
}
