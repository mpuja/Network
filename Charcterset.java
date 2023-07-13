package com.java4;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.*;

public class Charcterset {

    public static void main(String[] args) throws Exception {
        String url = "https://www.google.com/";
        String encoding = "ISO-8859-1";
        URL u = new URL(url);
        URLConnection uc = u.openConnection();
        String contentType = uc.getContentType();
        int encodingStart = contentType.indexOf("charset");
        if (encodingStart != -1) {
            encoding = contentType.substring(encodingStart + 8);
        }
        try (InputStream raw = uc.getInputStream()) {
            InputStream buffer = new BufferedInputStream(raw);
            Reader reader = new InputStreamReader(buffer, encoding);
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (MalformedURLException ex) {
            System.err.println(url + "is not a parseable URL");
        }
    }
}
