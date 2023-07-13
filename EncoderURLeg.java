package com.three;
import java.net.*;
public class EncoderURLeg {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		String url= "https://www.google.com/search?";
		System.out.println(URLEncoder.encode("this string has space","UTF-8"));
		System.out.println(URLEncoder.encode("this*string*has*asterisks","UTF-8"));
		
		
		System.out.println(URLEncoder.encode("this+string+has+pluses","UTF-8"));
		System.out.println(url);
	}

}
