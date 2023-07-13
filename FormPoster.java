package com.java4;
import java.net.*;
import java.util.*;
import java.io.*;
import java.net.URL;

public class FormPoster {
	
	private URL url;
	 private QueryString query = new QueryString();
	
	public FormPoster(URL url){
		if(!url.getProtocol().toLowerCase().startsWith("http")){
			throw new IllegalArgumentException("Posting only works for http URL");
			
		}
		this.url=url;
	}
	public void add(String name,String value){
	query.add(name,value);
	}
	
	public InputStream post()throws IOException{
		URLConnection uc=url.openConnection();
		uc.setDoOutput(true);
		try (OutputStreamWriter out= new OutputStreamWriter(uc.getOutputStream(),"UTF-8")){
			out.write(query.toString());
			out.write("\r\n");
			out.flush();
		}
		return uc.getInputStream();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url;
		if(args.length>0){
			try {
				url=new URL(args[0]);
			} catch (MalformedURLException ex) {
				// TODO: handle exception
				System.err.println("Usage:java formposter url");
				return;
			}
		}else {
			try {
			url=new URL("http://www.cafeaulait.org/books/jnp4/postquery.phtml");
			
			} catch (MalformedURLException ex) {
				// TODO: handle exception
				System.err.println("Usage: java FOrmPoster url");
				return;
			}
		}
		FormPoster p =new FormPoster(url);
		p.add("name","Puja Thapa");
		p.add("email", "pujathapa749@gmail.com");
		
		try (InputStream in= p.post()){
			Reader r= new InputStreamReader(in);
			int c;
			while((c=r.read())!=-1){
				System.out.print((char)c);
			}
			System.out.println();
		} catch (IOException ex) {
			// TODO: handle exception
			System.err.println(ex);
		}
	}
}
		
	
