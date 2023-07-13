package network;
import java.net.*;
public class baseprotocol {
		public static void main(String[] args)throws MalformedURLException  {
			// TODO Auto-generated method stub
	      String baseURLstr=("https://www.janabhawna.com//Home/filename123.txt");
			String relativeURLstr="filename123.txt";
			URL baseURL=new URL(baseURLstr);
			URL resolvedRelativeURL=new URL(baseURL,relativeURLstr);
			System.out.println("The base URL is"+baseURL);
			System.out.println("The Relative URL is"+relativeURLstr);
			System.out.println("The Resolved relative is"+resolvedRelativeURL);
		}

	}

