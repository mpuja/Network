package com.java4;
import java.util.*;
import java.net.*;
import java.net.URL;
import java.io.*;

public class HeaderField {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String url= "https://www.orielly.com/";
		
		URL u = new URL(url);
			URLConnection uc=u.openConnection();
			System.out.println(uc.getURL());
			for(int j=1;  ; j++){
			String header=uc.getHeaderField(j);	
			if(header==null)break;
			System.out.println(uc.getHeaderField(j)+"i"+header);
			}
			// TODO: handle exception
			System.out.println(url+"is not URL I understand.");
		
		}
}


