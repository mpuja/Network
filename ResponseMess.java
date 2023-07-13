package com.java4;
import java.net.*;
import java.util.*;
import java.io.*;
public class ResponseMess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "https://www.orielly.com/";
		try {
			URL u=new URL(url);
			HttpURLConnection uc=(HttpURLConnection)u.openConnection();
			int code=uc.getResponseCode();
			System.out.println("HTTP/1.x"+ code +"response");
			for(int j=1;  ; j++){
				String header=uc.getHeaderField(j);
				String key=uc.getHeaderField(j);	
				if(header==null||key==null)break;
				System.out.println(uc.getHeaderField(j)+":"+header);
				}
			System.out.println();
			try ( InputStream raw=uc.getInputStream()) {
				InputStream buffer=new BufferedInputStream(raw);
				Reader reader= new InputStreamReader(buffer);
				int c;
				while((c=reader.read())!=-1)
				{
					System.out.print((char)c);
				}
			} catch (MalformedURLException ex) {
				// TODO: handle exception
				System.err.println(url+"is not a praseable URL");
			}
		} catch (IOException ex) {
			// TODO: handle exception
			System.out.println(ex);
		}
	}

}
