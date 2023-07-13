package com.seven;
import java.net.*;
import java.io.*;
public class LocalPortScannereg {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
			for(int port=1;port<=1024;port++){
				ServerSocket server=new ServerSocket(port);
				System.out.println("there is a server on port"+".");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
