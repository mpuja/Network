package com.Eleven;
import java.net.*;
import java.io.IOException;
public class UDPMulticastServer {

    public static void sendUDPMessage(String message, String ipAddress, int port) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        InetAddress group = InetAddress.getByName(ipAddress);
        byte[] msg = message.getBytes();
        DatagramPacket packet = new DatagramPacket(msg, msg.length, group, port);
        socket.send(packet);
        socket.close();
    
    }
    public static void main(String[] args)throws IOException {
        
            sendUDPMessage("This is a multicast message", "224.0.0.1", 4321);
            sendUDPMessage("This is the second multicast message", "224.0.0.1", 4321);
            sendUDPMessage("This is the third multicast message", "224.0.0.1", 4321);
            sendUDPMessage("OK", "224.0.0.1", 4321);
    }
}
        
    


