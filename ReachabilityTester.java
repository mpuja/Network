package com.three;
import java.net.*;
import java.io.*;
public class ReachabilityTester{
	    public static void main(String[] args) {
	  
	        try {
InetAddress address=InetAddress.getByName("www.google.com");
boolean reachable=address.isReachable(1000);
if(reachable){ 
	            System.out.println("host is reachable");
	        } else {
	            
	            System.out.println("host  is  not unreachable");
	        }
	        }catch (UnknownHostException e) {
			
	              e.printStackTrace();
	              
	        }catch (Exception e) {
	        	e.printStackTrace();
			}
	    }
	    
}
	    



	    
	       

	       
	        
	    
	


