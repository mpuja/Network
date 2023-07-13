package com.five;
import java.net.*;
import java.io.*;
import java.net.Socket;
public class SocketInfo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String host="www.google.com";
		Socket theSocket=new Socket(host,80);
		System.out.println("Connect to"+theSocket.getInetAddress()+"on port"+theSocket.getPort()+"form port");
        
	}

}
