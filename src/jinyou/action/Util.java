package jinyou.action;

import java.io.BufferedReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Util {
	
	public static String serverAddress = "172.16.0.14";
	public static String urlport = "8080";
	
	public static boolean isConnected = false; // 是否已经连接服务器

	private static Selector mSelector;
	private static SocketChannel mSocketChannel;

	public static String URL_SERVER = "http://" + serverAddress + ":" + urlport
			+ "/new/login.jsp";
	public static String URL_SERVER2 = "http://" + serverAddress + ":"
			+ urlport;
	
	

}
