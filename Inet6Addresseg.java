package network;
import java.net.*;
public class Inet6Addresseg {

    public static void main(String[] args) throws Exception{
//    	InetAddress a = InetAddress.getByName("www.google.com");
//        System.out.println(a);
//        Inet4Address in = (Inet4Address)a;
//        System.out.println(in.getScopeId());
//    }
//}

    	        InetAddress a = InetAddress.getByName("www.google.com");
    	        System.out.println(a);

    	        if (a instanceof Inet4Address) {
    	            Inet4Address in4 = (Inet4Address) a;
    	           // System.out.println(in4.getScopeId());
    	        } else if (a instanceof Inet6Address) {
    	            Inet6Address in6 = (Inet6Address) a;
    	            System.out.println(in6.getScopeId());
    	        }
    	    }
    	}
      