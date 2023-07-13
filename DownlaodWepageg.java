package com.five;
import java.net.*;
import java.io.*;
import java.util.*;
public class DownlaodWepageg {
	
	    public static void main(String[] args) throws Exception {

	                String urlString = "https://example.com"; // Specify the URL of the web page you want to download
	                
	                    // Create a URL object with the specified URL
	                    URL url = new URL(urlString);

	                    // Open a connection to the URL
	                    URLConnection connection = url.openConnection();

	                    // Get the properties of the web page
	                    String contentType = connection.getContentType();
	                    int contentLength = connection.getContentLength();
	                    Date lastModified = new Date(connection.getLastModified());

	                    // Print the properties
	                    System.out.println("Content Type: " + contentType);
	                    System.out.println("Content Length: " + contentLength);
	                    System.out.println("Last Modified: " + lastModified);

	                }
	            }
	        

	    

	


