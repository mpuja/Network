package network;
import java.net.*;
import java.io.*;
public class URLdownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String downLoad_url="https://www.google.com/";
  InputStream in = null;
  try {
	URL u=new URL(downLoad_url);
	in= u.openStream();
	in= new BufferedInputStream(in);
	Reader r= new InputStreamReader(in);
	System.out.println("Downloading webpage");
	
	int c;
	while((c=r.read())!=-1){
	System.out.print((char)c);	
	}
} catch (MalformedURLException ex) {
	// TODO: handle exception
	System.out.println(downLoad_url+"is not parseable URL");
}catch (IOException ex) {
	// TODO: handle exception
	System.out.println(ex);
}finally {
	if(in!=null){
		try {
			in.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
}
}
	}

}
