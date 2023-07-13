package com.assigment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class PrimeCompositeServer {
	
	    public static void main(String[] args) throws IOException {
	        int PORT = 13; 

	            ServerSocket ss = new ServerSocket(PORT);
	        
	            Socket s = ss.accept();
	            

	            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
	            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

	            // Read the number sent by the client
	            String Message = in.readLine();
	            int num = Integer.parseInt(Message);

	            // Check if the number is prime or composite
	            boolean isPrime = checkPrime(num);

	            // Prepare the response to the client
	            String response;
	            if (isPrime) {
	                response = num + " is a prime number.";
	            } else {
	                response = num + " is a composite number.";
	            }

	            // Send the response back to the client
	            out.println(response);
	            System.out.println("Response sent to client.");

	           
	            in.close();
	            out.close();
	            ss.close();
	            s.close();
	        
	        }

	    // Helper method to check if a number is prime
	    private static boolean checkPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	}


