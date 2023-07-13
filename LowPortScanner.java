package com.five;
import java.net.*;
import java.io.*;
public class LowPortScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host="Localhost";
		for (int i = 0; i <100; i++) {
			System.out.println(i);
			try {
				Socket s=new Socket(host, i);
				System.out.println("there is a server on port"+i+"of"  + host);
				s.close();
			} catch (UnknownHostException ex) {
				System.err.println(ex);
				// TODO: handle exception
				break;
			}catch (IOException ex) {
				// TODO: handle exception
			}
		}
				

	}

}
