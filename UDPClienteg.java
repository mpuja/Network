package com.ten;
import java.io.IOException;
import java.net.*;
public class UDPClienteg {
	    public static void main(String[] args) throws IOException{
	     
	            InetAddress i = InetAddress.getByName("localhost");
	            int PORT=13;

	            DatagramSocket s = new DatagramSocket();
	            String msg = "Hello, server!";
	            byte[] sendData = msg.getBytes();

	           
	            DatagramPacket d= new DatagramPacket(sendData, sendData.length, i, PORT);

	            s.send(d);
	            System.out.println("Message sent to the server.");

	            byte[] receiveData = new byte[1024];
	            DatagramPacket d1 = new DatagramPacket(receiveData, receiveData.length);

	            s.receive(d1);

	            String servermsg = new String(d1.getData());

	            System.out.println("Received from server: " + servermsg);

	            s.close();
	       
	    }
	}


