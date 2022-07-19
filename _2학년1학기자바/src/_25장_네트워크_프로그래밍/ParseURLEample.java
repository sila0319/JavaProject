package _25��_��Ʈ��ũ_���α׷���;

import java.net.*;
import java.io.*;

public class ParseURLEample {
	public static void main(String[] args)throws IOException {
		URL myURL = new URL("http://java.sum.com:80/docs/books/tutorial"+"/index.html?name=database#TOP");
		System.out.println("protocol = "+ myURL.getProtocol());
		System.out.println("authority = " + myURL.getAuthority());
		System.out.println("host = " + myURL.getHost());
		System.out.println("prot = "+ myURL.getPort());
		System.out.println("path = "+ myURL.getPath());
		System.out.println("query = " + myURL.getQuery());
		System.out.println("filename = " + myURL.getFile());
		System.out.println("ref = " + myURL.getRef());
	}

}
