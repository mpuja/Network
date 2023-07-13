package network;
import java.net.*;
public class inet {
	 public static void main (String []args)
	    {
	    	try
	    	{
	    	InetAddress i= InetAddress.getByName("www.facebook.com");

	    	System.out.println(i);
	    	}catch(UnknownHostException e)
	    	{
	    		System.out.println("domain name is  not available");

	    }
	    }
}
