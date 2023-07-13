package network;
	import java.net.*;
	public class InterfaceEX{ 

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try{
				
				NetworkInterface n1 = NetworkInterface.getByName("eth0");
				// getByName() -> returns a NetworkInterface object representing network interface with the particular name
				
					if(n1 == null)
					{
						System.out.println("Not Found");
					}
					
					else
					{
						System.out.println("The result is " + n1);
					}
				
				NetworkInterface n2 = NetworkInterface.getByName("CE31");
				
					if(n2 == null)
					{
						System.out.println("Not Found");
					}
					
					else
					{
						System.out.println("The result is " + n2);
					}
					
				NetworkInterface n3 = NetworkInterface.getByName("lo");
					
					if(n3 == null)
					{
						System.out.println("Not Found");
					}
					
					else
					{
						System.out.println("The result is " + n3);
					}
				
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}

		}

	}


