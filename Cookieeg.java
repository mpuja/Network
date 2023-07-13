package com.java4;
import java.net.*;
import java.util.*;
import java.io.*;

	public class Cookieeg {

	    public static void main(String[] args) throws Exception {
	        CookieManager cm = new CookieManager();
	        CookieHandler.setDefault(cm);

	        URI uri = new URI("http://www.example.com");
	        HttpCookie hc = new HttpCookie("myCookie", "123456");

	        hc.setPath("/");
	        hc.setHttpOnly(true);
	        cm.getCookieStore().add(uri, hc);

	        URL url = new URL("http://www.example.com/");
	        URLConnection connection = url.openConnection();
	       	        connection.connect();

	        CookieStore cs = cm.getCookieStore();
	        List<HttpCookie> cookieList = cs.get(uri);

	        for (HttpCookie cu : cookieList) {
	            System.out.println("Cookie name: " + cu.getName());
	            System.out.println("Cookie value: " + cu.getValue());
	            System.out.println("Cookie domain: " + cu.getDomain());
	            System.out.println("Cookie path: " + cu.getPath());
	            System.out.println("Cookie max age: " + cu.getMaxAge());
	            System.out.println("Cookie secure: " + cu.getSecure());
	        }
	    }
	}


