import java.net.*;
import java.io.*;
class TestInetClass
{
    public static void main(String[] args)
    {
        String host="www.iitmjanakpuri.com";
        try
        {
            InetAddress[] iaddress=InetAddress.getAllByName(host);
            for(InetAddress ipaddress : iaddress)
            {
                System.out.println(ipaddress.toString());
            }
        }
        catch(UnknownHostException e)
        {
            System.out.println(e);
        }
    }
}