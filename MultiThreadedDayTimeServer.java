package com.seven;
import java.net.*;
import java.util.Date;
import java.io.*;
public class MultiThreadedDayTimeServer {
	public final static int PORT = 13;

	public  static void main(String[] args){
	try(ServerSocket server = new ServerSocket(PORT)){
	while(true){
	try{
	Socket connection = server.accept();
	Thread task = new DaytimeThread(connection);
	task.start();
	}catch(IOException ex){

	}
	}

	} catch (IOException e) {
	System.err.println("Couldnot start server");
	}

	}

	private static class DaytimeThread extends Thread{
	private Socket connection;
	DaytimeThread(Socket connection){
	this.connection = connection;

	}

	public void run(){
	try{
	Writer out = new OutputStreamWriter(connection.getOutputStream());
	Date now = new Date();
	out.write(now.toString() + "\r\n");
	out.flush();
	}catch(IOException ex){
	System.err.println(ex);
	}finally{
	try{
	connection.close();
	}catch(IOException e){

	}
	}
	}
	}

	}


