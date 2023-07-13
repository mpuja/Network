package network;
import java.net.*;
public class AddressType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	InetAddress i = InetAddress.getByName("www.janabhawana.com");
	if(i.isAnyLocalAddress()) 
	{
		System.out.println("The given address"+ "is wild  address.");

	}
	if(i.isLoopbackAddress()) 
	{
		System.out.println("The given address"+ "is Loopback address.");	

	}
	if(i.isLinkLocalAddress()) 
	{
		System.out.println("The given address"+ "is LinkLOcal address.");	

	}
	if(i.isSiteLocalAddress()) 
	{
		System.out.println("The given address"+ "is siteLOcal  address.");	

	}
	else
	{
		System.out.println("The given address"+ "is global address.");	

	}
	if(i.isMulticastAddress()) 
	{

	if(i.isMCGlobal()) 
	{
		System.out.println("The given address"+ "is global multicast address.");	

	}
	else if(i.isMCOrgLocal()) 
	{
		System.out.println("The given address"+ "is wild Multicast  address.");	

	} 
	else if(i.isMCSiteLocal())  
	{
		System.out.println("The given address"+ "is SiteWild multiCast address.");	

	}
	else if(i.isMCLinkLocal()) 
	{
		System.out.println("The given address"+ "is Subnet wide multicast  address.");	

	}
	else if(i.isMCNodeLocal()) 
	{
		System.out.println("The given address"+ "is an interface Local Multicast  address.");	

	}
	else
	{
		System.out.println("The given address"+ "is unknown multicast address.");	

	}
	}
	else
	{
		System.out.println("The given address"+ "is uniCast address.");	

	}
} catch (UnknownHostException e) {
	// TODO: handle exception
	System.out.println("This is invalid address");
}

	}

}

