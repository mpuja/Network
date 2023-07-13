package network;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.net.*;
public class GetInet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			InetAddress local = InetAddress.getByName("127.0.0.1");
			NetworkInterface n = NetworkInterface.getByInetAddress(local);
			// getByInetAddress() -> returns NetworkInterface object representing the network interface bound to the specified IP address
			
			if(n == null)
			{
				System.out.println("Not Found");
			}
			else{
				System.out.println("The result is" +n);
			}
			
		}catch(SocketException e) {  // returns socket exception message
			// TODO: handle exception
			
		System.out.println("Socket Exception error.");
		}
		catch(UnknownHostException e1){  // returns unknown host name exception 
			System.out.println("UnknownHost Exception error.");
		}
	}
	}
