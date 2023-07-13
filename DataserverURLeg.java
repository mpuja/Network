package com.five;
import java.net.*;
import java.io.*;
import java.util.*;
public class DataserverURLeg {
	public static void main(String[] args){
	try{
	    URL u = new URL("http://facebook.com/data");

	    URLConnection uc =  u.openConnection();
	    uc.setDoOutput(true);
	  
	    OutputStream raw = uc.getOutputStream();


	    OutputStream buffered = new BufferedOutputStream(raw);
	    OutputStreamWriter out =  new OutputStreamWriter(buffered,"8859_1");
	    
	 out.write("first=Puja&last=Thapa&work=String+student\r\n");
	    
	    out.flush();
	
	    out.close();
	}catch(IOException ex){
	    System.err.println(ex);
	}
	}
}

