package com.seven;
import java.net.*;
import java.io.*;
import java.util.Date;
public class MutilthreadDaySwing {
	public final static int PORT=13;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			try{ServerSocket server= new ServerSocket(PORT);
				while(true){
					try{
						
						Socket connection =server.accept();
						Thread task = new DaytimeThread(connection);
						task.start();
					}catch(IOException ex){
					
				}
				}
				}catch(IOException ex){
					System.out.println("couldn't start Server");
				}
			}
			private static class DaytimeThread extends Thread{
				
				private Socket connection;
				DaytimeThread(Socket connection){
					this.connection=connection;
				}
				@Override
				public void run(){
					try{
						Writer out= new OutputStreamWriter(connection.getOutputStream());
						Date now=new Date();
						out.write(now.toString()+"\r\n");
					System.out.println(now);
					}catch(IOException ex){
						System.err.println(ex);
					}finally{
						try{
							connection.close();
						}catch(IOException ex){}
					}
				}
			}
		
		
	}


