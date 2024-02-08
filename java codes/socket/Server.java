package socket;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
         System.out.println("Server started");
        try {
             try (ServerSocket ss = new ServerSocket(6666)) {
                 Socket s = ss.accept();//establishes connection
                 System.out.println("Client Connected");
             
                 Scanner ob=new Scanner(System.in);
                 String msg2=ob.nextLine();
                 ob.close();

                 DataOutputStream data_out=new DataOutputStream(s.getOutputStream());
                 data_out.writeUTF(msg2);

                 DataInputStream dis = new DataInputStream(s.getInputStream());
                 String str = (String) dis.readUTF();
                 System.out.println("message= " + str);
             } //establishes connection
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}