import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;


public class Server {

  public static void main(String args[]) {

    try {

    System.out.println("Waiting for clients");
    
    ServerSocket serversocket = new ServerSocket(3000);
    Socket socket = serversocket.accept();

    System.out.println("Connection established!");
    
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    String str = in.readLine();
    PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
    out.println("server : "+str);
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }
  }
}
