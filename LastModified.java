package com.java4;
import java.io.IOException;
import java.net.*;
import java.util.*;
import java.net.URL;
public class LastModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "https://www.orielly.com/xml";
		try {
			URL u=new URL(url);
			HttpURLConnection http=(HttpURLConnection)u.openConnection();
			http.setRequestMethod("HEAD");
			System.out.println(u+"wasLast Modified at"+new Date(http.getLastModified()));
			
		} catch (MalformedURLException ex) {
			// TODO: handle exception
			System.err.println(url+"is not URL I understand");
		}catch (IOException ex) {
			// TODO: handle exception
		}
		System.out.println();
		}

	}


