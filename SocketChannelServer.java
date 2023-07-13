package com.nine;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
public class SocketChannelServer {

	public static void main(String[] args) throws IOException {
		ServerSocketChannel serverSocket = null;
		SocketChannel client = null;
		serverSocket = ServerSocketChannel.open();
		serverSocket.socket().bind(new InetSocketAddress(9000));
		client = serverSocket.accept();
		System.out.println("Connection Set: " + client.getRemoteAddress());
		Path path = Paths.get("D:/pic/test.txt");

		RandomAccessFile file = new RandomAccessFile("D:/pic/test1.txt", "rw");
		FileChannel fileChannel = file.getChannel();

		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		while (client.read(buffer) >0) {
			buffer.flip();
			fileChannel.write(buffer);
			buffer.clear();
		}

		fileChannel.close();
		System.out.println("File Received");
		client.close();
		serverSocket.close();
	}
}
