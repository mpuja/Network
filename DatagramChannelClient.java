package com.ten;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.io.IOException;
import java.nio.*;
import java.net.InetSocketAddress;

public class DatagramChannelClient {

    public static void main(String[] args) throws IOException {
        DatagramChannel client = DatagramChannel.open();
        client.bind(null);

        String msg = "Hello. I am client";

        ByteBuffer buffer = ByteBuffer.allocate(100);
        buffer.put(msg.getBytes());
        buffer.flip();

        InetSocketAddress serverAddr = new InetSocketAddress("localhost", 9100);

        client.send(buffer, serverAddr);
        buffer.clear();
        client.receive(buffer);
        buffer.flip();

        String response = byteBufferToString(buffer);
        System.out.println("Response string: " + response);
    }

    private static String byteBufferToString(ByteBuffer buffer) {
        int limit = buffer.limit();
        byte[] bytes = new byte[limit];
        buffer.get(bytes, 0, limit);
        String s = new String(bytes);
        return s;
    }
}
