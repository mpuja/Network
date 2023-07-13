package com.assigment;
import java.net.*;
import java.io.*;
public class GreetResponseClient {
	static Socket echoSocket = null;
	static PrintWriter out = null;
	static BufferedReader in = null;
	static String host = "localhost";
	static final int port = 6666;

	public static void main(String[] args) throws Exception{
	try{
	echoSocket = new Socket(host, port);
	out = new PrintWriter(echoSocket.getOutputStream(), true);
	in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));

	}catch(UnknownHostException ex){
	System.out.println("Don't know about host " + host);
	System.exit(1);
	}
	catch(IOException ex){
	System.out.println("Couldnot get I/O for " + host);
	System.exit(1);
	}
	BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
	String userInput;

	while((userInput = stdIn.readLine()) != null){
	out.println( userInput+ "\r\n");

	for(String line = in.readLine(); !line.equals("hello");
	line = in.readLine()){
	System.out.println(line);

	}

	}
	out.print("quit\r\n");
	out.close();
	in.close();
	stdIn.close();
	echoSocket.close();
	}

}
