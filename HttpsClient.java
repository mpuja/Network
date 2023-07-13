package com.eight;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.*;
import javax.net.ssl.*;
public class HttpsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int port=443;
		String host="www.usps.com";
		SSLSocketFactory factory=(SSLSocketFactory)SSLSocketFactory.getDefault();
		SSLSocket socket=null;
		try {
		socket=(SSLSocket) factory.createSocket(host,port);
		String[] supported = socket.getSupportedCipherSuites();
		socket.setEnabledCipherSuites(supported);
		
		Writer out = new OutputStreamWriter(socket.getOutputStream(),"UTF-8");
		out.write("GET http://"+host+"/ HTTP/1.1\r\n");
		out.write("Host: "+host+"\r\n");
		out.write("\r\n");
		out.flush();
		
		BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String s;
		
		while(!(s=in.readLine()).equals("")){
			System.out.println(s);
		}
		
		
		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println(ex);
		}
	}

}
