package Exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckExceptionTester {

    public static void main(String[] args) {
        CheckExceptionTester ce = new CheckExceptionTester();
        try {
            ce.URLTEsrterbyThrows("httpdds://wszib.edu.pl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


    public void URLTesterByTryCatch (String URLString){
        try {
            URL  url  = new URL(URLString);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("UserInfo: " + url.getUserInfo());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }



    public void URLTEsrterbyThrows (String URLString) throws MalformedURLException{

        URL  url  = new URL(URLString);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("UserInfo: " + url.getUserInfo());

    }

}
