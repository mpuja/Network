package com.ten;
import java.io.IOException;
import java.net.*;
import java.util.Arrays;
public class SetGetMethodUPDPDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		byte ar[]={12,13,15,16};
		byte buf[]={15,16,17,18,19};
		
		InetAddress ip=InetAddress.getByName("Localhost");
		
		DatagramPacket dp1=new DatagramPacket(ar,4,ip,1052);
		
		dp1.setAddress(ip);
		System.out.println("Address:"+dp1.getAddress());
		
		dp1.setPort(2525);
		System.out.println("Port:"+dp1.getPort());
		dp1.setLength(4);
		System.out.println("Length:"+dp1.getLength());
		dp1.setData(buf);
		
		System.out.println("Data:"+Arrays.toString(dp1.getData()));
		System.out.println("Socket Addresss:"+dp1.getSocketAddress());
		System.out.println("Offset:"+dp1.getOffset());

	}

}
