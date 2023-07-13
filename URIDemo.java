package network;
import java.net.*;
public class URIDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 
              URL url = new URL("https://www.example.com:8080/path/to/file.html?query=string#fragment");
              System.out.println("Protocol: " + url.getProtocol());
              System.out.println("Host: " + url.getHost());
              System.out.println("Port: " + url.getPort());
              System.out.println("Path: " + url.getPath());
              System.out.println("Query: " + url.getQuery());
              System.out.println("Fragment: " + url.getRef());
	}
          }
      
  

  
	


