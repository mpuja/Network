package com.ten;
import java.io.IOException;
import java.net.*;
import java.util.Date;
public class DaytimeUDPServer {
	
	    public static void main(String[] args)throws IOException {
	        
	            // Create a UDP socket on port 13 (Daytime service)
	            DatagramSocket s = new DatagramSocket(13);

	            while (true) {
	                // Create a buffer to hold incoming data
	                byte[] receiveBuffer = new byte[1024];

	                // Create a DatagramPacket for receiving data
	                DatagramPacket d = new DatagramPacket(receiveBuffer, receiveBuffer.length);

	                // Receive a request from a client
	                s.receive(d);

	                // Get the client's IP address and port
	                InetAddress clientAddress = d.getAddress();
	                int clientPort = d.getPort();

	                // Get the current date and time
	                String daytime = new Date().toString();

	                // Convert the daytime string to bytes
	                byte[] sendBuffer = daytime.getBytes();

	                // Create a DatagramPacket to send the response back to the client
	                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);

	                // Send the response to the client
	                s.send(sendPacket);

	                System.out.println("Response sent to " + clientAddress.getHostAddress() + ":" + clientPort);
	            }
	       
	    }
	}


