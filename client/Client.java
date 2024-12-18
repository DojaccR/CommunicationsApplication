/*
    This class connects to the server and manages communication between server and GUI.
*/
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client{
    public static final int SCREEN_HEIGHT = 720;
    public static final int SCREEN_WIDTH = 1280;
    public static boolean gui = false;
    public static void main(String[] args){ 
	if(args != null){
        	GUI gui = new GUI(SCREEN_HEIGHT, SCREEN_WIDTH);
	}
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String ip = "";
	int port = -1;
	System.out.println("Enter the ip number");
	try{
		ip = in.readLine();
	}catch(IOException e){
		System.out.println("IOException");
	}
	System.out.println("Enter the port number");
	try{
		port = Integer.parseInt(in.readLine());
	}catch(IOException e){
		System.out.println("IOException");
	}
	Connection c = new Connection(ip, port);
    }
}
