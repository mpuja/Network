package com.seven;
import java.io.IOException;
import java.net.*;
public class SoTimeOuteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket (6666) ;
			 printSoTimeout(server);
				
				
		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println(ex);
		}
		}
		public static void printSoTimeout(ServerSocket server) throws IOException{
			int timeout=server.getSoTimeout();
			if(timeout>0){
				System.out.println(server+"will time out aafter"+timeout+"milliscond");
			}else if (timeout==0) {
				System.out.println(server+"will never timeout");
			}else{
				System.out.println("impossible condition ocurred in"+server);
			}
			System.out.println("Timeout in"+server);
		}
}
