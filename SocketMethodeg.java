package com.seven;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
public class SocketMethodeg {
	
	    public static void main(String[] args) {
	        String serverAddress = "127.0.0.1"; 
	        int serverPort = 8080; 

	        try {
	            Socket socket = new Socket();
	            socket.connect(new InetSocketAddress(serverAddress, serverPort));

	            System.out.println("Client Socket Information:");
	            
	            System.out.println("InetAddress: " + socket.getInetAddress());
	            
	            System.out.println("LocalAddress: " + socket.getLocalAddress());
	            
	            System.out.println("Port: " + socket.getPort());
	            
	            System.out.println("Remote Host: " + socket.getRemoteSocketAddress());

	            
	            System.out.println("Local Port: " + socket.getLocalPort());

	          
	            System.out.println("Local Address: " + socket.getLocalAddress());

	          
	            System.out.println("Local Socket Address: " + socket.getLocalSocketAddress());

	            socket.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


