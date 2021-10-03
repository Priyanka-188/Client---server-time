import java.net.*;

import java.io.*;

public class client {
    public static void main(String args[]) throws Exception
    {
        Socket s = new Socket("localhost",777);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(in.readLine());
    }
}
