package network;
import java.net.*;
public class Inet4AddressClass {
	   public static void main(String[] args) {
	      try {
	         // Get the IP address of a host
	         InetAddress a = InetAddress.getByName("www.google.com");
	         
	         // Print the IP address
	         if (a instanceof Inet4Address) {
	            System.out.println("IPv4 address: " + a.getHostAddress());
	         }
	      } catch (UnknownHostException ex) {
	         System.out.println("Could not find the host");
	      }
	   }
	}


