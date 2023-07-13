package com.ten;
import java.io.IOException;
import java.net.*;
public class DaytimeUDPClient {

	    public static void main(String[] args) throws IOException{
	        
	        	// Set the server's IP address and port
	            InetAddress i = InetAddress.getByName("localhost");
	            int PORT = 13;
	            		
	            // Create a UDP socket
	            DatagramSocket s = new DatagramSocket();

	            // Create a buffer to hold the received data
	            byte[] receiveBuffer = new byte[1024];

	            // Create a DatagramPacket for receiving the response
	            DatagramPacket d = new DatagramPacket(receiveBuffer, receiveBuffer.length);

	            // Send an empty request to the server
	            DatagramPacket d1 = new DatagramPacket(new byte[0], 0, i, PORT);
	            s.send(d1);

	            // Receive the response from the server
	            s.receive(d1);

	            // Convert the received data to a string
	            String daytime = new String(d1.getData(), 0, d1.getLength());

	            // Print the received daytime
	            System.out.println("Received daytime: " + daytime);

	            // Close the socket
	            s.close();
	        
	        }
	    }
	


