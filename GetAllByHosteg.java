package network;
import java.net.*;
public class GetAllByHosteg {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		    	
		    	{
		    	InetAddress i= InetAddress.getByName("www.facebook.com");
		    	NetworkInterface ni=NetworkInterface.getByInetAddress(i);
		    	if(ni==null){
                    System.out.println("No Local lookBack address");
		    	}
		    	
		    		System.out.println("could not list network interafce");
		    	
		    	
					// TODO: handle exception
		    		System.out.println("couldnot lookBack address"+"i");
				}
		 }
	}

	
		    		

		    
		    
	


