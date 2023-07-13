package com.java4;
import java.net.*;
import java.io.*;
import java.util.*;
import java.net.URL;

import network.URLconnection;

public class Last24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Date today=new Date();
		long millisecondPerDay=24 * 60 *60 * 1000;
		String url = "https://www.google.com/";
	
		
		try {
			URL u = new URL(url);
			URLConnection uc = u.openConnection();
			System.out.println("original if modified since:"+ new  Date(uc.getIfModifiedSince()));
			uc.setIfModifiedSince(new Date(today.getTime()-millisecondPerDay).getTime());
			System.out.println("will retrive file if its modified since"+new Date(uc.getIfModifiedSince()));
			try(InputStream in = new BufferedInputStream(uc.getInputStream()))
			{
			Reader r =new InputStreamReader(in);
			int c;
			while((c=r.read())!=-1){
				System.out.print((char) c);
				
			}
			System.out.println();
			}
			
		} catch (IOException ex) {
			// TODO: handle exception
			System.out.println(ex);
		}
	}
}
	


