package com.three;
import java.net.*;
public class URIparteg {
	
	    public static void main(String[] args) throws Exception {
	        String urlString = "https://www.example.com/path/to/resource?key1=value1&key2=value2#fragment";

	        
	            URI uri = new URI(urlString);

	            String scheme = uri.getScheme();
	            String host = uri.getHost();
	            int port = uri.getPort();
	            String path = uri.getPath();
	            String query = uri.getQuery();
	            String fragment = uri.getFragment();

	            System.out.println("Scheme: " + scheme);
	            System.out.println("Host: " + host);
	            System.out.println("Port: " + port);
	            System.out.println("Path: " + path);
	            System.out.println("Query: " + query);
	            System.out.println("Fragment: " + fragment);
	       
	        }
	    }
	


