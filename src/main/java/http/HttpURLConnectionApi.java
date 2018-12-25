package http;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HttpURLConnectionApi
{
    private final String USER_AGENT = "Mozilla/5.0";

    public void sendGet(String url) throws Exception
    {
        System.out.println("Request to send GET for URL : " + url);
    }

    public void sendPost(String url) throws Exception
    {
        System.out.println("Request to send POST for URL : " + url);
    }
}
