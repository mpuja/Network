package com.seven;
import java.net.*;
import java.io.*;
import java.util.Date;
public class DaytimeServrEg {
public final static int PORT=13;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try(ServerSocket server=new ServerSocket(PORT)) {
			while(true){
				try (Socket connection=server.accept()){
					Writer out= new OutputStreamWriter(connection.getOutputStream());
					Date now=new Date();
					out.write(now.toString()+"\r\n");
					out.flush();
					connection.close();
					
				} catch (IOException ex) {
					// TODO: handle exception
				}
			}
		}
	}
}

	


