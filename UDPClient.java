package com.ten;
import java.io.IOException;
import java.net.*;
public class UDPClient {
	   public static void main(String[] args)throws IOException {
	         String hostname = "localhost";
	        int PORT = 13;

	            DatagramSocket s = new DatagramSocket();
	            InetAddress i = InetAddress.getByName(hostname);
	            byte[] sendData;
	            byte[] receiveData = new byte[1024];
	            
	            String number = "123"; // Number to be sent to the server
	            
	            sendData = number.getBytes();
	            DatagramPacket d1 = new DatagramPacket(sendData, sendData.length, i, PORT);
	            s.send(d1);
	            
	            DatagramPacket d2 = new DatagramPacket(receiveData, receiveData.length);
	            s.receive(d2);
	            
	            String reply = new String(d2.getData(), 0, d2.getLength());
	            System.out.println("Received from server: " + reply);
	            
	            s.close();
	        }
	        }
	    



