package network;
import java.net.*;
public class IPTesteg {
	
	    public static void main(String[] args) {
	        try {
	            InetAddress address = InetAddress.getByName("www.facebook.com");
	            System.out.println("IP address: " + address.getHostAddress());
	            System.out.println("Is multicast address? " + address.isMulticastAddress());
	            System.out.println("Is any local address? " + address.isAnyLocalAddress());
	            System.out.println("Is loopback address? " + address.isLoopbackAddress());
	            System.out.println("Is link-local address? " + address.isLinkLocalAddress());
	            System.out.println("Is site-local address? " + address.isSiteLocalAddress());
	            System.out.println("Is global multicast address? " + address.isMCGlobal());
	            System.out.println("Is node-local multicast address? " + address.isMCNodeLocal());
	            System.out.println("Is link-local multicast address? " + address.isMCLinkLocal());
	            System.out.println("Is site-local multicast address? " + address.isMCSiteLocal());
	            System.out.println("Is organization-local multicast address? " + address.isMCOrgLocal());
	            System.out.println("Is well-known multicast address? " + address.isMCSiteLocal());
	        } catch (UnknownHostException e) {
	            System.out.println("Could not find IP address");
	        }
	    }
	}


