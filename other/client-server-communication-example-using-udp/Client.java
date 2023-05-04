import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {

    public static void main(String args[]) {
        try {
            System.out.println("Client started");

            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
            System.out.println("Connected to server at " + serverAddress.getHostAddress() + ":3000");

            while (true) {
                byte[] sendData = new byte[1024];
                System.out.print("Enter a string: ");
                String str = System.console().readLine();
                sendData = str.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 3000);
                clientSocket.send(sendPacket);

                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                clientSocket.receive(receivePacket);
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received message from server: " + message);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
