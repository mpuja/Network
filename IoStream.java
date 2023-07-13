package network;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class IoStream {
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		if(args.length>0)
		{
			InputStream in = null;
			try {
				URL u = new URL("https://www.youtube.com");
				in = u.openStream();
				in = new BufferedInputStream(in);
				Reader r = new InputStreamReader(in);
				int c;
				while((c = r.read())!= -1)
				{
					System.out.println((char) c);
				}
				
			} catch (IOException e) {
				// TODO: handle exception
				
				System.out.println();
			}
		}
		

	}

}


