package com.ten;
import java.io.IOException;
import java.net.*;
public class UDPServereg {
	    public static void main(String[] args)throws IOException {
	     
	            int PORT = 13;
	            DatagramSocket s = new DatagramSocket(PORT);
	
	            byte[] receiveData = new byte[1024];

	            while (true) {
	               
	                DatagramPacket d = new DatagramPacket(receiveData, receiveData.length);

	                s.receive(d);
	                String clientmsg = new String(d.getData());

	                System.out.println("Received from client: " + clientmsg);
	                
	                InetAddress i = d.getAddress();
	                int clientPort = d.getPort();

	                String responsemsg = "Hello, client!";
	                byte[] sendData = responsemsg.getBytes();

	                DatagramPacket d1 = new DatagramPacket(sendData, sendData.length, i, clientPort);

	                
	                s.send(d);
	            }
	       
	    }
	}


