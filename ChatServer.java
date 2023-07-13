package com.assigment;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class ChatServer {
	
	    public static void main(String[] args)throws IOException {
	        int PORT=13;	        
	            DatagramSocket s = new DatagramSocket(PORT);
	       
	            byte[] receiveBuffer = new byte[1024];

	            // Receive initial message from the client
	            DatagramPacket p= new DatagramPacket(receiveBuffer, receiveBuffer.length);
	            s.receive(p);
	            
	            String Message = new String(p.getData()).trim();
	            InetAddress i = p.getAddress();
	            int clientPort = p.getPort();
	            System.out.println("Client: " + Message);

	            // Start the chat
	            while (!Message.equalsIgnoreCase("Ok")) {
	                String Reply = getServerReply(Message);
	                byte[] sendBuffer = Reply.getBytes();

	                // Send the server's reply to the client
	                DatagramPacket p1= new DatagramPacket(sendBuffer, sendBuffer.length, i, clientPort);
	                s.send(p1);

	                // Receive next message from the client
	                p = new DatagramPacket(receiveBuffer, receiveBuffer.length);
	                s.receive(p);
	                Message = new String(p.getData()).trim();
	                System.out.println("Client: " + Message);
	            }
	            s.close();
	        
	    }

	    // Helper method to get server's reply based on the client message
	    private static String getServerReply(String clientMessage) {
	        String serverReply;
	        switch (clientMessage) {
	            case "Hello":
	                serverReply = "Hello";
	                break;
	            case "Good morning":
	                serverReply = "Good morning";
	                break;
	            default:
	                serverReply = " I didn't understand";
	        }
	        return serverReply;
	    }
	}


