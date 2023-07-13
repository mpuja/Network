package com.nine;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
public class SocketChannelClient {

	public static void main(String[] args) throws IOException {
		SocketChannel server = SocketChannel.open();
		SocketAddress socketAddr = new InetSocketAddress("localhost", 9000);
		server.connect(socketAddr);

		Path path = Paths.get("D:/pic/Test.txt");
		FileChannel fileChannel = FileChannel.open(path);
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		while (fileChannel.read(buffer) >0 ){
			buffer.flip();
			server.write(buffer);
			buffer.clear();
		}
		fileChannel.close();
		System.out.println("File Sent");
		server.close();
	}
}
