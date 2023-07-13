package network;
import java.net.*;
public class NetworkinterfaceEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    NetworkInterface n= NetworkInterface.getByName("CE31");
		    if(n == null)
		    {
		    System.out.println("not found");

		} else
		    {
		    System.out.println(n);
		    }
		}catch (SocketException ex) {
			// TODO: handle exception

       System.out.println("Socket exception error throw");
	}
	}	
	}

