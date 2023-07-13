package com.ten;
import java.io.UnsupportedEncodingException;
import java.net.*;

public class DatagramClass {
    public static void main(String[] args) {
        String s = "This is a test";
        try {
            byte[] data = s.getBytes("UTF-8");
            InetAddress address = InetAddress.getByName("www.javatpoint.com");
            int port = 13;
            DatagramPacket packet = new DatagramPacket(data, data.length, address, port);

            System.out.println("This packet is addressed to " + packet.getAddress() + " on port " + packet.getPort());

            System.out.println("There are " + packet.getLength() + " bytes of data in the packet");

            System.out.println(new String(packet.getData(), packet.getOffset(), packet.getLength(), "UTF-8"));

        } catch (UnknownHostException ex) {
            System.out.println("Unknown host: " + ex.getMessage());
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Unsupported encoding: " + ex.getMessage());
        }
    }
}
