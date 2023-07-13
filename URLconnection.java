package network;

import java.io.*;
import java.net.*;
public class URLconnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "https://www.google.com/";
 try {
	URL u = new URL(url);
	URLConnection uc=u.openConnection();
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
		System.out.println(url+"is not a parseable");
	}
} catch (IOException ex) {
	// TODO: handle exception
	System.out.println(ex);
}
	}

}
