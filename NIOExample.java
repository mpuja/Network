
package com.assigment;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class NIOExample {
	    public static void main(String[] args)throws IOException {
	     
	        RandomAccessFile file = new RandomAccessFile("D:/pic/Test.txt", "rw");
			FileChannel fileChannel = file.getChannel();
	            ByteBuffer buffer = ByteBuffer.allocate(1024);

	            while (fileChannel.read(buffer) > 0) {
	                buffer.flip();

	                // Process the data in the buffer
	                while (buffer.hasRemaining()) {
	                    System.out.print((char) buffer.get());
	                }

	                buffer.clear();
	            }
	       
	    }
	}


