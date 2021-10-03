import java.net.*;
import java.io.*;
import java.util.Date;
class Server {
    public static void main(String args[])throws Exception
    {
        ServerSocket ss = new ServerSocket(777);
        while(true)
        {
            System.out.println("Waiting for connection ...");
            Socket soc = ss.accept();
            DataOutputStream out = new DataOutputStream(soc.getOutputStream());
            out.writeBytes("Server Date" + (new Date()).toString() + "\n\n");
            out.close();
            soc.close();
     }
    }
}