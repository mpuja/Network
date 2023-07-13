package network;
import java.net.*;
public class Spamcheckeg {
	
	public static final String BLACKHOLE="sbl.spamhaus.org";
	static String host[]={"8.8.8.8","207.34.56.23"};
	
public static void  main(String[]args)throws UnknownHostException{
	for(String arg:host){
		if(isSpammer(arg)){
			System.out.println(arg+"is a known spammer.");
		}else{
			System.out.println(arg+"appears legitimate.");
		}
	}
}
private static boolean isSpammer(String arg){
	try {
	InetAddress address=InetAddress.getByName(arg);
	byte[]quad=address.getAddress();
	String query=BLACKHOLE;
	for(byte octet:quad){
		int unsignedByte=octet < 0 ? octet +256 :octet;
		query=unsignedByte + "."+ query;
	}
	InetAddress.getAllByName(query);
	return true;
	} catch (UnknownHostException e) {
		// TODO: handle exception
		return false;
	}
}
}
