package com.assigment;

import java.net.*;
import java.io.*;

public class GreetResponseServer {
	 public static void main(String[] args) {
	        int port = 6666; // Port to listen on

	        try (ServerSocket serverSocket = new ServerSocket(port)) {
	            System.out.println("Server started on port " + port);

	            while (true) {
	                try (Socket clientSocket = serverSocket.accept();
	                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
	                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

	                    System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

	                    // Read the client's greeting message
	                    String greeting = in.readLine();
	                    System.out.println("Received from client: " + greeting);

	                   
	                   
	                    // Send a response back to the client
	                    String response = "Hi, client! How can I help you?";
	                    out.println(response);
	                    System.out.println(response);

	                } catch (IOException e) {
	                    System.out.println("Error: " + e.getMessage());
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}
