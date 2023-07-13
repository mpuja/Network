package com.three;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
public class WebPageeg {
	    public static void main(String[] args) throws Exception{
	        String urlString = "https://www.facebook.com";
	        
	            URL url = new URL(urlString);
	            URLConnection conn = url.openConnection();
	            
	            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	            String inputLine;
	            while ((inputLine = in.readLine()) != null) {
	                System.out.println(inputLine);
	            }
	            in.close();
	       
	        }
	    }
	


