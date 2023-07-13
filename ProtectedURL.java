package com.java4;
import java.net.*;
import java.util.*;
import java.io.*;
import java.net.URL;
public class ProtectedURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "https://www.orielly.com/";
try {
	URL u = new URL(url);
	URLConnection uc=u.openConnection();
	System.out.println(uc.getURL());
} catch (IOException ex) {
	// TODO: handle exception
	System.out.println(ex);
}
	}

}
