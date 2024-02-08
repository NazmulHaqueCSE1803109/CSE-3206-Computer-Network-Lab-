package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            System.out.println("Client started");
            Socket s = new Socket("localhost", 6666);
            System.out.println("Client Connected");

            Scanner ob=new Scanner(System.in);
            String msg1=ob.nextLine();

            ob.close();
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF(msg1);

            DataInputStream dis = new DataInputStream(s.getInputStream());
                 String str = (String) dis.readUTF();
                 System.out.println("message= " + str);


            dout.flush();
            dout.close();
            s.close();
        } catch (IOException e) 
        {
            System.out.print(e);
        }
    }
}
