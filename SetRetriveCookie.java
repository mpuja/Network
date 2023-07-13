package com.Eleven;

import java.net.*;
import java.io.*;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.util.List;

public class SetRetriveCookie {
    public static void main(String[] args) {
        try {
            CookieManager cookieManager = new CookieManager();
            CookieHandler.setDefault(cookieManager);

            // Set a cookie by adding it to the cookie store
            URI uri = new URI("http://localhost");
            HttpCookie cookie = new HttpCookie("key", "123456");
            cookie.setPath("/");
            cookie.setHttpOnly(true);
            cookieManager.getCookieStore().add(uri, cookie);

            // Make an HTTP request that sends the cookie
            URL url = new URL("http://localhost/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            // Retrieve the stored cookies
            CookieStore cookieStore = cookieManager.getCookieStore();
            List<HttpCookie> cookies = cookieStore.get(uri);

            // Print the retrieved cookies
            for (HttpCookie c : cookies) {
                System.out.println("Cookie: " + c.getName() + "=" + c.getValue());
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
