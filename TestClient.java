import java.net.*;
import java.io.*;
public class TestClient
{
    public static void main(String[] args) throws Exception
    {
        Socket sock= new Socket("localhost",3000);
        BufferedReader keyRead=new BufferedReader(new InputStreamReader(System.in));
        OutputStream ostream =sock.getOutputStream();
        PrintWriter pwrite=new PrintWriter(ostream,true);
        InputStream istream =sock.getInputStream();
        BufferedReader receiveRead=new BufferedReader(new InputStreamReader(istream));
        System.out.println("Start Chat, Type And Enter");
        String receiveMessage,sendMessage;
        while(true)
        {
            sendMessage=keyRead.readLine();
            pwrite.println(sendMessage);
            pwrite.flush();
            if((receiveMessage=receiveRead.readLine()) !=null)
            {
                System.out.println(receiveMessage);
            }
        }
    }
}