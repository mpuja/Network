package network;
import java.net.*;
public class split {
	public static void main(String[] args)throws MalformedURLException {
		// TODO Auto-generated method stub
		  URL u=new URL("https:www.facebook.com");
		  System.out.println("The URLis"+u);

		  System.out.println("The Scheme of"+u.getUserInfo());

		  String host=u.getHost();
		  if(host!=null){
			  int a=host.indexOf('p');
			  if(a!=-1)host.substring(a+1);
			  System.out.println("The host is"+host);
		  }else{
				System.out.println("The host is null");  
			  }
		  System.out.println("The port number is"+u.getPort());
		  System.out.println("THe path is"+u.getPath());
		  System.out.println("The ref is"+u.getRef());
		  System.out.println("The query string is"+u.getQuery());
		  }
	}


