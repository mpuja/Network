package com.seven;
import java.net.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyClienteg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s=new Socket("Localhost",6666);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		dout.writeUTF("Hello Server");
		dout.flush();
			dout.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
