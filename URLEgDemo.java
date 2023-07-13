package network;
import java.net.*;
public class URLEgDemo  {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String[]uris={
				"tel:+1-800-9988-9936","www.google.com"	
			};
 for(int i=0;i<uris.length;i++){
	 try {
		URI u= new URI(uris[i]);
		System.out.println("The URI is"+ u);
		if(u.isOpaque()){
		System.out.println("This is opaque URI.");
		System.out.println("The Schema is"+u.getScheme());
		System.out.println("The schema specific part is"+ u.getSchemeSpecificPart() );
	System.out.println("The Fragment Id is"+u.getFragment());
	 } else{
		System.out.println("This is hierarchical URI");
		System.out.println("The Schema is"+u.getScheme());
		try {
		u=u.parseServerAuthority();
		System.out.println("The host is"+u.getHost());
		System.out.println("The user info is "+u.getUserInfo());
		System.out.println("The port is"+u.getPort());
		
		} catch (URISyntaxException ex) {
			// TODO: handle exception
			System.out.println("The authority is"+u.getAuthority());
		}	
		}
		System.out.println("The path is "+u.getPath());
		System.out.println("The query string is"+u.getQuery());
		System.out.println("The Fragment ID is"+u.getFragment());
	 } catch (URISyntaxException ex) {
		// TODO: handle exception
		 System.err.println(uris[i]+"doesnot seen to be URI.");
	}
	 System.out.println();
 }
	}
}
	


