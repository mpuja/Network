package com.seven;
import java.net.*;
import java.io.*;
public class MyServereg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
			System.out.println("message"+str);
			ss.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
