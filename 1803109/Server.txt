package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) throws IOException {
        try (// Create server socket...
        ServerSocket serverSocket = new ServerSocket(50000)) {
            System.out.println("Server Started");

            while(true)
            {
                // Create Connection between server, client...
            Socket socket=serverSocket.accept();
            System.out.println("Client Started.");

            // Receive message from client...
            DataInputStream dis=new DataInputStream(socket.getInputStream());
            String cMsg=(String)dis.readUTF();
            System.out.println("The messaage send by client is : "+cMsg);

            // send message from server to client...
            DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
            String sMsg=cMsg.toUpperCase();
            dos.writeUTF(sMsg);
            }
        }

    }
}
