package com.five;
import java.net.*;
import java.io.*;
import java.util.*;
public class MIMEeg {

	    public static void main(String[] args) throws Exception {
	        URL url = new URL("https://www.example.com");
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	  
	        System.out.println("Content-Type: " + conn.getContentType());
	        System.out.println("Content-Length: " + conn.getContentLength());
	        System.out.println("Content-Encoding: " + conn.getContentEncoding());
	        System.out.println("Last-Modified: " + new Date(conn.getLastModified()));
	        System.out.println("Expiration-Date: " + new Date(conn.getExpiration()));
	        System.out.println("Current-Date: " + new Date());

	        
	    }
	}


