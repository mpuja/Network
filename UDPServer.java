package com.ten;
import java.io.IOException;
import java.net.*;
public class UDPServer {
	    public static void main(String[] args) throws IOException{
	        int PORT=13;

	            DatagramSocket s = new DatagramSocket(PORT);
	            byte[] receiveData = new byte[1024];
	            byte[] sendData;
	            
	            while (true) {
	                DatagramPacket d = new DatagramPacket(receiveData, receiveData.length);
	                s.receive(d);

	                String clientmsg = new String(d.getData(), 0, d.getLength());
	                InetAddress i= d.getAddress();
	                int clientPort = d.getPort();
	                
	                System.out.println("Received from client: " + clientmsg);

	                int num = Integer.parseInt(clientmsg);
	                String replymsg;

	                if (num % 2 == 0) {
	                    replymsg = "Even";
	                } else {
	                    replymsg = "Odd";
	                }

	                sendData = replymsg.getBytes();
	                DatagramPacket d1 = new DatagramPacket(sendData, sendData.length, i, clientPort);
	                s.send(d1);
	                
	                System.out.println("Reply sent to client: " + replymsg);
	               
	                receiveData = new byte[1024];
	            }
	       
	        }
	    }
	


