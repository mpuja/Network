package network;
import java.net.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class CheckIpv4OrIpv6eg {

	    public static void main(String[] args)throws Exception {
	    	 InetAddress i1 = InetAddress.getByName("www.yahoo.com");
				//InetAddress i2 = InetAddress.getByName("www.google.com");
	     
//String s = i1.toString(s);
	byte[] ad = i1.getAddress();

	if(ad.length == 4)
	{
		System.out.println(" given address "+i1+" is IPV4.");
	}
	else if(ad.length == 16)
	{
	System.out.println(" given address "+i1+" is IPV6.");	
	}

	else
	{
		System.out.println("The given address "+i1+" is invalid.");
	}
	    }
	}



