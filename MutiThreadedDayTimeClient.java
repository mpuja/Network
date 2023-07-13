package com.seven;
import java.net.*;
import java.io.*;
public class MutiThreadedDayTimeClient {
	 public static void main(String[] args) {
	        String hostname = "time.nist.gov";
	        final int NUM_THREADS = 5; // Number of threads to create

	        for (int i = 0; i < NUM_THREADS; i++) {
	            Thread thread = new Thread(new DatetimeThread(hostname));
	            thread.start();
	        }
	    }
	   
	    private static class DatetimeThread implements Runnable {
	        private String hostname;
	       
	        DatetimeThread(String hostname) {
	            this.hostname = hostname;
	        }
	       
	        public void run() {
	            Socket socket = null;
	            try {
	                socket = new Socket(hostname, 13);
	                socket.setSoTimeout(15000);
	                InputStream in = socket.getInputStream();
	                StringBuilder time = new StringBuilder();
	                InputStreamReader reader = new InputStreamReader(in, "ASCII");

	                for (int c = reader.read(); c != -1; c = reader.read()) {
	                    time.append((char) c);
	                }

	                System.out.println("Thread " + Thread.currentThread().getId() + ": " + time);
	            } catch (IOException ex) {
	                System.err.print(ex);
	            } finally {
	                if (socket != null) {
	                    try {
	                        socket.close();
	                    } catch (IOException ex) {
	                        System.err.println("Error closing the socket");
	                    }
	                }
	            }
	        }
	    }
}
