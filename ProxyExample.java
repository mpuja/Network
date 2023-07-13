package com.three;
import java.io.IOException;
import java.net.*;
import java.util.*;
public class ProxyExample {
	    public static void main(String[] args) throws Exception {
	     
	        URL u = new URL("https://www.example.com");
	        HttpURLConnection c = (HttpURLConnection) u.openConnection();

	        Scanner s = new Scanner(c.getInputStream());
	        while (s.hasNextLine()) {
	            System.out.println(s.nextLine());
	        }
	    }
	}

	class CustomProxySelector extends ProxySelector {
	    @Override
	    public List<Proxy> select(URI uri) {
	        
	        if (uri.getHost().equals("www.example.com")) {
	            InetSocketAddress a = new InetSocketAddress("proxy.example.com", 8080);
	            Proxy p = new Proxy(Proxy.Type.HTTP, a);
	            return Collections.singletonList(p);
	        }
	        return ProxySelector.getDefault().select(uri);
	    }

	    @Override
	    public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
	        // Handle connection failures here
	    }
	}



