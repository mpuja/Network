package network;
import java.net.*;
public class Factoryeg {
	    public static void main(String[] args) throws Exception{
	       
	            InetAddress a1 = InetAddress.getByName("www.google.com");
	            System.out.println("getByName method: " + a1);
	            
	    
	            InetAddress[] a2 = InetAddress.getAllByName("www.yahoo.com");
	            System.out.println("getAllByName method:");
	            for (InetAddress ad : a2) {
	                System.out.println(ad);
	            }
	            
	            
	            InetAddress localAddress = InetAddress.getLocalHost();
	            System.out.println("getLocalHost method: " + localAddress);
	            
	            
	            byte[] ip = { 127, 0, 0, 1 };
	            InetAddress ad2 = InetAddress.getByAddress(ip);
	            System.out.println("getByAddress method: " + ad2);
	            
	            
	            InetAddress ad3 = InetAddress.getByAddress("localhost", ip);
	            System.out.println("getByAddress with hostname method: " + ad3);
	    }
}
	    

	


