package com.five;
import java.io.IOException;
import java.net.*;
import java.util.Date;
public class DifferentHeaderField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String urls[]={"https://www.oreilly.com/","https://www.google.com"};
		for (int i=0;i<urls.length;i++){
			System.out.println("FOR"+urls[i]+"\n");
			try {
			URL u=new URL(urls[i]);
			URLConnection uc=u.openConnection();
			System.out.println("Content-type:"+uc.getContentType());
			if(uc.getContentEncoding()!=null){
				System.out.println("content-encoding:"+uc.getContentEncoding());
			
			}
			if(uc.getDate()!=0){
				System.out.println("Date:"+new Date (uc.getDate()));
			
			}
			if(uc.getLastModified()!=0){
				System.out.println("Last Modified:"+new Date(uc.getLastModified()));
			
			}
			if(uc.getExpiration()!=0){
				System.out.println("Expiration date:"+new Date(uc.getExpiration()));
			
			}
			if(uc.getContentLength()!=-1){
				System.out.println("ContentLength:"+new Date(uc.getContentLength()));
			
			}
			} catch (MalformedURLException ex) {
				System.err.println(urls[i]+"is not URL I understand");
				// TODO: handle exception
			}catch (IOException ex) {
				// TODO: handle exception
				System.err.println(ex);
			}
		}
		System.out.println();
	}

}
