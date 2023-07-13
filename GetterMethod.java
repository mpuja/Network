package network;
import java.net.*;
import java.util.Enumeration;
public class GetterMethod {
	public static void main(String[] args) throws SocketException {
		// TODO Auto-generated method stub
		
		Enumeration<NetworkInterface> enumm = NetworkInterface.getNetworkInterfaces();
		while (enumm.hasMoreElements()) 
		{
		  NetworkInterface network = enumm.nextElement();
		  System.out.println(network.getName() +"::"+network.getDisplayName());
		  
		  //getName() -> returns the name of network interface
		  // getDisplayName() -> returns the user friendly name of network interface
		}
		
		
	}

}

