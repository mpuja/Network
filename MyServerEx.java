package com.seven;
import java.net.*;
import java.io.*;
public class MyServerEx {
	public static void main(String args[]) throws Exception {

		ServerSocket ss = new ServerSocket (3333);

		Socket s = ss. accept ();

		DataInputStream din = new DataInputStream(s.getInputStream());

		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		String str = "", str2 ="";

		while (!str.equals("stop")) {

		System.out.println("client says: " + str);

		str2 = br. readLine();

		dout.writeUTF (str2);
		dout.flush();

		System.out.println("====================");
		}
		din.close();
		s.close();
		ss.close () ;
		}
		
}
