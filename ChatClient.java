package com.assigment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ChatClient {
    public static void main(String[] args) throws IOException{
        String hostname = "localhost";
        int port = 13;
            DatagramSocket s = new DatagramSocket();
            InetAddress a = InetAddress.getByName(hostname);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Send initial message to the server
            System.out.print("Client: ");
            String message = br.readLine();
            byte[] sendBuffer = message.getBytes();
            DatagramPacket p = new DatagramPacket(sendBuffer, sendBuffer.length, a, port);
            s.send(p);

            // Start the chat
            while (!message.equalsIgnoreCase("Ok")) {
                byte[] receiveBuffer = new byte[1024];

                // Receive server's reply
                DatagramPacket p1 = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                s.receive(p);
                String Reply = new String(p.getData()).trim();
                System.out.println("Server: " + Reply);

                // Send next message to the server
                System.out.print("Client: ");
                message = br.readLine();
                sendBuffer = message.getBytes();
                p = new DatagramPacket(sendBuffer, sendBuffer.length, a, port);
                s.send(p1);
            }

            s.close();
       
        }
    }

