package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket socket =new Socket("localhost",50000);
        System.out.println("Client Started.");
      
        // Message send to server...
        DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
        Scanner in=new Scanner(System.in);
        String cMsg=in.nextLine();
        dos.writeUTF(cMsg);

        // Receive message form Server...
        DataInputStream dis=new DataInputStream(socket.getInputStream());
        String sMsg=(String)dis.readUTF();
        System.out.println("The Acknowledgement send by Server is : "+sMsg);

    }
}
