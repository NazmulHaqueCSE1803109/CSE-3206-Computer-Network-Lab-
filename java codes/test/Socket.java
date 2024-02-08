package test;
public class Socket{
    int port_no;
    String ip;
    void accept()
    {
            System.out.println("Accepted\n");
            System.out.println("Your ip address is : "+ip);
            System.out.println("Your port number is : "+port_no);

        }
    Socket(String ipa, int pn)
    {
            port_no=pn;
            ip=ipa;
        }
    public static void main(String[] args) {
        Socket ob=new Socket("192.168.100.100",100);
        ob.accept();
    }
}