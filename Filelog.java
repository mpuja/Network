package network;
import java.net.*;
import java.io.*;
public class Filelog {
	public static String[] host = {
	        "http://192.168.0.1/"
	    };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String logFilePath = "path/to/logfile.txt"; 
        
	try {FileInputStream fin=new FileInputStream(host[0]);
    Reader in=new InputStreamReader(fin);
    BufferedReader bin=new BufferedReader(in);
	for(String entry=bin.readLine();entry!=null;entry=bin.readLine()){
		int index=entry.indexOf("");
		String ip=entry.substring(0,index);
		String theRest=entry.substring(index);
		try {InetAddress address=InetAddress.getByName(ip);
		System.out.println(address.getHostAddress()+theRest);
			
		} catch (UnknownHostException ex) {
			// TODO: handle exception
			System.out.println(entry);
		}
		}
	} catch (IOException ex) {
		// TODO: handle exception
		System.out.println("Exception:"+ex);
	}
	}

		
	}

