package com.three;
import java.net.*;
public class ExtraURLstring {
	
	    public static void main(String[] args) throws Exception{
	        
	            URL url = new URL("https://www.facebook.com:8080/search?q=query&limit=10");

	            // Extract protocol
	            String protocol = url.getProtocol();
	            if (!protocol.equals("http") && !protocol.equals("https")) {
	                System.out.println("Protocol is not supported");
	                return;
	            }

	            // Extract host name
	            String host = url.getHost();

	            // Extract port number
	            int port = url.getPort();
	            if (port == -1) {
	                port = url.getDefaultPort();
	            }

	            // Extract query string
	            String query = url.getQuery();

	            // Extract path and file
	            String path = url.getPath();
	            String file = url.getFile();

	            System.out.println("Protocol: " + protocol);
	            System.out.println("Host Name: " + host);
	            System.out.println("Port Number: " + port);
	            System.out.println("Query String: " + query);
	            System.out.println("Path: " + path);
	            System.out.println("File: " + file);

	       
	        }
	    }
	


