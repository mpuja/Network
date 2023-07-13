package com.three;
import java.net.*;
public class DecoderURLeg {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String input="https://www.javatpoint.com/search?hl=en&as_q=java=I%2FO";
       String output=URLDecoder.decode(input,"UTF-8");
       System.out.println(output);
	}

}
