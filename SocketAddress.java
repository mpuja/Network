package com.five;
import java.net.*;
import java.net.Socket;
public class SocketAddress {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		
	
			Socket socket= new Socket("www.yahoo.com",80);
			 java.net.SocketAddress yahoo=socket.getRemoteSocketAddress();
			 System.out.println(yahoo);
			 socket.close();
	}
}
			
	
			
			
		




