package com.seven;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
public class LoginServereg {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger ("BasicLoggingExample");
		try {
		ServerSocket ss = new ServerSocket (6666) ;
		Socket s = ss. accept (); 
		DataInputStream dis = new DataInputStream(s.getInputStream()) ;
		String str = (String) dis.readUTF () ;
		System.out.println("message= " + str);
		logger. log(Level. INFO,"message= "+ str);
		ss. close () ;
		} catch (Exception e) {
		System.out.println(e);
		logger. log(Level. SEVERE,
		"error= " + e) ;
	}
	}
	}


