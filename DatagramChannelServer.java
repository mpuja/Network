package com.ten;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.io.IOException;
import java.nio.*;
import java.net.InetSocketAddress;

public class DatagramChannelServer {

	public static void main(String[] args) throws IOException {
		DatagramChannel server = DatagramChannel.open();
		InetSocketAddress iAddr = new InetSocketAddress(9100);
		server.bind(iAddr);
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		System.out.println("Waiting for client-------" + iAddr);

		SocketAddress remoteAddr = server.receive(buffer);

		String s = ". I am server";
		for (int i = 0; i < s.length(); i++) {
			buffer.put((byte) s.charAt(i));
		}
		buffer.flip();

		server.send(buffer, remoteAddr);
		server.close();
	}
}
