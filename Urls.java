package network;
import java.net.*;
public class Urls {
	
		public static void main(String[] args)  throws MalformedURLException{
			// TODO Auto-generated method stub
	   URL u=new URL("https:www.facebook.com");
	   System.out.println("The Authority of" + u+" + is"+u.getAuthority());
	   System.out.println("The Default port number of" + u+" + is"+u.getDefaultPort());
	   System.out.println("The Port number of" + u+" + is"+u.getAuthority());
	   System.out.println("The file name of" + u+" + is"+u.getFile());
	   System.out.println("The host name of" + u+" + is"+u.getHost());
	   System.out.println("The path of" + u+" + is"+u.getPath());
	   System.out.println("The protocol of" + u+" + is"+u.getProtocol());
	   System.out.println("The query of" + u+" + is"+u.getQuery());
	   System.out.println("The reference of" + u+" + is"+u.getRef());
	   System.out.println("The User information of" + u+" + is"+u.getUserInfo());
		}

	}

