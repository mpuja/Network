package network;

import java.net.MalformedURLException;
import java.net.*;

public class UrlConstructor {
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		URL ur = new URL("https://www.youtube.com/feed/trending?bp=6gQJRkVleHBsb3Jl#toc");
			
	    URL u1 = new URL(ur,"history.html");
			 
	    URL u2 = new URL("https","youtube.com","feed/trending");
			 
	    URL u3 = new URL("https","history.html",80,"feed/trending");
	    
	    System.out.println(ur);
	    System.out.println(u1);
	    
	    
			 

	}

}


