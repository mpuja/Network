package com.eight;
import java.io.UnsupportedEncodingException;
import java.net.*;
public class DatagramEg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a test";
		try {
			byte[]data=s.getBytes("UTF-8");
			InetAddress ia=InetAddress.getByName("www.ibiblio.org");
			int port=7;
			DatagramPacket dp
			=new DatagramPacket(data,data.length,ia,port);
			System.out.println("this packet is address to"+dp.getAddress()+"on Port"+dp.getPort());
			System.out.println("there are "+dp.getLength()+"bytes of data in the packet");
			System.out.println(new String(dp.getData(),dp.getOffset(),dp.getLength(),"UTF-8"));
			
		} catch (UnknownHostException | UnsupportedEncodingException ex) {
			// TODO: handle exception
			System.out.println(ex);
		}

	}

}
