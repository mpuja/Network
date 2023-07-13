package com.java4;
import java.net.*;
import java.io.*;
public class Daytimeclienteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hostname="LocalHost";
		Socket so=null;
		try {
		so =new Socket(hostname,13);
		so.setSoTimeout(15000);
		InputStream in = so.getInputStream();
		StringBuilder time=new StringBuilder();
		InputStreamReader reader=new InputStreamReader(in,"ASCII");
		for(int c=reader.read();c!=-1;c=reader.read()){
			time.append((char)c);
		}
		System.out.println(time);
		} catch (IOException ex) {
			// TODO: handle exception
		}finally {
		if(so!=null){
			try {
			so.close();	
			} catch (IOException ex) {
				// TODO: handle exception
			}
		}
		}

	}

}
