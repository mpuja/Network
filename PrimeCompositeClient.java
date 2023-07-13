package com.assigment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
public class PrimeCompositeClient {
	    public static void main(String[] args) throws IOException{
	        String  hostname="LocalHost"; 
	        int PORT = 13; 
	            Socket s = new Socket(hostname, PORT);

	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
	            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

	            // Read user input number
	            System.out.print("Enter a number: ");
	            String n = br.readLine();
	            int num = Integer.parseInt(n);

	            // Send the number to the server
	            out.println(num);

	            // Receive and print the server's response
	            String Response = in.readLine();
	            System.out.println("Server: " + Response);

	            
	            in.close();
	            out.close();
	            s.close();
	       
	        }
	    }
	


