package com.Eleven;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Multicast {
    public static void main(String[] args) {
        try {
            InetAddress i = InetAddress.getByName("224.0.0.1");
            int PORT = 8888;

            MulticastSocket m = new MulticastSocket();

            m.setTimeToLive(1);

            String message = "Hello, multicast!";
            byte[] messageBytes = message.getBytes();

            DatagramPacket d = new DatagramPacket(messageBytes, messageBytes.length, i, PORT);

            m.send(d);

            m.close();

            System.out.println("Multicast message sent successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
