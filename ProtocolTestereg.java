package com.three;
import java.net.*;
public class ProtocolTestereg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testProtocol("http://www.adc.org");
		testProtocol("https://www.amazon.com/exe/obidos/order2");
		testProtocol("ftp://:ibilio.org/pub/language/java/javafaq/");
	testProtocol("file:///etc/passwd");

	}
	private static void testProtocol(String string){
		// TODO Auto-generated method stub
		try {
			URL u=new URL(string);
			System.out.println(u.getProtocol()+"is supported");
		} catch (MalformedURLException ex) {
			// TODO: handle exception
		

String protocol=string.substring(0,string.indexOf(':'));
System.out.println(protocol +"is not supported");
}
}
}