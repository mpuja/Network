package network;

import java.net.InetAddress;

public class ObjectMethod {
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			
			InetAddress i1 = InetAddress.getByName("www.yahoo.com");
			InetAddress i2 = InetAddress.getByName("www.yahoo.com");
			InetAddress i3 = InetAddress.getByName("www.gmail.com");
			
			//equals() method -> It is used to check whether the given address are same or not
			if(i1.equals(i2))
			{
				System.out.println("The given addresses "+i1+ " and " +i2+ " are same.");
			}
			if(i1.equals(i3))
			{
				System.out.println("The given addresses "+i1+ " and " +i3+ " are same.");
			}
			if(i2.equals(i3))
			{
				System.out.println("The given addresses "+i2+ " and " +i3+ " are same.");
			}
			else
			{
				System.out.println("The given addresses are not same.");
			}
			
			// hashCode() method -> used to return the hash code value of given address
			//System.out.println("The hashcode of given address " +i1+ " is "+i1.hashCode());
			System.out.println("The hashcode of given address "+i3+ " is "+i3.hashCode());
			
			// toString() -> used to returns the string value of given address
             String s = i1.toString();
			System.out.println("The output of given address to string is "+s);
		
			// this is used to check whether the givan address is IPV4 or IPV6
			byte[] ad = i1.getAddress();
			
			if(ad.length == 4)
			{
				System.out.println("The given address "+i1+" is IPV4.");
			}
			else if(ad.length == 16)
			{
			System.out.println("The given address "+i1+" is IPV6.");	
			}
			
			else
			{
				System.out.println("The given address "+i1+" is invalid.");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid domain name is given.");
		}

	}

}


