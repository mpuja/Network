package com.seven;
import java.net.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;
public class Pooldayeg {
	public final static int PORT= 13;
	 
	public static void main(String[] args)
	{
		ExecutorService pool= Executors.newFixedThreadPool(50);
		
		try(ServerSocket server= new ServerSocket(PORT)){
			while(true){
				try{
					Socket connection = server.accept();
					Callable<Void>task= new DaytimeTask(connection);
					pool.submit(task);
				}catch(IOException ex){}
				}
				
			}catch(IOException ex){
				System.out.println("couldn't start server");
			
			}
	}
			private static class DaytimeTask implements Callable<Void>{
				private Socket connection;
				DaytimeTask(Socket connection){
					this.connection=connection;
				}
				@Override
				public Void call(){
					try{
						Writer out= new OutputStreamWriter(connection.getOutputStream());
						Date now=new Date();
						out.write(now.toString()+"\r\n");
						out.flush();
					}catch(IOException ex){
						System.err.println(ex);
					}finally{
						try{
							connection.close();
			
		} catch (IOException ex) {
			
		}
		
		}
					return null;
	}
			}
		
	}
	

